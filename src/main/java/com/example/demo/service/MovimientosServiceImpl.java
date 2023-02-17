package com.example.demo.service;

import com.example.demo.entity.MovimientosEntity;
import com.example.demo.repository.MovimientosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MovimientosServiceImpl implements iMovimientosService {

    @Autowired
    private MovimientosRepository repository;

    @Override
    public List<MovimientosEntity> consultarMovs() { return (List<MovimientosEntity>) this.repository.findAll(); }

    @Override
    public MovimientosEntity buscarUnMov(Integer movId) {
        return this.repository.findById(movId).get();
    }

    @Override
    public MovimientosEntity crearMov(MovimientosEntity mov) {
        mov.setMovimientoId(mov.getMovimientoId());
        mov.setCuentaId(mov.getCuentaId());
        mov.setFechaMov(mov.getFechaMov());
        mov.setTipoMov(mov.getTipoMov());
        mov.setValorMov(mov.getValorMov());
        mov.setSaldoActual(mov.getSaldoActual());
        return this.repository.save(mov);
    }

    @Override
    public MovimientosEntity modificarMov(MovimientosEntity mov) { return this.repository.save(mov); }

    @Override
    public void eliminarMov(Integer movId) { this.repository.deleteById(movId); }
}
