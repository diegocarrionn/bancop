package com.example.demo.controller;

import com.example.demo.entity.ClienteEntity;
import com.example.demo.service.ClienteServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.logging.Logger;

@RestController
public class BancoController {

    static Logger logger = Logger.getLogger(BancoController.class.getName());
    @Autowired
    private ClienteServiceImpl clienteService;

    @GetMapping(path = "/api/clientes")
    public ResponseEntity<?> consultarClientes(){
        List<ClienteEntity> listaClientes = this.clienteService.consultarClientes();
        return ResponseEntity.ok(listaClientes);
    }

    @GetMapping(path = "/api/clientes/{clienteId}")
    public ResponseEntity<?> buscarCliente(@PathVariable Integer clienteId){
        ClienteEntity cliente = this.clienteService.buscarCliente(clienteId);
        return ResponseEntity.ok(cliente);
    }

    @PostMapping(path = "/api/clientes/crear")
    public ResponseEntity<?> crearCliente(@RequestBody ClienteEntity cliente){
        ClienteEntity entity = this.clienteService.crearCliente(cliente);
        return ResponseEntity.status(HttpStatus.CREATED).body(entity);
    }

    @PutMapping(path = "/api/clientes/modificar")
    public ResponseEntity<?> modificarCliente(@RequestBody ClienteEntity cliente){
        ClienteEntity entity = this.clienteService.modificarCliente(cliente);
        return ResponseEntity.status(HttpStatus.CREATED).body(entity);
    }

    @DeleteMapping(path = "/api/clientes/eliminar/{clienteId}")
    public ResponseEntity<?> eliminarCliente(@PathVariable Integer clienteId){
        this.clienteService.eliminarCliente(clienteId);
        return ResponseEntity.ok().build();
    }
}
