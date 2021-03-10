package turmas;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import ficha.de.incricao.Alunos;
import ficha.de.incricao.Turno;

public class NatacaoInfantil extends Alunos {
	private String Horario_turma;
	private Integer Matricula;
	private Turno turno;
	
	private List<Alunos> alunos = new ArrayList<Alunos>();
	
	public String getHorario_turma() {
		return Horario_turma;
	}
	public void setHorario_turma(String horario_turma) {
		Horario_turma = horario_turma;
	}
	public Integer getMatricula() {
		return Matricula;
	}
	public void setMatricula(Integer matricula) {
		Matricula = matricula;
	}
	
	public void addAluno(Alunos aluno) {
		alunos.add(aluno);
	}
	
	public void removerAluno(Alunos aluno) {
		alunos.remove(aluno);
	}
	
	public Turno getTurno() {
		return turno;
	}
	
	
	public void setTurno(Turno turno) {
		this.turno = turno;
	}
	public void diaParaPagamento() {
		LocalDate hoje = LocalDate.now();
		LocalDate diaDoPagamento = hoje.plusDays(1);	
		System.out.println("\n\tHoje é : " + hoje ); 
		System.out.println("\n\tSeu pagamento ficou para daqui um mês, dia : " + diaDoPagamento);
	}
	
	public void ImprimirDados() {
		for (Alunos aluno : alunos) {
			System.out.println("\n\t+---------------------------------+");
			
			System.out.println("\n\t+ Nome: " + aluno.getNomealuno());
			System.out.println("\n\t+ Data de nascimento: " + aluno.getDatanascimento());
			System.out.println("\n\t+ Idade :" + aluno.getIdade());
			System.out.println("\n\t+ Estado civil " + aluno.getEstadocivil());
			System.out.println("\n\t+ Altura: " + aluno.getAltura());
			System.out.println("\n\t+ Peso: " + aluno.getPeso());
			System.out.println("\n\t+ Email: " + aluno.getEmail());
			System.out.println("\n\t+ Endereco: " + aluno.getEndereco());
			System.out.println("\n\t+ Telefone: " + aluno.getTelefone());
			System.out.println("\n\t+ Telefone secundario: " + aluno.getTelefoneSecundario());
			System.out.println("\n\t+ Endereco " + aluno.getEndereco());
			System.out.println("\n\t+ Complemento: " + aluno.getComplemento());
			System.out.println("\n\t+ Matricula: " + aluno.getMatricula());
			System.out.println("\n\t+ Horario:" + aluno.getHorario_turma());
			System.out.println("\n\t+ Turma: " + aluno.getTurma());
			diaParaPagamento();
			System.out.println("\n\t+---------------------------------+");
			
		}
	}
	public String salvar() {
		try {
			FileWriter fw = new FileWriter("AlunoNatInfantil.txt",true);
			BufferedWriter bw = new BufferedWriter( fw );
			
			
			bw.write("+---------------------------------+");
			bw.newLine();
			bw.write("Nome: " + getNomealuno());
			bw.newLine();
			bw.write("Data de nascimento: " + getDatanascimento());
			bw.newLine();
			bw.write("Idade:" + getIdade());
			bw.newLine();
			bw.write("Estado Civil :" + getEstadocivil());
			bw.newLine();
			bw.write("Endereço :" + getEndereco());
			bw.newLine();
			bw.write("E-mail: " + getEmail());
			bw.newLine();
			bw.write("Telefone : " + getTelefone());
			bw.newLine();
			bw.write("Telefone secundario: " + getTelefoneSecundario());
			bw.newLine();
			bw.write("Dia do pagamento: " + getDatadepagamento());
			bw.newLine();
			bw.write("Matricula: " + getMatricula());
			bw.newLine();
			bw.write("Horiario da turma: " + getHorario_turma());
			bw.newLine();
			bw.write("Genero: " + getGenero());
			bw.newLine();
			bw.write("Turma: " + getTurno());
			bw.newLine();
			bw.write("+---------------------------------+");
			bw.newLine();
			bw.close();
			fw.close();
			
				
		} catch (IOException ex) {
			
			ex.printStackTrace();
		}finally {
			System.out.println("\n\tFim do programa");
		}
		return null;
	}
	
}
