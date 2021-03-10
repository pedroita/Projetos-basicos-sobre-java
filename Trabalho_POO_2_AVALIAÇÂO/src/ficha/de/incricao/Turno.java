package ficha.de.incricao;

public enum Turno {
	MANHA ("manhã"),
	TARDE ("tarde"),
	NOITE ("noite");
	
	private String valor;
	
	Turno(String valor){
		this.valor = valor;
	}

	public String getValor() {
		return valor;
	}
	
	
}

