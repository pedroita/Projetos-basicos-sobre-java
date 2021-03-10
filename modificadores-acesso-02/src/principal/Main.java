package principal;

import entidade.Produto;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Produto produto = new Produto ();
		produto.setNome("Sabonete");
		produto.setPreco(5.00);
	
		System.out.println("+++Dados do Produto+++");
		System.out.println("Nome: " + produto.getNome());
		System.out.println("Preço: " + produto.getPreco());
		System.out.println("Codigo:" + produto.getCodigo());
		System.out.println("Quantidade: " + produto.getQtd());
		
		System.out.println();
		
		Produto produto2 = new Produto ();
		produto2.setNome("Arroz");
		produto2.setPreco(3.00);
	
		System.out.println("+++Dados do Produto+++");
		System.out.println("Nome: " + produto2.getNome());
		System.out.println("Preço: " + produto2.getPreco());
		System.out.println("Codigo:" + produto2.getCodigo());
		System.out.println("Quantidade: " + produto2.getQtd());
		
System.out.println();
		
		Produto produto3 = new Produto ();
		produto3.setNome("Abobra");
		produto3.setPreco(6.00);
	
		System.out.println("+++Dados do Produto+++");
		System.out.println("Nome: " + produto3.getNome());
		System.out.println("Preço: " + produto3.getPreco());
		System.out.println("Codigo:" + produto3.getCodigo());
		System.out.println("Quantidade: " + produto3.getQtd());
	
	}

}
