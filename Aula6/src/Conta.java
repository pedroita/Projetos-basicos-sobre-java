
public class Conta{
	public int numero;
	public String titular;
	private  double saldo,limiteSaque;
	public Conta (int numero,String
			titular,double saldo,double limiteSaque) {
		this.numero = numero;
		this.titular= titular;
		this.saldo = saldo;
		this.limiteSaque = limiteSaque;
	}
	
	
	public double getsaldo() {
		return this.saldo;
	}
	public double getdeposito() {
		return this.getdeposito();
	}
	void  sacar (double valor) {
		if (this.saldo > valor && this.limiteSaque > valor)
			this.saldo = this.saldo-valor;
		else
			System.out.println("Lime ou saldo ultrapasado");
		
	}
	void depositar(double valor) {
		saldo += valor;
	}
	public boolean limite() {
		
		return true;
	}

}