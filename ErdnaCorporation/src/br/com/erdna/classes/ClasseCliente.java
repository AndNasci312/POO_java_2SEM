package br.com.erdna.classes;

public class ClasseCliente {
				
			public int ID;
			public String nome; 
			public String  cpf;
			public int numeroSus;
			
			public ClasseCliente(int iD, String nome, String cpf, int numeroSus) {
				super();
				ID = iD;
				this.nome = nome;
				this.cpf = cpf;
				this.numeroSus = numeroSus;
			}


			public int getID() {
				return ID;
			}
			public void setID(int iD) {
				ID = iD;
			}
			public String getNome() {
				return nome;
			}
			public void setNome(String nome) {
				this.nome = nome;
			}
			public String getCpf() {
				return cpf;
			}
			public void setCpf(String cpf) {
				this.cpf = cpf;
			}
			public int getNumeroSus() {
				return numeroSus;
			}
			public void setNumeroSus(int numeroSus) {
				this.numeroSus = numeroSus;
			}
					
			@Override
			public String toString() {
			
			return "ID: " + this.ID +
			"\nNome: " + this.nome +
			"\nCPF: " + this.cpf +
			"\nNumero do SUS: " + this.numeroSus; 
			
		}
			
			
			
			
}
