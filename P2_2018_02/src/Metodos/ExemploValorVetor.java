package Metodos;

public class ExemploValorVetor {
	public static void main(String[] args) {
		int[] vetor = { 1, 5, 6 };

		// Imprimindo o vetor
		imprimeVetInt(vetor);
		System.out.println();
		
		// chamando o percorre vetor
		percorreVetor(vetor);

		// Imprimindo o vetor
		imprimeVetInt(vetor);
	}

	public static void percorreVetor(int[] novoVetor) {
		for (int i = 0; i < novoVetor.length; i++) {
			novoVetor[i]++;
		}
	}
	
	public static void imprimeVetInt(int[] novoVetor) {
		for (int i = 0; i < novoVetor.length; i++) {
			System.out.print(novoVetor[i] + " \t ");
		}
	}
}
