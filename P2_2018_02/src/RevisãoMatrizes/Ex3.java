package RevisãoMatrizes;

public class Ex3 {
	public static void main(String[] args) {
		String result = "";
		int linhas, colunas;
		final int minRand = 1, maxRand = 10;

		linhas = InOut.leInt("Digite o número de linhas da Matriz");
		colunas = InOut.leInt("Digite o número de colunas da Matriz");
		
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
				result += matriz[i][j] + " | ";
			}
			result += "\n";
		}

		System.out.println(result);
		//InOut.MsgDeInformação("", result);

	}
}
