package Metodos;

import java.util.Scanner;
import Util.Util;

public class SimuladoAEx2 {
	public static void main(String[] args) {
		final int lin = 3, col = 3, tamVetor=10, min = 1, max = 10;
		int[][] matriz = new int[lin][col];
		int[] vetor = new int[tamVetor];
		Scanner entrada = new Scanner(System.in);
		Util.getMatrizIntAleatorio(matriz, min, max);
		Util.imprimeMatriz(matriz);

		// Ex1
		zeraImpares(matriz);
		Util.imprimeMatriz(matriz);

		// Ex2
		Util.getVetorIntAleatorio(vetor, min, max);
		Util.imprimeVetorInt(vetor);
		System.out.println("Digite o N:");
		int N = Integer.valueOf(entrada.nextLine());
		int[] vetorMenorQueN = removeMenor(vetor, N);
		Util.imprimeVetorInt(vetorMenorQueN);
		
		// Ex 3
		entrada.close();
	}

	private static int[] removeMenor(int[] vetor, int N) {
		int qtdNovoVetor = 0;
		int cont = contaMenores(vetor, N);
		int[] novoVetor = new int[vetor.length - cont];
		for (int i = 0; i < vetor.length; i++) {
			if (vetor[i] >= N) {
				novoVetor[qtdNovoVetor] = vetor[i];
				qtdNovoVetor++;
			}
		}
		return novoVetor;
	}

	private static int contaMenores(int[] vetor, int N) {
		int cont = 0;
		for (int i = 0; i < vetor.length; i++) {
			if (vetor[i] < N) {
				cont++;
			}
		}
		return cont;
	}

	private static void zeraImpares(int[][] matriz) {
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz.length; j++) {
				if (matriz[i][j] % 2 == 1) {
					matriz[i][j] = 0;
				}
			}
		}

	}
}