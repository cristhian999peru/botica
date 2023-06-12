package com.proyecto.aplicativo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
@Table(name="Pago")
@Entity(name="Pago")
public class Pago {
	@Id
String fecha;

public Pago() {
	super();
}

public Pago(String fecha) {
	super();
	this.fecha = fecha;
}

public String getFecha() {
	return fecha;
}

public void setFecha(String fecha) {
	this.fecha = fecha;
}

}
