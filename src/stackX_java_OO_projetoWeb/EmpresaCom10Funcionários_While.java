package stackX_java_OO_projetoWeb;

import java.util.Scanner;

public class EmpresaCom10Funcionários_While {

	public static void main(String[] args) {
		String categoria = "";
		String turno = "";
		double salMinimo = 450.00;
		double salPorHora = 0;
		int horasTrabalhadas = 44;
		int totalHorasTrabalhadas;
		double salLiquido;
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
			salPorHora =  + (salMinimo *0.18); //salario por hora
			salLiquido = horasTrabalhadas * salPorHora; //total de salario
			System.out.println("Categoria GERENTE, turno NOTURNO, salário = R$" + salPorHora + " reais por hora trabalhada! Foram trabalhadas " +horasTrabalhadas+ " horas, total a receber R$" +  salLiquido);
		}else if(categoria.equals("G") && turno.equals("M") || turno.equals("V")) {
			salPorHora =  + (salMinimo *0.15);
			salLiquido = horasTrabalhadas * salPorHora; //total de salario
			System.out.println("Categoria GERENTE, turno DIURNO, salário = R$" + salPorHora + " reais por hora trabalhada! Foram trabalhadas " +horasTrabalhadas+ " horas, total a receber R$" +  salLiquido);
		}else if(categoria.equals("O") && turno.equals("N")) {
			salPorHora =  + (salMinimo *0.13);
			salLiquido = horasTrabalhadas * salPorHora; //total de salario
			System.out.println("Categoria OPERACINAL, turno NOTURNO, salário = R$" + salPorHora + " reais por hora trabalhada! Foram trabalhadas " +horasTrabalhadas+ " horas, total a receber R$" +  salLiquido);
		}else if(categoria.equals("O") && turno.equals("M") || turno.equals("V")) {
			salPorHora =  + (salMinimo *0.10);
			salLiquido = horasTrabalhadas * salPorHora; //total de salario
			System.out.println("Categoria OPERACINAL, turno DIURNO, salário = R$" + salPorHora + " reais por hora trabalhada! Foram trabalhadas " +horasTrabalhadas+ " horas, total a receber R$" +  salLiquido);
		}
	}
}	
