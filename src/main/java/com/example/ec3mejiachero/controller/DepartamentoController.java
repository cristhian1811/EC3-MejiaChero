package com.example.ec3mejiachero.controller;

import com.example.ec3mejiachero.models.Departamento;
import com.example.ec3mejiachero.service.DepartamentoService;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("api/v1/departamento")
public class DepartamentoController {
    private final DepartamentoService departamentoService;

    public DepartamentoController(DepartamentoService departamentoService) {
        this.departamentoService = departamentoService;
    }
    @GetMapping
    public List<Departamento> listarDepartamentos() {
        return this.departamentoService.listarDepartamentos();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Departamento> obtenerDepartamentoPorId(@PathVariable Integer id) {
        Optional<Departamento> departamento = this.departamentoService.obtenerDepartamentoPorId(id);
        return departamento.map(ResponseEntity::ok)
                .orElseGet(() -> ResponseEntity.notFound().build());
    }

    @PostMapping
    public ResponseEntity<Departamento> createDepartamento(@RequestBody Departamento departamento) {
        Departamento newDepartamento = this.departamentoService.guardarDepartamento(departamento);
        return ResponseEntity.ok(newDepartamento);
    }
}
