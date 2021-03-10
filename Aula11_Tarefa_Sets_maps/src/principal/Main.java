package principal;
import colecoes.ExemploList;
import entidade.Contato;
public class Main {

	public static void main(String[] args) {
		ExemploList arryList = new ExemploList(new Contato());
		Contato contato1 = new Contato();
		contato1.setNome("Pedro");
		contato1.setTelefone("123455");
		
		arryList.adiconarCotatos(contato1);
		
		Contato contato2 = new Contato();
		contato2.setNome("karla");
		contato2.setTelefone("54665");
		
		arryList.adiconarCotatos(contato2);
		
		Contato contato3 = new Contato();
		contato3.setNome("afonso");
		contato3.setTelefone("8848");
		
		arryList.adiconarCotatos(contato3);
		
		arryList.listaContatos();
		arryList.verificarContatos();
		
	}
	
}
