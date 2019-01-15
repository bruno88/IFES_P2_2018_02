package Recursividade.Extras;

import java.io.IOException;

import Util.GerenciadorDeArquivos;
import Util.Util;

public class L11E5 {
	public static void main(String[] args) {
		final String path = "src/Saidas/ResultadoEx5.txt";
		final int x = 6;
		try {
			// Salva em branco só pra limpar o arquivo
			GerenciadorDeArquivos.salvar(path, "");
			// IMPORTANTE: Long foi usado porque 
			// quando x é 6 ou mais, o número é 
			// grande demais pra ser armazenado
			// em variáveis "int"
			long result = Util.resolveEImprimeEquacao(x,path);
			System.out.println(result);
			System.out.println("Arquivo atualizado!");
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}
