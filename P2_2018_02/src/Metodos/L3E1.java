package Metodos;

import java.util.Scanner;

import Util.Util;

public class L3E1 {
	public static void main(String[] args) {
		final int ordem = 3, minRand = 1, maxRand = 60;
		int qtd = 0;
		int[][] matriz = new int[ordem][ordem];

		// lê o tamanho do vetor de maiores
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite a quantidade de"
				+ " números você deseja ver: ");
		int N = entrada.nextInt();
		entrada.close();
		
		int[] maiores = new int[N];

		try {
			// Popula matriz
			Util.getMatrizIntAleatorio(
					matriz, minRand, maxRand);

			// Imprime matriz
			Util.imprimeMatriz(matriz);

			// Obtém maiores
			maiores = Util.getNMaiores(matriz, N, qtd, minRand);
			
			// Imprime maiores
			Util.imprimeVetorInt(maiores);
		} catch (Exception e) {
			System.out.println("Ocorreu um erro no processamento");
		}
	}

}
