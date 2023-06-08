package br.com.erdna.herancas;

public class ClasseHGenericos {
			
	 public int idGenericos;
	 public String genericosNome;
	 public int genericosDosagem;
	 public String genericosFinalidade;
	 
	public int getIdGenericos() {
		return idGenericos;
	}
	public void setIdGenericos(int idGenericos) {
		this.idGenericos = idGenericos;
	}
	public String getGenericosNome() {
		return genericosNome;
	}
	public void setGenericosNome(String genericosNome) {
		this.genericosNome = genericosNome;
	}
	public int getGenericosDosagem() {
		return genericosDosagem;
	}
	public void setGenericosDosagem(int genericosDosagem) {
		this.genericosDosagem = genericosDosagem;
	}
	public String getGenericosFinalidade() {
		return genericosFinalidade;
	}
	public void setGenericosFinalidade(String genericosFinalidade) {
		this.genericosFinalidade = genericosFinalidade;
	}
	
	public ClasseHGenericos(int idGenericos, String genericosNome, int genericosDosagem, String genericosFinalidade) {
		super();
		this.idGenericos = idGenericos;
		this.genericosNome = genericosNome;
		this.genericosDosagem = genericosDosagem;
		this.genericosFinalidade = genericosFinalidade;
	}
	 
	// override: sobreescrita de métodos
	@Override
	public String toString() {
	
	return "ID: " + this.idGenericos +
	"\nNome: " + this.genericosNome +
	"\ndosagem: " + this.genericosDosagem +
	"\nFinalidade: " + this.genericosFinalidade; 
	
}
	 
	 
}
