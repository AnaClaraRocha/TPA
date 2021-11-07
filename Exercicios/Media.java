import java.util.Scanner;
public class Media {
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		double n1, n2, n3, m, vN;
		System.out.println("Insira a primeira nota:");
		n1 = input.nextDouble();
		System.out.println("Insira a segunda nota:");
		n2 = input.nextDouble();
		m = (n1+n2)/2;
		System.out.println("A sua nota é : "+m);
	    if (m<3) {
	    System.out.println("Reprovado/a");
	    } else if (m>=6) {
	    System.out.println("Aprovado/a");
	    } else if (m >=3 && m<6){
	   System.out.println("Exame");
	   System.out.println("Insira a terceira nota:");
		n3 = input.nextDouble();
		vN = (m+n3)/2;
		System.out.println("A sua nota é : "+vN);
		if (vN<3) {
		    System.out.println("Reprovado/a");
		    } else if (vN>=6) {
		    System.out.println("Aprovado/a");
		
	    }
	}
}
}
