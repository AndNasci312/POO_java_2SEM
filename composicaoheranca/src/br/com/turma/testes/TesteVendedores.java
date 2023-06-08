package br.com.turma.testes;

import br.com.turma.modelo.ClasseGerente;
import br.com.turma.modelo.VendedorN1;
import br.com.turma.modelo.VendedorN2;
import br.com.turma.modelo.VendedorN3;

public class TesteVendedores {

	public static void main(String[] args) {
			
		VendedorN1 vend1 = new VendedorN1(2019, "francisca vieira", 3000);
		/*
		vend1.setMatricula(2019);
		vend1.setNome("francisca vieira");
		vend1.setSalarioBruto(3000);
		vend1.setBonificacao(vend1.caucularBonificacao());
		vend1.setComissão(vend1.caucularComissao(10000));
		*/
		System.out.println("matricula: " + vend1.getMatricula());
		System.out.println("Nome: " + vend1.getNome());
		System.out.println("Salário Bruto: " + vend1.getSalarioBruto());
		System.out.println("Bonificação: " + vend1.getBonificacao());
		System.out.println("Comissão: " + vend1.getComissão());
		System.out.println("Salário Bruto e Bonificação: " + vend1.getSalarioBruto() + vend1.getBonificacao() + vend1.getComissão());
		
		System.out.println("");
		
		VendedorN2 vend2 = new VendedorN2(2015, "Pedro Guilherme", 3000);
		/*
		vend2.setMatricula(2015);
		vend2.setNome("Pedro guilherme");
		vend2.setSalarioBruto(3000);
		vend2.setBonificacao(vend2.caucularBonificacao());
		vend2.setComissão(vend2.caucularComissao(100000));
		*/
		System.out.println("matricula: " + vend2.getMatricula());
		System.out.println("Nome: " + vend2.getNome());
		System.out.println("Salário Bruto: " + vend2.getSalarioBruto());
		System.out.println("Bonificação: " + vend2.getBonificacao());
		System.out.println("Comissão: " + vend2.getComissão());
		System.out.println("Salário Bruto e Bonificação: " 
							+ vend2.getSalarioBruto() + vend2.getBonificacao() + vend2.getComissão());
		
		System.out.println("");
		
		VendedorN3 vend3 = new VendedorN3(2007, "flaviana nunes", 3000);
		/*
		vend3.setMatricula(2007);
		vend3.setNome("flaviana nunes");
		vend3.setSalarioBruto(3000);
		vend3.setBonificacao(vend3.caucularBonificacao());
		vend3.setComissão(vend3.caucularComissao(100000));
		*/
		System.out.println("matricula: " + vend3.getMatricula());
		System.out.println("Nome: " + vend3.getNome());
		System.out.println("Salário Bruto: " + vend3.getSalarioBruto());
		System.out.println("Bonificação: " + vend3.getBonificacao());
		System.out.println("Comissão: " + vend3.getComissão());
		System.out.println("Salário Bruto e Bonificação: " 
							+ vend3.getSalarioBruto() + vend3.getBonificacao() + vend3.getComissão());
		
		System.out.println("");
		
		
		ClasseGerente G  = new ClasseGerente(2019, "jorge", 6500);
		/*
		G.setMatricula(2019);
		G.setNome("Jorge");
		G.setSalarioBruto(6500);
		G.setBonificacao(G.caucularBonificacao());
		G.setComissão(G.caucularComissao(300000));
		*/
		System.out.println("matricula: " + G.getMatricula());
		System.out.println("Nome: " + G.getNome());
		System.out.println("Salário Bruto: " + G.getSalarioBruto());
		System.out.println("Bonificação: " + G.getBonificacao());
		System.out.println("Comissão: " + G.getComissão());
		System.out.println("Salário Bruto e Bonificação: " 
							+ G.getSalarioBruto() + G.getBonificacao() + G.getComissão());
		
		System.out.println("");

	}

}
