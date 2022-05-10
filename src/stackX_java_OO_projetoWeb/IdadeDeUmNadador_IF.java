package stackX_java_OO_projetoWeb;

import java.util.Scanner;

public class IdadeDeUmNadador_IF {

	public static void main(String[] args) {
		byte idade;
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Digite a idade do nadador:");
		idade = ler.nextByte();
		ler.close();
		
		if (idade > 4 && idade < 8) {
			System.out.println("Categoria Infantil");
		}else if (idade > 7 && idade < 11) {
			System.out.println("Categoria Juvenil");
		}else if (idade > 10 && idade < 16) {
			System.out.println("Categoria Adolescente");
		}else if (idade > 15 && idade < 31) {
			System.out.println("Categoria Adulto");
		}else if (idade > 30) {
			System.out.println("Categoria Sênior");
		}else
			System.out.println("Categoria não definida");
	}

}
