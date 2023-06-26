package tarea6;

public class PositivoNegativo {
private double numero; 

public PositivoNegativo() {
  }

public PositivoNegativo(double numero) {
	this.numero=numero;
  }

public void setnumero (double numero) {
	this.numero= numero;
}

public double getnumero () {
	return numero;
}

public void verificar () {
	if (numero == 0) {
		System.out.println("El numero es neutral");
	}
	else if (numero <0) {
		System.out.println("El numero es negativo");
	}
	else {
		System.out.println("El numero es positivo");
	}
}

}
