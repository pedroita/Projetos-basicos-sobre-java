package entidade;

public class Produto {
	private String nome;
	private double preco;
	private int qtd;
	private  static int codigo;
	public Produto() {
		codigo++;
	}
	
	public void setNome(String nome) {
		this.nome=nome;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setPreco(double preco) {
		this.preco= preco;
	}
	public double getPreco() {
		return preco;
	}
	
	public void setQtd(int qtd) {
		this.qtd=qtd;
	}
	public int getQtd() {
		return qtd;
	}
	public  int getCodigo() {
		return codigo;
	}
	
}
