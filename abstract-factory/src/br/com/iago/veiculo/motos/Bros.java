package br.com.iago.veiculo.motos;

import br.com.iago.veiculo.interfaces.Moto;

public class Bros implements Moto {

	@Override
	public void fabricar() {
		System.out.println("Mais uma Bros fabricada.");
	}

}
