package Recursividade.Extras;

import Util.Util;

public class L11E2 {
	public static void main(String[] args) {
		final int tam = 10;
		final int N = 2, i = 0;

		int[] vetor = new int[tam];
		Util.getVetorIntAleatorio(vetor, 1, 20);

		System.out.println("Vetor Original: ");
		Util.imprimeVetorInt(vetor);

		//
		int qtd = Util.countMultiplos(vetor, N, i);
		String multiplos = Util.exibeMultiplos(vetor, N, i);		
		
		// remove a virgula, só pra ficar bonito
		multiplos = multiplos.substring(1, multiplos.length());
		System.out.println("Quantidade de multiplos de " + N + ": " + qtd);
		System.out.println("Sendo eles: " + multiplos);
	}

}
