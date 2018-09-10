package Metodos;

import Util.Util;

public class L2E8 {
	public static void main(String[] args) {
		final int ordem = 5, minRand = 1, maxRand = 100;
		int[][] matriz = new int[ordem][ordem];		
		
		// Popula matriz
		Util.getMatrizIntAleatorio(matriz, 
				minRand, 
				maxRand);
		
		// Imprime matriz
		Util.imprimeMatriz(matriz);
		
		// Busca a linha do Maior Elemento
		int linha = Util.getLinhaDoMaiorElemento(matriz, minRand);
		System.out.println(linha);
		
		// Busca o minmax
		int minmax = Util.getMinmax(matriz, minRand, maxRand);
		System.out.println(minmax);
	}

}
