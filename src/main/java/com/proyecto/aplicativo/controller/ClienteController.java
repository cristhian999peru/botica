package com.proyecto.aplicativo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.proyecto.aplicativo.entity.Cliente;
import com.proyecto.aplicativo.service.ClienteService;
@RestController
@RequestMapping("/compris")
public class ClienteController {
	@Autowired
ClienteService z;
	
	@PostMapping
	public Cliente registrar (@RequestBody Cliente a) {
		return z.registrar(a);
	}
	@PutMapping
	public Cliente actualizar   (@RequestBody Cliente a) {
		return z.actualizar(a);
}
	@DeleteMapping
	public void eleminar (@RequestBody Cliente a) {
		z.eliminar(a);
	}
	@GetMapping
	public List<Cliente> ver(){
	
		return z.ver();
}
}
