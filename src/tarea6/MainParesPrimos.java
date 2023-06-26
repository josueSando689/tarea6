package tarea6;
import java.util.Scanner;
public class MainParesPrimos {

	public static void main(String[] args) {
		Scanner text = new Scanner (System.in);
		
		System.out.println("Escribe un numero para saber si es Primo y Par: ");
		int numero1 = text.nextInt();
		
		ParesPrimos saber = new ParesPrimos(numero1);
		saber.averiguarPares();
		saber.averiguarPrimos();
	}
}
