
public class Produto implements DAO {
	private int numero;
	private String descricao;
	@Override
	public void inserir() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void excluir() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public String toString() {
		return "Produto [numero=" + numero + ", descricao=" + descricao + ", getNumero()=" + getNumero()
				+ ", getDescricao()=" + getDescricao() + "]";
	}
	@Override
	public void localizar() {
		// TODO Auto-generated method stub
		
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
}
