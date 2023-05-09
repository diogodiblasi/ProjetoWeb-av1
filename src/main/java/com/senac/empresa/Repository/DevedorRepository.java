package com.senac.empresa.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.senac.empresa.entity.Devedor;

@Repository
public interface DevedorRepository extends JpaRepository<Devedor, Integer> {
}