package com.tiendita.servicio.productos.clientefeign;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.tiendita.servicio.productos.models.entity.Categoria;

//Importante debe tener el nombre del servicio y el base path del @RequestMapping
@FeignClient(name = "servicio-categorias/categoria")
public interface CategoriaClienteRest {
	
	@GetMapping("/listar")
	public List<Categoria> listar();
	
	@GetMapping("/listar/{id}")
	public Categoria detalle(@PathVariable Long id);

}
