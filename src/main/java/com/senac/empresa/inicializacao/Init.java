package com.senac.empresa.inicializacao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

import com.senac.empresa.Service.DevedorService;
import com.senac.empresa.Service.DividaService;
import com.senac.empresa.Service.EmpresaService;
import com.senac.empresa.entity.Devedor;
import com.senac.empresa.entity.Divida;
import com.senac.empresa.entity.Empresa;

@Component
public class Init implements ApplicationListener<ContextRefreshedEvent> {
	
	@Autowired
	DevedorService devedorService;
	
	@Autowired
	DividaService dividaService;
	
	@Autowired
	EmpresaService empresaService;

	@Override
	public void onApplicationEvent(ContextRefreshedEvent event) {
		
		Empresa empresa1 = new Empresa();
		empresa1.setNome("Senac");
		
		Devedor devedor1 = new Devedor();
		devedor1.setNome("Senac1");
		
		
		Divida divida1 = new Divida();
		divida1.setValor(200);
		divida1.setEmpresa(empresa1);
		divida1.setDevedor(devedor1);
		
		
		
		
	}

}
