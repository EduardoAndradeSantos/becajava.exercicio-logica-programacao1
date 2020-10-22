import java.util.Scanner;

public class exercicioLogica1 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		 
		int meses;
		int total;
		
		System.out.printf("Digite numero de meses: ");
		meses = (int) ler.nextDouble();
		
		total = (meses * 30);
		
		System.out.println("Numero de dias: "+total);
	}

}
