package tarefa04;
public class Livro {
	public String titulo;
	public String descricao;
	public double valor;
	
	public Autor autor;
	public Livro () {
		autor = new Autor();
	}
	public void mostrarDetalhes() {
		System.out.println("*** Dados dos livro ***");
		System.out.println("Titulo do livro: " + titulo);
		System.out.println("Descrição do livro: " + descricao );
		System.out.println("Valor do livro: " +  valor);
		autor.mostrarDetalhess();
		
		System.out.println();
	}
}
	