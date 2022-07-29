package com.tiendita.servicio.productos.models.dao;

import org.springframework.data.repository.CrudRepository;

import com.tiendita.servicio.productos.models.entity.Producto;

public interface ProductoDao extends CrudRepository<Producto, Long> {

}
