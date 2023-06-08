package br.com.turma.testes;

import aula_21092022.ClasseCarro;
import aula_21092022.ClasseComprador;
import aula_21092022.ClasseVendedor;

public class TesteComposicao {

	public static void main(String[] args) {
		
		// referencias a partir da classe vendedor 
		ClasseVendedor vend1 = new ClasseVendedor(3920 , "Rodrigo");
		ClasseVendedor vend2 = new ClasseVendedor(3060 , "Romário");
		ClasseVendedor vend3 = new ClasseVendedor(1253 , "betto");
		ClasseVendedor vend4 = new ClasseVendedor(2309 , "cloudy");
		
		ClasseComprador comp1 = new ClasseComprador("30.321.543.98", "Rodrigo Marcos");
		ClasseComprador comp2 = new ClasseComprador("32.432.563.94", "Nestor Luiz");
		ClasseComprador comp3 = new ClasseComprador("23.424.128.42", "Gomez da mottta");
		ClasseComprador comp4 = new ClasseComprador("53.234.987.56", "Alexandra Akajima");
		
		// COMPOSIÇÃO a partir da classe carro, juntamente com a referencia da classe vendedor
		
		ClasseCarro carro1 = new ClasseCarro("VW", "FOX", "AZUL", 25000, vend4, comp1);
		ClasseCarro carro2 = new ClasseCarro("Chevrolet", "ONIX", "PRETO", 40000, vend1, comp2);
		ClasseCarro carro3 = new ClasseCarro("ferrari", "g28", "vermelho", 540000, vend2, comp3);
		ClasseCarro carro4 = new ClasseCarro("ford", "car", "prata", 28000, vend3, comp4);
		
		/*
		 *  
		para chamar o dado de uma classe que faz parte de uma composição, é usada normalmente 
		o get da classe feita na classe "carro" juntamente com o get da informação "matricula"
		
		*/
		System.out.println("VENDEDOR");
		System.out.println("Matricula: " + carro1.getVendedor().getMatricula());
		System.out.println("Nome: " + carro1.getVendedor().getNome());
		System.out.println("");
		System.out.println("COMPRADOR");
		System.out.println("RG: " + carro1.getComprador().getNome());
		System.out.println("Nome: " + carro1.getComprador().getRg());
		System.out.println("");
		System.out.println("PRODUTO ");
		System.out.println("Marca: " + carro1.getMarca());
		System.out.println("Modelo: " + carro1.getModelo());
		System.out.println("Cor: " + carro1.getCor());
		System.out.println("Preço : " + carro1.getPreco());
		System.out.println("--------------------------------");
		
		System.out.println("VENDEDOR");
		System.out.println("Matricula: " + carro2.getVendedor().getMatricula());
		System.out.println("Nome: " + carro2.getVendedor().getNome());
		System.out.println("");
		System.out.println("COMPRADOR");
		System.out.println("RG: " + carro2.getComprador().getNome());
		System.out.println("Nome: " + carro2.getComprador().getRg());
		System.out.println("");
		System.out.println("PRODUTO ");
		System.out.println("Marca: " + carro2.getMarca());
		System.out.println("Modelo: " + carro2.getModelo());
		System.out.println("Cor: " + carro2.getCor());
		System.out.println("Preço : " + carro2.getPreco());
		System.out.println("--------------------------------");
		
		System.out.println("VENDEDOR");
		System.out.println("Matricula: " + carro3.getVendedor().getMatricula());
		System.out.println("Nome: " + carro3.getVendedor().getNome());
		System.out.println("");
		System.out.println("COMPRADOR");
		System.out.println("RG: " + carro3.getComprador().getNome());
		System.out.println("Nome: " + carro3.getComprador().getRg());
		System.out.println("");
		System.out.println("PRODUTO ");
		System.out.println("Marca: " + carro3.getMarca());
		System.out.println("Modelo: " + carro3.getModelo());
		System.out.println("Cor: " + carro3.getCor());
		System.out.println("Preço : " + carro3.getPreco());
		System.out.println("--------------------------------");
		
		System.out.println("VENDEDOR");
		System.out.println("Matricula: " + carro4.getVendedor().getMatricula());
		System.out.println("Nome: " + carro4.getVendedor().getNome());
		System.out.println("");
		System.out.println("COMPRADOR");
		System.out.println("RG: " + carro4.getComprador().getNome());
		System.out.println("Nome: " + carro4.getComprador().getRg());
		System.out.println("");
		System.out.println("PRODUTO ");
		System.out.println("Marca: " + carro4.getMarca());
		System.out.println("Modelo: " + carro4.getModelo());
		System.out.println("Cor: " + carro4.getCor());
		System.out.println("Preço : " + carro4.getPreco());
		System.out.println("--------------------------------");
		
		// EXTRA: CRIE UM CLIENTE AONDE O MESMO COMPRE UMA FROTA DE CARROS, USO DE VETOR! + CLASSE PARA O CLIENTE
	}

}
