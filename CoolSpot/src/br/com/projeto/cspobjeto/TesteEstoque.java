package br.com.projeto.cspobjeto;

import java.util.ArrayList;
import java.util.Scanner;

import br.com.projeto.cspclasse.Musica;

public class TesteEstoque {

	public static void main(String[] args) {
		// musica: idmusica, nomemusica, genero, banda
		
		Scanner entmusicas = new Scanner(System.in);
		int op;
		
		ArrayList<Musica> estoquemusica = new ArrayList<>();
		do {
			System.out.println("-----------------------------------");
			System.out.println("------- estoque de musicas --------");
			System.out.println("-----------------------------------");
			System.out.println("1: CADASTRAR MUSICA NO ESTOQUE");
			System.out.println("2: MOSTRAR MUSICAS CADASTRADAS");
			System.out.println("3: PESQUISAR MUSICAS CADASTRADAS");
			System.out.println("4: ALTERAR DADOS DE UMA MUSICA CADASTRADA");
			System.out.println("5: EXCLUIR ESTOQUE / MUSICA");
			System.out.println("6: FINALIZAR SISTEMA");
			System.out.println("--------------------------------------");
			System.out.println("?: ");
			
			op = entmusicas.nextInt();
			
			switch(op) {
			
			case 1:
				System.out.println(" ");
				System.out.println("******* CADASTRO DE MUSICAS **********");
				
				System.out.println("ID OFICIAL DA MUSICA: ");
				int ID_musica = entmusicas.nextInt();
				
				System.out.println("NOME: ");
				String nomeMusica = entmusicas.next();
				
				System.out.println("GENERO: ");
				String genero = entmusicas.next();
				
				System.out.println("BANDA: ");
				String banda = entmusicas.next();
				
				System.out.println("QUANTIDADE: ");
				int quantidade = entmusicas.nextInt();
				
					Musica musica = new Musica(ID_musica, nomeMusica, genero, banda, quantidade);
					musica.add(musica);
					System.out.println(" ");
				
				break;
				
			}
			
		}while(op!=6);
		
		entmusicas.close();
	}

}
