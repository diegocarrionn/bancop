package com.example.demo.entity;

import jakarta.persistence.*;
import java.math.BigDecimal;
import java.util.Date;

@Entity
@Table(name = "movimientos")
public class MovimientosEntity {
    @Id
    //@GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_movimiento")
    private Integer movimientoId;

    @Column(name = "id_cuenta")
    private Integer cuentaId;

    @Column(name = "fecha")
    private Date fechaMov;

    @Column(name = "tipo_mov")
    private String tipoMov;

    @Column(name = "valor_mov")
    private BigDecimal valorMov;

    @Column(name = "saldo")
    private BigDecimal saldoActual;

    public Integer getMovimientoId() {
        return movimientoId;
    }

    public void setMovimientoId(Integer movimientoId) {
        this.movimientoId = movimientoId;
    }

    public Integer getCuentaId() {
        return cuentaId;
    }

    public void setCuentaId(Integer cuentaId) {
        this.cuentaId = cuentaId;
    }

    public Date getFechaMov() {
        return fechaMov;
    }

    public void setFechaMov(Date fechaMov) {
        this.fechaMov = fechaMov;
    }

    public String getTipoMov() {
        return tipoMov;
    }

    public void setTipoMov(String tipoMov) {
        this.tipoMov = tipoMov;
    }

    public BigDecimal getValorMov() {
        return valorMov;
    }

    public void setValorMov(BigDecimal valorMov) {
        this.valorMov = valorMov;
    }

    public BigDecimal getSaldoActual() {
        return saldoActual;
    }

    public void setSaldoActual(BigDecimal saldoActual) {
        this.saldoActual = saldoActual;
    }
}