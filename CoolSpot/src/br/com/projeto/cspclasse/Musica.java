package br.com.projeto.cspclasse;

public class Musica {

	
	int ID_musica;
	private String nomeMusica;
	private String genero;
	private String banda;
	int quantidade;
	
	
	
	public int getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	public int getID_musica() {
		return ID_musica;
	}
	public void setID_musica(int iD_musica) {
		ID_musica = iD_musica;
	}
	public String getNomeMusica() {
		return nomeMusica;
	}
	public void setNomeMusica(String nomeMusica) {
		this.nomeMusica = nomeMusica;
	}
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	public String getBanda() {
		return banda;
	}
	public void setBanda(String banda) {
		this.banda = banda;
	}
	
	public Musica(int iD_musica, String nomeMusica, String genero, String banda, int quantidade) {
		super();
		ID_musica = iD_musica;
		this.nomeMusica = nomeMusica;
		this.genero = genero;
		this.banda = banda;
		this.quantidade = quantidade;
	}
	
	
	public void add(int iD_musica2, String nomeMusica2, String genero2, String banda2, int quantidade2) {
		
		this.nomeMusica = nomeMusica2;
		this.genero = genero2;
		this.banda = banda2;
		this.quantidade = quantidade2;
		
	}
	public void add(Musica musica) {
		// TODO Auto-generated method stub
		
	}


	

	
}
