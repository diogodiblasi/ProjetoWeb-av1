package com.senac.empresa.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;

import com.senac.empresa.Repository.DividaRepository;
import com.senac.empresa.entity.Divida;

@Service
public class DividaService {
	
	@Autowired
	DividaRepository repoDivida;
	
	@PostMapping
	public Divida salvar(Divida divida){
		return repoDivida.save(divida);
	}
	
	

}
