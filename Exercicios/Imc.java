
import java.util.Scanner;
public class Imc {
	public static void main(String args[]) {
		Scanner input = new Scanner (System.in);
		double pe, al, imc;
		System.out.println("Insira o seu peso:");
	    pe = input.nextDouble();
	    System.out.println("Insira a sua altura:");
	    al = input.nextDouble();
	    imc = (pe)/(al*al);
	    System.out.println("O seu IMC é de : "+imc);
	    if (imc < 18.5 ) {
	    System.out.println("Excesso de Magreza");
	    } else if(imc < 25 ) {
	    System.out.println("Peso Normal");
	    } else if(imc < 30 ) {
		System.out.println("Excesso de Peso");
	    } else if(imc < 35 ) {
		System.out.println("Obesidade Grau 1");
	    } else if(imc < 40 ) {
		System.out.println("Obesidade Grau 2");
	    } else if(imc > 40 ) {
		System.out.println("Obesidade Grau 3");
}
}
}
