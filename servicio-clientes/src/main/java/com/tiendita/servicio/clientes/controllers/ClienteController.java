package com.tiendita.servicio.clientes.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tiendita.servicio.clientes.models.entity.Cliente;
import com.tiendita.servicio.clientes.models.service.IClienteService;

@RestController
@RequestMapping("/cliente")
public class ClienteController {

	@Autowired
	private IClienteService clienteService;

	@GetMapping("/listar")
	public List<Cliente> findAll() {
		return clienteService.findAll();
	}

	@GetMapping("/listar/{id}")
	public Cliente findById(@PathVariable Long id) {
		return clienteService.findById(id);
	}

}
