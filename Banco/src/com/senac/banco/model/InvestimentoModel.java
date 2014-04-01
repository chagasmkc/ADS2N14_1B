package com.senac.banco.model;

public class InvestimentoModel extends ContaModel {
	
	private int dataCriacao;
		
		
	public InvestimentoModel(Double saldo, int numConta, int numVerificacao) {
		super(saldo, numConta, numVerificacao);
		setDataCriacao(dataCriacao);
		
		// TODO Auto-generated constructor stub
		
	}
	
	public int getData() {
		return dataCriacao;
	}

	public void setDataCriacao(int dataCriacao) {
		this.dataCriacao = dataCriacao;
	}


}



