package br.com.turma.modelo;

public class VendedorN2 extends ClasseVendedor{
		
		public VendedorN2(int matricula, String nome, double salarioBruto) {
		super(matricula, nome, salarioBruto);
		// TODO Auto-generated constructor stub
	}

		

		@Override
		public double caucularComissao(double carrosVendidos) {
			return carrosVendidos * 0.06;
		}
}
