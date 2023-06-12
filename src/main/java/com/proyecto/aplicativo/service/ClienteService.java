package com.proyecto.aplicativo.service;

import java.util.List;

import com.proyecto.aplicativo.entity.Cliente;

public interface ClienteService {
public Cliente registrar(Cliente a);
public Cliente actualizar(Cliente a);
public void eliminar(Cliente a);
public List<Cliente> ver();
}
