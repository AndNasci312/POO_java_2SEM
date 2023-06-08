package br.com.turma.exception;

public class TesteTratamentoExcecao {
	
	// exemplo de uma call stack: quando um método chama o outro por vez, pilhando as suas informações (organização de execução de codigo)
	// nesse caso, coloquei um while no codigo só para ele repetir o resultado diversas vezes esperando algum erro :P
				

	public static void main(String[] args) {
			System.out.println("Início do método main...");
			metodo1();
			System.out.println("Fim do método main...");
		}


		public static void metodo1() {
			System.out.println("Início do método1...");
			
			try {
				
				metodo2();
				
			}catch (ArithmeticException e) {
				
				System.out.println("erro!");
				
			}
			
			System.out.println("Fim do método1...");
		}
		
		public static void metodo2() {
			System.out.println("Início do método2...");
			for(int i=0;i<=5;i++) {
				
				try {
					System.out.println(i);
					System.out.println(i/0);
				} catch (ArithmeticException e) {
					
					System.out.println("erro!");	
					
				}
				
			}
			System.out.println("Fim do método2...");	
	}
}


