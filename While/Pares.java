import java.util.Scanner;
public class Pares {
	public static void main(String args[]) {
		Scanner in = new Scanner (System.in);
		int i=1, nn, n, nm=0;
		do {
			System.out.println("Escreva o número de valores:");
			nn= in.nextInt();
			
			while (i<=nn) {
			System.out.println("Escreva o valor:");
			n= in.nextInt();
			if(n > nm) {
				nm=n;
			}
			i++;
			}
		if (nn!=0) {
			System.out.println("O maior numero é:" +nm);
		}
		
		}while (nn!=0)	;
		in.close();
}
}
