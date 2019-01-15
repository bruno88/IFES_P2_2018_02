package Recursividade;

import java.util.Scanner;

import Util.Util;

public class L1E2_2 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		System.out.println("Informe o valor de N: ");
		int n = Integer.valueOf(entrada.nextLine());

		System.out.println(Util.exibePares(n));
		
		entrada.close();
	}
}
