import java.util.Scanner;
public class Salarios {
	public static void main(String args[]) {
		Scanner input = new Scanner (System.in);
		double  sa, mi  ;
		System.out.println("Insira o salário da pessoa");
	    sa = input.nextDouble();  
	    System.out.println("Insira o salário mínimo");
	    mi = input.nextDouble();
	    System.out.println("O salário de "+sa+"");
	    if (sa > mi){
	    	System.out.println("O valor é suficiente");
	    } else {
	    	System.out.println("O valor não é suficiente");
	    
	    input.close();
	    }
}
}
