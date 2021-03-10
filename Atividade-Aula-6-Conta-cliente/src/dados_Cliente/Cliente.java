package dados_Cliente;

import java.util.Scanner;

public class Cliente {
	private String nome;
	private String sobrenome;
	private int numero_conta;
	
	Scanner entrada = new Scanner( System.in);
	
	public String getNome() {
		return nome;
	}
	public void setNome() {
		this.nome = entrada.next() ;
	}
	public String getSobrenome() {
		return sobrenome;
	}
	public void setSobrenome() {
		this.sobrenome = entrada.next();
	}
	public int getNumero_conta() {
		return numero_conta;
	}
	public void setNumero_conta() {
		this.numero_conta = entrada.nextInt();
	}
	@Override
	public String toString() {
		return "Cliente [nome=" + nome + ", sobrenome=" + sobrenome + ", numero_conta=" + numero_conta + ", entrada="
				+ entrada + ", getNome()=" + getNome() + ", getSobrenome()=" + getSobrenome() + ", getNumero_conta()="
				+ getNumero_conta() + "]";
	}
	
	
	
}









