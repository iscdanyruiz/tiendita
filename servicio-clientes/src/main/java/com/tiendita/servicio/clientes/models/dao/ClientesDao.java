package com.tiendita.servicio.clientes.models.dao;

import org.springframework.data.repository.CrudRepository;

import com.tiendita.servicio.clientes.models.entity.Cliente;

public interface ClientesDao extends CrudRepository<Cliente, Long> {

}
