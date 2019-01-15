package Recursividade;

import Util.Util;

public class L2E1 {
	public static void main(String[] args) {
		//final int tam = 4;
		//int[] vet = new int[tam];
		int[] vet = { 1, 9, 3, 4, 2, 3};
		
		//Util.getVetorIntAleatorio(vet, 0, 10);
		
		Util.imprimeVetorInt(vet);
		
		Util.inverteVet(vet, 0);
		
		Util.imprimeVetorInt(vet);
	}
}
