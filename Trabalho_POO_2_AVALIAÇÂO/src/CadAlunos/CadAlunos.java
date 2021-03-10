package CadAlunos;

import java.util.Scanner;

import ficha.de.incricao.Genero;
import ficha.de.incricao.Turno;
import turmas.Hidroginastica;
import turmas.NatacaoAlduto;
import turmas.NatacaoInfantil;

public class CadAlunos {
	public void OpcaoesTurmas() {
		int opcao;
		Scanner entrada = new Scanner(System.in);
		Hidroginastica hidro = new Hidroginastica();
		NatacaoInfantil natinfatil = new NatacaoInfantil();
		NatacaoAlduto natacaoadulto= new NatacaoAlduto();
		do {
			System.out.println("\n\t+---------------------------------+");
			System.out.println("\n\t+         Cadastro de turmas    +");
			System.out.println("\n\t+---------------------------------+");
			System.out.println("\n\t Qual usuario voce deseja cadastrar?");
			System.out.println("\n\t+---------------------------------+");
			System.out.println("\n\t+ 1- Turma de hidroginastica      +");
			System.out.println("\n\t+ 2- Turma natação infantil       +");
			System.out.println("\n\t+ 3- Turma natação adulta         +");
			System.out.println("\n\t+ 0- Volta                         +");
			System.out.println("\n\t> Opcao: ");
			opcao= entrada.nextInt();
			System.out.println("\n\t+ Opcão selecionada :" + opcao);
			switch (opcao) {
			case 1:
				System.out.println("\n\t Cadastrando aluno na turma de hidroginastica");
				System.out.println("\n\t Selecione uma das opcaoes abaixo");
				System.out.println("\n\t 1. Manha");
				System.out.println("\n\t 2.Tarde");
				System.out.println("\n\t 3.Noite");
				System.out.println("\n\t 4.Sair");
				System.out.println("\n\t > Opção: ");
				opcao = entrada.nextInt();
				System.out.println("\n\t+ Opcão selecionada :" + opcao);
				if (opcao == 1) {
					hidro.inserir();
					hidro.setTurno(Turno.MANHA);
					hidro.setNomealuno("SILVA");
					hidro.setDatanascimento("19/03/1998");
					hidro.setEstadocivil("Solteiro");
					hidro.setEmail("Jouce@gmail.com");
					hidro.setEndereco("Travessa joao afonso");
					hidro.setTelefone("(88) 99430-555");
					hidro.setTelefoneSecundario("Não possui");
					hidro.setComplemento("Não possui");
					hidro.setAltura(1.59);
					hidro.setPeso(59.0);
					hidro.setIdade(22);
					hidro.setDatadepagamento("01");
					hidro.setMatricula(2525);
					hidro.setHorario_turma("5:30H");
					hidro.setTurma("MANHA");
					hidro.diaParaPagamento();
					hidro.setGenero(Genero.MASCULINO);
					hidro.addAluno(hidro);
					hidro.salvar();
					
				}else if (opcao == 2 ) {
					hidro.inserir();
					hidro.setTurno(Turno.TARDE);
					hidro.setNomealuno("joaozinho CORDEIRO");
					hidro.setDatanascimento("19/03/1998");
					hidro.setEstadocivil("Solteiro");
					hidro.setEmail("Jouce@gmail.com");
					hidro.setEndereco("Travessa joao afonso");
					hidro.setTelefone("(88) 99430-555");
					hidro.setTelefoneSecundario("Não possui");
					hidro.setComplemento("Não possui");
					hidro.setMatricula(2525);
					hidro.setHorario_turma("15:30H");
					hidro.setTurma("TARDE");
					hidro.setAltura(1.59);
					hidro.setPeso(59.0);
					hidro.setIdade(22);
					hidro.diaParaPagamento();
					hidro.setGenero(Genero.MASCULINO);
					hidro.addAluno(hidro);
					hidro.salvar();
			
				}else if (opcao == 3) {
					hidro.inserir();
					hidro.setTurno(Turno.NOITE);	
					hidro.setNomealuno("rodrigo CORDEIRO");
					hidro.setDatanascimento("19/03/1998");
					hidro.setEstadocivil("Solteiro");
					hidro.setEmail("Jouce@gmail.com");
					hidro.setEndereco("Travessa joao afonso");
					hidro.setTelefone("(88) 99430-555");
					hidro.setTelefoneSecundario("Não possui");
					hidro.setComplemento("Não possui");
					hidro.setMatricula(2525);
					hidro.setHorario_turma("18:30H");
					hidro.setTurma("NOITE");
					hidro.setAltura(1.59);
					hidro.setPeso(59.0);
					hidro.setIdade(22);
					hidro.diaParaPagamento();
					hidro.setGenero(Genero.MASCULINO);
					hidro.addAluno(hidro);
					hidro.salvar();
				
				}else {
					System.out.println(" Voltando");
					
				}
				break;
			case 2:
				System.out.println("\n\t Cadastrando aluno na turma natação infantil");
				System.out.println("\n\t Selecione uma das opcaoes abaixo");
				System.out.println("\n\t 1.Tarde");
				System.out.println("\n\t 2.Noite");
				System.out.println("\n\t 3.Sair");
				System.out.println("\n\t > Opção: ");
				opcao = entrada.nextInt();
				System.out.println("\n\t+ Opcão selecionada :" + opcao);
				if (opcao == 1 ) {
					natinfatil.inserir();
					natinfatil.setTurno(Turno.TARDE);
					natinfatil.setNomealuno("CORDEIRO");
					natinfatil.setDatanascimento("19/03/1998");
					natinfatil.setEstadocivil("Solteiro");
					natinfatil.setEmail("Jouce@gmail.com");
					natinfatil.setEndereco("Travessa joao afonso");
					natinfatil.setTelefone("(88) 99430-555");
					natinfatil.setTelefoneSecundario("Não possui");
					natinfatil.setComplemento("Não possui");
					natinfatil.setMatricula(2525);
					natinfatil.setHorario_turma("15:30H");
					natinfatil.setAltura(1.59);
					natinfatil.setPeso(59.0);
					natinfatil.setIdade(22);
					natinfatil.diaParaPagamento();
					natinfatil.setGenero(Genero.MASCULINO);
					natinfatil.addAluno(natinfatil);
					natinfatil.salvar();
					
					
			
				}else if (opcao == 2) {
					natinfatil.inserir();
					natinfatil.setTurno(Turno.NOITE);
					natinfatil.setNomealuno("fui ali");
					natinfatil.setDatanascimento("19/03/1998");
					natinfatil.setEstadocivil("Solteiro");
					natinfatil.setEmail("Jouce@gmail.com");
					natinfatil.setEndereco("Travessa joao afonso");
					natinfatil.setTelefone("(88) 99430-555");
					natinfatil.setTelefoneSecundario("Não possui");
					natinfatil.setComplemento("Não possui");
					natinfatil.setMatricula(2525);
					natinfatil.setHorario_turma("18:30H");
					natinfatil.setAltura(1.59);
					natinfatil.setPeso(59.0);
					natinfatil.setIdade(22);
					natinfatil.diaParaPagamento();
					natinfatil.setGenero(Genero.MASCULINO);
					natinfatil.addAluno(natinfatil);
					natinfatil.salvar();
				}else {
					System.out.println("\n\tSaindo...");
				}
				break;
			case 3:
				System.out.println("\n\t Cadastrando aluno na turma de hidroginastica");
				System.out.println("\n\t Selecione uma das opcaoes abaixo");
				System.out.println("\n\t 1. Manha");
				System.out.println("\n\t 2.Tarde");
				System.out.println("\n\t 3.Noite");
				System.out.println("\n\t 4.Sair");
				System.out.println("\n\t > Opção: ");
				opcao = entrada.nextInt();
				System.out.println("\n\t+ Opcão selecionada :" + opcao);
				if (opcao == 1) {
					natacaoadulto.inserir();
					natacaoadulto.setTurno(Turno.MANHA);
					natacaoadulto.setNomealuno("voltei");
					natacaoadulto.setDatanascimento("19/03/1998");
					natacaoadulto.setEstadocivil("Solteiro");
					natacaoadulto.setEmail("Jouce@gmail.com");
					natacaoadulto.setEndereco("Travessa joao afonso");
					natacaoadulto.setTelefone("(88) 99430-555");
					natacaoadulto.setTelefoneSecundario("Não possui");
					natacaoadulto.setComplemento("Não possui");
					natacaoadulto.setMatricula(2525);
					natacaoadulto.setHorario_turma("17:30H");
					natacaoadulto.setAltura(1.59);
					natacaoadulto.setPeso(59.0);
					natacaoadulto.setIdade(22);
					natacaoadulto.diaParaPagamento();
					natacaoadulto.setGenero(Genero.MASCULINO);
					natacaoadulto.addAluno(natacaoadulto);
					natacaoadulto.salvar();
				}else  if (opcao == 2 ) {
					natacaoadulto.inserir();
					natacaoadulto.setTurno(Turno.TARDE);
					natacaoadulto.setNomealuno("KELLE CORDEIRO");
					natacaoadulto.setDatanascimento("19/03/1998");
					natacaoadulto.setEstadocivil("Solteiro");
					natacaoadulto.setEmail("Jouce@gmail.com");
					natacaoadulto.setEndereco("Travessa joao afonso");
					natacaoadulto.setTelefone("(88) 99430-555");
					natacaoadulto.setTelefoneSecundario("Não possui");
					natacaoadulto.setComplemento("Não possui");
					natacaoadulto.setMatricula(2525);
					natacaoadulto.setHorario_turma("17:30H");
					natacaoadulto.setAltura(1.59);
					natacaoadulto.setPeso(59.0);
					natacaoadulto.setIdade(22);
					natacaoadulto.diaParaPagamento();
					natacaoadulto.setGenero(Genero.FEMININO);
					natacaoadulto.addAluno(natacaoadulto);
					natacaoadulto.salvar();
					
			
				}else if (opcao == 3) {
					natacaoadulto.inserir();
					natacaoadulto.setTurno(Turno.NOITE);
					natacaoadulto.setNomealuno("itala");
					natacaoadulto.setDatanascimento("19/03/1998");
					natacaoadulto.setEstadocivil("Solteiro");
					natacaoadulto.setEmail("Jouce@gmail.com");
					natacaoadulto.setEndereco("Travessa joao afonso");
					natacaoadulto.setTelefone("(88) 99430-555");
					natacaoadulto.setTelefoneSecundario("Não possui");
					natacaoadulto.setComplemento("Não possui");
					natacaoadulto.setMatricula(2525);
					natacaoadulto.setHorario_turma("19:30H");
					natacaoadulto.setAltura(1.59);
					natacaoadulto.setPeso(59.0);
					natacaoadulto.setIdade(22);
					natacaoadulto.diaParaPagamento();
					natacaoadulto.setGenero(Genero.FEMININO);
					natacaoadulto.addAluno(natacaoadulto);
					natacaoadulto.salvar();
					
			
					
				}
				break;
			case 0:
				System.out.println("\n\tVoltando");
			default:
				break;
			}
		}while(opcao!=0);
		
	}
}
