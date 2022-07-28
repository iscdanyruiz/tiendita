package com.tiendita.servicio.categorias.models.dao;

import org.springframework.data.repository.CrudRepository;

import com.tiendita.servicio.categorias.models.entity.Categoria;

public interface CategoriaDao extends CrudRepository<Categoria, Long>{

}
