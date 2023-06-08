package br.com.turma.testes;

import br.com.turma.modelo.ClasseVendedor;

// import = ctrl + shift + O


public class TesteVendedor {

	public static void main(String[] args) {
		
		ClasseVendedor vendedor = new ClasseVendedor(2010, "renan", 0);
		/*
		vendedor.setMatricula(2010);
		vendedor.setNome("renan");
		vendedor.setSalarioBruto(0);
		vendedor.setBonificacao(vendedor.caucularBonificacao());
		*/
		vendedor.setValorVendido(vendedor.caucularValorVendido(500000));
		vendedor.setValorVendido(vendedor.caucularValorVendido(200000));
		vendedor.setValorVendido(vendedor.caucularValorVendido(470000));
		vendedor.setValorVendido(vendedor.caucularValorVendido(700000));
		
		vendedor.setComissão(vendedor.getValorVendido());
		
		System.out.println("ano de matricula: " + vendedor.getMatricula());
		System.out.println("nome: " + vendedor.getNome());
		System.out.println("salário bruto: " + vendedor.getSalarioBruto());
		System.out.println("bonificação: " + vendedor.getBonificacao());
		System.out.println("valor vendido: " + vendedor.getValorVendido());
		
		
	}

}
