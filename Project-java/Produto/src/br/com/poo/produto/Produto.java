package br.com.poo.produto;
import java.util.Scanner;
public class Produto {
	public static void main(String[]ags) {
		Scanner ler = new Scanner (System.in);
		int parcelas;
		float valor;
		float parcelas_apagar;
		int opcao;
		System.out.print("Digite o valor da compra:");
		valor = ler.nextFloat();
		System.out.print("Deseja Dividir? Digite 1 pra sim ou 2 pra não");
		opcao=ler.nextInt();
		if(opcao==1) {
			System.out.print("Digite o numero de parcelas:");
			parcelas = ler.nextInt();
			parcelas_apagar = (valor/parcelas);
			System.out.printf("O valor a pagar é : R$ %.2f ",parcelas_apagar);
	}else {
		System.out.println("Obrigado");
	} 
  }
}
