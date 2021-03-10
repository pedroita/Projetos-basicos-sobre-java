
public class IMC {

	private Double imc;
	
	public String calcIMC(double alt, double peso) {
		imc = peso / (alt * alt);
		
		if (imc <= 18.5)
			return "IMC: " + imc + " - Abaixo do peso!";
		else if (18.5 < imc && imc <= 25)
			return "IMC: " + imc + " - Peso normal!";
		else if (25 < imc && imc <= 30)
			return "IMC: " + imc + " - Acima do peso!";
		else
			return "IMC: " + imc + " - Obesidade!";
	}
}
