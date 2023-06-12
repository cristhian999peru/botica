package com.proyecto.aplicativo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.proyecto.aplicativo.entity.Proveedor;
import com.proyecto.aplicativo.repository.ProveedorRepository;
@Service
public class ProveedorServiceImplements implements ProveedorService {
@Autowired
 ProveedorRepository  p;
	@Override
	public Proveedor registrar(Proveedor a) {
		// TODO Auto-generated method stub
		return  p.save(a);
	}

	@Override
	public Proveedor actualizar(Proveedor a) {
		// TODO Auto-generated method stub
		return p.save(a);
	}

	@Override
	public void eliminar(Proveedor a) {
		// TODO Auto-generated method stub
		p.delete(a);
	}

	@Override
	public List<Proveedor> ver() {
		// TODO Auto-generated method stub
		return p.findAll();
	}

}
