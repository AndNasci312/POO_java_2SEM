package br.com.erdna.herancas;

public class ClasseHOutros {
		
	 public int idoutros;
	 public String outrosNome;
	 public int outrosQuantidade;
	 public String outrosTipo;
	 
	public int getIdoutros() {
		return idoutros;
	}
	public void setIdoutros(int idoutros) {
		this.idoutros = idoutros;
	}
	public String getOutrosNome() {
		return outrosNome;
	}
	public void setOutrosNome(String outrosNome) {
		this.outrosNome = outrosNome;
	}
	public int getOutrosQuantidade() {
		return outrosQuantidade;
	}
	public void setOutrosQuantidade(int outrosQuantidade) {
		this.outrosQuantidade = outrosQuantidade;
	}
	public String getOutrosTipo() {
		return outrosTipo;
	}
	public void setOutrosTipo(String outrosTipo) {
		this.outrosTipo = outrosTipo;
	}
	
	public ClasseHOutros(int idoutros, String outrosNome, int outrosQuantidade, String outrosTipo) {
		super();
		this.idoutros = idoutros;
		this.outrosNome = outrosNome;
		this.outrosQuantidade = outrosQuantidade;
		this.outrosTipo = outrosTipo;
	}
	 
	
	
	 
}
