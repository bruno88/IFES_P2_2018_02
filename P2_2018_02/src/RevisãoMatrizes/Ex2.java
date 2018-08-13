package RevisãoMatrizes;

public class Ex2 {
	public static void main(String[] args) {
		String result = "";
		final int linhas = 5, colunas = 5, minRand = 1, maxRand = 10;

		int[][] matriz = new int[linhas][colunas];

		// Populando a Matriz
		for (int i = 0; i < linhas; i++) {
			for (int j = 0; j < colunas; j++) {
				matriz[i][j] = (int) (Math.random() * maxRand + minRand);
			}
		}

		// Imprimindo a Matriz
		for (int i = 0; i < linhas; i++) {
			for (int j = 0; j < colunas; j++) {
				result += matriz[i][j] + "\t|";
				// result += " | " + matriz[i][j] + " | ";
			}
			result += "\n";
		}

		System.out.println(result);
		// InOut.MsgDeInformação("", result);

	}
}
