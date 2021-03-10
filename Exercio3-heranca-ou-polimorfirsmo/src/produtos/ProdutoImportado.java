package produtos;

public class ProdutoImportado extends Produto {
	int taxa=100;
	public Double calturarfrete() {
		
		return this.getPreco()*taxa;
	}
	
	public Double total() {
		return calturarfrete();
	}
}
