package com.tiendita.servicio.compras.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tiendita.servicio.compras.models.entity.Compra;
import com.tiendita.servicio.compras.models.service.ICompraService;

@RestController
@RequestMapping("/compra")
public class CompraController {

	@Autowired
	@Qualifier("serviceFeign")
	private ICompraService compraService;

	@GetMapping("/listar")
	public List<Compra> listar() {
		return compraService.findAll();
	}

	@GetMapping("/listar/{id}")
	public Compra detalle(@PathVariable Long id) {
		return compraService.findById(id);
	}
}
