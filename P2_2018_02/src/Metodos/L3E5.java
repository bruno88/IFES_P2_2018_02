
package Metodos;

import java.util.Scanner;

public class L3E5 {

	public static void main(String[] args) {
		final int tam = 3;
		int jogadorAtual = 1;
		int novaLinha, novaColuna;
		boolean continuar = true;
		Scanner entrada = new Scanner(System.in);

		String[][] tabuleiro = new String[tam][tam];
		try {
			// Preenche toda a matriz com "_"
			defineTabuleiro(tabuleiro);

			do {
				// Imprime tabuleiro
				imprimeTabuleiro(tabuleiro);

				// Lê dados do usuário
				System.out.println("Digite a linha a ser jogada");
				novaLinha = Integer.valueOf(entrada.nextLine());
				System.out.println("Digite a coluna a ser jogada");
				novaColuna = Integer.valueOf(entrada.nextLine());

				// Verificando se a tupla é valida e está livre
				if (isTuplaValida(tabuleiro, novaLinha, novaColuna)) {
					// Registra a jogada de acordo com o jogador
					realizaJogada(tabuleiro, novaLinha, novaColuna, 
							jogadorAtual);
					jogadorAtual = getOutroJogador(jogadorAtual);
					// Verifica a condição de vitória
					// para saber se o jogo continua
					continuar = verificaVitoria(tabuleiro, jogadorAtual);
				} else {
					System.out.println("Jogada Inválida");
				}

			} while (continuar);

			// Imprime tabuleiro final
			System.out.println("\nTabuleiro final: \n");
			imprimeTabuleiro(tabuleiro);

			entrada.close();
		} catch (Exception e) {
			System.out.println("Erro: " + e);
		}
	}

	public static void defineTabuleiro(String[][] tabuleiro) {
		for (int i = 0; i < tabuleiro.length; i++) {
			for (int j = 0; j < tabuleiro.length; j++) {
				tabuleiro[i][j] = "_";
			}
		}

	}

	public static void imprimeTabuleiro(String[][] tabuleiro) {
		String result = "";
		for (int i = 0; i < tabuleiro.length; i++) {
			for (int j = 0; j < tabuleiro.length; j++) {
				result += tabuleiro[i][j] + " | ";
			}
			result += "\n";
		}
		System.out.println(result);

	}

	public static boolean isTuplaValida(String[][] tabuleiro, int novaLinha, int novaColuna) {
		if (// está no intervalo (entre 0 e 2)
		novaLinha >= 0 && novaLinha < tabuleiro.length 
		&& novaColuna >= 0 && novaColuna < tabuleiro.length
		// E se está livre
				&& tabuleiro[novaLinha][novaColuna] == "_") {
			return true;
		} else {
			return false;
		}
	}

	public static void realizaJogada(String[][] tabuleiro, int novaLinha, int novaColuna, int jogadorAtual) {

		if (jogadorAtual == 1) {
			tabuleiro[novaLinha][novaColuna] = "O";
		} else {
			tabuleiro[novaLinha][novaColuna] = "X";
		}

	}

	public static boolean verificaVitoria(String[][] tabuleiro, int jogadorAtual) {
		jogadorAtual = getOutroJogador(jogadorAtual);

		for (int i = 0; i < tabuleiro.length; i++) {
			// Checando as Linhas
			if (tabuleiro[i][0].equals(tabuleiro[i][1]) 
					&& tabuleiro[i][0].equals(tabuleiro[i][2])
					&& !tabuleiro[i][0].equals("_")) {
				System.out.println("Vitória do jogador " + jogadorAtual);
				return false;
			}
			// Checando as Colunas
			if (tabuleiro[0][i].equals(tabuleiro[1][i]) 
					&& tabuleiro[0][i].equals(tabuleiro[2][i])
					&& !tabuleiro[0][i].equals("_")) {
				System.out.println("Vitória do jogador " + jogadorAtual);
				return false;
			}

			// Verificando a Diagonal Principal
			if (tabuleiro[0][0].equals(tabuleiro[1][1]) 
					&& tabuleiro[0][0].equals(tabuleiro[2][2])
					&& !tabuleiro[0][0].equals("_")) {
				System.out.println("Vitória do jogador " + jogadorAtual);
				return false;
			}

			// Verificando a Diagonal Invertida
			if (tabuleiro[0][2].equals(tabuleiro[1][1]) && tabuleiro[0][2].equals(tabuleiro[2][0])
					&& !tabuleiro[0][2].equals("_")) {
				System.out.println("Vitória do jogador " + jogadorAtual);
				return false;
			}
		}

		if (verificaEmpate(tabuleiro)) {
			System.out.println("Fim de jogo. Não há jogadas disponíveis");
			return false;
		}

		return true;

	}

	private static boolean verificaEmpate(String[][] tabuleiro) {
		for (int i = 0; i < tabuleiro.length; i++) {
			for (int j = 0; j < tabuleiro.length; j++) {
				if (tabuleiro[i][j].equals("_")) {
					return false;
				}
			}
		}
		return true;
	}

	private static int getOutroJogador(int jogadorAtual) {
		if (jogadorAtual == 1) {
			return 2;
		} else {
			return 1;
		}
	}
}
