package Metodos;

import java.util.Scanner;
import Util.Util;

public class SimuladoAEx1 {
	public static void main(String[] args) {
		final int lin = 3, col = 4, min = 0, max = 20;
		int[] linhaMatriz;
		int[] numerosPares;
		boolean continuar = true;
		Scanner entrada = new Scanner(System.in);
		int[][] matriz = new int[lin][col];

		// Preenchendo a matriz com aleatórios no intervalo
		Util.getMatrizIntAleatorio(matriz, min, max);

		do {
			try {
				Util.imprimeMatriz(matriz);

				System.out.println("Escolha:\n" + "1 - Gerar novos valores\n" + "2 - Retornar Linha\n"
						+ "3 - Retorar Pares\n" + "4 - Checa numeros perfeitos\n\n" + "0 - Encerrar o programa");
				int op = Integer.valueOf(entrada.nextLine());
				switch (op) {
				// 1 - Gerar novos valores
				case 1:
					Util.getMatrizIntAleatorio(matriz, min, max);
					System.out.println("Matriz atualizada!");
					break;
				// 2 - Retornar Linha
				case 2:
					System.out.println("Digite a linha a ser selecionada:");
					int linha = Integer.valueOf(entrada.nextLine());
					linhaMatriz = getLinhaMatriz(matriz, linha);
					System.out.println("Nova linha: ");
					Util.imprimeVetorInt(linhaMatriz);
					break;
				// 3 - Retorar Pares
				case 3:
					int cont = contaPares(matriz);
					numerosPares = getVetorPares(matriz, cont);
					System.out.println("Vetor de pares: ");
					Util.imprimeVetorInt(numerosPares);
					break;
				// 4 - Checa numeros perfeitos
				case 4:
					if (hasPrimo(matriz)) {
						System.out.println("Tem pelo menos 1 perfeito no vetor");
					} else {
						System.out.println("Não tem numeros perfeitos no vetor");
					}
					break;

				case 0:
					System.out.println("Programa encerrado pelo usuário");
					continuar = false;
					break;

				default:
					System.out.println("Entrada Inválida!");
					break;
				}

			} catch (Exception e) {
				System.err.println("Ocorreu um erro: ");
				e.printStackTrace();
			}

		} while (continuar);
		entrada.close();
	}

	private static boolean hasPrimo(int[][] matriz) {
		boolean hasPrimo = false;
		for (int i = 0; !hasPrimo && i < matriz.length; i++) {
			for (int j = 0; !hasPrimo && j < matriz[0].length; j++) {
				if (Util.isPerfeito(matriz[i][j])) {
					hasPrimo = true;
				}

			}
		}

		return hasPrimo;
	}

	private static int[] getVetorPares(int[][] matriz, int cont) {
		int[] vetorPares = new int[cont];
		int qtdPares = 0;
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[0].length; j++) {
				if (matriz[i][j] % 2 == 0) {
					vetorPares[qtdPares] = matriz[i][j];
					qtdPares++;
				}
			}
		}
		return vetorPares;
	}

	private static int contaPares(int[][] matriz) {
		int cont = 0;
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[0].length; j++) {
				if (matriz[i][j] % 2 == 0) {
					cont++;
				}
			}
		}
		return cont;

	}

	public static int[] getLinhaMatriz(int[][] matriz, int linha) {
		int[] vetorLinha = new int[matriz[0].length];

		for (int i = 0; i < vetorLinha.length; i++) {
			vetorLinha[i] = matriz[linha][i];
		}
		return vetorLinha;

	}
}
