package Metodos;

import Util.Util;

public class L2E7 {
	public static void main(String[] args) {
		final int tam = 20, fatorPromo = 15, min = 1, max = 30;
		int[] locacoes = new int[tam];
		int[] gratuitas = new int[tam];

		Util.getVetorIntAleatorio(locacoes, min, max);

		getVetorLocacoesGratuitas(locacoes, gratuitas, fatorPromo);

		Util.imprimeVetorInt(locacoes);
		Util.imprimeVetorInt(gratuitas);
	}

	private static void getVetorLocacoesGratuitas(int[] locacoes, int[] gratuitas, int fatorPromo) {
		for (int i = 0; i < locacoes.length; i++) {
			gratuitas[i] = locacoes[i] / fatorPromo;
		}

	}

}
