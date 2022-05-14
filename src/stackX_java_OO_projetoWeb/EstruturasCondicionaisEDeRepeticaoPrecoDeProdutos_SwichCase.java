package stackX_java_OO_projetoWeb;

import java.util.Scanner;

public class EstruturasCondicionaisEDeRepeticaoPrecoDeProdutos_SwichCase {

	public static void main(String[] args) {
		String categoria = "";
		Scanner in = new Scanner(System.in);

		System.out.println("Digite '1' para limpeza; '2' para alimentação; ou '3' para vestuário");
		categoria = in.next();
		switch (categoria) {
		case "1": {
			System.out.println("categoria limpeza\n");
			break;
		}

		case "2": {
			System.out.println("categoria alimentação\n");
			break;
		}

		case "3": {
			System.out.println("categoria vestuário\n");
			break;
		}

		default: {
			System.out.println("categoria inválida\n");
			break;
		}

		}

		String situacao = "";
		System.out.println(
				"Digite 'r' para produtos que necessitam de refrigeração; e 'n' para produtos que não necessitam de refrigeração");
		situacao = in.next();
		switch (situacao) {
		case "r": {
			System.out.println("produto necessita de refrigeração\n");
			break;
		}

		case "n": {
			System.out.println("produto NÃO necessita de refrigeração\n");
			break;
		}

		default: {
			System.out.println("categoria inválida\n");
			break;
		}

		}

		double preco;
		System.out.print("Digite o preço: ");
		preco = in.nextDouble();

//		inicio - O valor do aumento
		if (preco <= 25) {
			if (categoria.equalsIgnoreCase("1")) {
				preco = preco + (preco * 0.05);
			} else if (categoria.equalsIgnoreCase("2")) {
				preco = preco + (preco * 0.08);
			} else {
				preco = preco + (preco * 0.10);
			}
		}

		if (preco > 25) {
			if (categoria.equalsIgnoreCase("1")) {
				preco = preco + (preco * 0.12);
			} else if (categoria.equalsIgnoreCase("2")) {
				preco = preco + (preco * 0.15);
			} else
				preco = preco + (preco * 0.18);
		}
//		fim - O valor do aumento

//		inicio - O valor do imposto
		String classficacao = "";
		if (categoria.equalsIgnoreCase("2") || situacao.equalsIgnoreCase("r")) {
			if (preco <= 50) {
				classficacao = "Batato";
			} else if (preco > 50 && preco <= 120) {
				classficacao = "Normal";
			} else
				classficacao = "Caro";

		}
//		fim - O valor do imposto

		System.out.print("\nPreço com aumento " + preco + "\n");
		System.out.print("Classficação " + classficacao + "\n");

	}

}
