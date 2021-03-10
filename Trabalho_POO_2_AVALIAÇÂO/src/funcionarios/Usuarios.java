package funcionarios;

import interfaces.DAO;

public class Usuarios implements DAO {
	private String name;
	private String lastname;
	private String phone;
	private String e_mail;
	private String cpf;
	private Integer Matricula;
	public Integer getMatricula() {
		return Matricula;
	}
	public void setMatricula(Integer matricula) {
		Matricula = matricula;
	}
	@Override
	public void inserir() {
		System.out.println("\n\tInserindo.....");
		
	}
	@Override
	public void excluir() {
		System.out.println("\n\tRemovendo....");
		
	}
	@Override
	public void localizar() {
		System.out.println("\ntLocalizando");
		
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		
		this.name = name;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getE_mail() {
		return e_mail;
	}
	public void setE_mail(String e_mail) {
		this.e_mail = e_mail;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	
	
	
	
	
	
}
