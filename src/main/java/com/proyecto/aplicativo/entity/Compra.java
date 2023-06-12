package com.proyecto.aplicativo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
@Table(name="Compra")
@Entity(name="Compra")
public class Compra {
	@Id
int cantidad;
 String fecha;
 int precio;
public Compra() {
	super();
}
public Compra(int cantidad, String fecha, int precio) {
	super();
	this.cantidad = cantidad;
	this.fecha = fecha;
	this.precio = precio;
}
public int getCantidad() {
	return cantidad;
}
public void setCantidad(int cantidad) {
	this.cantidad = cantidad;
}
public String getFecha() {
	return fecha;
}
public void setFecha(String fecha) {
	this.fecha = fecha;
}
public int getPrecio() {
	return precio;
}
public void setPrecio(int precio) {
	this.precio = precio;
}
 
}
