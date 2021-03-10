package funcionarios;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;




public class Atentende extends Usuarios {
	private Integer Matricula;

	private List<Usuarios> user = new ArrayList<Usuarios>();
	public Integer getMatricula() {
		return Matricula;
	}

	public void setMatricula(Integer matricula) {
		Matricula = matricula;
	}
	
	public void addAtendente(Atentende atende) {
		user.add(atende);
	}
	public void removerAtende(Atentende atende) {
		user.remove(atende);
	}
	
	
	public String salvar() {
		try {
			FileWriter fw = new FileWriter("Atedente.txt",true);
			BufferedWriter bw = new BufferedWriter( fw );
			
			
			bw.write("+---------------------------------+");
			bw.newLine();
			bw.write("Nome: " + getName()+ " " + getLastname());
			bw.newLine();
			bw.write("CPF: " + getCpf());
			bw.newLine();
			bw.write("Telefone: " + getPhone());
			bw.newLine();
			bw.write("E-Mail :" + getE_mail());
			bw.newLine();
			bw.write("Matricula :" + getMatricula());
			bw.newLine();
			bw.write("+---------------------------------+");
			bw.newLine();
			bw.close();
			fw.close();
			
			
			
			
		} catch (IOException ex) {
			
			ex.printStackTrace();
		}finally {
			System.out.println("\n\t Fim do programa");
		}
		return null;
	}
	
	
}
