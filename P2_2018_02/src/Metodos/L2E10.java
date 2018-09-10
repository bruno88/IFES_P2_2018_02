package Metodos;

import java.util.Scanner;

import Util.Util;

public class L2E10 {
	public static void main(String[] args) {
		final int tamVetor = 100, tamSubConj = 3;
		// int[] conjunto = new int[tamVetor];
		// Para Testes:
		int[] conjunto = { 8, 6, 5, 4, 7, 6, 5, 4, 6, 9, 8, 2, 6, 5, 4 };
		int[] subconjunto = new int[tamSubConj];
		int[] vetorDePosicoes = new int[tamVetor];
		Scanner entrada = new Scanner(System.in);
		int posicao;

		// Popula o vetor (Tirar para testar com vetor fixo)
		// Util.getVetorIntAleatorio2(conjunto, minRand, maxRand);

		// Imprime o vetor
		Util.imprimeVetorInt(conjunto);

		// Lê o subconjunto
		for (int i = 0; i < subconjunto.length; i++) {
			System.out.println("Digite o " + (i + 1) + " número");
			subconjunto[i] = entrada.nextInt();
		}
		entrada.close();

		// Imprime o subconjunto
		Util.imprimeVetorInt(subconjunto);

		// Verifica se o subconjunto está contido no conjunto
		posicao = Util.getIndexOfSubconjuntoNoConjunto(conjunto, subconjunto);

		if (posicao == -1) {
			System.out.println("Subconjunto não encontrado");
		} else {
			System.out.println("Subconjunto encontrado no índice " + posicao);
		}
		// ==============================///==============================
		// EXTRA: Ao invés de retornar 1, retornar todos

		// Verifica se o subconjunto está contido no conjunto
		vetorDePosicoes = Util.getAllIndexOfSubconjuntoNoConjunto(conjunto, subconjunto);

		Util.imprimeVetorInt(vetorDePosicoes);

	}

}
