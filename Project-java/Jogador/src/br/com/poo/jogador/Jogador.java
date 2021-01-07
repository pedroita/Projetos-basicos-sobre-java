package br.com.poo.jogador;

public class Jogador {
private int numero;
private String nome;
public static void main(String[ ] args) {
	Jogador jogador = new Jogador();    // Criação  do objeto
	jogador.setNumero(10);
	jogador.setNome("Pele");
	System.out.println("O " + jogador.getNome() + " foi um dos melhores camisa " +
	jogador.getNumero() + " de todos os tempos");
	System.out.println("referencia do objeto " + jogador); }
	
public String getNome() {	// método para pegar o valor da variável nome
	return nome;
}
 int getNumero() {	// método para pegar o valor da variável número
	return numero;
}

public void setNome(String nome) {	// método para mudar o valor da variável nome
	this.nome = nome;
}

public void setNumero(int numero) {	// método para mudar o valor da variável número
	this.numero = numero;
}
}