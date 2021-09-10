package br.com.iago.factory;

import br.com.iago.veiculo.motos.Bros;

public class MotoFactory implements Factory{
	@Override
	public void fabricar(String veiculo) {
		if("Bros".equalsIgnoreCase(veiculo)) {
			Bros bros = new Bros();
			bros.fabricar();
		}	
	}
}
