package com.senac.banco.app;

import com.senac.banco.controller.ContaController;

public class bancoApp {

	public static void main(String[] args) {
		
		ContaController controller = new ContaController();

		do {
			controller.iniciaSistema();
		} while (true);
	}
}