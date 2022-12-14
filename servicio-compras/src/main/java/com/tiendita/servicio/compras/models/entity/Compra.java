package com.tiendita.servicio.compras.models.entity;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "COMPRAS")
public class Compra {

	@Id
	@Column(name = "id_compra")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idCompra;

	@Column(name = "id_cliente")
	@JsonIgnore
	private Long idCliente;

	private LocalDateTime fecha;

	@Column(name = "medio_pago")
	private String medioPago;

	private String comentario;
	private String estado;

	@Transient
	private Cliente cliente;

	public Long getIdCompra() {
		return idCompra;
	}

	public void setIdCompra(Long idCompra) {
		this.idCompra = idCompra;
	}

	public Long getIdCliente() {
		return idCliente;
	}

	public void setIdCliente(Long idCliente) {
		this.idCliente = idCliente;
	}

	public LocalDateTime getFecha() {
		return fecha;
	}

	public void setFecha(LocalDateTime fecha) {
		this.fecha = fecha;
	}

	public String getMedioPago() {
		return medioPago;
	}

	public void setMedioPago(String medioPago) {
		this.medioPago = medioPago;
	}

	public String getComentario() {
		return comentario;
	}

	public void setComentario(String comentario) {
		this.comentario = comentario;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Compra [idCompra=");
		builder.append(idCompra);
		builder.append(", idCliente=");
		builder.append(idCliente);
		builder.append(", fecha=");
		builder.append(fecha);
		builder.append(", medioPago=");
		builder.append(medioPago);
		builder.append(", comentario=");
		builder.append(comentario);
		builder.append(", estado=");
		builder.append(estado);
		builder.append(", cliente=");
		builder.append(cliente);
		builder.append("]");
		return builder.toString();
	}

}
