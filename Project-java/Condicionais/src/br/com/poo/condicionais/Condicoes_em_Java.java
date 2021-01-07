package br.com.poo.condicionais;
import java.util.Scanner;
public class Condicoes_em_Java {
	public static void main (String[] args) {
		Scanner ler = new Scanner (System.in);
		float nota1,nota2,nota3;
		float media;
		System.out.println("Bem-vindo");
		System.out.println("Digite a nota que tirou na prova");
		nota1 = ler.nextInt();
		System.out.println("Digite a nota que tirou na prova 2");
		nota2 = ler.nextInt();
		System.out.println("Digite a nota que tirou na prova 3 ");
		nota3 = ler.nextInt();
		media= (nota1+nota2+nota3)/3;
		if (media>=7) {
			System.out.println("Parabens aprovado");
		}else if (media<7 && media >4) {
			System.out.println("Voce ainda tem chance de passar");
			
		}else if (media<4) {
			System.out.println("Voce reprovou direto");
		}
		
		/*if (idade==18 || idade <50) {
			System.out.println("voce pode tirar a sua carteira");
		}else if (idade >50 && idade<75 ) {
			System.out.println("Cuidado na estrada");
		}else {
			System.out.println("Voce nao pode dirigir");
		}
	}*/
	
	}
}
