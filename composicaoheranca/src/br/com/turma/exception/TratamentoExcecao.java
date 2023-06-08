package br.com.turma.exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TratamentoExcecao {

	@SuppressWarnings("null")
	public static void main(String[] args) {

		Scanner leitor = null;

		try {
			//leitor = new Scanner(System.in);
			//System.out.print("Digite um numero: ");
			int numero = 20;  //leitor.nextInt();
			System.out.println("Numero Digitado: " + numero);

		} catch (InputMismatchException e) {

			System.out.println("Digite somente NUMERO ô imbecil!");
		} finally {
			leitor.close();
			System.out.println("Conexão Fechada com Sucesso!!!");
		}
		
		leitor.close();

	}

}
