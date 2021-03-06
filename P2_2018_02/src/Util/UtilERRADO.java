package Util;

public class UtilERRADO {
	public static int geraIntAleatorio(int min, int max) {
		int numAleatorio = min + 
				(int) (Math.random() * ((max - min) + 1));

		return numAleatorio;

	}

	public static void imprimeString(String texto) {
		System.out.println(texto);

	}

	public static double calculaMediaHarmonica(int num1, int num2, int num3) {
		int numerador = 3;
		double denominador = (1 / num1) + (1 / num2) + (1 / num3);

		return numerador / denominador;
	}

	/**
	 * @author Bruno Clemente
	 * @param vetor
	 *            = vetor a ser impresso
	 * @return double
	 * 			  = m�dia harm�nica dos termo do vetor passado<br/><br/>
	 *
	 * M�todo utilizado para calcular m�dia Harmonica de um vetor de inteiros <br/>
	 * M�dia Harmonica: Caso de teste: {2,4,8,16} <br/>
	 * Resultado = 64/15 = 4.26666666667
	 * 
	 */
	public static double calculaMediaHarmonica(int[] vetor) {
		int numerador = vetor.length;
		double denominador = 0;

		for (int i = 0; i < vetor.length; i++) {
			denominador += (1.0 / vetor[i]);
		}

		return numerador / denominador;
	}

	public static double calculaMediaArit(int num1, int num2, int num3) {
		double conta = (double) (num1 + num2 + num3) / 3;
		return conta;
	}

	public static double calculaMediaArit(int[] vetor) {
		int soma = 0;
		for (int i = 0; i < vetor.length; i++) {
			soma += vetor[i];
		}
		return (double) soma / vetor.length;
	}

	public static double calculaMediaPond(int num1, int num2, int num3) {
		int peso1 = 5, peso2 = 3, peso3 = 2;
		int numerador = 0, denominador = 0;

		numerador = (num1 * peso1) + (num2 * peso2) + (num3 * peso3);
		denominador = (peso1 + peso2 + peso3);

		return (double) numerador / denominador;
	}

	public static double calculaMediaPond(int[] numeros, int[] pesos) {
		int numerador = 0, denominador = 0;
		double mediaPond = 0;

		for (int i = 0; i < numeros.length; i++) {
			numerador += (numeros[i] * pesos[i]);
		}
		System.out.println("num = " + numerador);
		System.out.println("denominador = " + denominador);
		mediaPond = (double) numerador / denominador;
		return mediaPond;
	}

	public static void getVetorIntAleatorio(int[] vetor,
					int min, int max) {
		// Popula o vetor com aleat�rios de min a max
		for (int i = 0; i < vetor.length; i++) {
			vetor[i] = UtilERRADO.geraIntAleatorio(min, max);
		}

	}

	public static int getMinutosFromHoras(int horas) {
		return horas * 60;
	}

	public static int getSegundosFromHoras(int horas) {
		return horas * 3600;
	}

	public static int getSegundosFromMinutos(int horas) {
		return horas * 60;
	}

	public static int[] doSelectionSort(int[] vetor) throws ArrayIndexOutOfBoundsException {
		for (int i = 0; i < vetor.length - 1; i++) {
			int index = i;
			for (int j = i + 1; j < vetor.length; j++) {
				if (vetor[j] <= vetor[index])
					index = j;
			}
			int menorValor = vetor[index];
			vetor[index] = vetor[i];
			vetor[i] = menorValor;
		}
		return vetor;
	}

	public static void imprimeVetorInt(int[] vetor) throws ArrayIndexOutOfBoundsException {
		String result = "";

		for (int i = 0; i < vetor.length; i++) {
			result += vetor[i] + " ";
		}
		System.out.println(result);

	}
	
	public static void imprimeVetorInt(int[] vetor, int qtd) {
		String result = "";

		for (int i = 0; i <= (qtd - 1); i++) {
			result += vetor[i] + " ";
		}
		System.out.println(result);
	}
	
	public static void imprimeVetorStr(String[] vetor) {
		String result = "";

		for (int i = 0; i < vetor.length; i++) {
			result += vetor[i] + " ";
		}
		System.out.println(result);

	}

	public static int[] getNumerosRepetidos(int[] vetor) {
		int qtd = 0;
		boolean isRepetido = false, isOnArray = false;
		int[] repetidos = new int[vetor.length/2];

		for (int i = 0; i < vetor.length; i++) {
			isRepetido = UtilERRADO.isRepetidoInt(vetor, vetor[i]);
			isOnArray = UtilERRADO.isOnArray(repetidos, vetor[i]);
			// Se o n�mero tem repeti��es E
			// se n�o est� no vetor de repetidos
			if (!isRepetido && isOnArray) {
				repetidos[qtd] = vetor[i];
				qtd++;
			}
		}

		return repetidos;
	}

	public static boolean isOnArray(int[] vetor, int numero) {
		int cont = 0;
		for (int i = 0; i < vetor.length; i++) {
			if (vetor[i] == numero) {
				cont++;
			}
		}
		if (cont == 0) {
			return false;
		} else {
			return true;
		}
	}

	public static boolean isOnArray(String[] vetor, String chave) {
		// Quando isOnArray recebe Strings, tamb�m precisa
		int cont = 0;
		for (int i = 0; i < vetor.length; i++) {
			if (vetor[i] != null && vetor[i].equalsIgnoreCase(chave)) {
				cont++;
			}
		}
		if (cont == 0) {
			return false;
		} else {
			return true;
		}
	}

	public static boolean isRepetidoInt(int[] vetor, int numero) {
		int cont = 0;

		for (int i = 0; i < vetor.length; i++) {
			if (vetor[i] == numero) {
				cont++;
			}
		}

		if (cont > 1) {
			return true;
		} else {
			return false;
		}

	}

	public static int getMaiorInt(int[] vetor) {
		int maior = 0;
		for (int i = 0; i < vetor.length; i++) {
			if (vetor[i] > maior) {
				maior = vetor[i];
			}
		}
		return maior;
	}

	public static void getMatrizIntAleatorio(int[][] matriz, int min, int max) {

		// Popula o vetor com aleat�rios de min a max
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[0].length; j++) {
				matriz[i][j] = UtilERRADO.geraIntAleatorio(min, max);
			}

		}
	}

	public static void imprimeMatriz(int[][] matriz) {
		String result = "";

		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[0].length; j++) {
				result += matriz[i][j] + "\t";
			}
			result += "\n";

		}
		System.out.println(result);

	}

	public static int getLinhaDoMaiorElemento(int[][] matriz, int minRand) {
		int maior = minRand;
		int linhaDoMaior = -1;

		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz.length; j++) {
				if (matriz[i][j] > maior) {
					maior = matriz[i][j];
					linhaDoMaior = i;
				}
			}
		}
		return linhaDoMaior;
	}

	public static int getMinmax(int[][] matriz, int minRand, int maxRand) {
		int linha = UtilERRADO.getLinhaDoMaiorElemento(matriz, minRand);
		int menor = maxRand;
		for (int j = 0; j < matriz.length; j++) {
			if (matriz[linha][j] < menor) {
				menor = matriz[linha][j];
			}
		}

		return menor;
	}

	public static int getIndexOfSubconjuntoNoConjunto(int[] conjunto, int[] subconjunto) {
		int index = -1;

		for (int i = 0; (index == -1) && i <= (conjunto.length - subconjunto.length); i++) {
			int cont = 0;
			boolean saiu = false;
			for (int j = 0; !saiu && j < subconjunto.length; j++) {
				if (conjunto[i + j] == subconjunto[j]) {
					cont++;

				} else {
					saiu = true;
				}
			}
			if (cont == subconjunto.length) {
				index = i;
			}

		}
		return index;

	}

	public static int[] getAllIndexOfSubconjuntoNoConjunto(int[] conjunto, int[] subconjunto) {
		int[] todosIndices = new int[conjunto.length];
		int index = -1;
		int qtdIndices = 0;

		for (int i = 0; (index == -1) && i <= (conjunto.length - subconjunto.length); i++) {
			int cont = 0;
			boolean saiu = false;
			for (int j = 0; !saiu && j < subconjunto.length; j++) {
				if (conjunto[i + j] == subconjunto[j]) {
					cont++;

				} else {
					saiu = true;
				}
			}
			if (cont == subconjunto.length) {
				todosIndices[qtdIndices] = i;
				qtdIndices++;
			}

		}
		return todosIndices;

	}

	public static boolean isPerfeito(int num) {
		int numAtual = num - 1, soma = 0;
		while (numAtual > 0) {
			if (num % numAtual == 0) {
				soma += numAtual;
			}
			
		}
		if (soma == num) {
			return true;

		} else {
			return false;
		}
	}

	public static boolean isPrimo(int num) {
		boolean isPrimo = true;
		// remover os menores que 2
		if (num < 2) {
			isPrimo = false;
		} else {
			// loop
			for (int i = 2; isPrimo && i < num; i++) {
				// se num � divis�vel por i
				if (num % i == 0) {
					// N�O � primo
					isPrimo = false;
				}
			}
		}
		return isPrimo;
	}

	public static int[] getNMaiores(int[][] matriz, int N, int qtd, int minRand) {
		int[] maiores = new int[N];
		int menor = UtilERRADO.getMenorElemento(matriz, minRand);
		while (qtd < N) {
			int maior = menor;
			for (int i = 0; i < matriz.length; i++) {
				for (int j = 0; j < matriz.length; j++) {
					if (matriz[i][j] > maior && !isOnArray(maiores, matriz[i][j])) {
						maior = matriz[i][j];
					}
				}
			}
			maiores[qtd] = maior;
			qtd++;
		}

		return maiores;
	}

	public static int getMenorElemento(int[][] matriz, int maxRand) {
		int menor = maxRand;

		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz.length; j++) {
				if (matriz[i][j] < menor) {
					menor = matriz[i][j];
				}
			}
		}
		return menor;
	}

	public static int getIndexOf(String[] login, String novoLogin) {
		int index = -1;
		boolean encontrado = false;
		
		for (int i = 0; !encontrado && i < login.length; i++) {
			if (login[i].equalsIgnoreCase(novoLogin)) {
				index = i;
				encontrado = true;
			}
		}
		return index;
	}
	
	public static int getNumPrimos(int[] vet1) {
		int cont = 0;
		for (int i = 0; i < vet1.length; i++) {
			if (UtilERRADO.isPrimo(vet1[i])) {
				cont++;
			}
		}
		return cont;
	}
	
	public static int[] adicionarNoVetor(int[] vetor, int numero, int qtdNum) {
		if (qtdNum < vetor.length) {
			vetor[qtdNum] = numero;
			return vetor;

		} else {
			// Cria novo vetor
			int[] novoVetor = new int[(vetor.length + 1)];

			// transfere os dados do primeiro vetor pro segundo
			for (int i = 0; i < vetor.length; i++) {
				novoVetor[i] = vetor[i];
			}

			// adiciona o novo n�mero
			novoVetor[qtdNum] = numero;

			// retorna o novo vetor
			return novoVetor;
		}
	}

	public static int[] removeDoVetor(int[] vetor, int numero) {
		int[] novoVetor = new int[(vetor.length - 1)];

		int novoCont = 0, removidos = 0;

		for (int i = 0; i < vetor.length; i++) {
			if (vetor[i] == numero && removidos < 1) {
				removidos++;
			} else {
				novoVetor[novoCont] = vetor[i];
				novoCont++;
			}
		}
		return novoVetor;
	}
}
