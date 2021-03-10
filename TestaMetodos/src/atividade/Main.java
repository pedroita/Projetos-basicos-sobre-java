package atividade;
 
public class Main {
	public static void main (String[] args ) {
		Conta conta = new Conta(213,"Rodrigo",200,500);
		conta.sacar(500);
		conta.depositar(150);
		boolean deuCerto = conta.sacar(500);
		
		if (deuCerto) {
			System.out.println("Saque efetuado");
		}else {
			System.out.println("Saldo ou limite ultrapasado");
		}
		
		System.out.println("Titula: " + conta.titular );
		System.out.println("Numero: " + conta.numero);
		System.out.println("Saldo: " + conta.saldo);
		System.out.println("Limite: " + conta.limiteSaque);
		
		System.out.println();
		
		Conta conta2 = new Conta(111,"Pedro",3000,300);
	
		conta.sacar(500);
		conta.depositar(1000);
		
		System.out.println("Titula: " + conta2.titular );
		System.out.println("Numero: " + conta2.numero);
		System.out.println("Saldo: " + conta2.saldo);
		System.out.println("Limite: " + conta2.limiteSaque);
		
	 }
}
	