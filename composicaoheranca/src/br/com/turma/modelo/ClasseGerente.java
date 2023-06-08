package br.com.turma.modelo;

public class ClasseGerente extends ClasseVendedor implements InterfaceAutenticador {
		
	public ClasseGerente(int matricula, String nome, double salarioBruto) {
		super(matricula, nome, salarioBruto);
		// TODO Auto-generated constructor stub
	}
	
	// override = ctrl + espaço + método

	@Override	
	public double caucularComissao(double carrosVendidos) {
			
			return carrosVendidos * 0.01;
			
		}
	
	@Override
	public double caucularBonificacao() {
		// TODO Auto-generated method stub
		return super.caucularBonificacao() + 500;
	}
	
	 String senha;

	@Override
 	public String getSenha() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setSenha(String senha) {
		this.senha = senha;
		
	}
			
}
