package com.senac.pessoa.app;

import com.senac.pessoa.controller.PessoaController;

public class PessoaApp {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		PessoaController pessoa = new PessoaController();
		
		for(int i = 0; i < 50; i++){
		
			pessoa.gerarCadastro();
		}
	}

}
