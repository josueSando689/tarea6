package tarea6;

public class BisiestoAño {

	private int año;

	public BisiestoAño () {
	}
	
	public BisiestoAño (int año) {
		this.año=año;
	}
	
	public void setaño (int año){
		this.año=año;
	}
	
	public int getaño () {
		return año;
	}
	
	public static boolean bisiesto (int año) {
		if (año % 4==0 && año %100 !=0) {
		return true;
	  } else {
		return false;
	  }	
	}
	
	public void resultadoaño () {
		if (bisiesto(año)) {
			System.out.println("El año es bisiesto");
		} 
		else {
			System.out.println("El año no es bisiesto");
		}
	}
	    
	 
	}

