package com.tiendita.servicio.compras.models.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.client.RestTemplate;

import com.tiendita.servicio.compras.models.dao.CompraDao;
import com.tiendita.servicio.compras.models.entity.Compra;

@Service("serviceRestTemplate")
public class CompraServiceImpl implements ICompraService {

	@Autowired
	private CompraDao compraDao;

	@Autowired
	private RestTemplate restTemplate;

	@Override
	@Transactional(readOnly = true)
	public List<Compra> findAll() {
		List<Compra> compras = (List<Compra>) compraDao.findAll();
		return compras;
	}

	@Override
	@Transactional(readOnly = true)
	public Compra findById(Long id) {
		Compra compra = compraDao.findById(id).orElse(null);
		return compra;
	}

}
