package com.senac.banco.exception;

public class SaldoInsuficienteException extends Exception  {

	
	private static final long serialVersionUID = 1L;
	
	public SaldoInsuficienteException() {
		super("Sem saldo para saque");
	}

}
