import java.util.Scanner;
public class RotinaBusca {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int a[], b=0, i, numBusca, resul=0;
		final int TAM = 10;
		a = new int [TAM];
		
		for(i=0;i<TAM;i++) {
			System.out.println("Insira um n�mero:");
			a[i] = input.nextInt();
		}
		
		System.out.println("   ");
		
		for(numBusca=0; numBusca<TAM; numBusca++) {
			System.out.println("Entre com o n�mero que ser� buscado:");
			b = input.nextInt();
			
			for(i=0, numBusca=0; i<TAM; i++, numBusca++) {
				if(a[i]==b) {
					resul = 1;
					
				}
			}
		}
		
		System.out.println("   ");
		
		if(resul==1) {
			
			System.out.println("O n�mero "+b+" est� dentro do vetor");
			
		}else{
			
			System.out.println("O n�mero "+b+" n�o est� dentro do vetor");
		}
	}
}
