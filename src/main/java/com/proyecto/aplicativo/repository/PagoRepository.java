package com.proyecto.aplicativo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.proyecto.aplicativo.entity.Pago;
@Repository
public interface PagoRepository extends JpaRepository<Pago, String> {

}
