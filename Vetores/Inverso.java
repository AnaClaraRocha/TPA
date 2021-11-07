import java.util.Scanner;
public class Inverso {
	public static void main(String args[]) {
		Scanner in = new Scanner (System.in);
		final int TAM=10;
		int i, a[], b[];
		a = new int [TAM];
		b = new int [TAM];
		
		for(i=0; i<TAM; i++) {
			System.out.println("Digite o " +(i+1)+" valor do vetor A:");
			a[i] = in.nextInt();
			b[9-i] = a[i];
		}
		
        System.out.println("   ");
        
        System.out.print("Vetor B = ");
		for(i=0; i<TAM; i++){
		System.out.print(b[i]+ "    ");
		}
	
	}

}
