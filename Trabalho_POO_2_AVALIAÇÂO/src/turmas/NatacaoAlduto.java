package turmas;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import ficha.de.incricao.Alunos;
import ficha.de.incricao.Turno;

public class NatacaoAlduto extends Alunos {
	private String Horario_turma;
	private Turno turno;
	
	private Integer Matricula;
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
	
	
	public String salvar() {
		try {
			FileWriter fw = new FileWriter("AlunosNataçãoAdulto.txt",true);
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
