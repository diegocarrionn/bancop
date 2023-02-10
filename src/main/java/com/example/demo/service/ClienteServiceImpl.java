package com.example.demo.service;

import com.example.demo.entity.ClienteEntity;
import com.example.demo.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClienteServiceImpl implements iClienteService{
    @Autowired
    private ClienteRepository repository;

    @Override
    public List<ClienteEntity> consultarClientes() {
        return (List<ClienteEntity>) this.repository.findAll();
    }

    @Override
    public ClienteEntity crearCliente(ClienteEntity cliente) {
        cliente.setClienteId(cliente.getClienteId());
        cliente.setClave(cliente.getClave());
        cliente.setEstadoCliente(cliente.getEstadoCliente());
        return this.repository.save(cliente);
    }

    @Override
    public ClienteEntity modificarCliente(ClienteEntity cliente) {
        return this.repository.save(cliente);
    }

    @Override
    public ClienteEntity buscarCliente(Integer clienteId) {
        return this.repository.findById(String.valueOf(clienteId)).get();
    }

    @Override
    public void eliminarCliente(Integer clienteId) {
        this.repository.deleteById(String.valueOf(clienteId));
    }
}