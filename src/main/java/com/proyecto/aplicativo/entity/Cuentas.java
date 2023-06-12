package com.proyecto.aplicativo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
@Table(name="Cuentas")
@Entity(name="Cuentas")
public class Cuentas {
@Id String iban;
String bn;
String caja_huancayo;
String bcp;
String bbva;
String interbank;
public Cuentas() {
	super();
}
public Cuentas(String iban, String bn, String caja_huancayo, String bcp, String bbva, String interbank) {
	super();
	this.iban = iban;
	this.bn = bn;
	this.caja_huancayo = caja_huancayo;
	this.bcp = bcp;
	this.bbva = bbva;
	this.interbank = interbank;
}
public String getIban() {
	return iban;
}
public void setIban(String iban) {
	this.iban = iban;
}
public String getBn() {
	return bn;
}
public void setBn(String bn) {
	this.bn = bn;
}
public String getCaja_huancayo() {
	return caja_huancayo;
}
public void setCaja_huancayo(String caja_huancayo) {
	this.caja_huancayo = caja_huancayo;
}
public String getBcp() {
	return bcp;
}
public void setBcp(String bcp) {
	this.bcp = bcp;
}
public String getBbva() {
	return bbva;
}
public void setBbva(String bbva) {
	this.bbva = bbva;
}
public String getInterbank() {
	return interbank;
}
public void setInterbank(String interbank) {
	this.interbank = interbank;
}

	
}


