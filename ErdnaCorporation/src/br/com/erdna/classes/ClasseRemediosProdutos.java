package br.com.erdna.classes;

import br.com.erdna.herancas.ClasseHGenericos;
import br.com.erdna.herancas.ClasseHOutros;
import br.com.erdna.herancas.ClasseHSemReceita;

public class ClasseRemediosProdutos {
			
	public String nome;
	public ClasseHGenericos genericos;
	public ClasseHSemReceita semReceita;
	public ClasseHOutros outros;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public ClasseHGenericos getGenericos() {
		return genericos;
	}
	public void setGenericos(ClasseHGenericos genericos) {
		this.genericos = genericos;
	}
	public ClasseHSemReceita getSemReceita() {
		return semReceita;
	}
	public void setSemReceita(ClasseHSemReceita semReceita) {
		this.semReceita = semReceita;
	}
	public ClasseHOutros getOutros() {
		return outros;
	}
	public void setOutros(ClasseHOutros outros) {
		this.outros = outros;
	}
	
	
	public ClasseRemediosProdutos(String nome, ClasseHGenericos genericos, ClasseHSemReceita semReceita,
			ClasseHOutros outros) {
		super();
		this.nome = nome;
		this.genericos = genericos;
		this.semReceita = semReceita;
		this.outros = outros;
	}
	
	
}
