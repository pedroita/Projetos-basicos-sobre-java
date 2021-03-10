import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		ExemploMetodos exemplo = new ExemploMetodos();
		
		Scanner entrada = new Scanner (System.in);
		System.out.println("Digite seu  nome:");
		String nome = entrada.nextLine();
		System.out.println("Digite o sobrenome");
		String sobrenome = entrada.nextLine();
		System.out.println("Digite dois numeros");
		int numero1= entrada.nextInt();
		int numero2 = entrada.nextInt();
		exemplo.exibirMensagem();
		System.out.println(exemplo.concatenarNome(nome, sobrenome));;
		System.out.println(exemplo.subtrairNumeros(numero1, numero2));

		entrada.close();
	}

}
