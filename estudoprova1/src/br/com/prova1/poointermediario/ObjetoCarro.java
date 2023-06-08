package br.com.prova1.poointermediario;

public class ObjetoCarro {
		
	public static void main(String[] args) {
		
		ClasseCarro carro1 = new ClasseCarro();
		carro1.setMarca("BMW");
		carro1.setModelo("G70");
		carro1.setCor("AZUL");
		carro1.setKm(37);
		carro1.setQuantidade(12);
		carro1.setImpostos(38);
		carro1.setPreco(5000000);
		
		System.out.println("-------------- Tabela de Carros ---------------");
		
		System.out.println("marca = " + carro1.getMarca());
		System.out.println("cor =  " + carro1.getCor());
		System.out.println("modelo = " + carro1.getModelo());
		System.out.println("km = " + carro1.getKm());
		System.out.println("preço = " + carro1.getPreco());
		System.out.println("impostos = " + carro1.cauculoImposto());
		System.out.println("quantidade de carros = " + carro1.getQuantidade());
		
		ClasseCarro carro2 = new ClasseCarro();
		carro2.setMarca("FERRARI");
		carro2.setModelo("342a");
		carro2.setCor("vermelho");
		carro2.setKm(49);
		carro2.setQuantidade(4);
		carro2.setImpostos(37);
		carro2.setPreco(50000000);
		
		System.out.println("");
		
		System.out.println("marca = " + carro2.getMarca());
		System.out.println("cor =  " + carro2.getCor());
		System.out.println("modelo = " + carro2.getModelo());
		System.out.println("km = " + carro2.getKm());
		System.out.println("preço = " + carro2.getPreco());
		System.out.println("impostos = " + carro2.cauculoImposto());
		System.out.println("quantidade de carros = " + carro2.getQuantidade());
		
		ClasseCarro carro3 = new ClasseCarro();
		carro3.setMarca("NISSAN");
		carro3.setModelo("versa");
		carro3.setCor("prata");
		carro3.setKm(78);
		carro3.setQuantidade(10);
		carro3.setImpostos(37);
		carro3.setPreco(4000000);
		
		System.out.println("");
		
		System.out.println("marca = " + carro3.getMarca());
		System.out.println("cor =  " + carro3.getCor());
		System.out.println("modelo = " + carro3.getModelo());
		System.out.println("km = " + carro3.getKm());
		System.out.println("preço = " + carro3.getPreco());
		System.out.println("impostos = " + carro3.cauculoImposto());
		System.out.println("quantidade de carros = " + carro3.getQuantidade());
		
	}
}	
