package stackX_java_OO_projetoWeb;

import java.util.Scanner;

public class EstruturasCondicionaisEDeRepeticaoOperacoesComNumeros_SwitchCase {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		
		System.out.print("Digite o primeiro número: ");
		int num1;		
		num1 = leitor.nextInt();
		
		System.out.print("Digite o primeiro número: ");
		int num2;
		num2 = leitor.nextInt();
		
		int resultado;
		
		System.out.print("Digite um número entre 1 e 4: ");
		int escolha;
		escolha = leitor.nextInt();

		switch (escolha) {
		case 1:
			resultado = (num1 + num2) /2;
			System.out.println(resultado);
			break;

		case 2:
			if(num1 > num2) {
				resultado = (num1 - num2);
				System.out.println(resultado);
			}else {
				resultado = (num2 - num1);
				System.out.println(resultado);
			}
			
			break;
			
		case 3:
			resultado = (num1 * num2);
			System.out.println(resultado);
			break;

		case 4:
			resultado = (num1 / num2);
			System.out.println(resultado);
			break;

		default:
			System.out.println("Opção inválida");
			break;
		}
		
	}

}
