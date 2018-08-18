package RevisãoMatrizes;

public class Ex9_extra {
	public static void main(String[] args) {
		String result = "";
		int termo, posAtual = 0;
		
		final int minRand = 1, maxRand = 10, ordem = 5;

		int[] iAux = new int[(int) Math.pow(ordem, 2)];
		int[] jAux = new int[(int) Math.pow(ordem, 2)];
		
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

		// Lê termo a ser consultado
		//termo = InOut.leString("Digite o termo a ser consultado");
		termo = InOut.leInt("Digite o termo a ser consultado");

		// Procurando na Matriz o termo
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz.length; j++) {
				if (termo == matriz[i][j]) {
					iAux[posAtual] = i;
					jAux[posAtual] = j;
					posAtual++;
				}
			}
		}

		// Formata resposta final
		result = "";
		for (int i = 0; i < posAtual; i++) {
			result += termo + " foi encontrado em matriz[" + iAux[i] + "][" + jAux[i] + "]\n";
		}

		System.out.println(result);
	}
}