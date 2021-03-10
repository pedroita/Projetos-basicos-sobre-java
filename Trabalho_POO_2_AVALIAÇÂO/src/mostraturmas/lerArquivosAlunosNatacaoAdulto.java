package mostraturmas;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
public class lerArquivosAlunosNatacaoAdulto {
	private File arquivo;
	public lerArquivosAlunosNatacaoAdulto() {
		arquivo = new File ("AlunosNataçãoAdulto.txt");
		try {
			FileReader fr = new FileReader(arquivo);
			BufferedReader br = new BufferedReader(fr);
			System.out.println("\n\tAlunos Turmar Natação Adulto!");
			while (br.ready()) {
				String linha = br.readLine();	
				System.out.println("\n\t" + linha);
			}
			
			br.close();
			fr.close();
		} catch (IOException ex) {
			ex.printStackTrace();
		}
	}
}
