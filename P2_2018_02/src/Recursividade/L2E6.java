package Recursividade;

import Util.Util;

public class L2E6 {
	public static void main(String[] args) {
		final int K = 13;
		int indice = 0;
		int[] vet = { 9, 13, 13, 3, 6 };

		int cont = Util.contaKNoVetor(vet, K, indice);

		System.out.println(cont);
	}
}
