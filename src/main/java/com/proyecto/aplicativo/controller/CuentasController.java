package com.proyecto.aplicativo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.proyecto.aplicativo.entity.Cuentas;
import com.proyecto.aplicativo.service.CuentasService;

 
@RestController
public class CuentasController  {
	@Autowired
	
	CuentasService c;
	@PostMapping("/Cuentas")
	public Cuentas registrar (@RequestBody Cuentas a) {
		return c.registrar(a);
	}
	@PutMapping("/Cuentas")
	public Cuentas actualizar   (@RequestBody Cuentas a) {
		return c.actualizar(a);
}
	@DeleteMapping("/Cuentas")
	public void eleminar (@RequestBody Cuentas a) {
		c.eliminar(a);
	}
	@GetMapping("/Cuentas")
	public List<Cuentas> ver(){
	
		return c.ver();
	}
}
