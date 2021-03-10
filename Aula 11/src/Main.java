import java.util.List;
import java.util.Map;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
public class Main {

	public static void main(String[] args) {
		Aluno a1 = new Aluno("Aluno 1");
		Aluno a2 = new Aluno("Aluno 2");
		Aluno a3 = new Aluno("Aluno 3");
		Aluno a4 = new Aluno("Aluno 4");
		
		//criar o arry
		List<Aluno> lista = new ArrayList<Aluno>();
		lista.add(a1);
		lista.add(a2);
		lista.add(a3);
		lista.add(a4);
		
		//saber o tamanho da lista
		System.out.println(lista.size());
		//recuperar dados da lista
		System.out.println("Nome: " + lista.get(0).getNome() );
		//remover da lista
		lista.remove(3);
		//saber o tamanho da lista
		System.out.println(lista.size());
		//retonar true ou false
		System.out.println(lista.contains(a4));
		
		//hast sem repetição
		
		Set<Aluno> Alunos = new  HashSet<Aluno>();
		Alunos.add(a1);
		Alunos.add(a2);
		Alunos.add(a3);
		Alunos.add(a4);
		
	
		
		Map<String, Aluno> alunos = new HashMap<String,Aluno>();
		
		alunos.put("1", a1);
		alunos.put("2", a2);
		alunos.put("3", a3);
		
		Aluno alunoRecuperado = alunos.get("1");
		System.out.println("Aluno chave 1 : " + alunoRecuperado.getNome());
	}

}
