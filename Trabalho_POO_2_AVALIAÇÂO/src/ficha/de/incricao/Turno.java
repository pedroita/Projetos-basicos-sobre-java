package ficha.de.incricao;

public enum Turno {
	MANHA ("manh�"),
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

