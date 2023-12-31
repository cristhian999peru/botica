package com.proyecto.aplicativo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.proyecto.aplicativo.entity.Venta;
import com.proyecto.aplicativo.repository.VentaRepository;
@Service
public class VentaServiceImplements implements VentaService{
@Autowired
VentaRepository  v ;
	@Override
	public Venta registrar(Venta a) {
		// TODO Auto-generated method stub
		return v.save(a) ;
	}

	@Override
	public Venta actualizar(Venta a) {
		// TODO Auto-generated method stub
		return v.save(a);
	}

	@Override
	public void eliminar(Venta a) {
		// TODO Auto-generated method stub
		v.delete(a);
	}

	@Override
	public List<Venta> ver() {
		// TODO Auto-generated method stub
		return v.findAll();
	}

}
