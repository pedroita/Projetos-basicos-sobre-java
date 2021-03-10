
public interface Carro {
	default int calcularVelocidade(int velocidade) {
		return velocidade;
	}
}
