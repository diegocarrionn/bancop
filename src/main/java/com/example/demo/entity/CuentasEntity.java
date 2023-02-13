package com.example.demo.entity;

import jakarta.persistence.*;
import java.math.BigDecimal;
import javax.validation.constraints.Size;

@Entity
@Table(name = "cuenta")
public class CuentasEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_cuenta")
    private Integer cuentaId;

    @Column(name = "id_cliente")
    private Integer clienteId;

    @Column(name = "nro_cuenta")
    @Size(max = 10, message = "El numero de la cuenta no debe superar los 10 digitos")
    private String numeroCuenta;

    @Column(name = "tipo_cuenta")
    private String tipoCuenta;

    @Column(name = "saldo_inicial")
    private BigDecimal saldoInicial;

    @Column(name = "estado")
    private Boolean estadoCuenta;

    /*
    @ManyToOne
    private ClienteEntity cliente;
    */
    /*
    public CuentasEntity(Integer cuentaId, Integer clienteId, String numeroCuenta, String tipoCuenta,
                         BigDecimal saldoInicial, Boolean estadoCuenta) {
        this.cuentaId = cuentaId;
        this.clienteId = clienteId;
        this.numeroCuenta = numeroCuenta;
        this.tipoCuenta = tipoCuenta;
        this.saldoInicial = saldoInicial;
        this.estadoCuenta = estadoCuenta;
    }
    */

    public Integer getCuentaId() {
        return cuentaId;
    }

    public void setCuentaId(Integer cuentaId) {
        this.cuentaId = cuentaId;
    }

    public Integer getClienteId() {
        return clienteId;
    }

    public void setClienteId(Integer clienteId) {
        this.clienteId = clienteId;
    }

    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(String numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public String getTipoCuenta() {
        return tipoCuenta;
    }

    public void setTipoCuenta(String tipoCuenta) {
        this.tipoCuenta = tipoCuenta;
    }

    public BigDecimal getSaldoInicial() {
        return saldoInicial;
    }

    public void setSaldoInicial(BigDecimal saldoInicial) {
        this.saldoInicial = saldoInicial;
    }

    public Boolean getEstadoCuenta() {
        return estadoCuenta;
    }

    public void setEstadoCuenta(Boolean estadoCuenta) {
        this.estadoCuenta = estadoCuenta;
    }
}