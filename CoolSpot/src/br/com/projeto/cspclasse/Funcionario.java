package br.com.projeto.cspclasse;

public class Funcionario {
			
			int ID_funcionario;
			String nome;
			int cpf;
			
			public int getID_funcionario() {
				return ID_funcionario;
			}
			public void setID_funcionario(int iD_funcionario) {
				ID_funcionario = iD_funcionario;
			}
			public String getNome() {
				return nome;
			}
			public void setNome(String nome) {
				this.nome = nome;
			}
			public int getCpf() {
				return cpf;
			}
			public void setCpf(int cpf) {
				this.cpf = cpf;
			}
			
			public Funcionario(int iD_funcionario, String nome, int cpf) {
				super();
				ID_funcionario = iD_funcionario;
				this.nome = nome;
				this.cpf = cpf;
			}
			
			
			
}
