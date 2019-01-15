package Recursividade.Extras;

import Util.Util;

public class L11E4 {
	public static void main(String[] args) {
		final int tam = 10;
		final int posFixa = 0;
		final int posCompara = posFixa + 1;
		// int[] vetor = { 9, 13, 2, 15, 7, 8, 4, 16 };
		int[] vetor = new int[tam];

		Util.getVetorIntAleatorio(vetor, 1, 20);

		System.out.println("Vetor Original: ");
		Util.imprimeVetorInt(vetor);

		vetor = Util.ordenaVetRecurs(vetor, posFixa, posCompara);

		System.out.println("Vetor Ordenado: ");
		Util.imprimeVetorInt(vetor);
	}
}
