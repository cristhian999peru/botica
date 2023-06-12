package com.proyecto.aplicativo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.proyecto.aplicativo.entity.Producto;
@Repository
public interface ProductoRepository extends JpaRepository<Producto, String>{

}
