package aula_projetoprincipal;

public class ClasseCarro {

	// Construtores


	public ClasseCarro (String marca, String modelo, String cor, int km, int capacidadeTanque, int kmPorLitro, double preco) {
		
		this.marca = marca;
		this.modelo = modelo;
		this.cor = cor;
		this.km = km;
		this.capacidadeTanque = capacidadeTanque;
		this.kmPorLitro = kmPorLitro;
		this.preco = preco;
		this.setKm(km);
		totalCarros = totalCarros + 1;
		ClasseCarro.precoTotal = ClasseCarro.precoTotal + this.preco;
		
	}

	//Atributos ou Propriedades
	private String marca;
	private String modelo;
	private String cor;
	private int km;
	private int capacidadeTanque;
	private int kmPorLitro;
	private double preco;
	private double valorComDesconto;
	private static int totalCarros;
	private static double precoTotal;
	
	//Getters e Setters
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
		/*
		if(km>=0 && km<=20000) {
			this.km=km;
		}else {
			System.err.println("Quilometragem acima de 20.000!!!");
			System.exit(0);
		}
		*/
	}

	public int getCapacidadeTanque() {
		return capacidadeTanque;
	}

	public void setCapacidadeTanque(int capacidadeTanque) {
		this.capacidadeTanque = capacidadeTanque;
	}

	public int getKmPorLitro() {
		return kmPorLitro;
	}

	public void setKmPorLitro(int kmPorLitro) {
		this.kmPorLitro = kmPorLitro;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public double getValorComDesconto() {
		return valorComDesconto;
	}

	public void setValorComDesconto(double valorComDesconto) {
		this.valorComDesconto = valorComDesconto;
	}

	public static int getTotalCarros() {
		return totalCarros;
	}
	
	
	public static double getPrecoTotal() {
		return precoTotal;
	}

	public static void setPrecoTotal(int precoTotal) {
		ClasseCarro.precoTotal = precoTotal;
	}

	public static void setTotalCarros(int totalCarros) {
		ClasseCarro.totalCarros = totalCarros;
	}

	//Métodos
	public int calcularKm() {
		return this.capacidadeTanque * this.kmPorLitro;
	}
	
	public double calcularDesconto(double percentualDescontoVendedor) {
		
		if(percentualDescontoVendedor>=0 && percentualDescontoVendedor<=4) {
			return this.preco * (percentualDescontoVendedor / 100);
		}else if(percentualDescontoVendedor<0) {
			return 0;
		}else {
			return this.preco * 0.04;
		}
		
	}
	
	public double calcularDesconto(double percentualDescontoVendedor, double percentualDescontoGerente) {
		
		//Alterar o percentual do Vendedor se a venda for menor que 0 ou maior que 4
		if(percentualDescontoVendedor<0) {
			percentualDescontoVendedor = 0;
		}else if(percentualDescontoVendedor>4) {
			percentualDescontoVendedor = 4;
		}
		
		//Alterar o percentual do Gerente se a venda for menor que 0 ou maior que 2
		if(percentualDescontoGerente<0) {
			percentualDescontoGerente=0;
		}else if(percentualDescontoGerente>2) {
			percentualDescontoGerente=2;
		}
		
		double desconto = this.preco * ((percentualDescontoVendedor/100) + (percentualDescontoGerente/100));
		this.valorComDesconto = this.preco - desconto;
		
		return desconto;
	}
	
}
