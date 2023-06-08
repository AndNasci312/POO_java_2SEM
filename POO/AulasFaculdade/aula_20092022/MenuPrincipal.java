package aula_20092022;

import java.util.ArrayList;
// CTRL + SHIFT + O = importa a biblioteca indisponível
import java.util.Scanner;


public class MenuPrincipal {

	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		int opcao;
		
		ArrayList<ClasseAluno> alunos = new ArrayList<>();
		
		do {
			System.out.println("");
			System.out.println("*********** MENU PRINCIPAL ***********");
			System.out.println("1 - CADASTRAR ALUNO");
			System.out.println("2 - MOSTRAR TODOS OS ALUNOS");
			System.out.println("3 - PESQUISAR PELO RA DO ALUNO");
			System.out.println("4 - ALTERAR DADOS DO ALUNO");
			System.out.println("5 - EXCLUIR ALUNO");
			System.out.println("6 - ENCERRAR PROGRAMA");
			System.out.print("Opção: ");
			
			opcao = leitor.nextInt();
			
			switch(opcao) {
				case 1:
					System.out.println("");
					System.out.println("***** CADASTRAR *****");
					System.out.print("nome: ");
					String nome = leitor.next();
					
					System.out.print("ra: ");
					int ra = leitor.nextInt();
					
					ClasseAluno aluno = new ClasseAluno(ra, nome);
					alunos.add(aluno);
					System.out.println("");
					break;
				
				case 2:
					System.out.println("");
					System.out.println("ALUNOS CADASTRADOS:");
					
					for (ClasseAluno a:alunos) {
						System.out.println("NOME: " + a.getNome());
						System.out.println("RA: " + a.getRa());
						System.out.println("---------------------");
					}
					
					/*
					for(int i=0;i<alunos.size();i++) {
						
						System.out.println("RA: " + alunos.get(i).getRa());
						
					}
					*/
					
					break;
					
				case 3:
					System.out.println("***** PESQUISAR POR RA ****");
					System.out.print("digite o RA: ");
					int raPesquisa = leitor.nextInt();
					
					for(ClasseAluno a:alunos) {
						
						if (raPesquisa == a.getRa()) {
							
							System.out.println("RA: " + a.getRa());
							System.out.println("NOME: " + a.getNome());
							break;
						}
						
					}
					
				case 4:
					System.out.println("***** ALTERAR *****");
					System.out.println("digite o ra a alterar: ");
					raPesquisa = leitor.nextInt();
					
					
					break;
					
				case 5:
					System.out.println("***** EXCLUIR *****");
					System.out.print("digite o RA: ");
					int raExcluir = leitor.nextInt();
					
					for(ClasseAluno a:alunos) {
						
						if (raExcluir == a.getRa()) {
							alunos.remove(a);
							break;
						}
					}
				case 6:
					System.out.println("***** ENCERRAR PROGRAMA *****");
					break;
			}
		
		}while(opcao!=6);
		
		leitor.close();
		

	}

}
