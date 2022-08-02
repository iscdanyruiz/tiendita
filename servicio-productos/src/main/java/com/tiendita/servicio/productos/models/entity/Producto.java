package com.tiendita.servicio.productos.models.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table(name = "PRODUCTOS")
public class Producto implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_producto")
	private Long id;
	private String nombre;
	@Column(name = "codigo_barras")
	private String codigoBarras;
	@Column(name = "precio_venta")
	private Double precioVenta;
	@Column(name = "cantidad_stock")
	private Integer cantidadStock;
	private Integer estado;
	@Column(name = "id_categoria")
	private Long categoriaId;

	@Transient
	private Categoria categoria;

	public Producto() {
	}

	public Producto(Long id, String nombre, String codigoBarras, Double precioVenta, Integer cantidadStock,
			Integer estado, Categoria categoria) {
		this.id = id;
		this.nombre = nombre;
		this.codigoBarras = codigoBarras;
		this.precioVenta = precioVenta;
		this.cantidadStock = cantidadStock;
		this.estado = estado;
		this.categoria = categoria;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getCodigoBarras() {
		return codigoBarras;
	}

	public void setCodigoBarras(String codigoBarras) {
		this.codigoBarras = codigoBarras;
	}

	public Double getPrecioVenta() {
		return precioVenta;
	}

	public void setPrecioVenta(Double precioVenta) {
		this.precioVenta = precioVenta;
	}

	public Integer getStock() {
		return cantidadStock;
	}

	public void setStock(Integer cantidadStock) {
		this.cantidadStock = cantidadStock;
	}

	public Integer getEstado() {
		return estado;
	}

	public void setEstado(Integer estado) {
		this.estado = estado;
	}

	public Categoria getCategoria() {
		return categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}

	public Long getCategoriaId() {
		return categoriaId;
	}

	public void setCategoriaId(Long categoriaId) {
		this.categoriaId = categoriaId;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Producto [id=");
		builder.append(id);
		builder.append(", nombre=");
		builder.append(nombre);
		builder.append(", codigoBarras=");
		builder.append(codigoBarras);
		builder.append(", precioVenta=");
		builder.append(precioVenta);
		builder.append(", cantidadStock=");
		builder.append(cantidadStock);
		builder.append(", estado=");
		builder.append(estado);
		builder.append(", categoriaId=");
		builder.append(categoriaId);
		builder.append(", categoria=");
		builder.append(categoria);
		builder.append("]");
		return builder.toString();
	}

}
