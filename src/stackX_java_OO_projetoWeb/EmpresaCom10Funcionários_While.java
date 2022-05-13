package stackX_java_OO_projetoWeb;

import java.util.Scanner;

public class EmpresaCom10Funcionários_While {

	public static void main(String[] args) {
		byte qtdFucnionario;
		byte codigo;
		String categoria;
		String turno;
		double salMinimo = 450.00;
		double salPorHora = 0;
		int horasTrabalhadas;
		double salarioMes;
		double auxilioAlimentacao;
		Scanner in = new Scanner(System.in);
		
		System.out.print("Digite a quantidade de funcionarios: ");
		qtdFucnionario = in.nextByte();
		
		for (int i = qtdFucnionario; i > 0; i--) {
			
			categoria =" ";
			turno = " ";
			
		System.out.print("Digite o código do fucnionário: ");
			codigo = in.nextByte();
			
			in.nextLine();

		System.out.print("Digite a categoria: ");
		categoria = in.nextLine();
		while (!categoria.equals("O") && !categoria.equals("G")) {
			
			if (!categoria.equals("O") && !categoria.equals("G")) {
				System.out.print("Categoria inválida, digite G para gerente ou O para operacional: ");
				categoria = in.nextLine();
			}
		}

		System.out.print("Digite o turno: ");
		while (!turno.equals("M") && !turno.equals("V") && !turno.equals("N")) {
			turno = in.nextLine();
			if (!turno.equals("M") && !turno.equals("V") && !turno.equals("N")) {
				System.out.print("Categoria inválida, digite M para Matutino ou V para Vespertino ou N para Noturno: ");
			}
		}
		
		System.out.print("Digite a quantidade de horas trabalhadas do fucnionário: ");
			horasTrabalhadas = in.nextInt();
		
		if (categoria.equals("G")) {
			if (turno.endsWith("N")) {
				salPorHora = +(salMinimo * 0.18);
			} else
				salPorHora = +(salMinimo * 0.15);
		} else if (categoria.equals("O")) {
			if (turno.endsWith("N")) {
				salPorHora = +(salMinimo * 0.13);
			} else
				salPorHora = +(salMinimo * 0.10);
		}

		salarioMes = salPorHora * horasTrabalhadas;

		if (salarioMes <= 300) {
			auxilioAlimentacao = salarioMes * 0.20;
		} else if (salarioMes > 300 && salarioMes <= 600) {
			auxilioAlimentacao = salarioMes * 0.15;
		} else {
			auxilioAlimentacao = salarioMes * 0.05;
		}
		
		System.out.println("--------------------------------------------------------------------------------");
		System.out.print(" codigo do funcionário: " + codigo + "\n");
		System.out.print(" número de horas trabalhadas: "+horasTrabalhadas+"\n");
		System.out.print(" valor da hora trabalhada: "+ salPorHora + "\n");
		System.out.print(" salário inicial: "+salarioMes+"\n");
		System.out.print(" auxílio alimentação: "+auxilioAlimentacao+"\n");
		System.out.print(" salário final: (salário + auxílio alimentação: "+ (salarioMes+auxilioAlimentacao));
		System.out.println("\n--------------------------------------------------------------------------------");
		System.out.println();

		}

	}
}
