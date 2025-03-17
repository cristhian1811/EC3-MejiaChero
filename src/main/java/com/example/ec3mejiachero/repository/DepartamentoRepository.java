package com.example.ec3mejiachero.repository;

import com.example.ec3mejiachero.models.Departamento;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DepartamentoRepository  extends JpaRepository<Departamento, Integer> {

}
