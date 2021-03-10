package dados_Conta;

import java.util.Scanner;

public class Operacoes {
	private double saldo;
	private double retirada;
	private double deposito;
	private double limite;
	Scanner entrada = new Scanner(System.in);
	public double getSaldo() {
		return saldo;
	}
	
	public double getRetirada() {
		return retirada;
	}
	public void setRetirada() {
		System.out.println("Informe o valor de retirada:");
		this.retirada = entrada.nextDouble();
	
		if (this.retirada >this.saldo + this.limite) {
			System.out.println("Não podemos realizar o saque");
		}else {
			this.saldo = this.saldo- this.retirada;
			System.out.println("RETIRDA EFETUADA!");
		}
		}
	public double getDeposito() {
		return deposito;
	}
	public void setDeposito() {
		System.out.println("Digite o valor para deposito: ");
		this.deposito = entrada.nextDouble();
		this.saldo = this.deposito;
		
	}

	public double getLimite() {
		return limite;
	}

	public void setLimite() {
		System.out.println("Informar o valor de limite de saque da sua conta: ");
		this.limite = entrada.nextDouble();
	}

	@Override
	public String toString() {
		return "Operacoes [saldo=" + saldo + ", retirada=" + retirada + ", deposito=" + deposito + ", limite=" + limite
				+ ", entrada=" + entrada + ", getSaldo()=" + getSaldo() + ", getRetirada()=" + getRetirada()
				+ ", getDeposito()=" + getDeposito() + ", getLimite()=" + getLimite() + "]";
	}
	
	
	
	
	
	
	
}
