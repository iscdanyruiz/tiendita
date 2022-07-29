package com.tiendita.servicio.productos.models.service;

import java.util.List;

import com.tiendita.servicio.productos.models.entity.Producto;

public interface IProductoService {
	public List<Producto> findAll();

	public Producto finById(Long id);
}
