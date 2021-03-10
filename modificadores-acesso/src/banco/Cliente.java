package banco;

public class Cliente {
	private String nome;
	private String sobrenome;
	private int idade;
	private Conta conta;
	//pegando da função principal os dados
	public void setnome(String nome) {
		this.nome = nome;
	}
	public String getNome() {
		return nome;
	}
	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}
	
	public String getSobrenome() {
		return sobrenome;
	}
	
	public void setidade(int idade) {
		this.idade = idade;
	}
	
	public int getidade() {
		return idade;
	}
	
	public void setConta(Conta conta) {
		this.conta = conta;
	}
	
	
	
	
	
	
	 
}
