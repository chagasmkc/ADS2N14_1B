package com.senac.banco.view;

import static java.lang.System.out;

import java.util.Scanner;

public class ContaView {
	
	private static Scanner ler = new Scanner(System.in);
	
	
	
	public String menuInicio() {
		out.println("Digite a uma op��o:"+"\n - Cadastro de Conta"+"\n - Transa��o desejada"+"\n - Sair");
		
		return ler.next();
	}

	public String entrarNome() {
		out.print("Nome:");
		
		return ler.next();
	}
	
	public String menuTipoConta () {
		out.println("Digite uma op��o:"+"\nC - Conta Comum"+"\nE - Conta Especial"+"\nI - Conta Investimento");
		
		return ler.next();
	}
	
	public String menuTransacoesConta() {
		out.println("Digite uma op��o:"+ "\n1 - Sacar"+ "\n2 - Depositar"+ "\n3 - Investimento"+ "\n4 - Saldo"+ "\nV - Voltar");

		return ler.next();
	}
	
	
	
}
