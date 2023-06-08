package musicas;

public class ClasseMusica {

	public int ID;
	public int preco;
	public String nomeDaBanda;
	public double duracao;
	
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	public int getPreco() {
		return preco;
	}
	public void setPreco(int preco) {
		this.preco = preco;
	}
	public String getNomeDaBanda() {
		return nomeDaBanda;
	}
	public void setNomeDaBanda(String nomeDaBanda) {
		this.nomeDaBanda = nomeDaBanda;
	}
	public double getDuracao() {
		return duracao;
	}
	public void setDuracao(double duracao) {
		this.duracao = duracao;
	}
	
	public ClasseMusica(int iD, int preco, String nomeDaBanda, double duracao) {
		super();
		ID = iD;
		this.preco = preco;
		this.nomeDaBanda = nomeDaBanda;
		this.duracao = duracao;
	}
	
	
	
}
