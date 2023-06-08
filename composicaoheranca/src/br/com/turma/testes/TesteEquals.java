package br.com.turma.testes;

import br.com.turma.modelo.ClasseFuncionario;

public class TesteEquals {

	public static void main(String[] args) {
		
		ClasseFuncionario func = new ClasseFuncionario();
		
		func.setNome("silva");
		func.setMatricula(987);
		func.setSalarioBruto(3000);

		ClasseFuncionario func2 = new ClasseFuncionario();
		
		func2.setNome("Sacre");
		func2.setMatricula(927);
		func2.setSalarioBruto(31043);
		
		boolean resul = func == func2;
		System.out.println(resul);
		
		boolean resul1 = func.equals(func2);
		System.out.println(resul1);
		System.out.println("hash func1: " + func.hashCode());
		System.out.println("hash func2: " + func2.hashCode());
		
		
	}

}
