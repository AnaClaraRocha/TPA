
import java.util.Scanner;
public class nomeIdade {
	public static void main(String args[]) {
		Scanner leia = new Scanner(System.in);
		String nome, nomeVelho, nomeNovo;
		double ida, idaVelha, idaNova;
		System.out.println("Insira o primeiro Nome:");
		nome = leia.next();
		System.out.println("Insira a primeira idade:");
		ida = leia.nextDouble();
		nomeVelho = nome;
	    idaVelha = ida;
	    nomeNovo = nome;
	    idaNova = ida;
	    System.out.println("Insira o segundo nome:");
	    nome = leia.next();
	    System.out.println("Insira a segunda idade:");
	    ida = leia.nextDouble();
	    if (ida>idaVelha) {
	    	idaVelha = ida;
	    	nomeVelho = nome;
	    }else if (ida < idaNova) {
	    	idaNova = ida;
	    	nomeNovo = nome;
	    System.out.println("Insira o terceiro nome:");
	    nome = leia.next();
	    System.out.println("Insira a terceira idade:");
	    ida = leia.nextDouble();
	    if (ida>idaVelha) {
	    	idaVelha = ida;
	    	nomeVelho = nome;
	    }else if (ida < idaNova) {
	    	idaNova = ida;
	    	nomeNovo = nome;
	    	 System.out.println("Insira o quarto nome:");
	 	    nome = leia.next();
	 	    System.out.println("Insira a quarta idade:");
	 	    ida = leia.nextDouble();
	 	    if (ida>idaVelha) {
	 	    	idaVelha = ida;
	 	    	nomeVelho = nome;
	 	    }else if (ida < idaNova) {
	 	    	idaNova = ida;
	 	    	nomeNovo = nome;
	 	    	System.out.println("Insira o quinto nome:");
		 	    nome = leia.next();
		 	    System.out.println("Insira a quinta idade:");
		 	    ida = leia.nextDouble();
		 	    if (ida>idaVelha) {
		 	    	idaVelha = ida;
		 	    	nomeVelho = nome;
		 	    }else if (ida < idaNova) {
		 	    	idaNova = ida;
		 	    	nomeNovo = nome;
		 	    }
		 	    	System.out.println("O nome do usuario mais velho é:"+nomeVelho);
		 	    	System.out.println("A idade do usuario mais velho é:"+idaVelha);
		 	    	System.out.println("O nome do usuario mais novo é:"+nomeNovo);
		 	    	System.out.println("O idade do usuario mais novo é:"+idaNova);
		 	    
	 	    }
	    		
	    }
	    }
	}
}
		