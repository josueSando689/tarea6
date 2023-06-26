package tarea6;

public class ParesPrimos {

private int numero;

public ParesPrimos () {
	
}

public ParesPrimos (int numero) {
this.numero=numero;}

public void setnumero (int numero) {
	this.numero=numero;
}

public int getnumero () {
	return numero;
}


//Averiguar pares.
public void averiguarPares (){
	if (numero % 2 ==0) {
		System.out.println("El numero es par: ");
	} 
	
	else { System.out.println("El numero es impar: ");
   }
 }

//Averiguar primos.

public boolean algrotimoPrimos (){
	if (numero <=1 ) {
	return false;
	} 
	
	for (int i = 2; i <= Math.sqrt(numero); i++) {
        if (numero % i == 0) {
            return false; 
        }
	}
	return true;
  }

public void averiguarPrimos () {
	if (algrotimoPrimos()) {
		System.out.println("El numero es primo: ");
	} 
	else {
		System.out.println("El numero no es primo: ");
	}
}

}