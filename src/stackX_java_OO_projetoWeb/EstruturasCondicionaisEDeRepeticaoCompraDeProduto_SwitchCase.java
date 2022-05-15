package stackX_java_OO_projetoWeb;

import java.util.Scanner;

public class EstruturasCondicionaisEDeRepeticaoCompraDeProduto_SwitchCase {

	public static void main(String[] args) {
		System.out.print("Digite o código do produto: ");
		Scanner in = new Scanner(System.in);
		int codigo;
		codigo = in.nextInt();
		
		System.out.print("Digite a quantidade do produto: ");
		int quantidade;
		quantidade = in.nextInt();
		
		int tabela = 0;
		
		if (codigo <= 10) {
			tabela = 1;
		}else if (codigo > 10 && codigo <= 20) {
			tabela = 2;
		}else if (codigo > 20 && codigo <= 30) {
			tabela = 3;
		}else if (codigo > 30 && codigo <= 40) {
			tabela = 4;
		}
		
		double preco = 0;
		
		switch (tabela) {
		case 1:
			preco = 10;
			break;
			
		case 2:
			preco = 15;
			break;
			
		case 3:
			preco = 20;
			break;
			
		case 4:
			preco = 30;
			break;

		default:
			System.out.println("Código Inválido");
			break;
		}
		
		double precoTotal = preco * quantidade;
		
		double precoDesconto = 0;
		double desconto = 0;
		
		if(precoTotal <= 250) {
			precoDesconto = precoTotal - (precoTotal * 0.05);
			 desconto = (precoTotal - precoDesconto);
		}else if(precoTotal > 250 && precoTotal <= 500) {
			precoDesconto = precoTotal - (precoTotal * 0.10);
			 desconto = (precoTotal - precoDesconto);
		}else {
			precoDesconto = precoTotal - (precoTotal * 0.15);
			 desconto = (precoTotal - precoDesconto);
		}
		
		System.out.print("\npreço unitario " + preco);
		System.out.print("\nQuantidade comprada " + quantidade);
		System.out.print("\nTotal R$" + precoTotal);
		System.out.print("\nValor do desconto R$" + desconto);
		System.out.print("\nTotal a pagar R$" + precoDesconto);

	}

}
