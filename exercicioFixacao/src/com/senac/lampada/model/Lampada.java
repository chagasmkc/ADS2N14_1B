package com.senac.lampada.model;

public class Lampada {
	
	private boolean estadoLampada;

		
	public boolean getEstadoLampada() {
		return estadoLampada;
	}
	
	public void setEstado(boolean estadoLampada) {
		this.estadoLampada = estadoLampada;
	}	

	public Lampada(boolean estadoLampada){
		this.estadoLampada = estadoLampada;
		estadoLampada = false;
	}
	
}
