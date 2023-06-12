package com.proyecto.aplicativo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.proyecto.aplicativo.entity.Proveedor;
@Repository
public interface ProveedorRepository extends JpaRepository<Proveedor, String>{

}
