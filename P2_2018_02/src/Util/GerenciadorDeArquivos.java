package Util;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class GerenciadorDeArquivos {
	public static void salvar(String fileName, String texto) throws IOException {
		// Neste método, sobreescreve o arquivo
		// anterior, se houver
		FileWriter arquivo = new FileWriter(fileName);
		BufferedWriter gravador = new BufferedWriter(arquivo);

		gravador.write(texto);
		gravador.close();
		arquivo.close();

	}

	public static void salvarComAppend(String fileName, 
			String texto) throws IOException {
		// Neste método, concatena-se o novo texto
		// ao final do arquivo
		// Atenção para segundo parametro "true" (append)
		FileWriter arquivo = new FileWriter(fileName, true);
		BufferedWriter gravador = new BufferedWriter(arquivo);

		gravador.append(texto);
		gravador.newLine();
		gravador.close();
		arquivo.close();

	}

	public static String ler(String fileName) throws IOException {
		String linha = "", result = "";
		FileReader arquivo = new FileReader(fileName);
		BufferedReader leitor = new BufferedReader(arquivo);

		while (linha != null) {
			linha = leitor.readLine();
			if (linha != null) {
				result += linha + "\n";
			}
		}

		leitor.close();
		arquivo.close();

		return result;
	}

	

}
