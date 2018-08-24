package RevisãoMatrizes;

public class Ex12 {
	public static void main(String[] args) {
		String result = "";
		final int minRand = 1, maxRand = 10, ordem = 5;

		int[][] matriz = new int[ordem][ordem];

		// Populando a Matriz
		for (int i = 0; i < ordem; i++) {
			for (int j = 0; j < ordem; j++) {
				matriz[i][j] = (int) (Math.random() * maxRand + minRand);
			}
		}

		// Imprimindo a Matriz
		for (int i = 0; i < ordem; i++) {
			for (int j = 0; j < ordem; j++) {
				result += matriz[i][j] + "\t|";
			}
			result += "\n";
		}
		System.out.println(result);

		// Limpa termos acima da Diagonal Principal
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz.length; j++) {
				if (j > i) {
					matriz[i][j] = 0;
				}
			}
		}
		// Imprimindo a Matriz
		result = "";
		for (int i = 0; i < ordem; i++) {
			for (int j = 0; j < ordem; j++) {
				result += matriz[i][j] + "\t|";
			}
			result += "\n";
		}
		System.out.println(result);

	}
}