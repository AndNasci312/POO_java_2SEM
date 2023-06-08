package aula_20092022;

public class ClasseAluno {

		
		// forma facil de fazer construtores ((ctrl+3) + "gcuf")
	
		private int ra;
		private String nome;
		
		// forma facil de fazer get in set ((ctrl+3) + "ggas" + (alt+a))
		public int getRa() {
			return ra;
		}
		public void setRa(int ra) {
			this.ra = ra;
		}
		public String getNome() {
			return nome;
		}
		public void setNome(String nome) {
			this.nome = nome;
		}
		
		public ClasseAluno(int ra, String nome) {
			super();
			this.ra = ra;
			this.nome = nome;
		}
		
		
		
		
		
		
		
}
