package com.proyecto.aplicativo.service;

import java.util.List;

import com.proyecto.aplicativo.entity.Producto;

public interface ProductoService {
 
	public Producto registrar(Producto a);
	public Producto actualizar(Producto a);
	public void eliminar(Producto a);
	public List<Producto> ver();
}
