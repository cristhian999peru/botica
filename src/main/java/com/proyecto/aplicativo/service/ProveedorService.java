package com.proyecto.aplicativo.service;

import java.util.List;

import com.proyecto.aplicativo.entity.Proveedor;

public interface ProveedorService {
public Proveedor registrar(Proveedor a);
public Proveedor actualizar(Proveedor a);
public void eliminar (Proveedor a);
public List<Proveedor>ver();
}
