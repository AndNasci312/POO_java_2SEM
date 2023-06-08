package br.com.turma.modelo;

public class VendedorN1 extends ClasseVendedor {
			
		public VendedorN1 (int matricula, String nome,  double salarioBruto) {
			
			super(matricula, nome, salarioBruto);
			
		}
	
		@Override
		public double caucularComissao(double carrosVendidos) {
			return carrosVendidos * 0.01;
		}
		
}
