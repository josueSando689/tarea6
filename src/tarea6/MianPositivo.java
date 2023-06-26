package tarea6;
import java.util.Scanner;
public class MianPositivo {
	
public static void main(String[] args) {
	Scanner text = new Scanner (System.in);
	
	System.out.println("Escribe cualquier numero:");
	double numero = text.nextDouble();
	
	PositivoNegativo respuesta = new PositivoNegativo(numero);
	respuesta.verificar();
}
}
