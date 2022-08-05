package com.tiendita.servicio.productos.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tiendita.servicio.productos.models.entity.Producto;
import com.tiendita.servicio.productos.models.service.IProductoService;

@RestController
@RequestMapping("/producto")
public class ProductoController {

	@Autowired
	@Qualifier("serviceFeign")
	private IProductoService productoService;

	@GetMapping("/listar")
	public List<Producto> listar() {
		return productoService.findAll();
	}

	@GetMapping("/listar/{id}")
	public Producto detalle(@PathVariable Long id) {
		return productoService.finById(id);
	}
}
