package com.example.demo.repository;

import com.example.demo.entity.MovimientosEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MovimientosRepository extends CrudRepository<MovimientosEntity,Integer> {
    public List<MovimientosEntity> findByCuentaId(Integer cuentaId);
}