package com.senac.empresa.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.senac.empresa.Repository.DevedorRepository;
import com.senac.empresa.entity.Devedor;

@RestController
@RequestMapping(value = "/devedores")
public class DevedorController {
	
	@Autowired
	private DevedorRepository repository;
	
	@GetMapping
	public List<Devedor> findAll(){
		List<Devedor> result = repository.findAll();
		
		return result;
		
		
	}

}
