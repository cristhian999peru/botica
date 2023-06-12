package com.proyecto.aplicativo.service;

import java.util.List;

import com.proyecto.aplicativo.entity.Pago;

public interface PagoService {

public Pago registrar (Pago a);
public Pago actualizar (Pago a);
public void eliminar (Pago a);
public List<Pago>ver();
}
