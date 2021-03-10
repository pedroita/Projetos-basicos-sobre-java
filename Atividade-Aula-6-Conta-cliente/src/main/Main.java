package main;
import java.util.Scanner;
import dados_Conta.Operacoes;

import pessoa_fisica.Pessoa_Fisca;
public class Main {

	public static void main(String[] args) {
		Pessoa_Fisca cliente = new Pessoa_Fisca();
		Operacoes operacao = new Operacoes();
		
		
		System.out.println("\t----Bem-vindo---");
		System.out.println("Digite  seu nome: ");
		cliente.setNome();
		System.out.println("Digite seu sobrenome: ");
		cliente.setNome();
		System.out.println("Digite o numero da sua conta: ");
		cliente.setNumero_conta();
		
		System.out.println("Deseja realizar um deposito inicial, digite S pra sim ou N pra não :");
		Scanner entrada = new Scanner(System.in);
		char opcao;
		opcao = entrada.next().charAt(0);
		if (opcao=='s'|| opcao =='S') {
			operacao.setDeposito();
		}
		
		System.out.println("Dados da conta: " + cliente.getNumero_conta() + ",  " + "Cliente: " +
		cliente.getNome()  + ", " + cliente.getSobrenome() + ", " + "Saldo: R$ " + operacao.getSaldo());
		int selecao;
		do {
			System.out.println("Deseja realizar mais um deposito ou fazer retirada, caso queria digite 1 para deposito ou 2 pra retirada (nota é cobrado uma taxa de 5 reais por saque)"
					+ " ou 3  pra encerrar: ");
			
			
			
	        selecao = entrada.nextInt();
			if (selecao == 1) {
				operacao.setDeposito();
				System.out.println("Dados da conta: " + cliente.getNumero_conta()+ ",  " + "Cliente: " +
						cliente.getNome()  + ", " + cliente.getSobrenome() + ", " + "Saldo: R$ " + operacao.getSaldo());
						
			}else if (selecao==2) {
				operacao.setRetirada();
				System.out.println("Dados da conta: " + cliente.getNumero_conta() + ",  " + "Cliente: " +
						cliente.getNome()  + ", " + cliente.getSobrenome() + ", " + "Saldo: R$ " + operacao.getSaldo());
							
			}else {
				System.out.println("Muito obrigado!");
			}
			
		}while(selecao!=3);
		
		entrada.close();
		
	}
	
}
