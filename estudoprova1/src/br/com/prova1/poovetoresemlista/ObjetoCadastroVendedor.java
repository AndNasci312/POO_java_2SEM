package br.com.prova1.poovetoresemlista;

import java.util.ArrayList;
import java.util.Scanner;

public class ObjetoCadastroVendedor {

	public static void main(String[] args) {
		
		// sistema de cadastro de funcionários (simples)
		
		// comando para inserir dados no sistema 
		Scanner leitor = new Scanner(System.in);
		int opcao = 0;
		
		// array list criada a partir da classevendedor com do e switch case
		ArrayList<ClasseVendedor> vendedores = new ArrayList<>();
		
		do {
			System.out.println("--------- cadastro de vendedores ---------");
			System.out.println("1 - Cadastrar Vendedor");
			System.out.println("2 - Mostrar Vendedores Cadastrados");
			System.out.println("3 - Excluir Vendedor");
			System.out.println("4 - Fechar Sistema");
			System.out.print("----> ");
			
			opcao = leitor.nextInt();
			
			switch(opcao) {
				
			case 1:
				System.out.println(" ");
				System.out.println("*** Cadastrar Vendedor ***");
				
				System.out.print("nome: ");
				String nome = leitor.next();
				
				System.out.print("ID do Funcionario: ");
				int id = leitor.nextInt();
				
				System.out.print("sexo: ");
				// String sexo = leitor.next();
				ClasseVendedor vendedor = new ClasseVendedor(nome, id, sexo());
				vendedores.add(vendedor);
				System.out.println("");
				break;
				
			case 2:
				System.out.println(" ");
				System.out.println("*** Mostrar Vendedores ***");
				
				// classe vend = variavel local (criado dentro de um método), classe vendedores = variavel global (todo o sistema tem acesso!)
				for (ClasseVendedor vend: vendedores) {
					System.out.println("Nome: " + vend.getNome());
					System.out.println("ID: " + vend.getId());
					System.out.println("Sexo: " + vend.getSexo());
					System.out.println(" ");
					break;
				}
				
			case 3:
				System.out.println(" ");
				System.out.println("*** Excluir Vendedores ***");
				System.out.print("digite o ID do Funcionário: ");
				int idExcluir = leitor.nextInt();
				
				for (ClasseVendedor vend2: vendedores) {
					
					if(idExcluir == vend2.getId()) {
						vendedores.remove(idExcluir);
						break;
					}
				}
				case 4:
				System.out.println("encerrando sistema");
				break;
				} 
			
			} while(opcao!=6);
			leitor.close();
		}

	private static char sexo() {
		// TODO Auto-generated method stub
		return 0;
	}
	}
					
		
		
	

