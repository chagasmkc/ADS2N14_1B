package com.senac.porta.model;

public class Porta {
	
	private boolean estadoPorta;
	
	public boolean getEstadoPorta() {
		return estadoPorta;
	}
	
	public void setEstadoPorta(boolean estadoPorta) {
		this.estadoPorta = estadoPorta;
	}

	public Porta(boolean estadoPorta) {
		this.estadoPorta = estadoPorta;
		estadoPorta = false;
	}
	
}
