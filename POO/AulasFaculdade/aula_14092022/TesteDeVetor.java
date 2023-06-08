package aula_14092022;

public class TesteDeVetor {

	public static void main(String[] args) {
		
		// vetores: um cojunto de dados que são criados a partir de uma só variável
		int numeros[] = new int[4];
		numeros[0] = 356;
		numeros[1] = 500;
		numeros[2] = 0;
		numeros[3] = 2897;
		
		// vetor usado a partir do comando for
		for (int i=0;i<numeros.length;i++) {
			System.out.println("numeros["+i+"] " + numeros[i]);
		}
		System.out.println();
		
		// forEach : cria uma variável (numero) e o sistema mostra os valores da variável numeros2 e os mesmos são armazenados na variavel numero
		int numeros2[] = {800,2751,97,45,12};
		for(int numero:numeros2) {	
			System.out.println("numero: " + numero);
		}
		
		// vetor com strings
		String nomes[] = new String[6];
		nomes[0] = "maria";
	    nomes[1] = "joao";
	    nomes[2] = "pedro";
	    nomes[3] = "roberta";
	    nomes[4] = "sandra";
	    nomes[5] = "joana";
	    
	    for(String nome:nomes) {
	    	System.out.println("nome: " + nome);
	    }
	    
	    for (int i=0;i<nomes.length;i++) {
			System.out.println("numeros["+i+"] " + numeros[i]);
		}
		System.out.println();
	    
	    
	    		
	   
		
	}

}
