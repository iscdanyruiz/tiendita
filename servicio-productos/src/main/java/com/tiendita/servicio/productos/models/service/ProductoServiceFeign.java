package com.tiendita.servicio.productos.models.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tiendita.servicio.productos.clientefeign.CategoriaClienteRest;
import com.tiendita.servicio.productos.models.dao.ProductoDao;
import com.tiendita.servicio.productos.models.entity.Categoria;
import com.tiendita.servicio.productos.models.entity.Producto;

@Service("serviceFeign")
public class ProductoServiceFeign implements IProductoService {

	@Autowired
	private CategoriaClienteRest clienteFeign;

	@Autowired
	private ProductoDao productoDao;

	@Override
	public List<Producto> findAll() {
		List<Producto> productos = (List<Producto>) productoDao.findAll();
		List<Categoria> categorias = clienteFeign.listar();
		for (Producto producto : productos) {
			for (Categoria categoria : categorias) {
				if (producto.getCategoriaId().equals(categoria.getIdCategorias())) {
					producto.setCategoria(categoria);
				}
			}

		}
		return productos;
	}

	@Override
	public Producto finById(Long id) {
		Producto producto = productoDao.findById(id).orElse(null);
		Categoria categoria = clienteFeign.detalle(producto.getCategoriaId());
		if (producto.getCategoriaId().equals(categoria.getIdCategorias())) {
			producto.setCategoria(categoria);
		}
		return producto;
	}

}
