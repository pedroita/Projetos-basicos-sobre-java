package colecoes;

import java.util.ArrayList;
import java.util.List;

import entidade.Contato;

public class ExemploList {
	private Contato contato;
	private List<Contato> contatos = new ArrayList<Contato>();
	public ExemploList(Contato contato) {
		this.contato = contato;
	}
	
	public void adiconarCotatos(Contato contato) {
		contatos.add(contato);
	}
	public void removerContato(int index) {
		contatos.remove(index);
	}
	
	public Boolean verificarContatos() {
		return contatos.contains(contato);
	}
	public void listaContatos() {
		for (Contato contato : contatos) {
			System.out.println("Nome: " + contato.getNome());
			System.out.println("Telefone: " + contato.getTelefone());
		}
	}
}
