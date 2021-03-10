package tarefa04;

public class CadastroDeLivros {
	public static void main (String []args ) {
		Livro livro1 = new Livro();
		
		livro1.titulo = "Dom casmuro";
		livro1.descricao = "Livro de Machado de assis";
		livro1.valor = 200;
		livro1.mostrarDetalhes();
		
		Livro livro2 = new Livro();
		livro2.titulo = "Python";
		livro2.descricao = "Como programa em python";
		livro2.valor = 169;
		livro2.mostrarDetalhes();
		
		Livro livro3 = new Livro();
		livro3.titulo = "PHP";
		livro3.descricao = "Aprender a usar o livro";
		livro3.valor = 5;
		livro3.autor.nomeAutor = "Pedro";
		livro3.autor.emailAutor ="pedro@gmail.com ";
		livro3.autor.cpfAutor = "054.619.423.00";
		livro3.mostrarDetalhes();
		
	}
}
