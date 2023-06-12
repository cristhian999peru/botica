package com.proyecto.aplicativo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.proyecto.aplicativo.entity.Pago;
import com.proyecto.aplicativo.repository.PagoRepository;
@Service
public class PagoServiceImplements implements PagoService {
  @Autowired
  PagoRepository p;
	@Override
	public Pago registrar(Pago a) {
		// TODO Auto-generated method stub
		return p.save(a);
	}

	@Override
	public Pago actualizar(Pago a) {
		// TODO Auto-generated method stub
		return p.save(a);
	}

	@Override
	public void eliminar(Pago a) {
		// TODO Auto-generated method stub
		p.delete(a);
	}

	@Override
	public List<Pago> ver() {
		// TODO Auto-generated method stub
		return p.findAll();
	}

}
