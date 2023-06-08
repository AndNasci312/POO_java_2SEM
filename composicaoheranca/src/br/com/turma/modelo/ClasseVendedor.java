package br.com.turma.modelo;

// ClasseFuncionario pertence (extends) a ClasseVendedor 
public class ClasseVendedor extends ClasseFuncionario {
		
			// super: insere os atributos de uma super classe
			

			public ClasseVendedor(int matricula, String nome,  double salarioBruto) {
				
				super.setMatricula(matricula);
				super.setNome(nome);
				super.setSalarioBruto(salarioBruto);
				super.setBonificacao(this.caucularBonificacao());
				this.setComissao(this.caucularComissao(100000));
			}
			
			private double comissão;
			private double valorVendido;
			
			public double getComissão() {
				return comissão;
			}
			public void setComissão(double comissão) {
				this.comissão = comissão;
			}
			public double getValorVendido() {
				return valorVendido;
			}
			public void setValorVendido(double valorVendido) {
				this.valorVendido = valorVendido;
			}
			
			
				
			public double caucularComissao (double carrosVendidos) {
				return 0;
			}
			public double caucularValorVendido(double valorVendido) {
				return this.valorVendido + valorVendido;
			}
			
			

			
}
