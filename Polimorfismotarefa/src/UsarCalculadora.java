
public class UsarCalculadora {

	public static void main(String[] args) {
		Soma soma = new Soma();
		System.out.println(soma.calcula(10, 10));
		
		Subtracao sub = new Subtracao();
		System.out.println(sub.calcula(50, 10));
		
		Dividir dir = new Dividir();
		System.out.println(dir.calcula(50, 10));
		
		
		Mutiplicao muti = new Mutiplicao();
		System.out.println(muti.calcula(50, 100));
	}
}


