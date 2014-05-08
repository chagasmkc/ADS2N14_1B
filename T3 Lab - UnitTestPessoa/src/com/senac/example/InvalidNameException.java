package com.senac.example;

public class InvalidNameException extends Exception{
	private static final long serialVersionUID = 1L;
	
	public InvalidNameException(){
		super("nome inválido");
	}

}
