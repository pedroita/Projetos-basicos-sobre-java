package ficha.de.incricao;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import interfaces.DAO;

public class Alunos implements DAO {
	
	private String nomealuno;
	
	private String datanascimento;
	
	private int idade;
		
	private Double peso;
	
	private Double altura;
	
	private  String estadocivil;
	
	private  String profisao;
	
	private String telefone;
	
	private String telefoneSecundario;
	
	private String Endereco;
	
	private int numeroCasa;
	
	private String complemento;
	
	private String email;
	
	private String datadepagamento;
	
	private Integer matricula;
	
	private String Horario_turma;
	
	private String turma;
	
	private Genero genero;
	
	private Turno turno;
	
	
	
	public Turno getTurno() {
		return turno;
	}
	public void setTurno(Turno turno) {
		this.turno = turno;
	}
	public Genero getGenero() {
		return genero;
	}
	public void setGenero(Genero genero) {
		this.genero = genero;
	}
	public String getTurma() {
		return turma;
	}
	public void setTurma(String turma) {
		this.turma = turma;
	}
	
	public String getHorario_turma() {
		return Horario_turma;
	}

	public void setHorario_turma(String horario_turma) {
		Horario_turma = horario_turma;
	}
	
	

	public String getNomealuno() {
		return nomealuno;
	}

	public void setNomealuno(String nomealuno) {
		this.nomealuno = nomealuno;
	}

	public String getDatanascimento() {
		return datanascimento;
	}

	public void setDatanascimento(String datanascimento) {
		this.datanascimento = datanascimento;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public Double getPeso() {
		return peso;
	}

	public void setPeso(Double peso) {
		this.peso = peso;
	}

	public Double getAltura() {
		return altura;
	}

	public void setAltura(Double altura) {
		this.altura = altura;
	}

	public String getEstadocivil() {
		return estadocivil;
	}

	public void setEstadocivil(String estadocivil) {
		this.estadocivil = estadocivil;
	}

	public String getProfisao() {
		return profisao;
	}

	public void setProfisao(String profisao) {
		this.profisao = profisao;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getTelefoneSecundario() {
		return telefoneSecundario;
	}

	public void setTelefoneSecundario(String telefoneSecundario) {
		this.telefoneSecundario = telefoneSecundario;
	}

	public String getEndereco() {
		return Endereco;
	}

	public void setEndereco(String endereco) {
		Endereco = endereco;
	}

	public int getNumeroCasa() {
		return numeroCasa;
	}

	public void setNumeroCasa(int numeroCasa) {
		this.numeroCasa = numeroCasa;
	}

	public String getComplemento() {
		return complemento;
	}

	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getDatadepagamento() {
		return datadepagamento;
	}

	public void setDatadepagamento(String datadepagamento) {
		this.datadepagamento = datadepagamento;
	}

	public Integer getMatricula() {
		return matricula;
	}

	public void setMatricula(Integer matricula) {
		this.matricula = matricula;
	}

	@Override
	public void inserir() {
		System.out.println("\n\tInserindo....");
	}

	@Override
	public void excluir() {
		System.out.println("\n\tExcluindo.....");
		
	}

	@Override
	public void localizar() {
		System.out.println("\n\tLocalizando...");
	}
	
	
	
	
}
