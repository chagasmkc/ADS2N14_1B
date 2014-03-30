package com.senac.banco.model;

public class Conta {
	
	private double saldo;
	private int numConta;
	private int numVerificacao;
	
	
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
	
}
