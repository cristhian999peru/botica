package com.proyecto.aplicativo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.proyecto.aplicativo.entity.Cuentas;
@Repository
public interface CuentasRepository extends JpaRepository<Cuentas, String>{

}
