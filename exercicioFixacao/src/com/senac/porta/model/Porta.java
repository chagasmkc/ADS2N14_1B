package com.senac.porta.model;

public class Porta {
	
	private boolean aberta; // lista de atributos; alt shift r
	private boolean trancada;
	private int codigo;
	
	//construtor;
	
	public Porta(boolean estadoPorta, boolean fechadura, int codigo) {
		this.aberta = estadoPorta;
		this.trancada = fechadura;
		this.codigo = codigo;
	}
		
	//metodos acessores
	
	public boolean getEstadoPorta() {
		return aberta;
	}
	
	public boolean getFechadura() {
		return trancada;
	}
	
	public int getCodigo(){
		return codigo;
	}
	
	public void setEstadoPorta(boolean estadoPorta) {
		this.aberta = estadoPorta;
	}

	public void trancar(int codigo){
		
		if (codigo == this.codigo) {
			this.trancada = true;
		}
		
		this.trancada = false;
		
	}
	
	
}
