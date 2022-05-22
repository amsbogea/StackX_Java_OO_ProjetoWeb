package stackX_java_OO_projetoWeb;

import java.util.Scanner;

import javax.sound.sampled.TargetDataLine;

import java.util.Date;

import java.util.Calendar;


public class IdadeParaVoto_IF {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.print("Digite o ano atual: ");
		int anoAtual = in.nextInt();
		
		System.out.print("Digite o ano do seu nascimento: ");
		int anoNasc = in.nextInt();
		
		int idade = anoAtual - anoNasc;
		if (idade > 15) {
			System.out.println("Você tem atualmente possui " + idade + " anos, você pode votar.");
		}else {
			System.out.println("Você tem atualmente possui " + idade + " anos, você não pode voltar nessa eleição.");

		}
	}

}
