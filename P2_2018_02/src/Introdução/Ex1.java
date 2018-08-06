package Introdução;

public class Ex1 {
	public static void main(String[] args) {
		final int min = 1, max = 10, ordem = 5;
		String result = "|";
		
		int[][] matriz = new int[ordem][ordem];
		
		// Preenchendo a Matriz
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz.length; j++) {
				matriz[i][j] = Util.geraIntAleatorio(min, max);
			}
		}
		
		
		// Imprimindo a matriz
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz.length; j++) {
				result += matriz[i][j] + "|";
			}
			result += "\n|";
		}
		System.out.println(result);
		
	}

	public static int soma(int num1, int num2) {
		int result = num1 + num2;
		return result;
	}
	
	
	
	
}
