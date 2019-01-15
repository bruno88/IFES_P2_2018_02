package Recursividade;

import Util.Util;

public class L2E2 {
	public static void main(String[] args) {
		int[] vet = { 4, 1, 7 }; // = 12
		int soma = Util.somaVetRecursao(vet, 0);
		System.out.println("Soma: " + soma);
	}
}
