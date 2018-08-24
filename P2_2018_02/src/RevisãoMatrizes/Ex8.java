package RevisãoMatrizes;

public class Ex8 {
	public static void main(String[] args) {
		String result = "";
		int soma = 0;
		final int minRand = 1, maxRand = 10, ordem = 5;

		int[][] matriz = new int[ordem][ordem];

		// Populando a Matriz
		for (int i = 0; i < ordem; i++) {
			for (int j = 0; j < ordem; j++) {
				matriz[i][j] = (int) (Math.random() * maxRand + minRand);
			}
		}

		// Somando Diagonal Principal
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz.length; j++) {
				if (i != j) {
					soma += matriz[i][j];
				}
			}
		}

		// Imprimindo a Matriz
		for (int i = 0; i < ordem; i++) {
			for (int j = 0; j < ordem; j++) {
				result += matriz[i][j] + "\t|";
			}
			result += "\n";
		}
		result += "Soma Fora da Diagonal Principal = " + soma;
		System.out.println(result);
	}
}