package com.tiendita.servicio.compras.clientefeign;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.tiendita.servicio.compras.models.entity.Cliente;

@FeignClient(name = "servicio-clientes/cliente")
public interface ClienteClienteRest {

	@GetMapping("/listar")
	public List<Cliente> findAll();

	@GetMapping("/listar/{id}")
	public Cliente findById(@PathVariable Long id);

}
