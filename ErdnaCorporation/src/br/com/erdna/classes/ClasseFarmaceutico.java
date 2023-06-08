package br.com.erdna.classes;

public class ClasseFarmaceutico {
				
			public int ID;
			public String nome;
			public String cpf;
			
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
			public ClasseFarmaceutico(int iD, String nome, String cpf) {
				super();
				ID = iD;
				this.nome = nome;
				this.cpf = cpf;
			} 

			public String toString() {
				
				return "ID: " + this.ID +
				"\nNome: " + this.nome +
				"\nCPF: " + this.cpf;
				
			}
				
			

}
