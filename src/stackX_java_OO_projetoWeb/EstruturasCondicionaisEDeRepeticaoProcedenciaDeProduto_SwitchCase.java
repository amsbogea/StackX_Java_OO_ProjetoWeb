package stackX_java_OO_projetoWeb;

import java.util.Scanner;

public class EstruturasCondicionaisEDeRepeticaoProcedenciaDeProduto_SwitchCase {

	public static void main(String[] args) {
		double preco;
		int codigoOrigem;
		String procedência;
		int tabela = 0;
		Scanner in = new Scanner(System.in);
		System.out.print("Digite o código, entre 1 e 30: ");
		tabela = in.nextInt();
		
		System.out.print("Digite o preço: ");
		preco = in.nextDouble();
		
		switch (tabela) {
		
		case 1:
			procedência = "Sul";
			break;
			
		case 2:
			procedência = "Norte";
			break;
			
		case 3:
			procedência = "Leste";
			break;
			
		case 4:
			procedência = "Oeste";
			break;
			
		case 5: case 6:
			procedência = "Nordeste";
			break;
			
		case 7: case 8: case 9:
			procedência = "Sudeste";
			break;
			
		case 10: case 11: case 12: case 13: case 14:
		case 15: case 16: case 17: case 18: case 19: case 20:	
			procedência = "Centro Oeste";
			break;
			
		case 21: case 22: case 23: case 24: case 25:
		case 26: case 27: case 28: case 29: case 30:
			procedência = "Nordeste";
			break;

		default:
			procedência = "Código inválido";
			break;
		}
		
		System.out.println("\npreço R$" + preco);
		System.out.println("Procedência = " + procedência);
	}

}
