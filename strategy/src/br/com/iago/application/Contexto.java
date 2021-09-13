package br.com.iago.application;

import br.com.iago.interfaces.ObjetoEscrever;

public class Contexto {
	
	private ObjetoEscrever objetoEscrever;
	private String frase;

	public Contexto(ObjetoEscrever objetoEscrever, String frase) {
		this.objetoEscrever = objetoEscrever;
		this.frase = frase;
	}
	
	public void iniciarEscritura() {
		objetoEscrever.escrever(frase);
	}
}
