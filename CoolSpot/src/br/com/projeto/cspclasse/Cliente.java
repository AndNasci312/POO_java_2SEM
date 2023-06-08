package br.com.projeto.cspclasse;

public class Cliente {
		
	int ID_cliente;
	String nome;
	String CPF;
	String CNPJ;
	String email;
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getID_cliente() {
		return ID_cliente;
	}
	public void setID_cliente(int iD_cliente) {
		ID_cliente = iD_cliente;
	}
	public String getCPF() {
		return CPF;
	}
	public void setCPF(String cPF) {
		CPF = cPF;
	}
	public String getCNPJ() {
		return CNPJ;
	}
	public void setCNPJ(String cNPJ) {
		CNPJ = cNPJ;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

	public Cliente(int iD_cliente, String nome, String cPF, String cNPJ, String email) {
		super();
		ID_cliente = iD_cliente;
		this.nome = nome;
		CPF = cPF;
		CNPJ = cNPJ;
		this.email = email;
	}
	
	
	@Override
		public String toString() {
		
		return "id: " + this.ID_cliente +
		"\nCPF: " + this.CPF +
		"\nCNPJ: " + this.CNPJ +
		"\nemail:" + this.email;
	}
	
	
	
}
