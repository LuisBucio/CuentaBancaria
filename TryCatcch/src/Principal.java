
public class Principal {
	
	static int numerador = 10;
	static int denominador = 0;
	static float division;
	
	public static void main (String[] args) {
		System.out.println("Antes de la division");
		
		try {
			division = numerador / denominador;
		} catch (ArithmeticException ex) {
			division = 0;
			System.out.println("Error: " + ex.getMessage());
		}
		
		System.out.println("Despues de la division");
		
	}
	
	}

