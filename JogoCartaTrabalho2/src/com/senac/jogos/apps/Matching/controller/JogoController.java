package com.senac.jogos.apps.Matching.controller;

import static java.lang.System.out;
import java.util.Scanner;

import com.senac.jogos.Jogador;
import com.senac.jogos.apps.Matching.model.MatchingCardGame;
import com.senac.jogos.cartas.Carta;

public class JogoController {
	
	private MatchingCardGame jogo;
	private Carta cartaJogador;
	
	public JogoController(){
		jogo = new MatchingCardGame();
		cartaJogador = null;
	}
	
	public void playTurno(){
		int pontos = jogo.matchCarta(cartaJogador);
		jogo.getprimeiroJogador().addPontos(pontos);
		// descartar carta
		jogo.setMesa(cartaJogador);
		cartaJogador = null;
	}
	
	public String numeroJogador()
	{
		Scanner teclado = new Scanner(System.in);
		
		out.print("Endre com o Número de Jogadores entre 1 e 4 ");

		String comandojogador = teclado.next();

		if (comandojogador.equalsIgnoreCase("1")){
			out.println("Um Jogador:");
			out.println("Carta na mesa: " + showMesa());
		}
		
		else if (comandojogador.equalsIgnoreCase("2")){
			out.println("Dois Jogadores");
			out.println("Cartas na mesa: " + showMesa());
		}
		
		else if (comandojogador.equalsIgnoreCase("3")){
			out.println("Tres Jogadores");
			out.println("Cartas na mesa: " + showMesa());
		}
		
		else if (comandojogador.equalsIgnoreCase("4")){
			out.println("Quatro Jogadores");
			out.println("Cartas na mesa: " + showMesa());
		}
		else{
			out.println("Valor informado e invalido!");
		}

		return comandojogador;
	}
	
	public String showJogador(Jogador jogador){
		return String.format("Pontos: %d", jogo.getprimeiroJogador().getPontos());
	}
	
	public String showCarta(Carta carta){
		return String.format("%d%c",
			    carta.getValor(),
			    carta.getNaipe());
	}

	public String showMesa()
	{
		return showCarta(jogo.getMesa());
	}

	public String showCartaJogador()
	{
		if (cartaJogador == null)
			cartaJogador = jogo.drawCarta();
		return showCarta(cartaJogador);
	}
}