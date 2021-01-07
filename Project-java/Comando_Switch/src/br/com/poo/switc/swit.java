package br.com.poo.switc;
import java.util.Scanner;
public class swit {
	public static void main (String[] args) {
		Scanner ler = new Scanner (System.in);
		int operando = 0;
		float numero1, numero2,numero3;
		float media;
		float soma;
		float subtracao;
		int muti;
		System.out.println("A seguir algumas opções");
		System.out.println("1.Calcular a media de dois numeros");
		System.out.println("2.Calcular a media de 3 numeros");
		System.out.println("3.Somar");
		System.out.println("4.Subtração");
		System.out.println("5.mutiplicação");
		System.out.println("0.Sair");
		operando=ler.nextInt();
		switch(operando){
		case 1:
			System.out.println("Digite o primeiro numero:");
			numero1=ler.nextFloat();
			System.out.println("Digite o segundo  numero:");
			numero2=ler.nextFloat();
			media = (numero1+numero2)/2;
			System.out.println("A media é "+media);
			break;
		case 2:
			System.out.println("Digite o primeiro numero:");
			numero1=ler.nextFloat();
			System.out.println("Digite o segundo  numero:");
			numero2=ler.nextFloat();
			System.out.println("Digite o terceiro  numero:");
			numero3=ler.nextFloat();
			media = (numero1+numero2+numero3)/3;
			System.out.println("A media é " +media);
			break;
		case 3:
			System.out.println("Digite o primeiro numero:");
			numero1=ler.nextFloat();
			System.out.println("Digite o segundo  numero:");
			numero2=ler.nextFloat();
			soma=numero1+numero2;
			System.out.println("A soma é " +soma);
			break;
		case 4:
			System.out.println("Digite o primeiro numero:");
			numero1=ler.nextFloat();
			System.out.println("Digite o segundo  numero:");
			numero2=ler.nextFloat();
			subtracao=numero1-numero2;
			System.out.println("A subtraçao é " +subtracao);
			break;
		case 5:
			System.out.println("Digite o primeiro numero:");
			numero1=ler.nextFloat();
			System.out.println("Digite o segundo  numero:");
			numero2=ler.nextFloat();
			muti=(int) (numero1*numero2);
			System.out.println("A mutiplicação " 
					+ muti);
			break;
		default:
			
		}
	}
}
