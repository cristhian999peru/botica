package com.proyecto.aplicativo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.proyecto.aplicativo.entity.Proveedor;
import com.proyecto.aplicativo.service.ProveedorService;
@RestController
public class ProveedorController {
	@Autowired
	ProveedorService ñ;
	@PostMapping("/Proveedor")
	public Proveedor registrar (@RequestBody Proveedor a) {
		return ñ.registrar(a);
	}
	@PutMapping("/Proveedor")
	public Proveedor actualizar   (@RequestBody Proveedor a) {
		return ñ.actualizar(a);
	}
	@DeleteMapping("/Proveedor")
	public void eliminar (@RequestBody 	Proveedor a) {
		ñ.eliminar(a);
	}
	@GetMapping("/Proveedor") 
	public List<Proveedor> ver(){

		return ñ.ver();
	}
}
