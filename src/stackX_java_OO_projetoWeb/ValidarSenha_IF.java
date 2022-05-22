package stackX_java_OO_projetoWeb;

import java.util.Scanner;

public class ValidarSenha_IF {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.print("Digite sua senha: ");
		String senha = in.next();

			if (!senha.equals("1234")) {
				System.out.print("ACESSO NEGADO: ");
			} else {
				System.out.print("ACESSO PERMITIDO: ");
			}
		}
	}
