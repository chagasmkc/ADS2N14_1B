package com.senac.pilhaGenerica;

public class PilhaGenerica {
	
	public Object[] vetor;
	public int i;
	
	
	public PilhaGenerica(){
		this.i=-1;
		this.vetor =  new Object[1000000];
	}
	
	public boolean ehVazio(){
		if(this.i==-1){
			return true;
		}
		return false;
	}

	public int tamanho(){
		if(this.ehVazio()){
			return 0;
		}
		return this.i+1;
	}

	public Object topo(){
		if(this.ehVazio()){
			return null;
		}
		return this.vetor[this.i];
	}
	public Object pop(){
		if(this.ehVazio()){
			return null;
		}
		return this.vetor[this.i--];
	}

	public void push(Object valor){
		if(this.i < this.vetor.length-1){
			this.vetor[++i]=valor;
		}
	}

}
