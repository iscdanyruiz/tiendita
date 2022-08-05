package com.tiendita.servicio.productos.models.service;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.client.RestTemplate;

import com.tiendita.servicio.productos.models.dao.ProductoDao;
import com.tiendita.servicio.productos.models.entity.Categoria;
import com.tiendita.servicio.productos.models.entity.Producto;

@Service("serviceRestTemplate")
public class ProductoServiceImpl implements IProductoService {

	@Autowired
	private ProductoDao productoDao;

	@Autowired
	private RestTemplate clienteRest;

	@Override
	@Transactional(readOnly = true)
	public List<Producto> findAll() {
		List<Categoria> categorias = Arrays
				.asList(clienteRest.getForObject(
						"http://localhost:8001/categoria/listar", 
						Categoria[].class
						));
		List<Producto> productos = (List<Producto>) productoDao.findAll();
		for (Producto producto : productos) {
			for (Categoria categoria : categorias) {
				if(producto.getCategoriaId().equals(categoria.getIdCategorias())) {
					producto.setCategoria(categoria);
				}
			}
		}
		return productos;
	}

	@Override
	@Transactional(readOnly = true)
	public Producto finById(Long id) {
		return productoDao.findById(id).orElse(null);
	}

}
