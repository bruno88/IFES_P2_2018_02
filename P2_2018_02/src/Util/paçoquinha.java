package Util;

public class pa�oquinha {
	public static int geraIntAleatorio(int min, int max) {
		int numAleatorio = min + (int) (Math.random() * ((max - min) + 1));

		return numAleatorio;

	}
}
