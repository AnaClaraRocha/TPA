import java.util.Scanner;
public class PositivoNegativo {
	public static void main(String args[]) {
		Scanner input = new Scanner (System.in);
		double  n ;
		System.out.println("Insira o n�mero");
	    n = input.nextDouble();   
	    System.out.println("O n�mero �:");
	    if (n >= 0) {
	    	System.out.println("Positivo");
	    }else {
	    	System.out.println("Negativo");
	    }
	    input.close();
	    }
	}
