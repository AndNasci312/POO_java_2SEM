package aula_31082022;

public class ObjetoCarro {

	public static void main(String[] args) {
		
		// alt, shift e r / alt + setinha do teclado
		
		ClasseCarro nCarro = new ClasseCarro(15560);
		nCarro.setMarca("vw");
		nCarro.setModelo("fox");
		nCarro.setCor("azul");
		//nCarro.setKm(15560);
		nCarro.setCapacidadeTanque(40);
		nCarro.setKmPorLitro(10);
		nCarro.setPreco(10000);
		
		
		System.out.println("DADOS DO CARRO 1");
		System.out.println("--------------------------");
		System.out.println("marca: " + nCarro.getMarca());
		System.out.println("modelo: " + nCarro.getModelo());
		System.out.println("cor: " + nCarro.getCor());
		//System.out.println("Km: " + nCarro.getKm());
		System.out.println("rodagem do veículo: " + nCarro.caucularKm());
		System.out.println("preço: " + nCarro.getPreco());
		System.out.println("desconto: " + nCarro.calcDesconto(2.5));
		System.out.println("valor com desconto: " + nCarro.getValorComDesconto());
		System.out.println(" ");
		
		//---------------------------------------------------------------------
		
		ClasseCarro nCarro2 = new ClasseCarro(400000);
		/*
		nCarro2.marca = "fiat";
		nCarro2.modelo = "palio";
		nCarro2.cor = "prata";
		nCarro2.km = 0;
		nCarro2.capacidadeTanque = 30;
		nCarro2.kmPorLitro = 15;
		nCarro2.preco = 15.000;
		*/
		nCarro2.setMarca("fiat");
		nCarro2.setModelo("palio");
		nCarro2.setCor("prata");
		nCarro2.setKm(12);
		nCarro2.setCapacidadeTanque(30);
		nCarro2.setKmPorLitro(15);
		nCarro2.setPreco(15.000);
		
		System.out.println("DADOS DO CARRO 2");
		System.out.println("--------------------------");
		System.out.println("marca: " + nCarro2.getMarca());
		System.out.println("modelo: " + nCarro2.getModelo());
		System.out.println("cor: " + nCarro2.getCor());
		//System.out.println("Km: " + nCarro2.getKm());
		System.out.println("rodagem do veículo: " + nCarro2.caucularKm());
		System.out.println("preço: " + nCarro2.getPreco());
		System.out.println("desconto: " + nCarro2.calcDesconto(2.5));
		System.out.println("valor com desconto: " + nCarro2.getValorComDesconto());
		System.out.println(" ");
		
		//------------------------------------------------------------------------
		
		ClasseCarro nCarro3 = new ClasseCarro(400000);
		/*
		nCarro3.marca = "toyota";
		nCarro3.modelo = "corolla";
		nCarro3.cor = "vermelho";
		nCarro3.km = 293450;
		nCarro3.capacidadeTanque = 50;
		nCarro3.kmPorLitro = 12;
		nCarro3.preco = 20.000;
		*/
		nCarro3.setMarca("toyota");
		nCarro3.setModelo("corolla");
		nCarro3.setCor("vermelho");
		nCarro3.setKm(21234);
		nCarro3.setCapacidadeTanque(50);
		nCarro3.setKmPorLitro(12);
		nCarro3.setPreco(20.000);
		
		System.out.println("DADOS DO CARRO 3");
		System.out.println("--------------------------");
		System.out.println("marca: " + nCarro3.getMarca());
		System.out.println("modelo: " + nCarro3.getModelo());
		System.out.println("cor: " + nCarro3.getCor());
		System.out.println("Km: " + nCarro3.getKm());
		System.out.println("rodagem do veículo: " + nCarro3.caucularKm());
		System.out.println("preço: " + nCarro3.getPreco());
		System.out.println("desconto: " + nCarro3.calcDesconto(2.5));
		System.out.println("valor com desconto: " + nCarro3.getValorComDesconto());
		System.out.println(" ");
		
	}

}
