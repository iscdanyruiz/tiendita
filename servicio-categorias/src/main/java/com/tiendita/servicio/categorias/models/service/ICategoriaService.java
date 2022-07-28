package com.tiendita.servicio.categorias.models.service;

import java.util.List;

import com.tiendita.servicio.categorias.models.entity.Categoria;

public interface ICategoriaService {
	public List<Categoria> findAll();

	public Categoria findById(Long id);
}
