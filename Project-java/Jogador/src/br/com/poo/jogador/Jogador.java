package br.com.poo.jogador;

public class Jogador {
private int numero;
private String nome;
public static void main(String[ ] args) {
	Jogador jogador = new Jogador();    // Cria��o  do objeto
	jogador.setNumero(10);
	jogador.setNome("Pele");
	System.out.println("O " + jogador.getNome() + " foi um dos melhores camisa " +
	jogador.getNumero() + " de todos os tempos");
	System.out.println("referencia do objeto " + jogador); }
	
public String getNome() {	// m�todo para pegar o valor da vari�vel nome
	return nome;
}
 int getNumero() {	// m�todo para pegar o valor da vari�vel n�mero
	return numero;
}

public void setNome(String nome) {	// m�todo para mudar o valor da vari�vel nome
	this.nome = nome;
}

public void setNumero(int numero) {	// m�todo para mudar o valor da vari�vel n�mero
	this.numero = numero;
}
}