package aula_21092022;

public class ClasseCarro {
		
		private String marca;
		private String modelo;
		private String cor;
		private double preco;
		// referencia da classe vendedor, junto com o seu get, set e construtores
		private ClasseVendedor vendedor;
		private ClasseComprador comprador;
		
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
		public double getPreco() {
			return preco;
		}
		public void setPreco(double preco) {
			this.preco = preco;
		}
		
		public ClasseVendedor getVendedor() {
			return vendedor;
		}
		public void setVendedor(ClasseVendedor vendedor) {
			this.vendedor = vendedor;
		}
		
		public ClasseComprador getComprador() {
			return comprador;
		}
		public void setComprador(ClasseComprador comprador) {
			this.comprador = comprador;
		}
		
		
		public ClasseCarro(String marca, String modelo, String cor, double preco, ClasseVendedor vendedor, ClasseComprador comprador) {
			super();
			this.marca = marca;
			this.modelo = modelo;
			this.cor = cor;
			this.preco = preco;
			
			this.vendedor = vendedor;
			this.comprador = comprador;
		}
		
		
}
