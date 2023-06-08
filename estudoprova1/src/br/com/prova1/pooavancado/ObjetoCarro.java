package br.com.prova1.pooavancado;

public class ObjetoCarro {

	public static void main(String[] args) {
		
		// método feito a partir da classe ClasseVendedor e depois usado no método principal ClasseCarro
		
		ClasseVendedor func1 = new ClasseVendedor("éder lima");
		ClasseVendedor func2 = new ClasseVendedor("gustavo santos");
		ClasseVendedor func3 = new ClasseVendedor("Scarpa Santos");
		
		ClasseCarro carro1 = new ClasseCarro("BMW", "G70", "AZUL", 37, 12, 38, 3000000, func1);
		ClasseCarro carro2 = new ClasseCarro("FERRARI", "324a", "VERMELHO", 49, 4, 37, 50000000, func2);
		ClasseCarro carro3 = new ClasseCarro("NISSAN", "VERSA", "PRATA", 78, 10, 67, 40000000, func3);
		
		System.out.println("-------------- Tabela de Carros ---------------");
		
		System.out.println("marca = " + carro1.getMarca());
		System.out.println("cor =  " + carro1.getCor());
		System.out.println("modelo = " + carro1.getModelo());
		System.out.println("km = " + carro1.getKm());
		System.out.println("preço = " + carro1.getPreco());
		System.out.println("quantidade de carros = " + carro1.getQuantidade());
		System.out.println("Vendedor = " + carro1.getVendedor().getNome());
		
		System.out.println("");
		
		System.out.println("marca = " + carro2.getMarca());
		System.out.println("cor =  " + carro2.getCor());
		System.out.println("modelo = " + carro2.getModelo());
		System.out.println("km = " + carro2.getKm());
		System.out.println("preço = " + carro2.getPreco());
		System.out.println("quantidade de carros = " + carro2.getQuantidade());
		System.out.println("Vendedor = " + carro2.getVendedor().getNome());
		
		System.out.println("");
		
		System.out.println("marca = " + carro3.getMarca());
		System.out.println("cor =  " + carro3.getCor());
		System.out.println("modelo = " + carro3.getModelo());
		System.out.println("km = " + carro3.getKm());
		System.out.println("preço = " + carro3.getPreco());
		System.out.println("quantidade de carros = " + carro3.getQuantidade());
		System.out.println("Vendedor = " + carro3.getVendedor().getNome());
	}

}
