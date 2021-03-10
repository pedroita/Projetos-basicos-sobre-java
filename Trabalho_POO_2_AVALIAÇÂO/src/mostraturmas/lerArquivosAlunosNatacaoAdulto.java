package mostraturmas;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
public class lerArquivosAlunosNatacaoAdulto {
	private File arquivo;
	public lerArquivosAlunosNatacaoAdulto() {
		arquivo = new File ("AlunosNata��oAdulto.txt");
		try {
			FileReader fr = new FileReader(arquivo);
			BufferedReader br = new BufferedReader(fr);
			System.out.println("\n\tAlunos Turmar Nata��o Adulto!");
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
