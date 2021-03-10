
public class Funcionario extends PessoaFisica {
	private String cartao;

	public String getCartao() {
		return cartao;
	}

	public void setCartao(String cartao) {
		this.cartao = cartao;
	}

	@Override
	public String toString() {
		return "Funcionario [cartao=" + cartao + "]";
	}
	
}
