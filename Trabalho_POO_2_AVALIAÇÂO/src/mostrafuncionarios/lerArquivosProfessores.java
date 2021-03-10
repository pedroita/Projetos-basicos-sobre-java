package mostrafuncionarios;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
public class lerArquivosProfessores {
	private File arquivo;
	public lerArquivosProfessores() {
		arquivo = new File ("Professores.txt");
		try {
			FileReader fr = new FileReader(arquivo);
			BufferedReader br = new BufferedReader(fr);
			System.out.println("\n\tProfessores!");
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
