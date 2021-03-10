/* Nome : Pedro Italo Campos Da Silva;
 * Matricula: 428065;
 * */
package execucao.programa;

import java.util.Scanner;

import CadAlunos.CadAlunos;
import CadUsaurios.CadastrodeUsuarios;
import funcionarios.Atentende;
import funcionarios.Presidente;
import funcionarios.Professor;
import menu.visual.Menu;
import mostraturmas.MostrarTurmas;
import turmas.Hidroginastica;
import mostrafuncionarios.ExibirUsuarios;
public class Principal {

	public static void main(String[] args) {
		Menu menu = new Menu ();
		CadastrodeUsuarios caduser = new CadastrodeUsuarios();
		CadAlunos aluno = new CadAlunos();
		MostrarTurmas exbirturmas = new MostrarTurmas();
		ExibirUsuarios exibiruser = new ExibirUsuarios();
		Scanner entrada = new Scanner(System.in);
		int opcaoes=0;
		
		do {
			menu.menu();
			opcaoes= entrada.nextInt();
			System.out.println("\n\t>Você selecionou: " + opcaoes );
			switch (opcaoes) {
			case 1:
				caduser.opcaoes();
				break;
			case 2:
				aluno.OpcaoesTurmas();
				break;
			case 3:
				exbirturmas.exibirArquivos();
				break;
			case 4:
				exibiruser.exibirArquivos();
				break;
			case 0:
				System.out.println("\n\tSaindo...");
			default:
				
				break;
			}
			
			
			
		}while(opcaoes!=0);
		System.out.println("\n\tPrograma Finalizado!");
		
	}

	
}

