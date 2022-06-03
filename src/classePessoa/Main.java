package classePessoa;

public class Main {

	public static void main(String[] args) {
//		Pessoa pessoa1 = new Pessoa("Alisson", 13, 1.65);
//		
//		System.out.println(pessoa1.getNome());
//		System.out.println(pessoa1.getIdade());
//		System.out.println(pessoa1.getAltura());
		
		Pessoa pessoa2 = new Pessoa();
		pessoa2.setNome("Alex");
		pessoa2.setIdade(35);
		pessoa2.setAltura(1.75);

		System.out.println("Meu nome é "+ pessoa2.getNome());
		System.out.println("Minha idade atual é "+ pessoa2.getIdade()+ " anos");
		System.out.println("Minha altura é "+ pessoa2.getAltura());
		System.out.println("No mes de julho eu farei "+ pessoa2.fazeraniversario(pessoa2.getIdade())+ " anos");
		
	}

}
