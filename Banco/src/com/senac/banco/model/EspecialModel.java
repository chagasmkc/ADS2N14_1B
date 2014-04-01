package com.senac.banco.model;

public class EspecialModel extends ContaModel {
	
	private double limite;
	
	public EspecialModel(Double saldo, int numConta, int numVerificacao) {
		super(saldo, numConta, numVerificacao);
		setLimite(limite);
		
		// TODO Auto-generated constructor stub
	}
		
	public Double getLimite() {
		return limite;
	}
	
	public void setLimite(Double limite) {
		this.limite = limite;
	}
	
}
