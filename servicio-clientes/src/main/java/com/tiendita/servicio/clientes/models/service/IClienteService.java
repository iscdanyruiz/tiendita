package com.tiendita.servicio.clientes.models.service;

import java.util.List;

import com.tiendita.servicio.clientes.models.entity.Cliente;

public interface IClienteService {

	public List<Cliente> findAll();

	public Cliente findById(Long id);

}
