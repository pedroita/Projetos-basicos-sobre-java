
public class Programa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Aluno aluno = new Aluno();
		aluno.nome="Pedro";
		aluno.idade=14;
		aluno.curso="Engenharia";
		aluno.CalcularMedia(9.6,9.6, 8.4);
		System.out.println("aluno : " + aluno.resultado());

	}

}
