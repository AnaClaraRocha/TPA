import java.util.Scanner;
public class Anos {
	public static void main(String args[]) {
		Scanner in = new Scanner (System.in);
		int i=1, aInicial=0, aFinal;
		
		System.out.println("Leia a partir de que ano deve ser analisado:");
		aInicial= in.nextInt();
		System.out.println("Leia o ano que a contagem vai parar:");
		aFinal= in.nextInt();
		do {
			if  (aInicial% 4==0) {
			System.out.println(+aInicial+" é bissexto");
			}else {}
			aInicial= aInicial+1;
		}while (aInicial<=aFinal);
	}
}
