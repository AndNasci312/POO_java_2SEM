package br.com.erdna.objetos;

import br.com.erdna.classes.ClasseCliente;
import br.com.erdna.classes.ClasseFarmaceutico;
import br.com.erdna.herancas.ClasseHGenericos;

public class ObjetoCompra {

	public static void main(String[] args) {
		
		System.out.println("---------------compras feitas!---------------");
		
		ClasseFarmaceutico vendedor = new ClasseFarmaceutico(213, "leandro moreira", "758.643.263-12");
		ClasseFarmaceutico vendedor2 = new ClasseFarmaceutico(843, "marcelo nagari", "835.846.987.36");
		ClasseFarmaceutico vendedor3 = new ClasseFarmaceutico(465, "luka modric", "847.987.237.54");
		ClasseFarmaceutico vendedor4 = new ClasseFarmaceutico(456, "felipe franco nogori", "645.876.906.12");
		
		System.out.println("vendedor: ");
		System.out.println(vendedor);
		System.out.println("");
		System.out.println(vendedor2);
		System.out.println("");
		System.out.println(vendedor3);
		System.out.println("");
		System.out.println(vendedor4);
		
		System.out.println("-----------------------------------------------");
		
		ClasseCliente cliente = new ClasseCliente(707, "Augusto Ferreira", "899.737.431-21", 87304);
		
		System.out.println("cliente: ");
		System.out.println(cliente);
	
		System.out.println("-----------------------------------------------");
		
		ClasseHGenericos generico = new ClasseHGenericos(9992, "nobre", 35 , "dores musculares");
		System.out.println(generico);
		
	}

}
