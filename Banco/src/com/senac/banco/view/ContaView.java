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
	
	
}
