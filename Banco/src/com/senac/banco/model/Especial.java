package com.senac.banco.model;

public class Especial {
	
	private double limite;
	
	
	public Especial(double limite) {
		this.setLimite(limite);
	}
	
	
	public Double getLimite() {
		return limite;
	}
	
	public void setLimite(Double limite) {
		this.limite = limite;
	}
	
}
