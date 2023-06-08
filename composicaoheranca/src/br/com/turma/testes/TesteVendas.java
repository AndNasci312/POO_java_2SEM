package br.com.turma.testes;

import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Locale;

import br.com.turma.modelo.ClasseCarro;
import br.com.turma.modelo.ClasseGerente;
import br.com.turma.modelo.ClasseVenda;
import br.com.turma.modelo.ClasseVendedor;
import br.com.turma.modelo.VendedorN1;
import br.com.turma.modelo.VendedorN2;
import br.com.turma.modelo.VendedorN3;


public class TesteVendas {

	public static void main(String[] args) {
			
		// polimorfismo: quando a referencia pode ser usada em um objeto só, ao mesmo tempo que um objeto pode ser usado em uma herança
		/* OU SEJA, UMA REFERENCIA PODE SER USADA PARA DECLARAR UM OBJETO
		 * exemplo:
		 * 
		 * classecarro classe = new classecarro();
		 * funcionario classe = new classecarro();
		 * vendedor classe = new classecarro();
		 * 
		 * classecarro classe = new classecarro();
		 * classecarro classe = new classefuncionario();
		 * classecarro classe = new classevendedor();
		 * 
		 * 
		 */
		
		ClasseCarro fox = new ClasseCarro("VW", "FOX", "PRETO", 2500);
		ClasseCarro cobalt = new ClasseCarro("CHEVROLET", "COBALAT", "CHUMBO", 4500);
		ClasseCarro mobi = new ClasseCarro("FIAT", "MOBI", "VERMELHO", 2700);
		ClasseCarro doblo = new ClasseCarro("FIAT", "DOBLO", "PRATA", 5400);
		ClasseCarro eco = new ClasseCarro("FORD", "ECO SPORT", "AMARELO", 5600);
		
		
		// objetos que representam vendedores da agencia
		ArrayList<ClasseVendedor> vendedores = new ArrayList<>();
		vendedores.add(new VendedorN1(2010, "Francisca Vieira", 3000));
		vendedores.add(new VendedorN2(2020, "pedro guilherme", 3000));
		vendedores.add(new ClasseGerente(2010, "domenico jorge", 6500));
		
		//criando a venda 
		ArrayList<ClasseVenda> vendas = new ArrayList<>();
		vendas.add(new ClasseVenda(vendedores.get(0), fox));
		vendas.add(new ClasseVenda(vendedores.get(1), cobalt));
		vendas.add(new ClasseVenda(vendedores.get(0), mobi));
		vendas.add(new ClasseVenda(vendedores.get(2), doblo));
		vendas.add(new ClasseVenda(vendedores.get(1), eco));
		
		
		// relatório de vendas
		System.out.println("RELATÓRIO DE VENDAS");
		
		for (ClasseVenda classeVenda : vendas) {
			
			ClasseVendedor objVendedor = classeVenda.getVendedor();
			ClasseCarro objCarro = classeVenda.getCarro();
			String nivelDoVendedor = objVendedor.getClass().getSimpleName();
			int matricula = objVendedor.getMatricula();
			String nome = objVendedor.getNome();
			String modelo = objCarro.getModelo();
			double precoDoCarro = objCarro.getPreco();
			
			System.out.printf("%s \t %d \t %-20s %-10s %8.2f \n", nivelDoVendedor,matricula,nome,modelo,precoDoCarro);
			
			if(objVendedor instanceof VendedorN1) {
				objVendedor.setValorVendido(objVendedor.caucularValorVendido(precoDoCarro));
				objVendedor.setComissao(objVendedor.caucularComissao(objVendedor.getValorVendido()));	
			}else if (objVendedor instanceof VendedorN2) {
				objVendedor.setValorVendido(objVendedor.caucularValorVendido(precoDoCarro));
				objVendedor.setComissao(objVendedor.caucularComissao(objVendedor.getValorVendido()));	
			}else if (objVendedor instanceof VendedorN3) {
				objVendedor.setValorVendido(objVendedor.caucularValorVendido(precoDoCarro));
				objVendedor.setComissao(objVendedor.caucularComissao(objVendedor.getValorVendido()));	
		}
		
		System.out.println("------------------------------------");
		
		NumberFormat moedabr = NumberFormat.getCurrencyInstance(new Locale("pt","br"));
		System.out.println("total em vendas: " + moedabr.format(ClasseVenda.getVendaTotal()));
		
		System.out.println("RELATÓRIO DE VENDAS E COMISSÃO");
		
		
		
		for (ClasseVendedor vendedor : vendedores) {
			System.out.printf("%s \t %-20 %-15s \tValorVendido: %9.2f\tComissão: %7.2f\n", 
					vendedor.getMatricula(), vendedor.getNome(), vendedor.getClass().getSimpleName(), vendedor.getValorVendido(), 
					vendedor.getComissao());
		}
		
		vendedores.get(3).setValorVendido(ClasseVenda.getVendaTotal());
		vendedores.get(3).setComissao(vendedores.get(3).caucularComissao(ClasseVenda.getVendaTotal()));

	}

	}
}
