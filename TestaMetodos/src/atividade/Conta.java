package atividade;

public class Conta{
	public int numero;
	public String titular;
	public double saldo,limiteSaque;
	public Conta (int numero,String
			titular,double saldo,double limiteSaque) {
		this.numero = numero;
		this.titular= titular;
		this.saldo = saldo;
		this.limiteSaque = limiteSaque;
	}
	
	public boolean sacar (double valor) {
		if (saldo <= valor || limiteSaque < valor)
			return false;
		else {
			saldo -=valor;
			return true;
		}
		
	}
	void depositar(double valor) {
		saldo += valor;
	}
	public boolean limite() {
		
		return true;
	}
}
