package br.com.turma.modelo;

public class VendedorN3 extends ClasseVendedor{

		public VendedorN3(int matricula, String nome, double salarioBruto) {
		super(matricula, nome, salarioBruto);
		// TODO Auto-generated constructor stub
	}

		@Override
		public double caucularComissao(double carrosVendidos) {
			return carrosVendidos * 0.04;
		}
}
