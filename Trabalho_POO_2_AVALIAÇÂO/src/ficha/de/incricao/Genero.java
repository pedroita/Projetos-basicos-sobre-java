package ficha.de.incricao;

public enum Genero {
	
		FEMININO('F'), 
		MASCULINO('M');
		private char valor;
		Genero (char valor){
			this.valor = valor;
		}
		public char getValor() {
			return valor;
		}
	
}
