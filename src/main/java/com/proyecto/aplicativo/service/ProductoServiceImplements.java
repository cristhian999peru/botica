package com.proyecto.aplicativo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.proyecto.aplicativo.entity.Producto;
import com.proyecto.aplicativo.repository.ProductoRepository;
@Service
public class ProductoServiceImplements implements ProductoService{
@Autowired
ProductoRepository p;
	@Override
	public Producto registrar(Producto a) {
		// TODO Auto-generated method stub
		return p.save(a);
	}

	@Override
	public Producto actualizar(Producto a) {
		// TODO Auto-generated method stub
		return p.save(a);
	}

	@Override
	public void eliminar(Producto a) {
		// TODO Auto-generated method stub
		p.delete(a);
	}

	@Override
	public List<Producto> ver() {
		// TODO Auto-generated method stub
		return p.findAll();
	}

}
