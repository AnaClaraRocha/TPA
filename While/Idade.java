import java.util.Scanner;
public class Idade {
	public static void main(String args[]) {
		Scanner in = new Scanner (System.in);
		int i=1, menor=0, maior=0, ida;
		while (i<=10) {
		System.out.println("Insira a idade do aluno "  +i);
	    ida = in.nextInt();   
	    if(ida>=18) {
	    System.out.println("Maior de idade ");
	    maior++;
	    }else {
	    	System.out.println("Menor de idade ");
	    	menor++;
	    	i++;
	    }
	   
	    System.out.println("A quantidade de maior de idade é " +maior);
	    System.out.println("A quantidade de menor de idade é " +menor);
	}
  }
}	
