package br.com.prova1.pooavancado;

public class ClasseCarro {
		
	// classe carro com a herança feita a partir da classe vendedor 
	
	private String marca;
	private String modelo;
	private String cor;
	private int km;
	private int quantidade;
	private int preco;
	private int impostos;
	private ClasseVendedor vendedor;
	
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public int getKm() {
		return km;
	}
	public void setKm(int km) {
		this.km = km;
	}
	public int getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	public double getPreco() {
		return preco;
	}
	public void setPreco(int preco) {
		this.preco = preco;
	}
	public double getImpostos() {
		return impostos;
	}
	public void setImpostos(int impostos) {
		this.impostos = impostos;
	}
	public ClasseVendedor getVendedor() {
		return vendedor;
	}
	public void setVendedor(ClasseVendedor vendedor) {
		this.vendedor = vendedor;
	}
	
	public ClasseCarro(String marca, String modelo, String cor, int km, int quantidade, int preco, int impostos,
			ClasseVendedor vendedor) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.cor = cor;
		this.km = km;
		this.quantidade = quantidade;
		this.preco = preco;
		this.impostos = impostos;
		this.vendedor = vendedor;
	}
	
	
	
	
	
	
	
}
