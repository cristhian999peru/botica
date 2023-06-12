package com.proyecto.aplicativo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.proyecto.aplicativo.entity.Compra;
@Repository
public interface CompraRepository extends JpaRepository<Compra, String>{

}
