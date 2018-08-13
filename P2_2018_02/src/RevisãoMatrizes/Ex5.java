package RevisãoMatrizes;

import java.util.Scanner;

import Introdução.Util;

public class Ex5 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		String result = "";
		int ordem, soma = 0;
		final int min = 1, max = 10;

		// Entrada com Scanner
		System.out.println("Digite a Ordem da Matriz");
		ordem = Integer.valueOf(entrada.nextLine());

		// Criamos e instanciamos matriz
		int[][] matriz = new int[ordem][ordem];
		int[][] matrizNova = new int[ordem][ordem];

		// Populando a Matriz
		for (int i = 0; i < ordem; i++) {
			for (int j = 0; j < ordem; j++) {
				// matriz[i][j] = (int) (Math.random() * maxRand + minRand);
				matriz[i][j] = Util.geraIntAleatorio(min, max);
			}
		}

		// Imprimindo a Matriz
		for (int i = 0; i < ordem; i++) {
			for (int j = 0; j < ordem; j++) {
				result += matriz[i][j] + " | ";
				soma += matriz[i][j];
			}
			result += "\n";
		}
		result += "Soma total= " + soma + "\n";
		System.out.println(result);
		
		// Limpando as variáveis
		soma = 0;
		result = "";
		
		System.out.println("Digite o termo a ser multiplicado");
		int termo = Integer.valueOf(entrada.nextLine());
		
		// Fechando o Scanner
		entrada.close();
		
		// Multiplicando os valores da matriz
		for (int i = 0; i < ordem; i++) {
			for (int j = 0; j < ordem; j++) {
				// matriz[i][j] = matriz[i][j] * termo;
				matriz[i][j] *= termo;
				result += matriz[i][j] + " | ";
				soma += matriz[i][j];
			}
			result += "\n";
		}
		
		result += "Soma total= " + soma + "\n";
		System.out.println(result);
		// InOut.MsgDeInformação("", result);

	}
}
