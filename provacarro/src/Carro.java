
public class Carro {
	String modelo;
	int velocidadeAtual;
	Motor motor;
	public Carro() {
		motor = new Motor();
	}
	public void liga() {
		System.out.println("Carro Ligado");
	}
	public void acelerar() {
		System.out.println("Acelerando");
	}
	
	public void motorCarro() {
		motor.potencia=1.6;
		
	}
	public void tipoVeiculo() {
		motor.tipo = "Carro de passeio";
	}
}
