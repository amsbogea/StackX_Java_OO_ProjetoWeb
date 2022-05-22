package stackX_java_OO_projetoWeb;

import java.util.Scanner;

public class CompraMacas_IF {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		System.out.println("Digite a quantidade de maçãs compradas: ");
		int qtd = in.nextInt();
		double preco = 0;
		
		if(qtd > 11) {
			preco = 0.30 * qtd;
			System.out.println("valor total da compra " + preco);
		}else {
			preco = 0.25 * qtd;
			System.out.println("valor total da compra " + preco);
		}
	}

}
