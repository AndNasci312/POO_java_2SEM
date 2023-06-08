package aula_20092022;

import java.util.ArrayList;

public class TesteListaDeVetor {

	public static void main(String[] args) {
		
		// o arraylist é usada unicamente para a criação de vetores 
		ArrayList<String> nomes = new ArrayList<>();
		
		nomes.add("pedrinho");
		nomes.add("marcinho");
		nomes.add("juninho");
		
		System.out.println(nomes);
		
		// remove o dado do vetor
		nomes.remove(2);
		
		System.out.println(nomes);
		
		// mostra o dado em sua posição
		System.out.println("posição 2: " + nomes.get(1));

	}

}
