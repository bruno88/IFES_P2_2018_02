package Introdução;

public class Util {
	public static int geraIntAleatorio(int min, int max) {
		int intAleatorio = min + (int) (Math.random() * ((max - min) + 1));
		return intAleatorio;
	}
}
