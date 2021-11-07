import java.util.Scanner;
public class MediaValores {
	public static void main(String args[]) {
		Scanner in = new Scanner (System.in);
		final int TAM=10;
		int i, a[], m=0;
		a = new int [TAM];
		
		for(i=0; i<TAM; i++) {
			System.out.println("Digite o " +(i+1)+" valor da média do vetor A:");
			a[i] = in.nextInt();
			m = m + a[i];
		}
		
		m = m/10;
		
		System.out.println("A média é: " +m);

	}
}