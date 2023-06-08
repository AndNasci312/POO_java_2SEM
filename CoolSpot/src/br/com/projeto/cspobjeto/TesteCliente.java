package br.com.projeto.cspobjeto;

import br.com.projeto.cspclasse.Cliente;

public class TesteCliente {

	public static void main(String[] args) {
		
		Cliente cli = new Cliente(0, null, null, null, null);
		
		cli.setNome("bruno mello ramos da silva");
		cli.setID_cliente(721);
		cli.setCPF("283.495.123.39");
		cli.setCNPJ("873.937.827/0001-32");
		cli.setEmail("ramossilva@hotmail.com");
		
		System.out.println("NOME DO CLIENTE: " + cli.getNome());
		System.out.println("ID: " + cli.getID_cliente());
		System.out.println("CPF: " + cli.getCPF());
		System.out.println("CNPJ: " + cli.getCNPJ());
		System.out.println("EMAIL: " + cli.getEmail());
		

	}

}
