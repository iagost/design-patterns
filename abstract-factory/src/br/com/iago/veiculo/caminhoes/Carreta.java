package br.com.iago.veiculo.caminhoes;

import br.com.iago.veiculo.interfaces.Caminhao;

public class Carreta implements Caminhao {

	@Override
	public void fabricar() {
		System.out.println("Mais um Caminh�o Carreta fabricado.");
	}
}
