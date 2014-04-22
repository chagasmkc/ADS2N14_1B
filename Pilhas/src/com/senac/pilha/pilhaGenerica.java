package com.senac.pilha;

public class pilhaGenerica {
	
	private int tamMax;  				// tamanho array
	private Object[] pilha;
	private int topoPilha; 
	
	public pilhaGenerica(int tamanho){ // metodo construtor
		
		tamMax = tamanho;			  // tamanho do array
		pilha = new Object[tamMax];   // cria array
		topoPilha = -1;
	}
	
	public void push(Object pilhaAdd){ // Adiciona item na pilha
		
		pilha[++topoPilha] = pilhaAdd;
	}

	public Object pop(){  //tira um item da pilha
		
		return pilha[++topoPilha];
	}

	public Object peek(){ //retorna topo da pilha
		
		return pilha[topoPilha];
	}

	public boolean empty(){	// retorna true se a pilha estiver vazia
		
		return (topoPilha == -1);
	}

	public boolean full(){ // retorna true se a pilha estiver cheia
		
		return (topoPilha == tamMax -1);
	}
	
	public int getTopoPilha(){
		
		return topoPilha;
	}
}
