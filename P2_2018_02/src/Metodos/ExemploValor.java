package Metodos;

import java.util.Scanner;

public class ExemploValor {
	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		
		// Leitura dos dados
		System.out.println("Digite A");
		int A = Integer.valueOf(entrada.nextLine());
		System.out.println("Digite B");
		int B = Integer.valueOf(entrada.nextLine());

		// Somando
		int resultado = soma(A, B);
		System.out.println("Soma = " + resultado);

		// Subtraindo A - B
		resultado = subtracao(A, B);
		System.out.println("Subtração de A - B = " + resultado);

		// Subtraindo B - A
		resultado = subtracao(B, A);
		System.out.println("Subtração de B - A = " + resultado);

		// Fechando Scanner
		entrada.close();

	}

	public static void percorreVetor(int[] vetor) {
		for (int i = 0; i < vetor.length; i++) {
			System.out.println(vetor[i]);
		}
		
	}

	public static int soma(int A, int novoB) {
		int soma = A + novoB;
		A = 400;
		return soma;
	}

	public static int subtracao(int novoA, int novoB) {
		int subtracao = novoA - novoB;

		return subtracao;
	}
}
