package com.example.ec3mejiachero.service;

import com.example.ec3mejiachero.models.Empleado;
import com.example.ec3mejiachero.repository.EmpleadoRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmpleadoService {
    private final EmpleadoRepository empleadoRepository;

    //agregar constructor

    public EmpleadoService(EmpleadoRepository empleadoRepository) {
        this.empleadoRepository = empleadoRepository;
    }

    //listar los empleados
    public List<Empleado> listarEmpleado(){
        return  empleadoRepository.findAll();

    }
    // Obtener enpleado por id

    public Optional<Empleado> obtenerEmpleadoPorId(Integer empleadoId){
        return  empleadoRepository.findById(empleadoId);
    }
    //guardar empleado
    public  Empleado guardarEmpleado(Empleado empleado){
        return empleadoRepository.save(empleado);
    }
}
