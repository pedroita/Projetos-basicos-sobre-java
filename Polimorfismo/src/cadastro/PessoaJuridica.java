package cadastro;

public class PessoaJuridica extends Cliente {
	private String cnpj;
	private String nomeFantasia;
	
public void PessoaFisica(String n, String e, String t,String c, String nf) {
		
	}
	
	
	public void imprirDados() {
		
	}
	public String getCnpj() {
		return cnpj;
	}
	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	public String getNomeFantasia() {
		return nomeFantasia;
	}
	public void setNomeFantasia(String nomeFantasia) {
		this.nomeFantasia = nomeFantasia;
	}
	
}
