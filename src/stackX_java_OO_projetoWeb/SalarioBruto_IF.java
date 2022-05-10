package stackX_java_OO_projetoWeb;

import java.util.Scanner;

public class SalarioBruto_IF {

	public static void main(String[] args) {
		double salarioBruto;
		double salarioLiquido = 0;
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Digite o salário:");
		salarioBruto = in.nextDouble();
		in.close();

		if (salarioBruto <= 350.00) {
			salarioLiquido = salarioBruto - (salarioBruto * 0.07) + 100.00;
			System.out.println("Valor a receber é "+salarioLiquido);
		} else if (salarioBruto >= 351.00 && salarioBruto <= 600.00) {
			salarioLiquido = salarioBruto - (salarioBruto * 0.07) + 75.00;
			System.out.println("Valor a receber é "+salarioLiquido);
		} else if (salarioBruto >= 601.00 && salarioBruto <= 900.00) {
			salarioLiquido = salarioBruto - (salarioBruto * 0.07) + 50.00;
			System.out.println("Valor a receber é "+salarioLiquido);
		} else if (salarioBruto >= 901.00) {
			salarioLiquido = salarioBruto - (salarioBruto * 0.07) + 35.00;
			System.out.println("Valor a receber é "+salarioLiquido);
		}

	}
}
