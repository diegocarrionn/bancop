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
    public CuentasEntity buscarUnaCuenta(Integer cuentaId) {
        return this.repository.findById(String.valueOf(cuentaId)).get();
    }

    @Override
    public CuentasEntity crearCuenta(CuentasEntity cuenta) {
        cuenta.setCuentaId(cuenta.getCuentaId());
        cuenta.setClienteId(cuenta.getClienteId());
        cuenta.setNumeroCuenta(cuenta.getNumeroCuenta());
        cuenta.setTipoCuenta(cuenta.getTipoCuenta());
        cuenta.setSaldoInicial(cuenta.getSaldoInicial());
        cuenta.setEstadoCuenta(cuenta.getEstadoCuenta());
        return this.repository.save(cuenta);

    }

    @Override
    public CuentasEntity modificarCuenta(CuentasEntity cuenta) { return this.repository.save(cuenta);  }

    @Override
    public void eliminarCuenta(Integer cuentaId) { this.repository.deleteById(String.valueOf(cuentaId)); }
}
