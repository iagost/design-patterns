package br.com.iago.factory;

import br.com.iago.veiculo.caminhoes.Cacamba;
import br.com.iago.veiculo.caminhoes.Carreta;

public class CaminhaoFactory implements Factory {
	@Override
	public void fabricar(String veiculo) {
		if("Cacamba".equalsIgnoreCase(veiculo)) {
			Cacamba cacamba = new Cacamba();
			cacamba.fabricar();
		}else if("Carreta".equalsIgnoreCase(veiculo)) {
			Carreta carreta = new Carreta();
			carreta.fabricar();
		}	
	}
}
