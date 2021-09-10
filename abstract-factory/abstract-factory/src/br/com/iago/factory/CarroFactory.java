package br.com.iago.factory;

import br.com.iago.veiculo.carros.Onix;
import br.com.iago.veiculo.carros.Polo;

public class CarroFactory implements Factory{
	@Override
	public void fabricar(String veiculo) {
		if("Polo".equalsIgnoreCase(veiculo)){
			Polo polo = new Polo();
			polo.fabricar();
		}else if("Onix".equalsIgnoreCase(veiculo)){
			Onix onix = new Onix();
			onix.fabricar();
		}	
	}
}
