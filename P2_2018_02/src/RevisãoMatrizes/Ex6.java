package RevisãoMatrizes;

import Util.Util;

public class Ex6 {
	public static void main(String[] args) {
		String result = "";
		int soma = 0;
		final int min = 1000, max = 10000, ordem = 5;
		
		int[] somaCol = new int[ordem];
		int[][] matriz = new int[ordem][ordem];

		// Populando a Matriz
		for (int i = 0; i < ordem; i++) {
			for (int j = 0; j < ordem; j++) {
				matriz[i][j] = Util.geraIntAleatorio(min, max);
			}
		}

		// Somando Colunas
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz.length; j++) {
				soma += matriz[j][i];
			}
			somaCol[i] = soma;
			soma = 0;
		}
		
		// Imprimindo a Matriz
		for (int i = 0; i < ordem; i++) {
			for (int j = 0; j < ordem; j++) {
				result += matriz[i][j] + "\t|";
			}
			result += "\n";
		}
		result += "\n";
		for (int i = 0; i < somaCol.length; i++) {
			result += somaCol[i] + "\t|";
		}
		
		System.out.println(result);
	}
}
