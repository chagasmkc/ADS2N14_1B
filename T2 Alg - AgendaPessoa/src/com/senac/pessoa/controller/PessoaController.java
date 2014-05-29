package com.senac.pessoa.controller;


import java.util.Random;

import com.senac.pessoa.model.PessoaModel;

import com.senac.pessoa.view.PessoaView;


public class PessoaController {
	
	private PessoaModel pessoa = new PessoaModel(); // atributos
	private PessoaView view = new PessoaView();
	Random geraRandon = new Random(); 

	
	public String gerarNome(){  // Gera nomes aleatórios.
		
		 int nomeAleatorio,sobrenomeAleatorio;  
         
	     String nomes [] = {"Michel","Marisa","Julia","Sofia","Lara","Maria","Joao","Pedro","Paulo","Mario","Joana","Homer","Bruno","Carlos","Eduardo","Breno","Mara","Douglas","Camila","Paula"};
	     String sobrenomes [] ={"Chagas","Knob","Gomes","Silva","Pereira","Oliveira","Sedano","Castro","Silveira","Java","Linux","Simpson","Kratos","Rene","Alves","Testa","Santos","Bros","Coimbra","Cotto"};
	     String nome = "";
	     String sobrenome = "";
	               
	     nomeAleatorio = geraRandon.nextInt(20);
	     sobrenomeAleatorio = geraRandon.nextInt(20);  
              
         nome = nomes[nomeAleatorio];
         sobrenome = sobrenomes[sobrenomeAleatorio]; 
		
	     return nome+" "+sobrenome;
	                
	}
	
	public String gerarEndereco(){ // Gera os endereços.
		
		 int enderecoAleatorio;  
        
	     String enderecos [] = {"Olavo Bilac","Marechal Floriano","Getulio Vargas","A","B","C","Sem saída","Sem saída","S","Das Grotas","das Paineiras","das Pedras"};
	                             
	     enderecoAleatorio = geraRandon.nextInt(12);
	                      
         return enderecos[enderecoAleatorio];
	                
	}
	
	public String gerarTipoTelefone(){   // Sorteia telefones
		
		 int tipoTelefoneAleatorio;  
       
	     String tipos [] = {"R","C","T"};
	                             
	     tipoTelefoneAleatorio = geraRandon.nextInt(3);
	                      
        return tipos[tipoTelefoneAleatorio];
	                
	}
	
	public String geraTelefone(){ //Gera os telefones.
		
		return (this.geraRandon.nextInt(1000-100)+100) + "-" + (this.geraRandon.nextInt(10000-1000)+1000);
		
	}
	
	public void gerarCadastro(){  // Sorteia nome e endereço e manda para o Model.
		
		this.pessoa.setNome(this.gerarNome());
		this.pessoa.setEndereco(this.gerarEndereco());
		this.pessoa.setTelefone(this.geraTelefone());
		this.pessoa.setTipo(this.gerarTipoTelefone());
	
		view.imprimeCliente(this.pessoa.getNome(), this.pessoa.getEndereco(), this.pessoa.getTelefone(), this.pessoa.getTipo()); // 
		
	}

}