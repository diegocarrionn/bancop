package com.example.demo.service;

import com.example.demo.entity.CuentasEntity;

import java.util.List;

public interface iCuentasService {

    public List<CuentasEntity> consultarCuentas();

    public CuentasEntity crearCuenta(CuentasEntity cuenta);

    public CuentasEntity modificarCuenta(CuentasEntity cuenta);

    public CuentasEntity buscarUnaCuenta(Integer cuentaId);

    public void eliminarCuenta(Integer cuentaId);
}
