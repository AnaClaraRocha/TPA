import java.util.Scanner;
public class Salarios {
	public static void main(String args[]) {
		Scanner input = new Scanner (System.in);
		double  sa, mi  ;
		System.out.println("Insira o sal�rio da pessoa");
	    sa = input.nextDouble();  
	    System.out.println("Insira o sal�rio m�nimo");
	    mi = input.nextDouble();
	    System.out.println("O sal�rio de "+sa+"");
	    if (sa > mi){
	    	System.out.println("O valor � suficiente");
	    } else {
	    	System.out.println("O valor n�o � suficiente");
	    
	    input.close();
	    }
}
}
