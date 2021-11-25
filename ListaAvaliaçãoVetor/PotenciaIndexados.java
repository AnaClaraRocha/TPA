import java.util.Scanner;
public class PotenciaIndexados {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int a[], i, b, resultado;
		final int TAM = 11;
		a = new int [TAM];
		
		
		for(i=0; i<TAM; i++) {
			resultado=1;
			
			System.out.println("Insira o expoente:");
			a[i] = in.nextInt();
			
			for(b=0; b<a[i]; b++) {
				resultado = (2*resultado);
				
			}
			System.out.println( a[i]+" Elevado a 2 = "+resultado+"\n");
		}
	}

}