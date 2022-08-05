package com.tiendita.servicio.categorias.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tiendita.servicio.categorias.models.entity.Categoria;
import com.tiendita.servicio.categorias.models.service.ICategoriaService;

@RestController
@RequestMapping("/categoria")
public class CategoriaController {

	@Autowired
	private ICategoriaService categoriaService;

	@GetMapping("/listar")
	public List<Categoria> listar() {
		return categoriaService.findAll();
	}

	@GetMapping("/listar/{id}")
	public Categoria detalle(@PathVariable Long id) throws Exception {
		/*boolean ok = false;
		if(!ok) {
			throw new Exception("No se puede cargar la categoría");
		}*/
		return categoriaService.findById(id);
	}
}
