package br.com.turma.modelo;

public class ClasseVenda {
			
	private ClasseVendedor vendedor;
	private ClasseCarro carro;
	private static double vendaTotal;
	
	public ClasseVendedor getVendedor() {
		return vendedor;
	}
	public void setVendedor(ClasseVendedor vendedor) {
		this.vendedor = vendedor;
	}
	public ClasseCarro getCarro() {
		return carro;
	}
	public void setCarro(ClasseCarro carro) {
		this.carro = carro;
	}
	public static double getVendaTotal() {
		return vendaTotal;
	}
	public static void setVendaTotal(double vendaTotal) {
		ClasseVenda.vendaTotal = vendaTotal;
	}
	
	
	// ESSE SERIA UM EXEMPLO DE POLIMORFISMO, AONDE A CLASSEVENDA DECLARA A REFERENCIA (ClasseVendedor) COM A VARIÁVEL vendedor
	public ClasseVenda(ClasseVendedor vendedor, ClasseCarro carro) {
		super();
		this.vendedor = vendedor;
		this.carro = carro;
		ClasseVenda.vendaTotal += carro.getPreco();
	}

	
	
}
