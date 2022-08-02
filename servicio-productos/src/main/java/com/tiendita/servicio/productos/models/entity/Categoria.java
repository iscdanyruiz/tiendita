package com.tiendita.servicio.productos.models.entity;

public class Categoria {

	private Long idCategorias;
	private String descripcion;
	private Integer estado;

	public Long getIdCategorias() {
		return idCategorias;
	}

	public void setIdCategorias(Long idCategorias) {
		this.idCategorias = idCategorias;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public Integer getEstado() {
		return estado;
	}

	public void setEstado(Integer estado) {
		this.estado = estado;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Categoria [idCategorias=");
		builder.append(idCategorias);
		builder.append(", descripcion=");
		builder.append(descripcion);
		builder.append(", estado=");
		builder.append(estado);
		builder.append("]");
		return builder.toString();
	}

}
