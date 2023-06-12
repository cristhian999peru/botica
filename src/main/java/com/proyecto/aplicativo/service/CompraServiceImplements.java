package com.proyecto.aplicativo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.proyecto.aplicativo.entity.Compra;
import com.proyecto.aplicativo.repository.CompraRepository;
@Service
public class CompraServiceImplements implements CompraService {
@Autowired
CompraRepository c;
	@Override
	public Compra registrar(Compra a) {
		// TODO Auto-generated method stub
		return c.save(a);
	}

	@Override
	public Compra actualizar(Compra a) {
		// TODO Auto-generated method stub
		return c.save(a);
	}

	@Override
	public void eliminar(Compra a) {
		// TODO Auto-generated method stub
		c.delete(a);
	}

	@Override
	public List<Compra> ver() {
		// TODO Auto-generated method stub
		return c.findAll();
	}

}
