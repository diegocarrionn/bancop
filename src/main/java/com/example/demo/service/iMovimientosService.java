package com.example.demo.service;

import com.example.demo.entity.MovimientosEntity;
import java.util.List;

public interface iMovimientosService {

    public List<MovimientosEntity> consultarMovs();

    public MovimientosEntity buscarUnMov(Integer movId);

    public MovimientosEntity crearMov(MovimientosEntity mov);

    public MovimientosEntity modificarMov(MovimientosEntity mov);

    public void eliminarMov(Integer movId);
}
