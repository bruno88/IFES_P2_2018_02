package Util;

public class Util {
	public static int geraIntAleatorio(int min, int max) {
		int numAleatorio = min + (int) 
				(Math.random() * 
						((max - min) + 1));

		return numAleatorio;

	}
	
	public static void imprimeString(String texto) {
		System.out.println(texto);
		
	}
}
