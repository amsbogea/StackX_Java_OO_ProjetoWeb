package stackX_java_OO_projetoWeb;

import java.util.Scanner;

public class EstruturasCondicionaisEdeRepeticaoEstatistica_FOR {

	public static void main(String[] args) {
		int codigoCidade = 0; 
		int cidadeIndiceMenor = 0, cidadeIndiceMaior = 0;
		int numeroVeiculosPasseio, somaVeiculosPasseio;
		int numeroAcidentesVitimas, somaAcidentesVitimas;
		int indiceMaior = -1;
		int indiceMenor = 99999;
		double mediaVeiculos;
		double mediaAcidentes;
		double mediaMenor2000;
		int qtdAcidentes = -1;
		int acidenteVeiculosMenor2000 = 0;
		int cont = 0;
		Scanner in = new Scanner(System.in);

		somaVeiculosPasseio = 0;
		numeroVeiculosPasseio = 0;

		for (int i = 1; i <= 5; i++) {
			System.out.print("Digite o código da cidade " + i +": ");
			codigoCidade = in.nextInt();
//			in.next();

			System.out.print("Digite a quantidade de veículos passeio  na cidade " + i +": ");
			numeroVeiculosPasseio = in.nextInt();
//			in.next();

			System.out.print("Digite a quantidade de acidentes com vítimas " + i +": ");
			numeroAcidentesVitimas = in.nextInt();
			System.out.println();
//			in.next();
			
			if (numeroAcidentesVitimas < indiceMenor) {
				indiceMenor = numeroAcidentesVitimas;
				cidadeIndiceMenor = codigoCidade;
			}

			
			if (numeroAcidentesVitimas > indiceMaior) {
				indiceMaior = numeroAcidentesVitimas;
				cidadeIndiceMaior = codigoCidade;
			}
			
			if(numeroVeiculosPasseio < 2000) {
				acidenteVeiculosMenor2000 = acidenteVeiculosMenor2000 + numeroAcidentesVitimas;
				cont++;
			}
			
			somaVeiculosPasseio = somaVeiculosPasseio + numeroVeiculosPasseio;
		}

		mediaVeiculos = somaVeiculosPasseio / 5;
		mediaMenor2000 = acidenteVeiculosMenor2000 / cont;
		
		System.out.println("O maior índice de acidentes "+ indiceMaior + " que pertencem a cidade "+ cidadeIndiceMaior);
		System.out.println("O menor índice de acidentes "+ indiceMenor + " que pertencem a cidade "+ cidadeIndiceMenor);
		System.out.println(mediaVeiculos + " é a media de veículos nas cinco cidades juntas");
		System.out.println("A média de acidentes de trânsito nas cidades com menos de 2.000 veículos de passeio é " + mediaMenor2000 + " acidentes");
	}

}
