package com.senac.view;
import java.util.*;

public class View {
	
	Scanner leia=new Scanner(System.in);
	
	public int menu(){
		System.out.println("1 - Teste palindromo");
		System.out.println("2 - Converter decimal em binario");
	
		int x=leia.nextInt();
		return x;
	}
	public String pegaPalavra(){
		System.out.println("Digite a palavra");
		String a=leia.next();
		return a;
	}
	
	public void simPalindromo(){
		System.out.println("A palavra ou n�mero informado � um palindromo!!");
	}
	public void naoPalindromo(){
		System.out.println("A palavra ou n�mero informado n�o � um palindromo!!");
	}
	public int pegaNumero(){
		System.out.println("Informe o n�mero para converter");
		int numero = leia.nextInt();
		return numero;
	}
	
}
