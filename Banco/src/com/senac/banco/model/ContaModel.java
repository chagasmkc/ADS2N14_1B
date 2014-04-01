package com.senac.banco.model;


public class ContaModel {
	
	private double saldo;
	private int numConta;
	private int numVerificacao;
	
	
	public ContaModel(Double saldo, int numConta, int numVerificacao) {
		this.setSaldo(saldo);
		this.setNumConta(numConta);
		this.setNumVerificacao(numVerificacao);
		
	}
	
	
	public Double getSaldo() {
		return saldo;
	}
	
	public int getConta() {
		return numConta;
	}

	public int numVerificacao() {
		return numVerificacao;
	}


	
	public void setSaldo(Double saldo) {
		this.saldo = saldo;
	}

	public void setNumConta(int numConta) {
		this.numConta = numConta;
	}
	
	public void setNumVerificacao(int numVerificacao) {
		this.numVerificacao = numVerificacao;
	}
	
	
	public void depositar (double valor) {
		this.saldo +=valor;
	
	}
	
	public void sacar(double valor) {
		
		this.saldo -= valor;
	}
		
}
