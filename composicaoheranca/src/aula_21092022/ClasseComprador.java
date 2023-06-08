package aula_21092022;

public class ClasseComprador {
	
	private String nome;
	private String rg;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getRg() {
		return rg;
	}
	public void setRg(String rg) {
		this.rg = rg;
	}
	
	public ClasseComprador(String nome, String rg) {
		super();
		this.nome = nome;
		this.rg = rg;
	}
	
	
}
