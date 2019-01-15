package Arquivos;

import java.io.IOException;

public class ExLeitura {
	public static void main(String[] args) {
		final String fileName = "Pessoas.txt";
		
		try {
			ControlePessoa.carregar(fileName);
			ControlePessoa.imprimeTodasPessoas();
			
		} catch (IOException e) {
			System.err.println("Problema na leitura do arquivo! ");
		}
	}
}
