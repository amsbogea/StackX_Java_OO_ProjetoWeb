package stackX_java_OO_projetoWeb;

import java.util.Scanner;

public class AlturaESexo_IF {
//Tendo como entrada a altura e o sexo (codificado da seguinte forma: 
//	1: feminino 
//	2: masculino) 
//de uma pessoa, construa um programa que calcule e imprima seu peso ideal, 
//utilizando as seguintes Fórmulas:

//para homens: (72.7 * Altura) – 58
//para mulheres: (62.1 * Altura) – 44.7
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		double pesoIdeal = 0;
		
		System.out.println("Qual o seu sexo?");
		System.out.println("Digite 1: para feminino ou 2: para masculino: ");
		double sexo = in.nextInt();
		
		System.out.println("Digite o seu peso: ");
		double altura = in.nextDouble();
		
		if(sexo == 1) {
			pesoIdeal = (altura * 62.1) - 44-7;
			System.out.println("Seu peso ideal é: "+ pesoIdeal);
		}else {
			pesoIdeal = (altura * 72.7) - 58;
			System.out.println("Seu peso ideal é: " + pesoIdeal);
		}
	}
}
