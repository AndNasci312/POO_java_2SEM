package br.com.turma.modelo;

public class ClasseFuncionario {
		
		/* 	public: geral
			private: só a própria classe
			protected: publico para classes pai e seus filhos
		 */
	
	
		protected int matricula;
		protected String nome;
		protected double salarioBruto;
		protected double bonificacao;
		protected double comissao;
		
		
		public int getMatricula() {
			return matricula;
		}
		public void setMatricula(int matricula) {
			this.matricula = matricula;
		}
		public String getNome() {
			return nome;
		}
		public void setNome(String nome) {
			this.nome = nome;
		}
		public double getSalarioBruto() {
			return salarioBruto;
		}
		public void setSalarioBruto(double salarioBruto) {
			this.salarioBruto = salarioBruto;
		}
		public double getBonificacao() {
			return bonificacao;
		}
		public void setBonificacao(double bonificacao) {
			this.bonificacao = bonificacao;
		}
		public double getComissao() {
			return comissao;
		}
		public void setComissao(double comissao) {
			this.comissao = comissao;
		}
		public double caucularBonificacao() {
			
			return this.salarioBruto * 0.05;
			
		}
		
		
		
		
		// exemplo de método toString
		@Override
			public String toString() {
			
			return "matricula: " + this.matricula +
			"\nNome: " + this.nome +
			"\nSalario Bruto: " + this.salarioBruto +
			"\nBonificação: " + this.bonificacao; 
			
		}
		
		
		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + matricula;
			return result;
		}
			
			
}
		



// classe abstrata: não cria um objeto 
