package br.com.prova1.poovetoresemlista;

public class ClasseVendedor {
			
	
		String nome;
		int id;
		char sexo;
		
		
		public char getSexo() {
			return sexo;
		}
		public void setSexo(char sexo) {
			this.sexo = sexo;
		}
		public String getNome() {
			return nome;
		}
		public void setNome(String nome) {
			this.nome = nome;
		}
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		
		public ClasseVendedor(String nome, int id, char sexo) {
			super();
			this.nome = nome;
			this.id = id;
			this.sexo = sexo;
		}
		
		
		
		
}
