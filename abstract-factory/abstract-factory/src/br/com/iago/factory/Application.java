package br.com.iago.factory;

import br.com.iago.model.Veiculo;

public class Application {
	private Veiculo veiculo;
	private Factory factory;
	
	public Application(Veiculo veiculo) {
		this.veiculo = veiculo;
		definirfactory();
	}
	
	public void definirfactory() {
		if("Carro".equalsIgnoreCase(veiculo.getTipo())) {
			factory = new CarroFactory();
		}else if("Moto".equalsIgnoreCase(veiculo.getTipo())) {
			factory = new MotoFactory();
		}else if("Caminhao".equalsIgnoreCase(veiculo.getTipo())) {
			factory = new CaminhaoFactory();
		}
	}
	
	public void fabricar() {
		factory.fabricar(veiculo.getNome());
	}
	
	public Veiculo getVeiculo() {
		return veiculo;
	}

	public void setVeiculo(Veiculo veiculo) {
		this.veiculo = veiculo;
	}

	public static void main(String[] args) {	
		Veiculo veiculo = new Veiculo("Polo", "Carro");	
		Application application = new Application(veiculo);
		application.fabricar();	
	}
}
