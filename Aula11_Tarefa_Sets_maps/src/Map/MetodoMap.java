package Map;
import produto.Produto;
import java.util.List;
import java.util.Map;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import entidade.Contato;
public class MetodoMap {
	
	private Produto Produto;
	private Map<String,Produto> produtos = new HashMap<String,Produto>();
	
	public MetodoMap (Produto produto) {
		this.Produto = produto;
	}
	
	public void adiconarProduto(Produto produto) {
		produtos.putAll(produtos);;
	}
	
	public void removerProduto(Produto produto) {
		produtos.remove(produto);
	}
	public void mostraProdutos(Produto produto) {
		produtos.get(produto);
	}
}
