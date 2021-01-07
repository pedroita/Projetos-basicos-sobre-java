package br.com.poo.ternario;
import java.util.Scanner;
public class Ternario {
	public static void main (String[] args) {
		Scanner ler = new Scanner (System.in);
		float number1,number2;
		number1=ler.nextFloat();
		number2=ler.nextFloat();
		float media;
		media = (number1+number2)/2;
		System.out.println(media>=7?"Aprovado":"Reprovado");
	}
}
