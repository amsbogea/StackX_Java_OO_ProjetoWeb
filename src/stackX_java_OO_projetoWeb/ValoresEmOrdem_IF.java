package stackX_java_OO_projetoWeb;

import java.util.Scanner;
//Escreva um programa para ler 3 valores inteiros 
//(considere que não serão lidos valores iguais) 
//e escrevê-los em ordem crescente.
public class ValoresEmOrdem_IF {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		System.out.print("Digite o primeiro valor: ");
		int num1 = in.nextInt();
		int maior = -1;
		
		System.out.print("Digite o segundo valor: ");
		int num2 = in.nextInt();
		
		System.out.print("Digite o terceiro valor: ");
		int num3 = in.nextInt();
		
		if(num1 == num2 || num1 == num3 || num2 == num3) {
			System.out.println("Números inválidos, não é permtido valores iguais!");
		}else if(num1 > num2 && num1 > num3){
			maior = num1;
			System.out.print(maior + " é o maior número!");
		}else if(num2 > num1 && num2 > num3){
			maior = num2;
			System.out.print(maior + " é o maior número!");
		}else {
			maior = num3;
			System.out.print("\nO número "+maior + " é o maior número!");
		}
		
	}

}
