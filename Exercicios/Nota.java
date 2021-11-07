
import java.util.Scanner;
public class Nota {
	public static void main(String args[]) {
		Scanner input = new Scanner (System.in);
		double n1, n2, n3,m, vN;
		System.out.println("Insira a primeira nota:");
	    n1 = input.nextDouble();
	    System.out.println("Insira a segunda nota:");
	    n2 = input.nextDouble();
	    m = (n1+n2)/2;
	    
	    if (m>3) {
	    System.out.println("Aprovado");
	    }else {
	    	 System.out.println("Reprovado");
	    }
		}
	} 

