import java.util.Scanner;
public class Bissexto {
	public static void main(String args[]) {
		Scanner in = new Scanner (System.in);
		int aI,aF, total=0, ano;
		
			System.out.println("Digite o ano inicial:");
			aI= in.nextInt();
			System.out.println("Digite o ano final:");
			aF= in.nextInt();
			ano = aI;
			while (ano%4!=0) {
				
			}
			do {
				System.out.println(ano+ " è um ano bissexto");
			ano = ano + 4;
			total ++;
			}while (ano<aF);
		System.out.println("O total de anos que são bissextos é: " +total+ " anos bissextos");
		}
	}

