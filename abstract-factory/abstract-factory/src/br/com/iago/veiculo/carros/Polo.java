package br.com.iago.veiculo.carros;

import br.com.iago.veiculo.interfaces.Carro;

public class Polo implements Carro{

	@Override
	public void fabricar() {
		System.out.println("Polo fabricado.");
	}
}
