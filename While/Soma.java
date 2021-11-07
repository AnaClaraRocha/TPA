import java.util.Scanner;
public class Soma {

	public static void main(String[] args) {
		int n = 1, s = 0;
		while(n<101) {
			s=s+n;
			n++;
		} 
		
		System.out.println("A soma de todos os números de 1 a 100 é " +s);
		
	}

}
