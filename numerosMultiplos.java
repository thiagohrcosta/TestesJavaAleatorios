import java.util.Locale;
import java.util.Scanner;

public class numerosMultiplos {

	public static void main(String[] args) {
		
		//Leia 2 valores inteiros (A e B). Após, o programa deve 
		// mostrar uma mensagem "Sao Multiplos" ou "Nao sao
		// Multiplos", indicando se os valores lidos são múltiplos 
		// entre si. Atenção: os números devem poder ser digitados em
		// ordem crescente ou decrescente
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		int A = sc.nextInt();
		int B = sc.nextInt();
		
		if (A % B == 0) {
			System.out.println("Voce digitou " + A + " e " + B + " Estes numeros são múltiplos");
		}
		else if (B % A == 0) {
			System.out.println("Voce digitou " + A + " e " + B + " Estes numeros são múltiplos");		
		}
		else {
			System.out.println("Voce digitou " + A + " e " + B + " Estes números não são múltiplos");
		}
		
		sc.close();

	}	

}
