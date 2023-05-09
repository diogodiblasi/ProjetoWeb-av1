package com.senac.empresa.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.senac.empresa.Repository.DividaRepository;
import com.senac.empresa.entity.Divida;

@RestController
@RequestMapping(value = "/dividas")
public class DividaController {
	
	@Autowired
	private DividaRepository repository;
	
	@GetMapping
	public List<Divida> findAll(){
		List<Divida> result = repository.findAll();
		
		return result;
		
	}
	


}
