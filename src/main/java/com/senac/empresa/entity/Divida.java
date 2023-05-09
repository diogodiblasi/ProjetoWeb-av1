package com.senac.empresa.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Divida {
	
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	private double valor;
	
    @ManyToOne
    @JoinColumn(name = "empresa_id")
    private Empresa empresa;
    
    @ManyToOne
    @JoinColumn(name = "devedor_id")
    private Devedor devedor;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public Empresa getEmpresa() {
		return empresa;
	}

	public void setEmpresa(Empresa empresa) {
		this.empresa = empresa;
	}

	public Devedor getDevedor() {
		return devedor;
	}

	public void setDevedor(Devedor devedor) {
		this.devedor = devedor;
	}

    
}
