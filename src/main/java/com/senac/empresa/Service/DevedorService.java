package com.senac.empresa.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.senac.empresa.Repository.DevedorRepository;
import com.senac.empresa.entity.Devedor;

@Service
public class DevedorService {
	
	@Autowired
	DevedorRepository repoDevedor;
	
	public Devedor salvar(Devedor devedor){
		return repoDevedor.save(devedor);
	}

}
