package RevisãoMatrizes;

public class Ex1 {
	public static void main(String[] args) {
		final int linhas = 5, colunas = 5, minRand = 1, maxRand = 10;

		int[][] matriz = new int[linhas][colunas];

		// Populando a Matriz
		for (int i = 0; i < linhas; i++) {
			for (int j = 0; j < colunas; j++) {
				matriz[i][j] = (int) (Math.random() * maxRand + minRand);
			}
		}
	}
}
