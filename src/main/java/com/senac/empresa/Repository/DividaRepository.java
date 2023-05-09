package com.senac.empresa.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.senac.empresa.entity.Divida;

@Repository
public interface DividaRepository extends JpaRepository<Divida, Long> {
}