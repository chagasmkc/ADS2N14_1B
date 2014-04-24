package com.senac.contato.controller;

import java.util.Random;

import com.senac.contato.model.ContatoModel;


public class ContatoController {
	
	private Random random = new Random();
	private ContatoModel contato = new ContatoModel();
	
	public String gerarNome() {
		
		
		int nomeAleatorio, sobrenomeAleatorio;
		
		String nomes [] = {"Michel","Marisa","Julia","Sofia","Lara","Maria","Joao","Pedro","Paulo","Mario","Joana","Homer"};
		String sobrenomes [] = {"Chagas","Knob","Gomes","Silva","Pereira","Oliveira","Senado","Castro","Silveira","Java","Linux","Simpson"};
		String nomeRand = "";
		String sobrenomeRand = "";
		
		nomeAleatorio = random.nextInt(20);
		sobrenomeAleatorio = random.nextInt(20);
		
		nomeRand = nomes[nomeAleatorio];
		sobrenomeRand = sobrenomes[sobrenomeAleatorio];
		
		return nomeRand+" "+sobrenomeRand;
		
	}
	
	public String gerarEndereco(){
		
		 int nrAleatorioEndereco;  
       
	     String enderecos [] = {"Olavo Bilac","Marechal Floriano","Getulio Vargas","A","B","C","Sem saída","Sem saída","S"};
	           
	          
	     Random random = new Random();  
	      
                 
	     nrAleatorioEndereco = random.nextInt(5);
	                      
        return enderecos[nrAleatorioEndereco];
	                
	}

	public String gerarTipoTelefone() {

		 int tipoTelefoneAleatorio;  
      
	     String tipos [] = {"R","C","T"};

	     tipoTelefoneAleatorio = random.nextInt(3);

       return tipos[tipoTelefoneAleatorio];

	}
	
	public String geraTelefone() { 

		return (this.random.nextInt(1000-100)+100) + "-" + (this.random.nextInt(10000-1000)+1000);

	}
	
	public void gerarCadastro(){  

		this.contato.setNome(this.gerarNome());
		this.contato.setEndereco(this.gerarEndereco());
		this.contato.setTelefone(this.gerarTipoTelefone());
		this.contato.setTipo(this.gerarTipoTelefone());

		view.imprimeCliente(this.contato.getNome(), this.contato.getEndereco(), this.contato.getTelefone(), this.contato.getTipo()); // 

	}
}
