import java.util.Locale;
import java.util.Scanner;

public class NumeroParImpar {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um número qualquer:");
		int A = sc.nextInt();
		
		if (A % 2 == 0) {
			
			System.out.println("Você digitou o número " + A + ", este número é par");
		}
		
		else {
			System.out.println("O número digitado foi " + A + ", ele é impar");
		}

		sc.close();

	}

}
