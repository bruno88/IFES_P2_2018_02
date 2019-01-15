package Recursividade;

import java.util.Scanner;

import Util.Util;

public class L1E1 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		System.out.println("Informe quantos elementos " + "são calculados da sequencia: ");
		int n = Integer.valueOf(entrada.nextLine());

		//System.out.println(Util.imprimeFibonacci(n1, n2, n, 0));
		System.out.println(Util.calculaFibonacci(n));

		entrada.close();
	}
}
