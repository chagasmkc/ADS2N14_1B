package com.senac.jogos.apps.Matching.model;

import com.senac.jogos.Jogador;
import com.senac.jogos.cartas.Baralho;
import com.senac.jogos.cartas.Carta;

public class MatchingCardGame {
	
	private Baralho baralho;
	private Jogador primeiroJogador;
	private Jogador segundoJogador;
	private Jogador terceiroJogador;
	private Jogador quartoJogador;
	private Carta mesa;
	
	public MatchingCardGame(){
		
		baralho = new Baralho();
		primeiroJogador = new Jogador();
		segundoJogador = new Jogador();
		terceiroJogador = new Jogador();
		quartoJogador = new Jogador();
		mesa = baralho.drawCarta();
	}
	
	public int matchCarta(Carta carta){
		int  score = -1;
		
		if(carta.getNaipe() == mesa.getNaipe())
			score = 1;
		if(carta.getValor() == mesa.getValor())
			score = 4;
		
		return score;
	}
	
	public void setMesa(Carta carta){
		mesa = carta;
	}
	
	public Carta getMesa(){
		return mesa;
	}

	public Carta drawCarta()
	{
		return baralho.drawCarta();
	}

	public Jogador getprimeiroJogador()
	{
		return primeiroJogador;
	}
	
	public Jogador getsegundoJogador()
	{
		return segundoJogador;
	}
	
	public Jogador getterceiroJogador()
	{
		return terceiroJogador;
	}
	
	public Jogador getquartoJogador()
	{
		return quartoJogador;
	}
}