package br.com.turma.testes;

import br.com.turma.modelo.ClasseFuncionario;

public class TesteFuncionario {

	public static void main(String[] args) {
		
		ClasseFuncionario func = new ClasseFuncionario();
		
		func.setNome("silva");
		func.setMatricula(987);
		func.setSalarioBruto(3000);
		func.setBonificacao(func.caucularBonificacao());
		
		System.out.println("matricula: " + func.getMatricula());
		System.out.println("nome: " + func.getNome());
		System.out.println("salario bruto: " + func.getSalarioBruto());
		System.out.println("bonificação: " + func.getBonificacao());
		System.out.println("salario bruto e bonificação: " + func.getSalarioBruto() + ("/") + func.getBonificacao());
		
		}
}



