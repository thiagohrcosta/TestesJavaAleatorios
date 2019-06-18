import java.util.Locale;
import java.util.Scanner;

public class horasJogadas {

	public static void main(String[] args) {
		
		//Leia a hora inicial e a hora final de um jogo. 
		// A seguir calcule a duração do jogo, sabendo que o mesmo 
		// pode começar em um dia e terminar em outro, tendo uma 
		// duração mínima de 1 hora e máxima de 24 horas.

		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		int horaInicial = sc.nextInt();
		int horaFinal = sc.nextInt();
		
		int horasJogadas = (horaInicial - horaFinal);
		
		if (horasJogadas < 0) {
			System.out.println(horasJogadas * -1);
		}
		else if (horasJogadas == 0) {
			System.out.println(horasJogadas + 24);
		}
		else if (horasJogadas >12){
			System.out.println((horasJogadas -24) * -1 );
		}
		
		sc.close();
		

	}

}
