package com.example.ec3mejiachero.service;

import com.example.ec3mejiachero.models.Salario;
import com.example.ec3mejiachero.repository.SalarioRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SalarioService {
    private final SalarioRepository salarioRepository;

    //agregar constructor

    public SalarioService(SalarioRepository salarioRepository) {
        this.salarioRepository = salarioRepository;
    }

    //listar los salarios
    public List<Salario> listarSalario(){
        return  salarioRepository.findAll();

    }
    // Obtener salario por id

    public Optional<Salario> obtenerSalarioPorId(Integer salarioId){
        return  salarioRepository.findById(salarioId);
    }
    //guardar empleado
    public  Salario guardarSalario(Salario salario){
        return salarioRepository.save(salario);
    }
}
