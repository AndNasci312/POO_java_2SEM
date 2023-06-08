package br.com.prova1.poosimples;

public class ObjetoCarro {

	public static void main(String[] args) {
			
		// métodos
		ClasseCarro carro1 = new ClasseCarro();
		carro1.marca = "BMW";
		carro1.cor = "azul";
		carro1.modelo = "g70";
		carro1.km = 37;
		carro1.impostos = 38;
		carro1.quantidade = 12;
		
		System.out.println("-------------- Tabela de Carros ---------------");
		
		System.out.println("marca = " + carro1.marca);
		System.out.println("cor =  " + carro1.cor);
		System.out.println("modelo = " + carro1.modelo);
		System.out.println("km = " + carro1.km);
		System.out.println("impostos = " + carro1.impostos + " %");
		System.out.println("quantidade de carros = " + carro1.quantidade);
		
		ClasseCarro carro2 = new ClasseCarro();
		carro2.marca = "FERRARI";
		carro2.cor = "vermelho";
		carro2.modelo = "342a";
		carro2.km = 49;
		carro2.impostos = 37;
		carro2.quantidade = 4;
		
		System.out.println("");
		
		System.out.println("marca = " + carro2.marca);
		System.out.println("cor = " + carro2.cor);
		System.out.println("modelo = " + carro2.modelo);
		System.out.println("km = " + carro2.km);
		System.out.println("impostos = " + carro2.impostos + " %");
		System.out.println("quantidade de carros = " + carro2.quantidade);
		
		ClasseCarro carro3 = new ClasseCarro();
		carro3.marca = "NISSAN";
		carro3.cor = "prata";
		carro3.modelo = "versa";
		carro3.km = 78;
		carro3.impostos = 37;
		carro3.quantidade = 10;
				
		System.out.println("");
		
		System.out.println("marca = " + carro3.marca);
		System.out.println("cor = " + carro3.cor);
		System.out.println("modelo = " + carro3.modelo);
		System.out.println("km = " + carro3.km);
		System.out.println("impostos = " + carro3.impostos + " %");
		System.out.println("quantidade de carros = " + carro3.quantidade);
		
		
		
	}

}
