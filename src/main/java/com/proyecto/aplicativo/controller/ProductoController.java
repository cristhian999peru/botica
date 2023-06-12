package com.proyecto.aplicativo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.proyecto.aplicativo.entity.Producto;
import com.proyecto.aplicativo.service.ProductoService;
@RestController
public class ProductoController {
@Autowired
ProductoService	 y;

@PostMapping("/Producto")
public Producto registrar (@RequestBody Producto a) {
	return y.registrar(a);
}
@PutMapping("/Producto")
public Producto actualizar   (@RequestBody Producto a) {
	return y.actualizar(a);
}
@DeleteMapping("/Producto")
public void eliminar (@RequestBody 	Producto a) {
	y.eliminar(a);
}
@GetMapping("/Producto")
public List<Producto> ver(){

	return y.ver();
}

}
