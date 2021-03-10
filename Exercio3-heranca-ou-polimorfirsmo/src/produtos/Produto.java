package produtos;
public class Produto {
	private String nome;
	private Double preco;
	
	public Double calturarfrete() {
		
		return 0.0;
	}
	
	public Double total() {
		return 0.0;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(Double preco) {
		this.preco = preco;
	}

	@Override
	public String toString() {
		return "Produto [calturarfrete()=" + calturarfrete() + ", total()=" + total() + ", getNome()=" + getNome()
				+ ", getPreco()=" + getPreco() + "]";
	}

	

	
	
	
	
	
	
}
