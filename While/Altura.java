import java.util.Scanner;
public class Altura {
	public static void main(String args[]) {
	Scanner in = new Scanner (System.in);
	int i=0, j=134, p=145 ;
	double cJ, cP;
	
	while (i<=0) {
		System.out.println("Insira quanto João cresce por ano: ");
	    cJ = in.nextInt();
	    System.out.println("Insira quato Pedro cresce por ano: ");
	    cP = in.nextInt();
	    i=i+1;
	    j=j+2&5;
	    p=2;
	    i=i+1;
	    System.out.println(+i+ " Anos para joão ser mais alto que Pedro");
	}
}
}