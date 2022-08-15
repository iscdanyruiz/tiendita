package com.tiendita.servicio.compras.models.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tiendita.servicio.compras.clientefeign.ClienteClienteRest;
import com.tiendita.servicio.compras.models.dao.CompraDao;
import com.tiendita.servicio.compras.models.entity.Cliente;
import com.tiendita.servicio.compras.models.entity.Compra;

@Service("serviceFeign")
public class CompraServiceFeign implements ICompraService {

	@Autowired
	private ClienteClienteRest clienteFeign;

	@Autowired
	private CompraDao compraDao;

	@Override
	public List<Compra> findAll() {
		List<Compra> compras = (List<Compra>) compraDao.findAll();
	    List<Cliente> clientes = clienteFeign.findAll();
	    for (Compra compra: compras) {
			for (Cliente cliente : clientes) {
				if(compra.getIdCliente().equals(cliente.getId())) {
					compra.setCliente(cliente);
				}
			}
		}
		return compras;
	}

	@Override
	public Compra findById(Long id) {
		Compra compra = compraDao.findById(id).orElse(null);
		Cliente cliente = clienteFeign.findById(compra.getIdCliente());
		compra.setCliente(cliente);
		return compra;
	}

}
