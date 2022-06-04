package divisao_Tratamento_de_Excecoes;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		try {
			System.out.println("digite um numero");
			Scanner in = new Scanner(System.in);

			int num = (int) in.nextDouble();
			int divisao = (num / 0);
			System.out.println(divisao);
		} catch (ArithmeticException e) {
			System.out.println("erro de divisão por zero");
		}

		try {
			System.out.println("\ndigite outro numero");
			Scanner leitor = new Scanner(System.in);
			int num2 = leitor.nextInt();
			System.out.println(num2);
		} catch (InputMismatchException e) {
			System.out.println("o valor informado não é numerico");
		}
	}

}
