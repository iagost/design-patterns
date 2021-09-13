package br.com.iago.types;

import br.com.iago.interfaces.ObjetoEscrever;

public class Pincel implements ObjetoEscrever{

	@Override
	public void escrever(String frase) {
		System.out.println("Frase " + frase + " escrita com Pincel.");
	}

}
