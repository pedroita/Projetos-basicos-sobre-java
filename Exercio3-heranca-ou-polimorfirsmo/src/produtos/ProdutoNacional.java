package produtos;

public class ProdutoNacional extends Produto {
	int taxa=30;
	
	public Double calturarfrete() {
		
		return this.getPreco()*taxa;
	}
	
	public Double total() {
		return calturarfrete();
	}
}
