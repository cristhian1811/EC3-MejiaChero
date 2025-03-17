package com.example.ec3mejiachero.service;

import com.example.ec3mejiachero.models.Departamento;
import com.example.ec3mejiachero.repository.DepartamentoRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class DepartamentoService {
    private final DepartamentoRepository departamentoRepository;

    //Agregar constructor
    public DepartamentoService(DepartamentoRepository departamentoRepository) {
        this.departamentoRepository = departamentoRepository;
    }

    //listar todos los departamentos
    public List<Departamento> listarDepartamentos(){
        return departamentoRepository.findAll();
    }

    // Obtener departamento por ID
    public Optional<Departamento> obtenerDepartamentoPorId(Integer categoryId) {
        return departamentoRepository.findById(categoryId);
    }

    // Guardar una nueva departamento
    public Departamento guardarDepartamento(Departamento departamento) {
        return departamentoRepository.save(departamento);
    }
}





