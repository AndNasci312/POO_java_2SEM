		package aula_31082022;

public class ClasseCarro {
	
	// construtor
	
	public ClasseCarro(int km) {
		if (km>=0 && km<=20000) {
			this.km = km;
		}else {
			System.err.println("quilometragem acima de 20.000");
			System.exit(0);
		}
	}

	    String marca;
		String modelo;
		String cor;
		int km;
		int capacidadeTanque;
		int kmPorLitro;
		double preco;
		double valorComDesconto;
		
		//setters e getters
		
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

		// método
		
		int caucularKm() {
			
			return this.capacidadeTanque * this.kmPorLitro;
			
		}
		
		double calcDesconto(double percentualDescontoVendedor) {

			
			if(percentualDescontoVendedor>=0 && percentualDescontoVendedor<4) {
				return this.preco * (percentualDescontoVendedor/100);
			} else if (percentualDescontoVendedor<0) {
				return 0.0;	
			} else {				
				return this.preco * 0.04;
			}
			
		}
		
		double calcDesconto(double percentualDescontoVendedor, double percentualDescontoGerente) {
			
			//alterar o percentual se a venda for menor que 0 ou maior que 4
			if (percentualDescontoVendedor<0) {
				percentualDescontoVendedor = 0;
			} else if (percentualDescontoVendedor>4) {
				percentualDescontoGerente = 4;
			}
			
			//alterar o percentual se a venda for menor que 0 ou maior que 2
			
			if (percentualDescontoGerente<0) {
				
				percentualDescontoGerente = 0;
				
			}else if (percentualDescontoGerente>2) {
				
				percentualDescontoGerente = 2;
				
			}
			
			double desconto = this.preco * ((percentualDescontoVendedor/100 + percentualDescontoGerente/100)); 
			this.valorComDesconto = this.preco - desconto;
			return desconto;
			
		}
		
}		
		