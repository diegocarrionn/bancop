package com.example.demo.controller;

import com.example.demo.entity.ClienteEntity;
import com.example.demo.entity.CuentasEntity;
import com.example.demo.entity.MovimientosEntity;
import com.example.demo.repository.MovimientosRepository;
import com.example.demo.service.ClienteServiceImpl;
import com.example.demo.service.CuentasServiceImpl;
import com.example.demo.service.MovimientosServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.logging.Logger;

@RestController
public class BancoController {

    static Logger logger = Logger.getLogger(BancoController.class.getName());
    @Autowired
    private ClienteServiceImpl clienteService;

    @Autowired
    private CuentasServiceImpl cuentasService;

    @Autowired
    private MovimientosServiceImpl movimientosService;

    @Autowired
    private MovimientosRepository repository;

    @GetMapping(path = "/api/clientes")
    public ResponseEntity<?> consultarClientes(){
        List<ClienteEntity> listaClientes = this.clienteService.consultarClientes();
        return ResponseEntity.ok(listaClientes);
    }

    @GetMapping(path = "/api/clientes/{clienteId}")
    public ResponseEntity<?> buscarUnCliente(@PathVariable Integer clienteId){
        ClienteEntity cliente = this.clienteService.buscarUnCliente(clienteId);
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

    @ExceptionHandler(NoSuchElementException.class)
    public ResponseEntity<String> handleNoSuchElementFoundException(NoSuchElementException exception) {
        return ResponseEntity
                .status(HttpStatus.NOT_FOUND)
                .body(exception.getMessage());
    }

    @GetMapping(path = "/api/cuentas")
    public ResponseEntity<?> consultarCuentas(){
        List<CuentasEntity> listaCuentas = this.cuentasService.consultarCuentas();
        return ResponseEntity.ok(listaCuentas);
    }

    @GetMapping(path = "/api/cuentas/{cuentaId}")
    public ResponseEntity<?> buscarUnaCuenta(@PathVariable Integer cuentaId){
        CuentasEntity cuenta = this.cuentasService.buscarUnaCuenta(cuentaId);
        return ResponseEntity.ok(cuenta);
    }

    @PostMapping(path = "/api/cuentas/crear")
    public ResponseEntity<?> crearCuenta(@RequestBody CuentasEntity cuenta){
        CuentasEntity entity = this.cuentasService.crearCuenta(cuenta);
        return ResponseEntity.status(HttpStatus.CREATED).body(entity);
    }

    @PutMapping(path = "/api/cuentas/modificar")
    public ResponseEntity<?> modificarCuenta(@RequestBody CuentasEntity cuenta){
        CuentasEntity entity = this.cuentasService.modificarCuenta(cuenta);
        return ResponseEntity.status(HttpStatus.CREATED).body(entity);
    }

    @DeleteMapping(path = "/api/cuentas/eliminar/{cuentaId}")
    public ResponseEntity<?> eliminarCuenta(@PathVariable Integer cuentaId){
        this.cuentasService.eliminarCuenta(cuentaId);
        return ResponseEntity.ok().build();
    }

    @GetMapping(path = "/api/movimientos")
    public ResponseEntity<?> consultarMovs(){
        List<MovimientosEntity> listaMovs = this.movimientosService.consultarMovs();
        return ResponseEntity.ok(listaMovs);
    }

    @GetMapping(path = "/api/movimientos/{movId}")
    public ResponseEntity<?> buscarUnMov(@PathVariable Integer movId){
        MovimientosEntity mov = this.movimientosService.buscarUnMov(movId);
        return ResponseEntity.ok(mov);
    }

    @GetMapping(path = "/api/movimientos/cuenta")
    public ResponseEntity<List<MovimientosEntity>> buscarMovsCta(@RequestParam Integer cuentaId){
        return new ResponseEntity<>(repository.findByCuentaId(cuentaId), HttpStatus.OK);
    }

    @PostMapping(path = "/api/movimientos/crear")
    public ResponseEntity<?> crearMov(@RequestBody MovimientosEntity mov){
        MovimientosEntity entity = this.movimientosService.crearMov(mov);
        return ResponseEntity.status(HttpStatus.CREATED).body(entity);
    }

    @PutMapping(path = "/api/movimientos/modificar")
    public ResponseEntity<?> modificarMov(@RequestBody MovimientosEntity mov){
        MovimientosEntity entity = this.movimientosService.modificarMov(mov);
        return ResponseEntity.status(HttpStatus.CREATED).body(entity);
    }

    @DeleteMapping(path = "/api/movimientos/eliminar/{movId}")
    public ResponseEntity<?> eliminarMov(@PathVariable Integer movId){
        this.movimientosService.eliminarMov(movId);
        return ResponseEntity.ok().build();
    }

}
