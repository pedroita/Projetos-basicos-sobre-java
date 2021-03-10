package programacao_OO;



public class Carro {
	public String cor;
	public String modelo;
	public int ano;
	
	public Motor motor;
	
	public Controlador controlado;
	
	public Carro () {
		motor = new Motor();
		
	} 
	
	public void ligar () {
		System.out.println("Ligado");
	}
	
	public void acelera() {
		System.out.println("Acelerando");
	}
	//Exibir valores
	public  void Mostra_Veiculo() {
		System.out.println("O modelo do carro é : " + modelo );
		System.out.println("A cor do carro é : " + cor);
		System.out.println("O ano do carro é : " + ano );
	}
	
	
}
