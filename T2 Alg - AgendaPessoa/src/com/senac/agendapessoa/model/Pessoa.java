/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.senac.agendapessoa.model;

/**
 *
 * @author michel.chagas
 */
public class Pessoa {
    
    private String nome;
    private String telefone;
    private String sexo;
    private int idade;   
    
    // ---- metodos Get
    
    public String getNome(){
        return nome;
    }

    public String getTelefone(){
        return telefone;
    }

    public String getSexo(){
        return sexo;
    }
    
    public int getIdade(){
        return idade;
    }
    

    // ---- metodos Set
    
    
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public void setTelefone(String telefone){
        this.telefone = telefone;
    }
    
    public void setSexo(String sexo){
        this.sexo = sexo;
    }
    
    public void setIdade(int idade){
        this.idade = idade;
    }
    
}