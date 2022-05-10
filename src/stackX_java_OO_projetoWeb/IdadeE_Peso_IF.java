package stackX_java_OO_projetoWeb;

import java.util.Scanner;

public class IdadeE_Peso_IF {

	public static void main(String[] args) {
		int idade;
		double peso;
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Digito a idade");
		idade = ler.nextInt();
		
		System.out.println("Digite o peso");
		peso = ler.nextDouble();
		
		ler.close();
		
		if(idade <20 && peso <= 60) {
			System.out.println("Grupo de Risco 9");
		}else if(idade < 20 && peso > 60 && peso <=90) {
			System.out.println("Grupo de Risco 8");
		}else if(idade < 20 && peso >= 90) {
			System.out.println("Grupo de Risco 7");
		}else if(idade >= 20 && idade <= 50 && peso <= 60) {
			System.out.println("Grupo de Risco 6");
		}else if(idade >= 20 && idade <= 50 && peso > 60 && peso <=90) {
			System.out.println("Grupo de Risco 5");
		}else if(idade >= 20 && idade <= 50 && peso >= 90) {
			System.out.println("Grupo de Risco 4");
		}else if(idade >50 && peso <= 60) {
			System.out.println("Grupo de Risco 3");
		}else if(idade > 50 && peso > 60 && peso <=90) {
			System.out.println("Grupo de Risco 2");
		}else if(idade > 50 && peso >= 90) {
			System.out.println("Grupo de Risco 1");
		}
	}

}
