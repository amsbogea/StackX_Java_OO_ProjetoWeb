package stackX_java_OO_projetoWeb;

import java.util.Scanner;

public class EmpresaCom10Funcionários_While {

	public static void main(String[] args) {
		String categoria = "";
		String turno = "";
		double salMinimo = 450.00;
		double horaTrabalhada = 0;

		Scanner in = new Scanner(System.in);

		while (!categoria.equals("O") && !categoria.equals("G")) {
			System.out.println("Digite a categoria");
			categoria = in.nextLine();
		}

		while (!turno.equals("M") && !turno.equals("V") && !turno.equals("N")) {
			System.out.println("Digite o turno");
			turno = in.nextLine();
		}
		
		in.close();
		
		if(categoria.equals("G") && turno.equals("N")) {
			horaTrabalhada =  + (salMinimo *0.18);
			System.out.println(horaTrabalhada);
		}else if(categoria.equals("G") && turno.equals("M") || turno.equals("V")) {
			horaTrabalhada =  + (salMinimo *0.15);
			System.out.println(horaTrabalhada);
		}else if(categoria.equals("O") && turno.equals("N")) {
			horaTrabalhada =  + (salMinimo *0.13);
			System.out.println(horaTrabalhada);
		}else if(categoria.equals("O") && turno.equals("M") || turno.equals("V")) {
			horaTrabalhada =  + (salMinimo *0.10);
			System.out.println(horaTrabalhada);
		}
	}
}	
