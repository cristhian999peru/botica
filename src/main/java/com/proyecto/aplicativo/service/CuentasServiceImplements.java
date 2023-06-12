package com.proyecto.aplicativo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.proyecto.aplicativo.entity.Cuentas;
import com.proyecto.aplicativo.repository.CuentasRepository;
@Service
public class CuentasServiceImplements implements CuentasService{
@Autowired
  CuentasRepository c;
	@Override
	public Cuentas registrar(Cuentas a) {
		// TODO Auto-generated method stub
		return c.save(a);
	}

	@Override
	public Cuentas actualizar(Cuentas a) {
		// TODO Auto-generated method stub
		return c.save(a);
	}

	@Override
	public void eliminar(Cuentas a) {
		// TODO Auto-generated method stub
		c.delete(a);
	}

	@Override
	public List<Cuentas> ver() {
		// TODO Auto-generated method stub
		return c.findAll();
	}

}
