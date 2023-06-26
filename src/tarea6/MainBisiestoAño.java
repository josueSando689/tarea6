package tarea6;
import java.util.Scanner;
public class MainBisiestoAño {
	
	public static void main(String[] args) {
		Scanner text = new Scanner (System.in); 
		System.out.println("Escribe el año a saber; ");
		int año1 = text.nextInt();
		
		BisiestoAño resultado = new BisiestoAño (año1);
		resultado.resultadoaño();
	}
	
}
