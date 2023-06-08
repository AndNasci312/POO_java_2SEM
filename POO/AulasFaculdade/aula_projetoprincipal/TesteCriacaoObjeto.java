package aula_projetoprincipal;

public class TesteCriacaoObjeto {

	public static void main(String[] args) {
		
		// com vetores!
		
		ClasseCarro carros[] = new ClasseCarro[4];
		
		carros[0] = new ClasseCarro("VW", "Fox", "Azul", 15560, 50, 12, 28500);
		carros[1] = new ClasseCarro("Chevrolet", "Onix", "Preto", 22350, 45, 10, 30000);
		
		for(int i=0;i<carros.length;i++) {
			
			System.out.println("Marca: " + carros[i].getMarca());
			System.out.println("Modelo: " + carros[i].getModelo());
			System.out.println("Cor: " + carros[i].getCor());
			System.out.println("Km: " + carros[i].getKm());
			System.out.println("Rodagem do Veículo: " + carros[i].calcularKm());
			System.out.println("Preço: " + carros[i].getPreco());
			System.out.println("Desconto: " + carros[i].calcularDesconto(2.5,2));
			System.out.println("Valor Com Desconto: " + carros[i].getValorComDesconto());
			System.out.println("");
			
		}
		
		// atributo de instancia estático - o que pode ser mudado, fica na classe
		// atributo de instancia não estático - o que NÃO pode ser mudado
		
		/*
		ClasseCarro novoCarro = new ClasseCarro("VW", "Fox", "Azul", 15560, 50, 12, 28500);
		 
		System.out.println("Marca: " + novoCarro.getMarca());
		System.out.println("Modelo: " + novoCarro.getModelo());
		System.out.println("Cor: " + novoCarro.getCor());
		System.out.println("Km: " + novoCarro.getKm());
		System.out.println("Rodagem do Veículo: " + novoCarro.calcularKm());
		System.out.println("Preço: " + novoCarro.getPreco());
		System.out.println("Desconto: " + novoCarro.calcularDesconto(2.5,2));
		System.out.println("Valor Com Desconto: " + novoCarro.getValorComDesconto());
		System.out.println("QTD DE CARROS " + ClasseCarro.getTotalCarros());
		System.out.println("TOTAL " + ClasseCarro.getPrecoTotal());
		
		System.out.println();
		
		ClasseCarro novoCarro2 = new ClasseCarro("VW", "Fox", "Azul", 15560, 50, 12, 28500);
		System.out.println("Marca: " + novoCarro2.getMarca());
		System.out.println("Modelo: " + novoCarro2.getModelo());
		System.out.println("Cor: " + novoCarro2.getCor());
		System.out.println("Km: " + novoCarro2.getKm());
		System.out.println("Rodagem do Veículo: " + novoCarro2.calcularKm());
		System.out.println("Preço: " + novoCarro2.getPreco());
		System.out.println("Desconto: " + novoCarro2.calcularDesconto(2.5,2));
		System.out.println("Valor Com Desconto: " + novoCarro2.getValorComDesconto());
		
		System.out.println();
		
		/*ClasseCarro novoCarro3 = new ClasseCarro();
		novoCarro3.setMarca("Fiat");
		novoCarro3.setModelo("Palio");
		novoCarro3.setCor("Prata");
		novoCarro3.setKm(0);
		novoCarro3.setCapacidadeTanque(47);
		novoCarro3.setKmPorLitro(14);
		novoCarro3.setPreco(33650);
		
		System.out.println("Marca: " + novoCarro3.getMarca());
		System.out.println("Modelo: " + novoCarro3.getModelo());
		System.out.println("Cor: " + novoCarro3.getCor());
		System.out.println("Km: " + novoCarro3.getKm());
		System.out.println("Rodagem do Veículo: " + novoCarro3.calcularKm());
		System.out.println("Preço: " + novoCarro3.getPreco());
		System.out.println("Desconto: " + novoCarro3.calcularDesconto(2.5,2));
		System.out.println("Valor Com Desconto: " + novoCarro3.getValorComDesconto());
		
		System.out.println();
		
		ClasseCarro novoCarro4 = new ClasseCarro();
		novoCarro4.setMarca("Fiat");
		novoCarro4.setModelo("Palio");
		novoCarro4.setCor("Prata");
		novoCarro4.setKm(0);
		novoCarro4.setCapacidadeTanque(47);
		novoCarro4.setKmPorLitro(14);
		novoCarro4.setPreco(33650);
		
		System.out.println("Marca: " + novoCarro4.getMarca());
		System.out.println("Modelo: " + novoCarro4.getModelo());
		System.out.println("Cor: " + novoCarro4.getCor());
		System.out.println("Km: " + novoCarro4.getKm());
		System.out.println("Rodagem do Veículo: " + novoCarro4.calcularKm());
		System.out.println("Preço: " + novoCarro4.getPreco());
		System.out.println("Desconto: " + novoCarro4.calcularDesconto(2.5,2));
		System.out.println("Valor Com Desconto: " + novoCarro4.getValorComDesconto());
		
		*/
		
		
	}

}
