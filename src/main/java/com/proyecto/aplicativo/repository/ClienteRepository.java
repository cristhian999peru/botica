package com.proyecto.aplicativo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.proyecto.aplicativo.entity.Cliente;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente, String> {

}
