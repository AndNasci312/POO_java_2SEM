package aula_30082022;

public class ObjetoPessoa {

	public static void main(String[] args) {
		
		ClassePessoa pessoa1 = new ClassePessoa();
		
		pessoa1.nome = "sabrina";
		pessoa1.sexo = 'F';
		pessoa1.idade = 26;
		
		System.out.println("------------------------");
		System.out.println("nome: " + pessoa1.nome);
		System.out.println("sexo: " + pessoa1.sexo);
		System.out.println("idade: " + pessoa1.idade);
		System.out.println("------------------------");
		
		
	}

}
