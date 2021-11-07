
import java.util.Scanner;
public class Combustivel{
	public static void main(String args[]) {
		Scanner input = new Scanner (System.in);
		double km, cap, g;
		System.out.println("Insira a distancia percorrida em quilometro");
	    km = input.nextDouble();
	    System.out.println("Insira a capacidade do tanque do combustivel em litros:");
	    cap = input.nextDouble();
	    g = (km/cap);  
	    if (g>=10 ) {
	    	System.out.println("O carro é economico.");
	    }else  {
	         System.out.println("O carro não é economico.");
	   
	    }
	}
}