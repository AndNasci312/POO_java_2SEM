package br.com.turma.testes;

import br.com.turma.modelo.ClasseGerente;
import br.com.turma.modelo.ClasseParceiro;

public class TesteInterface {
	
	public static void main(String[] args) {
		
		ClasseGerente gerente = new ClasseGerente(9828, "domentico", 8476);
		gerente.setSenha("1223");
		
		ClasseParceiro parceiro = new ClasseParceiro();
		parceiro.setSenha("6253");
		
		// SistemaInterno si = new SistemaInterno();
		// si.LoginRegistro(ClasseGerente);
		// si.LoginRegistro(ClasseParceiro);
		
		
		
	}


}
