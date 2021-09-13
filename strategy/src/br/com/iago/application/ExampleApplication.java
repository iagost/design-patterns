package br.com.iago.application;

import br.com.iago.interfaces.ObjetoEscrever;
import br.com.iago.types.Caneta;
import br.com.iago.types.Lapis;
import br.com.iago.types.Pincel;

public class ExampleApplication {

	public static void main(String[] args) {
		ObjetoEscrever objetoEscrever = getTipoObjetoEscritura("Caneta");
		Contexto contexto = new Contexto(objetoEscrever, "Hoje é o dia do Strategy");
		contexto.iniciarEscritura();	
	}

	private static ObjetoEscrever getTipoObjetoEscritura(String tipo) {
		ObjetoEscrever objetoEscrever = null;	
		if("Lapis".equalsIgnoreCase(tipo)) {
			objetoEscrever = new Lapis();
		}else if("Caneta".equalsIgnoreCase(tipo)) {
			objetoEscrever= new Caneta();
		}else if("Pincel".equalsIgnoreCase(tipo)) {
			objetoEscrever = new Pincel();
		}
		return objetoEscrever;
	}
}
