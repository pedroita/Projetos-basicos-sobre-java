package cadastro;

public class Cliente {
	private String nome;
	private String endereco;
	private String telefone;
	
public void Cliente(String n, String e, String t) {
		this.nome=n;
	}
	
	
	
	public String getNome() {
		return nome;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	
}
