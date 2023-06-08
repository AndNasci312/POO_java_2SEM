package br.com.prova1.poointermediario;

public class ClasseCarro {
	
		// classes
		// tipos primitivos não tem classes (int, short, double) já o String tem classe
		String marca;
		String modelo;
		String cor;
		int km;
		int quantidade;
		int impostos;
		int preco;
		
		
		
		// getters in setters
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
		public int getImpostos() {
			return impostos;
		}
		public void setImpostos(int impostos) {
			this.impostos = impostos;
		}
		public int getPreco() {
			return preco;
		}
		public void setPreco(int preco) {
			this.preco = preco;
		}
		
		
		// metodos (cauculos feitos em uma determinada classe)
		
		int cauculoImposto () {
			
			return this.preco * this.impostos;
			
		}
		
	
	
	

}
