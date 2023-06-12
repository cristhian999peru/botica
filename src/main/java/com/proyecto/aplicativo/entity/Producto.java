package com.proyecto.aplicativo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
@Table(name="Producto")
@Entity(name="Producto")
public class Producto {
	@Id
String codigo;
String fecha;
int precio_UN;
String descripcion;
public Producto() {
	super();
}
public Producto(String codigo, String fecha, int precio_UN, String descripcion) {
	super();
	this.codigo = codigo;
	this.fecha = fecha;
	this.precio_UN = precio_UN;
	this.descripcion = descripcion;
}
public String getCodigo() {
	return codigo;
}
public void setCodigo(String codigo) {
	this.codigo = codigo;
}
public String getFecha() {
	return fecha;
}
public void setFecha(String fecha) {
	this.fecha = fecha;
}
public int getPrecio_UN() {
	return precio_UN;
}
public void setPrecio_UN(int precio_UN) {
	this.precio_UN = precio_UN;
}
public String getDescripcion() {
	return descripcion;
}
public void setDescripcion(String descripcion) {
	this.descripcion = descripcion;
}

	
}
