package com.senac.palindromo;

import java.util.Scanner;

import com.senac.pilhaGenerica.PilhaGenerica;


public class Palindromo {
	
	PilhaGenerica pilha = new PilhaGenerica();
	
	Scanner entrada = new Scanner(System.in);
	int tam;

	public void teste_palindromo(){
		
		System.out.println("Digite a palavra");
		String palavra = entrada.next();
	
		tam = palavra.length();
	
		for(int i = 0 ; i <tam ; i++){
			pilha.push(palavra.charAt(i));
		}
	
		boolean controle=true;	
		int i=0;
		int j=tam-1;
	
		while(controle==true && i < tam & j > 0){
			if(pilha.vetor[i]==pilha.vetor[j]){
				i++;
				j--;
			}
			
			else
				controle=false;
		}

		if(controle){
			System.out.println("Eh palindromo");
			for(int z = 0 ; z < tam ; z++){
				System.out.print(pilha.pop());
			}
		}
			else
		if(controle==false){
			System.out.println("Nao eh palindromo");
			
			for(int z = 0 ; z < tam ; z++){
				
				System.out.print(pilha.pop());
				
			}
		
		}
	}

}