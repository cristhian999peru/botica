package com.proyecto.aplicativo.service;

import java.util.List;

import com.proyecto.aplicativo.entity.Cuentas;

public interface CuentasService {
	public Cuentas registrar (Cuentas a);
	public Cuentas actualizar (Cuentas a);
	public void eliminar( Cuentas a);
	public List<Cuentas>ver();
}
