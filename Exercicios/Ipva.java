
import java.util.Scanner;
public class Ipva {
	public static void main(String args[]) {
		Scanner input = new Scanner (System.in);
		double carro, ipva;
		System.out.println("Insira o valor do veiculo:");
	    carro = input.nextDouble();
	    ipva = (4*carro)/100;
	    System.out.println("O valor do IPVA do veiculo é: R$"+ipva);
	    input.close();
	}
}
