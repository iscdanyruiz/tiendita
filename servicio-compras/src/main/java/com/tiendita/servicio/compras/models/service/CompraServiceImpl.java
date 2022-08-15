package com.tiendita.servicio.compras.models.service;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.client.RestTemplate;

import com.tiendita.servicio.compras.models.dao.CompraDao;
import com.tiendita.servicio.compras.models.entity.Cliente;
import com.tiendita.servicio.compras.models.entity.Compra;

@Service("serviceRestTemplate")
public class CompraServiceImpl implements ICompraService {

	@Autowired
	private CompraDao compraDao;

	@Autowired
	private RestTemplate clienteRest;

	@Override
	@Transactional(readOnly = true)
	public List<Compra> findAll() {
		List<Cliente> clientes = Arrays
				.asList(clienteRest.getForObject("http://localhost:8001/cliente/listar", Cliente[].class));
		List<Compra> compras = (List<Compra>) compraDao.findAll();
		for (Compra compra : compras) {
			for (Cliente cliente : clientes) {
				if (compra.getIdCliente().equals(cliente.getId())) {
					compra.setCliente(cliente);
				}
			}
		}
		return compras;
	}

	@Override
	@Transactional(readOnly = true)
	public Compra findById(Long id) {
		Cliente cliente = clienteRest.getForObject("http://localhost:8004/categoria/listar", Cliente.class);
		Compra compra = compraDao.findById(id).orElse(null);
		if (compra.getIdCliente().equals(cliente.getId())) {
			compra.setCliente(cliente);
		}
		return compra;
	}

}
