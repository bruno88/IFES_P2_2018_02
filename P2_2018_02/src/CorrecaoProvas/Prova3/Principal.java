package CorrecaoProvas.Prova3;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Principal {
	public static void main(String[] args) {
		//final String fileName = "matriz.txt";
		final String fileName = "src/Arquivos/Entrada/matriz.txt";

		try {
			int[][] matriz = leMatriz(fileName);
			imprimeMat(matriz);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	private static void imprimeMat(int[][] matriz) {
		String result = "";
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz.length; j++) {
				result += matriz[i][j] + "\t";
			}
			result += "\n";
		}
		System.out.println(result);
	}

	private static int[][] leMatriz(String fileName) throws IOException {
		int numLin = 0;
		final int TAM = 4;
		String linha = "";
		FileReader arquivo = new FileReader(fileName);
		BufferedReader leitor = new BufferedReader(arquivo);
		int[][] matriz = new int[TAM][TAM];
		while (linha != null) {
			linha = leitor.readLine();
			if (linha != null) {
				
				String[] vetor = linha.split(";");
				matriz[numLin][0] = Integer.valueOf(vetor[0]);
				matriz[numLin][1] = Integer.valueOf(vetor[1]);
				matriz[numLin][2] = Integer.valueOf(vetor[2]);
				matriz[numLin][3] = Integer.valueOf(vetor[3]);
			}
			numLin++;
		}

		leitor.close();
		arquivo.close();

		return matriz;
	}

}
