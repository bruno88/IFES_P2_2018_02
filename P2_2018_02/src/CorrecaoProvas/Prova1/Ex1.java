package CorrecaoProvas.Prova1;

import java.util.Scanner;

import Util.Util;

public class Ex1 {

	public static void main(String[] args) {
		final int min = 9, max = 20;
		int ordem = 0;
		int[][] mat1, mat2;
		boolean sair = false;

		// Lê tamanho das matrizes
		Scanner entrada = new Scanner(System.in);

		System.out.println("Digite a Ordem da Matriz: ");
		ordem = Integer.valueOf(entrada.nextLine());

		// Instanciando as matrizes
		mat1 = new int[ordem][ordem];
		mat2 = new int[ordem][ordem];

		// Colocando valores nas matrizes
		Util.getMatrizIntAleatorio(mat1, min, max);
		Util.getMatrizIntAleatorio(mat2, min, max);

		// Imprimindo as matrizes
		imprimeMatrizes(mat1, mat2);

		do {
			try {
				System.out.println("Escolha: \n" 
						+ "1 - Inverter linhas\n" 
						+ "2 - Vetor intercalado\n" 
						+ "3 - Sair");
				int op = Integer.valueOf(entrada.nextLine());
				switch (op) {
				case 1:
					System.out.println("Digite a linha a ser invertida:");
					int linha = Integer.valueOf(entrada.nextLine());
					inverteLinhas(mat1, mat2, linha);
					imprimeMatrizes(mat1, mat2);
					break;
				case 2:
					int[] vetor;
					vetor = getVetorIntercalado(mat1, mat2);
					System.out.println("Vetor intercalado: ");
					Util.imprimeVetorInt(vetor);
					break;
				case 3:
					System.out.println("Saída por comando do usuário!");
					sair = true;
					break;

				default:
					System.out.println("Entrada inválida! Tente novamente!");
					break;
				}
			} catch (Exception e) {
				imprimeErro(e);
			}
		} while (!sair);

		entrada.close();

	}

	private static void imprimeErro(Exception e) {
		System.out.println("Erro, tente novamente!\n" + "Erro: " + e.getMessage() + "\n"
				+ "Exibindo novamente o menu inicial: \n");

	}

	private static int[] getVetorIntercalado(int[][] mat1, int[][] mat2) {
		int qtd = 0;
		// Criando o vetor com tamanho em 
		// função do tamanho das matrizes
		int[] vetor = new int[(int) (Math.pow(mat1.length, 2) * 2)];
		
		//Fixa uma linha das 2 matrizes
		for (int i = 0; i < mat1.length; i++) {
			// Caminhamento das colunas da mat1
			for (int j = 0; j < mat1.length; j++) {
				vetor[qtd] = mat1[i][j];
				qtd++;
			}
			// Caminhamento das colunas da mat2
			for (int j = 0; j < mat2.length; j++) {
				vetor[qtd] = mat2[i][j];
				qtd++;
			}
		}
		return vetor;
	}

	private static void imprimeMatrizes(int[][] mat1, int[][] mat2) {
		System.out.println("Mat1:");
		Util.imprimeMatriz(mat1);
		System.out.println("Mat2:");
		Util.imprimeMatriz(mat2);

	}

	private static void inverteLinhas(int[][] mat1, int[][] mat2, int linha) {
		for (int i = 0; i < mat1.length; i++) {
			int aux = mat1[linha][i];
			mat1[linha][i] = mat2[linha][i];
			mat2[linha][i] = aux;
		}
	}
}
