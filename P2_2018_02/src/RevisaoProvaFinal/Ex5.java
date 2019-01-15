package RevisaoProvaFinal;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import javax.swing.JOptionPane;

public class Ex5 {
	public static void main(String[] args) {
		final String path = "src/Arquivos/Entrada/bancoQuestoes.txt";
		String result = "";
		try {
			Questao[] resultado = leQuestao(path);
			
			for (int i = 0; i < resultado.length; i++) {
				result += "Questão de " + resultado[i].getAssunto() + "\n";
				result += resultado[i].getTexto() + " (" +
						resultado[i].getPontuacao() + " pontos)\n\n";
			}
			System.out.println(result);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private static Questao[] leQuestao(String path) throws IOException {
		String linha = "";
		final int TAM = 3; 
		Questao[] vetorQuestoes = new Questao[TAM];
		FileReader arquivo = new FileReader(path);
		BufferedReader leitor = new BufferedReader(arquivo);
		int qtd = 0;

		while (linha != null) {
			linha = leitor.readLine();
			if (linha != null) {
				String[] vetor = linha.split(";");
				Questao novaQuestao = new Questao(
						vetor[0],
						vetor[1],
						Double.valueOf(vetor[2]));
				vetorQuestoes[qtd++] =  novaQuestao;
			}
		}

		leitor.close();
		arquivo.close();

		return vetorQuestoes;
		
	}
}
