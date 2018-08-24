package RevisãoMatrizes;

public class Ex4 {
	public static void main(String[] args) {
		String result = "";
		final int minRand = 1, maxRand = 10;

		int tam = InOut.leInt("Digite a Ordem da Matriz");

		int[][] matriz = new int[tam][tam];

		// Populando a Matriz
		for (int i = 0; i < tam; i++) {
			for (int j = 0; j < tam; j++) {
				matriz[i][j] = (int) (Math.random() * maxRand + minRand);
			}
		}

		// Imprimindo a Matriz
		for (int i = 0; i < tam; i++) {
			for (int j = 0; j < tam; j++) {
				result += matriz[i][j] + " | ";
			}
			result += "\n";
		}

		System.out.println(result);
		// InOut.MsgDeInformação("", result);

	}
}
