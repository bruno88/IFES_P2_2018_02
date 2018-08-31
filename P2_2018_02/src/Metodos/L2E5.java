package Metodos;

import Util.Util;

public class L2E5 {
	public static void main(String[] args) {
		final int tamVetor = 10, 
				minRand = 1, maxRand = 50;
		int[] vetor = new int[tamVetor];
		int[] vetRepetidos;

		try {
			// Popula o vetor
			Util.getVetorIntAleatorio(vetor, minRand, maxRand);

			// Imprime o vetor
			System.out.print("Vetor Original: ");
			Util.imprimeVetorInt(vetor);

			// Passo 1: Ordenar Vetor
			vetor = Util.doSelectionSort(vetor);

			// Imprime o vetor
			System.out.print("Vetor Ordenado: ");
			Util.imprimeVetorInt(vetor);

			// Passo 2: Gerar novos valores
			// Mostrar a questão do re-uso de código
			Util.getVetorIntAleatorio(vetor, minRand, maxRand);

			// Imprime o vetor
			System.out.print("Novo Vetor: ");
			Util.imprimeVetorInt(vetor);

			// Passo 3: Buscar repetidos
			vetRepetidos = Util.getNumerosRepetidos(vetor);
			Util.imprimeVetorInt(vetRepetidos);
			
			

			// Imprime o vetor de repetidos
			System.out.print("Vetor de repetidos: ");
			Util.imprimeVetorInt(vetRepetidos);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
