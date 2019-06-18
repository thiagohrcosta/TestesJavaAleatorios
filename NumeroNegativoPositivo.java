import java.util.Locale;
import java.util.Scanner;

public class NumeroNegativoPositivo {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		
		if (a > 0) {
			System.out.println("Não negativo");
		}
		else if (a < 0){
			System.out.println("Negativo");
		}
		else {
			System.out.println("Não negativo");
		}

		sc.close();
	}

}
