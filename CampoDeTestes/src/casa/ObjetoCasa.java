package casa;

public class ObjetoCasa {

	public static void main(String[] args) {
		
		ClasseCasa casa = new ClasseCasa();
		
		casa.setPedreiros("bahia, " + "willian, " + "mauricio, " + "moscatelli");
		casa.setQtdDeCimento(125);
		casa.setQtdArgamassa(100);
		casa.setQtdAreia(100);
		casa.setMetragem(20);
		casa.setQtdTijolos(50);
		casa.setAfiacaoEletrica(120);
		casa.setPisos(30);
	    
		System.out.println("DADOS DA CONSTRUÇÃO DA CASA");
		System.out.println("--------------------------------------------------------------------");
		System.out.println("COLABORADORES: " + casa.getPedreiros());
		System.out.println("QUANTIDADE DE CIMENTO: " + casa.getQtdDeCimento() + " kg");
		System.out.println("ARGAMASSA: " + casa.getQtdArgamassa() + " kg");
		System.out.println("AREIA: " + casa.getQtdAreia() + " kg");
		System.out.println("METROS: " + casa.getMetragem() + " m");
		System.out.println("QUANTIDADE DE TIJOLOS: " + casa.getQtdTijolos());
		System.out.println("METRAGEM DA AFIAÇAÕ ELÉTRICA: " + casa.getAfiacaoEletrica() + " m");
		System.out.println("METRAGEM DOS PISOS: " + casa.getPisos() + " m");
		System.out.println(" ");
		
		//--------------------------------------------------------------------------------------------------
		
		ClasseRegiao bairrocidade = new ClasseRegiao();
		
		bairrocidade.setEndereco("rua jarvis macedo");
		bairrocidade.setNumeroCasa(67);
		bairrocidade.setBairro("Grajaú");
		bairrocidade.setCidade("São Paulo");
		bairrocidade.setEstado("São Paulo");
		bairrocidade.setPais("Brasil");
		bairrocidade.setContinente("Sul Americano");
		
		
		System.out.println("REGIÃO");
		System.out.println("--------------------------------------------------------------------");
		System.out.println("ENDEREÇO: " + bairrocidade.getEndereco());
		System.out.println("CASA Nª: " + bairrocidade.getNumeroCasa());
		System.out.println("BAIRRO: " + bairrocidade.getBairro());
		System.out.println("CIDADE: " + bairrocidade.getCidade());
		System.out.println("ESTADO: " + bairrocidade.getEstado());
		System.out.println("PAÍS: " + bairrocidade.getPais());
		System.out.println("CONTINENTE: " + bairrocidade.getContinente());
		
		
			

	}

}
