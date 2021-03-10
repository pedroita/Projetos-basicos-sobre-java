
public class Cliente implements DAO{
	private int codigo;
	private String nome;
	
	@Override
	public void inserir() {
		System.out.println("Inserindo");
	}
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	@Override
	public void excluir() {
		System.out.println("Excluindo");
	}
	@Override
	public void localizar() {
		
	}
	@Override
	public String toString() {
		return "Cliente [codigo=" + codigo + ", nome=" + nome + ", getCodigo()=" + getCodigo() + ", getNome()="
				+ getNome() + "]";
	}
	
}
