import java.util.Scanner;
public class Fibonacci {
	public static void main(String args[]) {
		Scanner in = new Scanner (System.in);
		int i=1;
		do {
			System.out.println("Leia o numero informado pelo usuario");
			   i= in.nextInt();
			   i = i+i;
		}while (i<=34);
	
		System.out.println( +i  +i);
}
}