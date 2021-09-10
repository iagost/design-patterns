package br.com.iago.veiculo.carros;

import br.com.iago.veiculo.interfaces.Carro;

public class Onix implements Carro{

	@Override
	public void fabricar() {
		System.out.println("Mais um Onix fabricado.");
	}
}
