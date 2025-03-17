package com.example.ec3mejiachero.controller;

import com.example.ec3mejiachero.models.Empleado;
import com.example.ec3mejiachero.service.EmpleadoService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("api/v1/empleado")
public class EmpleadoController {

    private  final EmpleadoService empleadoService;

    public  EmpleadoController (EmpleadoService empleadoService){
        this.empleadoService = empleadoService;

    }
    @GetMapping
    public List<Empleado> listarEmpleado(){
        return  this.empleadoService.listarEmpleado();

    }

    @GetMapping("/{id}")
    public ResponseEntity<Empleado> obtenerEmpleadoPorId(@PathVariable Integer id){
        Optional<Empleado> empleado = this.empleadoService.obtenerEmpleadoPorId(id);
        return  empleado.map(ResponseEntity::ok).orElseGet(()->ResponseEntity.notFound().build());


    }
    @PostMapping
    public  ResponseEntity<Empleado> createEmpleado(@RequestBody Empleado empleado){
        Empleado newEmpleado= this.empleadoService.guardarEmpleado(empleado);
        return  ResponseEntity.ok(newEmpleado);
    }
}
