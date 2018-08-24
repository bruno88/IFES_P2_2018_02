package RevisãoMatrizes;

public class Ex9 {
	public static void main(String[] args) {
		String termo, result = "";
		int iAux = -1, jAux = -1;

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

		// Lê termo a ser consultado
		termo = InOut.leString("Digite o termo a ser consultado");

		// Procurando na Matriz o termo
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz.length; j++) {
				if (termo.equals(String.valueOf(matriz[i][j]))) {
					iAux = i;
					jAux = j;
				}
			}
		}

		// Formata resposta final
		if (iAux != -1 || jAux != -1) {
			result = termo + " foi encontrado em matriz[" + iAux + "][" + jAux + "]";
		} else {
			result = "Termo não encontrado";
		}

		System.out.println(result);
	}
}