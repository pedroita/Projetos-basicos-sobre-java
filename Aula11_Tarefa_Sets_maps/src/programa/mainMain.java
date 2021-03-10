package programa;
import java.util.*;
import Map.MetodoMap;
import produto.Produto;
import java.util.List;
import java.util.Map;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class mainMain {

	public static void main(String[] args) {
		Produto listadeprodutos = new Produto();
		MetodoMap meumetodomap = new HashMap<String,>();
		Scanner input = new Scanner(System.in);
		System.out.println("\n\n\t----------Bem-vindo-------------\t");
		System.out.println("\n\n\t Digite a quantidade de produtos que deseja cadastra: ");
		int qtd = input.nextInt();
		for (int i = 0; i<qtd; i++) {
			
			
			System.out.println("Digite o nome do " + i + " º produto: ");
			String nome = input.next();
			listadeprodutos.setNome(nome);
			System.out.println("Digite o valor do  " + i + " º produto: ");
			Double valor = input.nextDouble();
			listadeprodutos.setValor(valor);
			
			System.out.println("Digite a chave do " + i + " º produto: ");
			int chave = input.nextInt();
			listadeprodutos.setChave(chave);
			
			
		}
		mapa.put(null, listadeprodutos);
		for (String key: mapa.keySet()){  
			System.out.println(key+ " = " + mapa.get(key));
		} 
		
		input.close();
		System.out.println("Obrigado");
	}

}
