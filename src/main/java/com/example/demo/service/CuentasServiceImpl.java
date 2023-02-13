package com.example.demo.service;

import com.example.demo.entity.CuentasEntity;
import com.example.demo.repository.CuentasRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CuentasServiceImpl implements iCuentasService{

    @Autowired
    private CuentasRepository repository;

    @Override
    public List<CuentasEntity> consultarCuentas() {
        return (List<CuentasEntity>) this.repository.findAll();
    }

    @Override
    public CuentasEntity crearCuenta(CuentasEntity cuenta) {
        return null;
    }

    @Override
    public CuentasEntity modificarCuenta(CuentasEntity cuenta) {
        return null;
    }

    @Override
    public CuentasEntity buscarCuenta(Integer cuentaId) {
        return null;
    }

    @Override
    public void eliminarCuenta(Integer cuentaId) {

    }
}
