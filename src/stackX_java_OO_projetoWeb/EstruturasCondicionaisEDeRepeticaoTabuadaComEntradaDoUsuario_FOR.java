package stackX_java_OO_projetoWeb;

import java.util.Scanner;

public class EstruturasCondicionaisEDeRepeticaoTabuadaComEntradaDoUsuario_FOR {

	public static void main(String[] args) {
		int num;
		int soma;
		int sub;
		int mult;
		int divi;
		Scanner in = new Scanner(System.in);
		
		
		System.out.print("Digite o número desejado: ");
		num = in.nextInt();
		
		System.out.println("\nadição");
		for (int i = 1; i <= 10; i++) {

			System.out.println(num + " + " + i + " = " + (soma = num + i));

		}
		System.out.println("\nSubtração");
		for (int i = 1; i <= 10; i++) {

			System.out.println(num + " - " + i + " = " + (sub = num - i));

		}
		System.out.println("\nMultiplicação");
		for (int i = 1; i <= 10; i++) {

			System.out.println(num + " * " + i + " = " + (mult = num * i));

		}
		System.out.println("\nDivisão");
		for (int i = 1; i <= 10; i++) {

			System.out.println(num + " / " + i + " = " + (divi = num / i));

		}

	}

}
