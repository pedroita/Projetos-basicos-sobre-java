package mostrafuncionarios;

import java.util.Scanner;

import mostraturmas.lerArquivosAlunosHidro;
import mostraturmas.lerArquivosAlunosInfantil;
import mostraturmas.lerArquivosAlunosNatacaoAdulto;

public class ExibirUsuarios {
	public void exibirArquivos() {
		
		Scanner input = new Scanner( System.in );
		int opcao ;
		
		do {
			System.out.println("\n\t+---------------------------------+");
			System.out.println("\n\t+         Bem-Vindo               +");
			System.out.println("\n\t+---------------------------------+");
			System.out.println("\n\t+ Qual dessas opções você deseja? +");
			System.out.println("\n\t+---------------------------------+");
			System.out.println("\n\t+ 1- Presidente                   +");
			System.out.println("\n\t+ 2- Professor                    +");
			System.out.println("\n\t+ 3- Atende                       +");
			System.out.println("\n\t+ 0- Voltar");
			System.out.println("\n\t+---------------------------------+");
			System.out.println("\n\t> Opcao: "); 
			
			opcao = input.nextInt();
			System.out.println("\n\t> Opcao: " + opcao);
			switch (opcao) {
			case 1:
				lerArquivosPresidente arquivo = new lerArquivosPresidente();
				break;
			case 2:
				lerArquivosProfessores arquivonatacaoinfaltil = new lerArquivosProfessores();
				break;
			case 3:
				LerArquivosAtendende arquivonatacaoadulto = new LerArquivosAtendende();
				break;
			case 0 :
				System.out.println("\n\t Voltando");
			default:
				System.out.println(" ");
				break;
			}
		}while (opcao != 0);
			System.out.println("\n\tFinal menu");
	}
}
