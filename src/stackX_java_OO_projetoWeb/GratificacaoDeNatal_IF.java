package stackX_java_OO_projetoWeb;

import java.util.Scanner;

public class GratificacaoDeNatal_IF {

	public static void main(String[] args) {
		double HT, HF, H;

		
		  Scanner leitor = new Scanner(System.in);
		  
		  System.out.println("Informe o numero de horas trabalhadas."); 
		  HT = leitor.nextDouble();
		  
		  System.out.println("Informe o numero de horas faltantes."); HF =
		  leitor.nextDouble();
		  
		  leitor.close();
		 
//		HE = 2500;
//		HF = 250;
		H = (HT - (2 * HF / 3));			

		if (H >= 2.401) {
			System.out.println("Suas horas extras foram " + H + " seu PRÊMIO será no valor de (R$)500,00");
		} else if (H >= 1.801 && H <= 2.400) {
			System.out.println("Suas horas extras foram "+ H +" seu PRÊMIO será no valor de (R$)400,00");
		} else if (H >= 1.201 && H <= 1.800) {
			System.out.println("Suas horas extras foram "+H+" seu PRÊMIO será no valor de (R$)300,00");
		} else if (H >= 600 && H <= 1.200) {
			System.out.println("Suas horas extras foram "+H+" seu PRÊMIO será no valor de (R$)200,00");
		}else
			System.out.println("Suas horas extras foram "+H+" seu PRÊMIO será no valor de (R$)100,00");

	}

}
