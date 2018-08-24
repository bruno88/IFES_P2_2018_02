package RevisãoMatrizes;

public class Ex11 {
	public static void main(String[] args) {
		String result = "";
		int qtdImpares = 0;
		final int minRand = 1, maxRand = 10, ordem = 5;

		int[][] matriz = new int[ordem][ordem];

		// Populando a Matriz
		for (int i = 0; i < ordem; i++) {
			for (int j = 0; j < ordem; j++) {
				matriz[i][j] = (int) (Math.random() * maxRand + minRand);
			}
		}

		// Procurando na Matriz o termo
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz.length; j++) {
				result += matriz[i][j] + " | ";
				if (matriz[i][j] % 2 == 1) {
					qtdImpares++;
				}
			}
			result += "; Qtd Impares: " + qtdImpares + "\n";
			qtdImpares = 0;

		}

		System.out.println(result);
	}
}