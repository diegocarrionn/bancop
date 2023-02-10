package com.example.demo.service;

import com.example.demo.entity.ClienteEntity;

import java.util.List;

public interface iClienteService {

    public List<ClienteEntity> consultarClientes();

    public ClienteEntity crearCliente(ClienteEntity cliente);

    public ClienteEntity modificarCliente(ClienteEntity cliente);

    public ClienteEntity buscarCliente(Integer clienteId);

    public void eliminarCliente(Integer clienteId);
}
