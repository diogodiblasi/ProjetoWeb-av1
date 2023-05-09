package com.senac.empresa.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.senac.empresa.entity.Empresa;

@Repository
public interface EmpresaRepository extends JpaRepository<Empresa, Integer> {
}