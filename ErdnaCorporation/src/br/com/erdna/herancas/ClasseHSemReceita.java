package br.com.erdna.herancas;

public class ClasseHSemReceita {
	
	 public int idSemReceita;
	 public String SemReceitaNome;
	 public int SemReceitaDosagem;
	 public String SemReceitaFinalidade;
	 
	public ClasseHSemReceita(int idSemReceita, String semReceitaNome, int semReceitaDosagem,
			String semReceitaFinalidade) {
		super();
		this.idSemReceita = idSemReceita;
		SemReceitaNome = semReceitaNome;
		SemReceitaDosagem = semReceitaDosagem;
		SemReceitaFinalidade = semReceitaFinalidade;
	}
	

	public int getIdSemReceita() {
		return idSemReceita;
	}

	public void setIdSemReceita(int idSemReceita) {
		this.idSemReceita = idSemReceita;
	}

	public String getSemReceitaNome() {
		return SemReceitaNome;
	}

	public void setSemReceitaNome(String semReceitaNome) {
		SemReceitaNome = semReceitaNome;
	}

	public int getSemReceitaDosagem() {
		return SemReceitaDosagem;
	}

	public void setSemReceitaDosagem(int semReceitaDosagem) {
		SemReceitaDosagem = semReceitaDosagem;
	}

	public String getSemReceitaFinalidade() {
		return SemReceitaFinalidade;
	}

	public void setSemReceitaFinalidade(String semReceitaFinalidade) {
		SemReceitaFinalidade = semReceitaFinalidade;
	}
	 
	
}
