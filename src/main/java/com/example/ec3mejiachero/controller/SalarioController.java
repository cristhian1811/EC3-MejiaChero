package com.example.ec3mejiachero.controller;

import com.example.ec3mejiachero.models.Salario;
import com.example.ec3mejiachero.service.SalarioService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;


@RestController
@RequestMapping("api/v1/salario")
public class SalarioController {

    private  final SalarioService salarioService;

    public  SalarioController (SalarioService salarioService){
        this.salarioService = salarioService;

    }
    @GetMapping
    public List<Salario> listarSalario(){
        return  this.salarioService.listarSalario();

    }

    @GetMapping("/{id}")
    public ResponseEntity<Salario> obtenerSalarioPorId(@PathVariable Integer id){
        Optional<Salario> salario = this.salarioService.obtenerSalarioPorId(id);
        return  salario.map(ResponseEntity::ok).orElseGet(()->ResponseEntity.notFound().build());


    }
    @PostMapping
    public  ResponseEntity<Salario> createSalario(@RequestBody Salario salario){
        Salario newSalario= this.salarioService.guardarSalario(salario);
        return  ResponseEntity.ok(newSalario);
    }
}