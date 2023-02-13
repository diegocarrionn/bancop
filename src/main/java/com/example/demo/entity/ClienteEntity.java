package com.example.demo.entity;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "cliente")
public class ClienteEntity {
    @Id
    //@GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_cliente")
    private Integer clienteId;

    @Column(name = "clave")
    private String clave;

    @Column(name = "estado")
    private Boolean estadoCliente;
    /*
    @OneToMany(mappedBy = "cliente")
    List<CuentasEntity> cuentas;
    */

    /*public ClienteEntity(Integer clienteId, String clave, Boolean estadoCliente) {
        this.clienteId = clienteId;
        this.clave = clave;
        this.estadoCliente = estadoCliente;
    }*/

    public Integer getClienteId() {
        return clienteId;
    }

    public void setClienteId(Integer clienteId) {
        this.clienteId = clienteId;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public Boolean getEstadoCliente() {
        return estadoCliente;
    }

    public void setEstadoCliente(Boolean estadoCliente) {
        this.estadoCliente = estadoCliente;
    }
}