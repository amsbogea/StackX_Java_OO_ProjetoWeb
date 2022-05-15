package stackX_java_OO_projetoWeb;

import java.util.Scanner;

//Faça um programa que receba o salário de um funcionário chamado Carlos. 
//Sabe-se que outro funcionário, João, tem salário equivalente a um terço do salário de Carlos. 
//Carlos aplicará seu salário integralmente na caderneta de poupança, que rende 2% ao mês, 
//e João aplicará seu salário integralmente no fundo de renda fixa, que rende 5% ao mês. 
//O programa deverá calcular e mostrar a quantidade de meses necessários para que o valor pertencente a 
//João iguale ou ultrapasse o valor pertencente a Carlos.

public class ReceberNomesESalarios_While {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		double salarioCarlos = 0;
		
		System.out.print("Digite o salário do Carlos: ");
		salarioCarlos = in.nextDouble();
		double salarioJoao = salarioCarlos/3;
	
		int mes = 0;
		while (salarioJoao <= salarioCarlos) {
			salarioCarlos = salarioCarlos  *1.02;
			salarioJoao = salarioJoao  *1.05; 
			mes++;
		}
		System.out.printf("Carlos R$ %.2f \n" ,salarioCarlos);
		System.out.printf("Joao R$ %.2f \n" ,salarioJoao);
		System.out.print(mes + " meses");
	}
}
