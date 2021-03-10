package mostraturmas;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;


public class lerArquivosAlunosHidro {
	private File arquivo;
	public lerArquivosAlunosHidro() {
		arquivo = new File ("AlunosHidro.txt");
		try {
			FileReader fr = new FileReader(arquivo);
			BufferedReader br = new BufferedReader(fr);
			System.out.println("\n\tAlunos Hidroginastica!");
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
