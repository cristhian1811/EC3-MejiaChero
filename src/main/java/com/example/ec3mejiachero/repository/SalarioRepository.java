package com.example.ec3mejiachero.repository;

import com.example.ec3mejiachero.models.Salario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SalarioRepository  extends JpaRepository<Salario, Integer> {
}
