package com.proyecto.aplicativo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.proyecto.aplicativo.entity.Pago;
import com.proyecto.aplicativo.service.PagoService;
@RestController
public class PagoController {
@Autowired
	
PagoService p;
	
	@PostMapping("/Pago")
	public Pago registrar (@RequestBody Pago a) {
		return p.registrar(a);
	}
	@PutMapping("/Pago")
	public Pago actualizar   (@RequestBody Pago a) {
		return p.actualizar(a);
}
	@DeleteMapping("/Pago")
	public void eleminar (@RequestBody 	Pago a) {
		p.eliminar(a);
	}
	@GetMapping("/Pago")
	public List<Pago> ver(){
	
		return p.ver();
}
}
