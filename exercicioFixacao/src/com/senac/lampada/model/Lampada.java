package com.senac.lampada.model;

public class Lampada {
	
	private boolean estado;

		
	public boolean getEstado() {
		return estado;
	}
	
	public void setEstado(boolean estado) {
		this.estado = estado;
	}	

	public Lampada(boolean estado){
		this.estado = estado;
		estado = true;
	}
	
}
