package principal;
import produtos.ProdutoNacional;
import produtos.ProdutoImportado;
public class Main {

	public static void main(String[] args) {
		ProdutoNacional nacional = new ProdutoNacional();
		nacional.setNome("Gol");
		nacional.setPreco(85.0000);
		System.out.println(nacional);
		
		ProdutoImportado importado = new ProdutoImportado();
		importado.setNome("Mustang");
		importado.setPreco(300.000);
		System.out.println(importado);
	}

}
