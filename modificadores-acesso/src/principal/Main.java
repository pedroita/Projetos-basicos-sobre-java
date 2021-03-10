package principal;
import banco.Cliente;
import banco.Conta;
public class Main extends Conta {
	
	 public static void main (String[] args) {
		 //dados cliente1
		 Cliente cliente1 = new Cliente();
		 cliente1.setnome("Pedro");
		 cliente1.setSobrenome("Campos");
		 cliente1.setidade(37);
		 //dados conta1
		 Conta conta1 = new Conta();
		 conta1.setNumero(31);
		 cliente1.setConta(conta1);
		 conta1.setSaldo(7.000);
		 conta1.setLimite(1.000);
		 conta1.saca(400);
		 //cliente 2
		 Cliente cliente2 = new Cliente();
		 cliente2.setnome("Fabricio");
		 cliente2.setSobrenome("oliveira");
		 cliente2.setidade(37);
		 //dados conta2
		 Conta conta2 = new Conta();
		 conta2.setNumero(35);
		 cliente2.setConta(conta2);
		 conta2.setSaldo(5.000);
		 conta2.setLimite(1.000);
		 conta2.saca(10);
		 
		 //valores pra usario
		 System.out.println("Nome do Cliente: " + cliente1.getNome()  + " "  +  cliente1.getSobrenome() );
		 System.out.println("Idade: " + cliente1.getidade());
		 System.out.println("Numero da conta: " + conta1.getNumero());
		 System.out.println("Saldo da conta do cliente: " + conta1.getSaldo());
		 
		 //valores pra usario
		 System.out.println("Nome do Cliente: " + cliente2.getNome()  + " "  +  cliente2.getSobrenome() );
		 System.out.println("Idade: " + cliente2.getidade());
		 System.out.println("Numero da conta: " + conta2.getNumero());
		 System.out.println("Saldo da conta do cliente: " + conta2.getSaldo());
	 }
}
