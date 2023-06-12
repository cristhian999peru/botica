package com.proyecto.aplicativo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.proyecto.aplicativo.entity.Compra;
import com.proyecto.aplicativo.service.CompraService;
@RestController

public class CompraController {
@Autowired
CompraService b;
	
	@PostMapping("/Compra")
	public Compra registrar (@RequestBody Compra a) {
		return b.registrar(a);
	}
	@PutMapping("/Compra")
	public Compra actualizar   (@RequestBody Compra a) {
		return b.actualizar(a);
}
	@DeleteMapping("/Compra")
	public void eleminar (@RequestBody Compra a) {
		b.eliminar(a);
	}
	@GetMapping("/Compra")
	public List<Compra> ver(){
	
		return b.ver();
}
}
