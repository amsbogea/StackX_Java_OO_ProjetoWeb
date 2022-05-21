package stackX_java_OO_projetoWeb;

import java.util.Scanner;

public class NumeroMaior_IF {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.print("Digite um número: ");
		int num1 = in.nextInt();
		
		System.out.print("Digite um núero diferente do número anterior: ");
		int num2 = in.nextInt();
		
		while(num1 == num2) {
			System.out.print("Este número é igual ao número anterior, digite um número diferente do número anterior: ");
			num2 = in.nextInt();
		}
		if(num1 > num2) {
			System.out.print("O número maior é " + num1);
		}else {
			System.out.print("O número maior é " + num2);
		}
	}

}
