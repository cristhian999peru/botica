package com.proyecto.aplicativo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.proyecto.aplicativo.entity.Venta;
@Repository
public interface VentaRepository extends JpaRepository<Venta, String>{

}
