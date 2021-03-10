package banco;

public class Conta {
	int numero;
	Cliente titular;
	private double saldo;
	private double limite;
	
	public void saca(double qtd) {
		if (saldo > 0 && limite > 0 ) {
			
			if (saldo >= qtd && qtd <= limite) {
				saldo -= qtd;
				System.out.println("Saque realizado com sucesso");
			}else
				System.out.println("Houve uma falha no seu saque, posivelmente limite ou saldo insuficiente");
		}
		
		
	}
	public void deposita(double qtd) {
		saldo = saldo + qtd;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	public int getNumero() {
		return numero;
	}
	
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	public double getSaldo() {
		return saldo;
	}
	
	public void setLimite(double limite) {
		this.limite = limite;
	}
	public double getLimite() {
		return limite;
	}
}
