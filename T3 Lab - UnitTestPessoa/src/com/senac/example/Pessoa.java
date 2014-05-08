package com.senac.example;


public class Pessoa {
	
	private String nome;
	private String sobrenome;
	private String telefone;
	
	public Pessoa(String nome){
		
		throws InvalidNameException {
			
			if (nome == null)
				throw new InvalidNameException();
			try {
				Double.parseDouble(nome);
				throw new InvalidNameException();
			}

			catch(InvalidNameException ine){throw ine;}
			catch(Exception e){
			}
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.telefone = null;
	}
	
	public void setNome(String nome){
		this.nome = nome;
	}
	
	public void setSobrenome(String sobrenome){
		this.sobrenome = sobrenome;
	}
	
	public String getNome(){
		return nome;
	}
	
	public String getSobrenome(){
		return sobrenome;
	}
	
	public void setTelefone(String telefone){
		this.telefone = telefone;
	}
	
	public String getTelefone(){
		return telefone;
	}

}
