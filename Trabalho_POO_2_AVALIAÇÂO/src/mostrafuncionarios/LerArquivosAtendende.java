package mostrafuncionarios;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
public class LerArquivosAtendende {
	private File arquivo;
	public  LerArquivosAtendende() {
		arquivo = new File ("Atedente.txt");
		try {
			FileReader fr = new FileReader(arquivo);
			BufferedReader br = new BufferedReader(fr);
			System.out.println("\n\tAtendes:");
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
