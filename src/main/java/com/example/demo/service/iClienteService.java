package com.example.demo.service;

import com.example.demo.entity.ClienteEntity;

import java.util.List;

public interface iClienteService {

    public List<ClienteEntity> consultarClientes();

    public ClienteEntity buscarUnCliente(Integer clienteId);

    public ClienteEntity crearCliente(ClienteEntity cliente);

    public ClienteEntity modificarCliente(ClienteEntity cliente);

    public void eliminarCliente(Integer clienteId);
}
