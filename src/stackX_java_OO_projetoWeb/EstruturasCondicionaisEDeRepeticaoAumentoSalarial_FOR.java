package stackX_java_OO_projetoWeb;

public class EstruturasCondicionaisEDeRepeticaoAumentoSalarial_FOR {

	public static void main(String[] args) {
		int contratado = 2000;
		double salarioInicial =  1000;
		double aumento = 0.015;
		double salarioFinal;
		
		
		salarioFinal = salarioInicial + (salarioInicial*aumento);
		
		System.out.printf("Em "+ contratado + " o salário final =: R$ %.2f\n",salarioInicial);
		System.out.printf("Em " + (contratado + 1) + " o salário final =: R$ %.2f\n", salarioFinal);
		
		for (int i = 2002; i <= 2017; i++) {
			aumento = aumento*2;
			salarioFinal = salarioFinal + (salarioFinal*aumento);
			System.out.printf("Em " + i + " o salário final =: R$ %.2f\n", salarioFinal);
		}
		
//		
		
	}

}
