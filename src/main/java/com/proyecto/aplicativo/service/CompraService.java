package com.proyecto.aplicativo.service;

import java.util.List;

import com.proyecto.aplicativo.entity.Compra;

public interface CompraService {

	public Compra registrar(Compra a);
	public Compra actualizar(Compra a);
	public  void eliminar (Compra a);	
	public List<Compra> ver();
}
