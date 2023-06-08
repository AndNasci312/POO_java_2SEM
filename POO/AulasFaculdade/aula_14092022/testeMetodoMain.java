package aula_14092022;

public class testeMetodoMain {

	public static void main(String[] args) {
		
		for(String nome:args) {
			
			System.out.println("nome: " + nome);
		}
	}
		
	public static void meuMetodo(String[] args) {
		
		System.out.println("método...");
		for (@SuppressWarnings("unused") String nome:args) {
			System.out.println("nome " + args);
			
		}
	}
}




