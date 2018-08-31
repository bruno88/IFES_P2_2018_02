package Metodos;

import Util.Util;

public class L2E4 {
	public static void main(String[] args) {
		// Nums perfeitos para teste: 6, 28, 496
		int num = 28;
		if (Util.isPerfeito(num)) {
			System.out.println("O número " + num + " é PERFEITO!");
		} else {
			System.out.println("O número " + num + " NÃO é PERFEITO!");
		}
	}

}
