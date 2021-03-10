package mostraturmas;

import java.util.Scanner;

public class MostrarTurmas {
	public void exibirArquivos() {
		
		Scanner input = new Scanner( System.in );
		int opcao ;
		
		do {
			System.out.println("\n\t+---------------------------------+");
			System.out.println("\n\t+         Bem-Vindo               +");
			System.out.println("\n\t+---------------------------------+");
			System.out.println("\n\t+ Qual dessas opções você deseja? +");
			System.out.println("\n\t+---------------------------------+");
			System.out.println("\n\t+ 1- Turma Hidroginastica         +");
			System.out.println("\n\t+ 2- Turma Natação Infantil       +");
			System.out.println("\n\t+ 3- Turma Natação Adulto         +");
			System.out.println("\n\t+ 0- Voltar");
			System.out.println("\n\t+---------------------------------+");
			System.out.println("\n\t>Opcao: ");
			
			opcao = input.nextInt();
			System.out.println("\n\t >Opcao Selecionada: " + opcao);
			switch (opcao) {
			case 1:
				lerArquivosAlunosHidro arquivo = new lerArquivosAlunosHidro();
				break;
			case 2:
				lerArquivosAlunosInfantil arquivonatacaoin = new lerArquivosAlunosInfantil();
				break;
			case 3:
				lerArquivosAlunosNatacaoAdulto arquivonatacaoadulto = new lerArquivosAlunosNatacaoAdulto();
				break;
			case 0 :
				System.out.println("\n\tVoltando");
			default:
				System.out.println(" ");
				break;
			}
		}while (opcao != 0);
			System.out.println("\n\tFinal menu");
	}
}
