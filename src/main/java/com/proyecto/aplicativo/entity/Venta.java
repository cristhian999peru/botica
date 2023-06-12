package com.proyecto.aplicativo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
@Table(name="Venta")
@Entity(name="Venta")
public class Venta {
	
 @Id String cantidad;
String fecha;
public Venta() {
	super();
}
public Venta(String cantidad, String fecha) {
	super();
	this.cantidad = cantidad;
	this.fecha = fecha;
}
public String getCantidad() {
	return cantidad;
}
public void setCantidad(String cantidad) {
	this.cantidad = cantidad;
}
public String getFecha() {
	return fecha;
}
public void setFecha(String fecha) {
	this.fecha = fecha;
}



}
