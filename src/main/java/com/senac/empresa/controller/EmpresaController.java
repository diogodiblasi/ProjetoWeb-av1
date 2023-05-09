package com.senac.empresa.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.senac.empresa.Repository.EmpresaRepository;
import com.senac.empresa.entity.Empresa;

@Controller
@RequestMapping(value = "/empresas")
public class EmpresaController {
	
	@Autowired
	private EmpresaRepository repository;
	
	@GetMapping
	public List<Empresa> findAll(){
		List<Empresa> result = repository.findAll();
		
		return result;	
		
	}
	
	

}
