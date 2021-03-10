package CadUsaurios;

import java.util.Scanner;

import funcionarios.Atentende;
import funcionarios.Presidente;
import funcionarios.Professor;

public class CadastrodeUsuarios {
	public void opcaoes() {
		Presidente presidente = new Presidente();
		Professor prof = new Professor();
		Atentende atedente = new Atentende();
		int opcao;
		Scanner entrada = new Scanner(System.in);
		
		do {
		System.out.println("\n\t+---------------------------------+");
		System.out.println("\n\t+ Cadastro de usuarios            +");
		System.out.println("\n\t+---------------------------------+");
		System.out.println("\n\t+ Qual usuario voce deseja cadastrar?");
		System.out.println("\n\t+---------------------------------+");
		System.out.println("\n\t+ 1- Cadastrar presidente         +");
		System.out.println("\n\t+ 2- Cadastrar professor          +");
		System.out.println("\n\t+ 3- Cadastrar atedente           +");
		System.out.println("\n\t+ 4- Encerrar cadastro            +");
		System.out.println("\n\t+ 0- Volta                         +");
		System.out.println("\n\t> Opcao:");
		 opcao= entrada.nextInt();
		 System.out.println("\n\t+Opcão selecionada : " + opcao);
		 switch (opcao) {
		 case 1:
	
			presidente.inserir();
			System.out.println("\n\t+ Realizando cadastro do presidente. +");
			
			presidente.setName("Pedro");
			presidente.setLastname("Silva");
			presidente.setCpf("37135554353");
			presidente.setE_mail("PedroitaloCampos@gmail.com");
			presidente.setPhone("85997811617");
			presidente.setMatricula(12222);
			presidente.addPresidente(presidente);
			presidente.salvar();
			//presidente.ImprimirDados();
			
			break;
		case 2:
			prof.inserir();
			System.out.println("\n\t+ Realizando cadastro  do professor. +");
			
			prof.setName("Pedro");
			prof.setLastname("Silva");
			prof.setCpf("37135554353");
			prof.setE_mail("PedroitaloCampos@gmail.com");
			prof.setPhone("85997811617");
			prof.setMatricula(122989892);
			prof.addProfessor(prof);
			prof.salvar();
			//prof.ImprimirDados();
			
			prof.inserir();
			System.out.println("\n\t+ Realizando cadastro  do professor. +");
			
			prof.setName("Douglas");
			prof.setLastname("Silva");
			prof.setCpf("555555555");
			prof.setE_mail("Não possui");
			prof.setPhone("nao possui");
			prof.setMatricula(122989892);
			prof.addProfessor(prof);
			prof.salvar();
			//prof.ImprimirDados();
			
			break;
		case 3:
			atedente.inserir();
			System.out.println("\n\t+ Realiazado cadastro do atedente. +");
			atedente.setName("Pedro");
			atedente.setLastname("Silva");
			atedente.setCpf("37135554353");
			atedente.setE_mail("PedroitaloCampos@gmail.com");
			atedente.setPhone("85997811617");
			atedente.setMatricula(122989892);
			atedente.addAtendente(atedente);
			atedente.salvar();
			//atedente.ImprimirDados();
			
			atedente.inserir();
			System.out.println("\n\t+ Realiazado cadastro do atedente. +");
			atedente.setName("joyce");
			atedente.setLastname("Silva");
			atedente.setCpf("8885848-00");
			atedente.setE_mail("joyce@gmail.com");
			atedente.setPhone("85997811617");
			atedente.setMatricula(010101);
			atedente.addAtendente(atedente);
			atedente.salvar();
			//atedente.ImprimirDados();	
			break;
		case 4:
			System.out.println("\n\t+Encerrando Cadastro +");
			break;
		case 0:
			System.out.println("Voltando....");
		default:
			System.out.println("\n\t+ Você desejou voltar ao menu anterior +");
		
		}
		
	}while (opcao !=0);
		
  }
}	
