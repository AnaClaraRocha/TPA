import java.util.Scanner;
public class Triangulos {
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		double a, b, c;
		System.out.println("Insira o primeiro valor:");
		a = input.nextDouble();
		System.out.println("Insira o segundo valor:");
		b = input.nextDouble();
		System.out.println("Insira o terceiro valor:");
		c = input.nextDouble();
		if (a> b+c)  {
		System.out.println("Não é triangulo");
	} else if (b>a+c) {
	    System.out.println("Não é triangulo");
    }else if (b>a+c) {
    System.out.println("Não é triangulo");
    }else if (a!=b && b!=c) {
    System.out.println("Triangulo Equilatero");
    }else if (a!=b && b!=c && a!=c) {
    System.out.println("Triangulo escaleno");
   } else  {
   System.out.println("Triangulo Isosceles");
}
}
}