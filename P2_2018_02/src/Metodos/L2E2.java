package Metodos;

import Util.Util;

public class L2E2 {
	public static void main(String[] args) {
		final int num = 200;
		boolean isPrimo = Util.isPrimo(num);
		
		if (isPrimo) {
			System.out.println("O numero " + num + " é PRIMO");
		} else {
			System.out.println("O numero " + num + " NÃO é PRIMO");
		}
	}
}
