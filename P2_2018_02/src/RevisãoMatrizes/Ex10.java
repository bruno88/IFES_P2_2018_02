package RevisãoMatrizes;

public class Ex10 {
	public static void main(String[] args) {
		String result = "";
		int somaImpares = 0, somaPares = 0;
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

		// Procurando na Matriz o termo
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz.length; j++) {
				if (matriz[i][j]%2 == 0) {
					somaPares++;
				} else {
					somaImpares++;
				}
			}
		}

		result = "Pares: " + somaPares + "\n"
				+ "Impares: " + somaImpares;
		System.out.println(result);
	}
}