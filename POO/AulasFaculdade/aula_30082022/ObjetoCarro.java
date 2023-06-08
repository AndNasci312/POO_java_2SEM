package aula_30082022;

public class ObjetoCarro {

	public static void main(String[] args) {
		
	//	classe, variável = cria um novo objeto(valor)
		
		ClasseCarro carro1 = new ClasseCarro();
		
		ClasseSegCarro carro2 = new ClasseSegCarro();
		
	// inserir informações para dentro do objeto
		
		carro1.marca = "vw";
		carro1.modelo = "gol";
		carro1.cor = "azul";
		carro1.preco = 250000;
		
		carro2.marca2 = "fiat";
		carro2.modelo2 = "uno";
		carro2.cor2 = "branco";
		carro2.preco2 = 150000;
		
	// pegar as informações dp objeto e mostrar na tela 
		
		System.out.println("marca: " + carro1.marca);
		System.out.println("modelo: " + carro1.modelo);
		System.out.println("cor: " + carro1.cor);
		System.out.println("preço atual: " + carro1.preco);
		System.out.println("preço reajustado: " + carro1.caucularReajuste());
		System.out.println("--------------------------");
		System.out.println("marca: " + carro2.marca2);
		System.out.println("modelo: " + carro2.modelo2);
		System.out.println("cor: " + carro2.cor2);
		System.out.println("preço atual: " + carro2.preco2);
		System.out.println("preço reajustado: " + carro2.caucularReajuste2());
		System.out.println("--------------------------");
		
		
       
	}

}
