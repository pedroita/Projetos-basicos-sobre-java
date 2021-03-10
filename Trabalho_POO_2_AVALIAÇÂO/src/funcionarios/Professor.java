package funcionarios;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;



public class Professor extends Usuarios {
	private Integer Matricula;

	private List<Usuarios> user = new ArrayList<Usuarios>();
	public Integer getMatricula() {
		return Matricula;
	}

	public void setMatricula(Integer matricula) {
		Matricula = matricula;
	}
	
	public void addProfessor(Professor professor) {
		user.add(professor);
	}
	public void removerProfessor(Professor professor) {
		user.remove(professor);
	}
	
	
	
	public String salvar() {
		try {
			FileWriter fw = new FileWriter("Professores.txt",true);
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
			System.out.println("Fim do programa");
		}
		return null;
	}
	
}
