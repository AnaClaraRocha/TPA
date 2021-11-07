import java.util.Scanner;
public class Conversao {
     public static void main(String args[]) {
    	 Scanner input = new Scanner (System.in);
    	 double m, km; 
    	 System.out.println("Insira o valor do metros para ser convertido: ");
    	 m = input.nextDouble();
    	 km = m/1000;
    	 System.out.println("Valor convertido:  "+km+"km");
    	 input.close();
     }
}
