
public class Aluno {
	public String nome, curso;
	public int idade;
	public double media;
	
	
	public  double CalcularMedia(double n1,double n2,double n3) {
		this.media = (n1+n2+n3)/3;
		return this.media;
	}
	public String resultado() {
		if (this.media>=7.0) {
			return  "aprovado";
		}else if (this.media>=5.0 && this.media<7.0) {
			return "final";
		}else {
			return "reprovado";
		}
		}
		
}
	

