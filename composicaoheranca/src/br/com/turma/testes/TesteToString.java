package br.com.turma.testes;

import br.com.turma.modelo.ClasseFuncionario;

public class TesteToString {

	public static void main(String[] args) {
		
		ClasseFuncionario func = new ClasseFuncionario();
		
		func.setNome("silva");
		func.setMatricula(987);
		func.setSalarioBruto(3000);
		func.setBonificacao(func.caucularBonificacao());
		
		System.out.println(func);

	}

}
