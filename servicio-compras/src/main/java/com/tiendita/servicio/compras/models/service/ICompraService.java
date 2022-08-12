package com.tiendita.servicio.compras.models.service;

import java.util.List;

import com.tiendita.servicio.compras.models.entity.Compra;

public interface ICompraService {
	public List<Compra> findAll();

	public Compra findById(Long id);
}
