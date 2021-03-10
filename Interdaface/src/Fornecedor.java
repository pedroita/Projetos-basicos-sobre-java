
public class Fornecedor implements DAO{
	private String cnpj;
	private String razaoSocial;
	
	public String getCnpj() {
		return cnpj;
	}
	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	public String getRazaoSocial() {
		return razaoSocial;
	}
	public void setRazaoSocial(String razaoSocial) {
		this.razaoSocial = razaoSocial;
	}
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
		return "Fornecedor [cnpj=" + cnpj + ", razaoSocial=" + razaoSocial + ", getCnpj()=" + getCnpj()
				+ ", getRazaoSocial()=" + getRazaoSocial() + "]";
	}
	@Override
	public void localizar() {
		// TODO Auto-generated method stub
		
	}
}
