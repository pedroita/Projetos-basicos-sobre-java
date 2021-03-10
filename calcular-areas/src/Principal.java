import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		int opcao;
		float base, altura;
		System.out.println("Bem-vindo");
		System.out.println("Digite 1 para retangulo 2 para triangulo: ");
		Scanner entrada = new Scanner(System.in);
		opcao = entrada.nextInt();
		if (opcao == 1) {
			Retangulo retangulo = new Retangulo();
			System.out.println("Digite a base: ");
			base = entrada.nextFloat();
			System.out.println("Digite a altura:");
			altura = entrada.nextFloat();
			System.out.println("A area é: " +" "+ retangulo.calcularAreas(base, altura));	
		}else if (opcao == 2 ) {
			Triangulo triangulo = new Triangulo();
			System.out.println("Digite a base: ");
			base = entrada.nextFloat();
			System.out.println("Digite a altura:");
			altura = entrada.nextFloat();
			System.out.println("A area é: " +" "+ triangulo.calcularAreas(base, altura));	
		}else {
			System.out.println("VOCÊ DESEJESOU SAIR!");
		}
		entrada.close();
	}

}
