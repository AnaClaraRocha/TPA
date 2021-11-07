import java.util.Scanner;
public class BQuadradoA {
	public static void main(String args[]) {
		Scanner in = new Scanner (System.in);
		final int TAM=10;
		int i, a[], b[];
		a = new int [TAM];
		b = new int [TAM];
		
		for(i=0; i<TAM; i++) {
			System.out.println("Digite o " +(i+1)+" valor do vetor A:");
			a[i] = in.nextInt();
			b[i] = a[i]*a[i];
		}
		
		System.out.println("   ");
		
		System.out.println("O quadrado do vetor A é de:");
		System.out.print("B = ");
		for(i=0; i<TAM; i++){
		System.out.print(b[i]+ "   ");
		}
		
	}
}

