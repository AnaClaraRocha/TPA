import java.util.Scanner;
public class Valores {
	public static void main(String args[]) {
		Scanner in = new Scanner (System.in);
		int i=1, v, n, m=0;
		do {
			System.out.println("Digite a quantidade de valores:");
			v= in.nextInt();
			while (i<=v) {
			System.out.println("Digite o valor:");
			n= in.nextInt();
			if(n > m) {
				m=n;
			}
			i++;
			
			}if (v !=0) {
			System.out.println("O maior número é:" +m);
			}
		}while (v!=0)	;
		in.close();


	}
}