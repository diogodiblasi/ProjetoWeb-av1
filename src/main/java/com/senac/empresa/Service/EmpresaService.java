package com.senac.empresa.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.senac.empresa.Repository.EmpresaRepository;
import com.senac.empresa.entity.Empresa;

@Service
public class EmpresaService {
	
	@Autowired
	EmpresaRepository repoEmpresa;
	
	public Empresa salvar(Empresa empresa){
		return repoEmpresa.save(empresa);
	}
	
	public List<Empresa> listaTodasempresas(){
		return repoEmpresa.findAll();
	}

}
