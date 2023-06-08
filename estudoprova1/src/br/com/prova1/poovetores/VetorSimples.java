package br.com.prova1.poovetores;

public class VetorSimples {
	
	public static void main(String[] args) {
		
		System.out.println("ARRAYS COM NUMEROS ");
		
		int N [] = new int[5];
		
		N[0] = 1;
		N[1] = 2;
		N[2] = 3;		
		N[3] = 4;		
		N[4] = 5;
		
		
		for (int numeros:N) {
			
		System.out.println(numeros);
		
		}
		
		System.out.println(" ");
		
		System.out.println("ARRAYS COM NOMES/PALAVRAS ");
		String nomes [] = new String[4];
		nomes [0] = "matheus";
		nomes [1] = "nathan";
		nomes [2] = "gilberto";
		nomes [3] = "camilla";
		
		for (String nome: nomes) {
			System.out.println(nome);
		}
		
	}
}
