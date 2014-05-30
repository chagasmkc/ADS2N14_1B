package com.senac;

import java.util.Random;
import java.util.Stack;


	public class Pilha{



		public void pilha(){
			
		
			Object[] vetor=new Object[10]; 
			
	        Stack<Integer> pilha = new Stack<Integer>();
	        Random random = new Random();       

	        for (int i=0;i<10;i++){
	        	vetor[i]=pilha.push(random.nextInt(10));
	           }

	        
	        System.out.println("___________________________________");
	        System.out.println("");
	        for (int i=0;i<10;i++){
	        	System.out.println("Insera o valor "+vetor[i]);
	        }
	        
	        System.out.println("___________________________________");
	        System.out.println("");
	        for (int i=0;i<10;i++){
	            System.out.println("Retir da pilha: " + pilha.pop());       
	 
		}
	}
}
