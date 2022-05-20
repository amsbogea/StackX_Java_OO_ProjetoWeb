package stackX_java_OO_projetoWeb;

import java.util.Scanner;

public class ConjuntoDeValores_While {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.print("Digite um número! ");
		double num = in.nextDouble();
		
		while (num > 0) {
			
				System.out.print("O número digitado = " + num +"\n");
				System.out.print("O seu quadrado = " + Math.pow(num, 2)+"\n");
				System.out.print("O seu cubo = " + Math.pow(num, 3)+"\n");
				System.out.print("A sua raiz quadrada = " + Math.sqrt(num)+"\n");
				
				System.out.print("\nDigite um número ");
				num = in.nextDouble();
			
			System.out.print("O "+ num + " encerra o programa! " );
		}
		System.out.print("O número digitado foi "+ num + ", esse número encerra o programa! " );
	}

}
