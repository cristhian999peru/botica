package com.proyecto.aplicativo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.proyecto.aplicativo.entity.Venta;
import com.proyecto.aplicativo.service.VentaService;
@RestController
public class VentaController {
@Autowired
	VentaService h;
	@PostMapping("/Venta")
	public Venta registrar (@RequestBody Venta a) {
		return h.registrar(a);
	}
	@PutMapping("/Venta")
	public Venta actualizar   (@RequestBody Venta a) {
		return h.actualizar(a);
	}
	@DeleteMapping("/Venta")
	public void eliminar (@RequestBody 	Venta a) {
		h.eliminar(a);
	}
	@GetMapping("/Venta")
	public List<Venta> ver(){

		return h.ver();
	}

}
