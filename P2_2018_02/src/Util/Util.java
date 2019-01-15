package Util;

import java.io.IOException;
import java.util.Scanner;

public class Util {
	public static int soma(int numA, int numB) {
		int result = numA + numB;
		return result;
	}

	public static int geraIntAleatorio(int min, int max) {
		int intAleatorio = min + (int) (Math.random() * ((max - min) + 1));
		return intAleatorio;
	}

	public static double calculaMediaArit(int[] vetor) {
		int soma = 0;
		double media;
		for (int i = 0; i < vetor.length; i++) {
			soma += vetor[i];
		}
		media = (double) soma / vetor.length;
		return media;
	}

	/**
	 * @description Método utilizado para imprimir vetor de inteiros
	 * 
	 * @author Bruno Clemente
	 * @param vetor
	 *            = vetor a ser impresso
	 * @return void
	 */
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

	public static double getNumeroAbs(double numero) {
		return Math.abs(numero);
		/*
		 * if (numero >= 0) { return numero; } else { return (-1)*numero; }
		 */
	}

	public static void getVetorIntAleatorio(int[] vetor, int min, int max) {
		// Popula o vetor com aleatórios de min a max
		for (int i = 0; i < vetor.length; i++) {
			vetor[i] = Util.geraIntAleatorio(min, max);
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
				if (vetor[j] < vetor[index])
					index = j;
			}
			int menorValor = vetor[index];
			vetor[index] = vetor[i];
			vetor[i] = menorValor;
		}
		return vetor;
	}

	public static int[] getNumerosRepetidos(int[] vetor) {
		int qtd = 0;
		boolean isRepetido = false, isOnArray = false;
		int[] repetidos = new int[vetor.length];

		for (int i = 0; i < vetor.length; i++) {
			isRepetido = Util.isRepetidoInt(vetor, vetor[i]);
			isOnArray = Util.isOnArray(repetidos, vetor[i]);
			// Se o número tem repetições E
			// se não está no vetor de repetidos
			if (isRepetido && !isOnArray) {
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
		// Quando isOnArray recebe Strings, também precisa
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

	public static int getIndexOfSubconjuntoNoConjunto(int[] conjunto, int[] subconjunto) {
		int cont;
		for (int i = 0; i <= (conjunto.length - subconjunto.length); i++) {

			cont = 0;
			for (int j = 0; j < subconjunto.length; j++) {
				if (conjunto[i + j] == subconjunto[j]) {
					cont++;
				}
			}
			if (cont == subconjunto.length) {
				return i;
			}

		}
		return -1;
	}

	public static int[] getAllIndexOfSubconjuntoNoConjunto(int[] conjunto, int[] subconjunto, int qtd) {
		int cont;
		int[] posicoes = new int[conjunto.length];

		for (int i = 0; i <= (conjunto.length - subconjunto.length); i++) {
			cont = 0;
			for (int j = 0; j < subconjunto.length; j++) {
				if (conjunto[i + j] == subconjunto[j]) {
					cont++;
				}
			}
			if (cont == subconjunto.length) {
				posicoes[qtd] = i;
				qtd++;
			}

		}
		return posicoes;

	}

	public static void imprimeLocacoesPromocao(int[] vetor) {
		for (int i = 0; i < vetor.length; i++) {
			Util.imprimeLocacoesPromocao(vetor, i);
		}
	}

	public static void imprimeLocacoesPromocao(int[] vetor, int codPessoa) {
		final int criterio = 15;
		String result = "Cliente " + (codPessoa + 1) + " possui " + vetor[codPessoa] + " locações. "
				+ (vetor[codPessoa] / criterio) + " locações grátis\n";

		System.out.println(result);
	}

	public static void getMatrizIntAleatorio(int[][] matriz, int min, int max) {

		// Popula o vetor com aleatórios de min a max
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[0].length; j++) {
				matriz[i][j] = Util.geraIntAleatorio(min, max);
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

	public static void imprimeMatriz(String[][] matriz) {
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

	public static int getMaiorElemento(int[][] matriz, int minRand) {
		int maior = minRand;

		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz.length; j++) {
				if (matriz[i][j] > maior) {
					maior = matriz[i][j];
				}
			}
		}
		return maior;
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

	public static int getMenorElemento(int num1, int num2, int num3, int num4, int maxRand) {
		int menor = maxRand;

		if (num1 < menor) {
			menor = num1;
		}
		if (num2 < menor) {
			menor = num2;
		}
		if (num3 < menor) {
			menor = num3;
		}
		if (num4 < menor) {
			menor = num4;
		}

		return menor;
	}

	public static int getMinmax(int[][] matriz, int minRand, int maxRand) {
		int linha = Util.getLinhaDoMaiorElemento(matriz, minRand);
		int menor = maxRand;
		for (int j = 0; j < matriz.length; j++) {
			if (matriz[linha][j] < menor) {
				menor = matriz[linha][j];
			}
		}

		return menor;
	}

	public static double getMediaPond(int[] numeros, int[] pesos) {
		int numerador = 0, denominador = 0;
		double mediaPond = 0;

		for (int i = 0; i < numeros.length; i++) {
			numerador += (numeros[i] * pesos[i]);
			denominador += pesos[i];
		}
		mediaPond = (double) numerador / denominador;
		return mediaPond;
	}

	public static double getMediaPond(double[] numeros, int[] pesos) {
		int numerador = 0, denominador = 0;
		double mediaPond = 0;

		for (int i = 0; i < numeros.length; i++) {
			numerador += (numeros[i] * pesos[i]);
			denominador += pesos[i];
		}
		mediaPond = (double) numerador / denominador;
		return mediaPond;
	}

	public static int[] setVetorNegativo(int[] vetor) {
		for (int i = 0; i < vetor.length; i++) {
			vetor[i] = -1;
		}
		return vetor;
	}

	public static void zeraImpares(int[] vetor) {
		for (int i = 0; i < vetor.length; i++) {
			if (vetor[i] % 2 == 1) {
				vetor[i] = 0;
			}
		}

	}

	public static boolean isPrimo(int numero) {
		int cont = 0;

		for (int i = 1; i <= numero; i++) {
			if (numero % i == 0)
				cont++;
		}

		if (cont == 2) {
			return true;
		} else {
			return false;
		}
	}

	public static int[] getNumerosPrimo(int[] vetor, int[] qtdPrimos) {
		int[] indicesPrimos = new int[vetor.length];

		for (int i = 0; i < vetor.length; i++) {
			if (Util.isPrimo(vetor[i]) && !Util.isOnArray(indicesPrimos, vetor[i])) {
				indicesPrimos[qtdPrimos[0]] = vetor[i];
				qtdPrimos[0]++;
			}
		}
		return indicesPrimos;
	}

	public static int[] getIndexOfAllNumerosPrimo(int[] vetor, int[] qtdPrimos) {
		int[] indicesPrimos = new int[vetor.length];

		for (int i = 0; i < vetor.length; i++) {
			if (Util.isPrimo(vetor[i])) {
				indicesPrimos[qtdPrimos[0]] = i;
				qtdPrimos[0]++;
			}
		}

		return indicesPrimos;
	}

	public static int[] getNMaiores(int[][] matriz, int N, int qtd, int minRand) {
		int[] maiores = new int[N];
		int menor = Util.getMenorElemento(matriz, minRand);
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

	public static int getIndexOf(String[] login, String novoLogin) {
		for (int i = 0; i < login.length; i++) {
			if (login[i].equalsIgnoreCase(novoLogin)) {
				return i;
			}
		}
		return -1;
	}

	public static int getNumPrimos(int[] vet1) {
		int cont = 0;
		for (int i = 0; i < vet1.length; i++) {
			if (Util.isPrimo(vet1[i])) {
				cont++;
			}
		}
		return cont;
	}

	public static void salvaHistorico(String operacao, double valor, String[] nomeOperHist, double[] valorOperHist,
			int qtdTransacoes) {
		nomeOperHist[qtdTransacoes] = operacao;
		valorOperHist[qtdTransacoes] = valor;

	}

	public static void imprimeHistorico(String[] nomeOperHist, double[] valorOperHist, int qtdTransacoes) {
		System.out.println("Listando transações:\n");
		for (int i = 0; i < qtdTransacoes; i++) {
			System.out.println("Operação " + (i + 1) + ": " + nomeOperHist[i] + " no valor de: " + valorOperHist[i]);
		}
		System.out.println();

	}

	public static void defineTabuleiro(String[][] tabuleiro) {
		for (int i = 0; i < tabuleiro.length; i++) {
			for (int j = 0; j < tabuleiro.length; j++) {
				tabuleiro[i][j] = "_";
			}
		}

	}

	public static void imprimeTabuleiro(String[][] tabuleiro) {
		String result = "";
		for (int i = 0; i < tabuleiro.length; i++) {
			for (int j = 0; j < tabuleiro.length; j++) {
				result += tabuleiro[i][j] + " | ";
			}
			result += "\n";
		}
		System.out.println(result);

	}

	public static boolean isTuplaValida(String[][] tabuleiro, int novaLinha, int novaColuna) {
		if (// está no intervalo (entre 0 e 2)
		novaLinha >= 0 && novaLinha < tabuleiro.length && novaColuna >= 0 && novaColuna < tabuleiro.length
		// E se está livre
				&& tabuleiro[novaLinha][novaColuna] == "_") {
			return true;
		} else {
			return false;
		}
	}

	public static void realizaJogada(String[][] tabuleiro, int novaLinha, int novaColuna, int jogadorAtual) {

		if (jogadorAtual == 1) {
			tabuleiro[novaLinha][novaColuna] = "O";
		} else {
			tabuleiro[novaLinha][novaColuna] = "X";
		}

	}

	public static boolean verificaVitoria(String[][] tabuleiro, int jogadorAtual) {
		jogadorAtual = Util.getOutroJogador(jogadorAtual);

		for (int i = 0; i < tabuleiro.length; i++) {
			// Checando as Linhas
			if (tabuleiro[i][0].equals(tabuleiro[i][1]) && tabuleiro[i][0].equals(tabuleiro[i][2])
					&& !tabuleiro[i][0].equals("_")) {
				System.out.println("Vitória do jogador " + jogadorAtual);
				return false;
			}
			// Checando as Colunas
			if (tabuleiro[0][i].equals(tabuleiro[1][i]) && tabuleiro[0][i].equals(tabuleiro[2][i])
					&& !tabuleiro[0][i].equals("_")) {
				System.out.println("Vitória do jogador " + jogadorAtual);
				return false;
			}

			// Verificando a Diagonal Principal
			if (tabuleiro[0][0].equals(tabuleiro[1][1]) && tabuleiro[0][0].equals(tabuleiro[2][2])
					&& !tabuleiro[0][0].equals("_")) {
				System.out.println("Vitória do jogador " + jogadorAtual);
				return false;
			}

			// Verificando a Diagonal Invertida
			if (tabuleiro[0][2].equals(tabuleiro[1][1]) && tabuleiro[0][2].equals(tabuleiro[2][0])
					&& !tabuleiro[0][2].equals("_")) {
				System.out.println("Vitória do jogador " + jogadorAtual);
				return false;
			}
		}

		if (Util.verificaEmpate(tabuleiro)) {
			System.out.println("Fim de jogo. Não há jogadas disponíveis");
			return false;
		}

		return true;

	}

	public static boolean verificaEmpate(String[][] tabuleiro) {
		for (int i = 0; i < tabuleiro.length; i++) {
			for (int j = 0; j < tabuleiro.length; j++) {
				if (tabuleiro[i][j].equals("_")) {
					return false;
				}
			}
		}
		return true;
	}

	public static int getOutroJogador(int jogadorAtual) {
		if (jogadorAtual == 1) {
			return 2;
		} else {
			return 1;
		}
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

			// adiciona o novo número
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

	public static void substituiValor(int[] vetor, int pos, int num) {
		vetor[pos] = num;
	}

	public static void leVetorInt(int[] vetor, Scanner entrada) {
		for (int i = 0; i < vetor.length; i++) {
			System.out.println("Digite o próximo valor: ");
			vetor[i] = Integer.valueOf(entrada.nextLine());
		}
	}

	public static void alteraMatriz(int[][] matriz, int[] vetor) {
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz.length; j++) {
				if (Util.maiorQue(i, vetor[0])) {
					matriz[i][j] += 1;
				}
				if (Util.menorQue(j, vetor[1])) {
					matriz[i][j] += 2;
				}
			}
		}

	}

	public static boolean menorQue(int i, int j) {
		if (i < j) {
			return true;
		} else {
			return false;
		}
	}

	public static boolean maiorQue(int i, int j) {
		if (i > j) {
			return true;
		} else {
			return false;
		}
	}

	public static void alteraVizinhos(int[] vetor, int pos, int media) {
		// Se posição 0, só altera o posterior
		if (pos == 0) {
			vetor[pos + 1] /= media;
		} else
		// Se posição 19 (20 - 1), só altera o anterior
		if (pos == (vetor.length - 1)) {
			vetor[pos - 1] /= media;
			// Senão, altera ambos
		} else {
			vetor[pos + 1] /= media;
			vetor[pos - 1] /= media;

		}
	}

	public static int[][] getMenorMatriz(int[][] mat1, int[][] mat2, int[][] mat3, int[][] mat4, int posL, int posC,
			int maxRand) {
		// Cria a menor Matriz
		int[][] menorMatriz = new int[mat1.length][mat1.length];

		// Obtém os menores termos de cada matriz
		for (int i = 0; i < menorMatriz.length; i++) {
			for (int j = 0; j < menorMatriz.length; j++) {
				// para cada posição (i,j), obtém o menor
				menorMatriz[i][j] = Util.getMenorElemento(mat1[i][j], mat2[i][j], mat3[i][j], mat4[i][j], maxRand);
			}
		}

		// Ao final, zera a posição (posL,posC)
		menorMatriz[posL][posC] = 0;

		return menorMatriz;

	}

	public static int[] incluirValor(int[] vetor, int pos, int num) {
		int[] novoVetor = new int[vetor.length + 1];
		int qtdInserido = 0;

		// transfere os dados do vetor velho para o novo
		for (int i = 0; i < vetor.length; i++) {
			if (i != pos) {
				novoVetor[qtdInserido] = vetor[i];
				qtdInserido++;
			} else {
				novoVetor[qtdInserido] = num;
				qtdInserido++;
				i--;
				pos = -1;
			}
		}
		return novoVetor;

	}

	public static int[] somaVetores(int[] vet1, int[] vet2) {
		int[] vetSoma = new int[vet1.length];

		// Para cada posição, soma os elementos de vet1 e vet2
		for (int i = 0; i < vetSoma.length; i++) {
			vetSoma[i] = vet1[i] + vet2[i];
		}
		return vetSoma;
	}

	public static double getMediaAritMatriz(int[][] matriz) {
		int soma = 0;
		double media = 0;

		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[0].length; j++) {
				soma += matriz[i][j];
			}
		}
		media = (double) soma / (matriz.length * matriz[0].length);
		return media;
	}

	public static void alugarAptoParaCondomino(String[][] condominio, String nome, int andar, int apto, String texto) {
		if (condominio[andar][apto].equalsIgnoreCase(texto)) {
			condominio[andar][apto] = nome;
			System.out.println("Aluguel realizado com sucesso !");
		} else {
			System.out.println("O apartamento andar " + andar + ", apto " + apto + " já está ocupado pelo condômino "
					+ condominio[andar][apto]);
		}

	}

	public static void preencheMatrizComTexto(String[][] condominio, String texto) {
		for (int i = 0; i < condominio.length; i++) {
			for (int j = 0; j < condominio.length; j++) {
				condominio[i][j] = texto;
			}
		}
	}

	public static void transfereCondomino(String[][] condominio, String nome, int novoAndar, int novoApto,
			String texto) {
		// Verifica se o novo apto está vago
		if (Util.isAptoVago(condominio, novoAndar, novoApto, texto)) {
			int[] aptoAtual = Util.getIJMatrizPorNome(condominio, nome);
			// atualiza novo apto
			condominio[novoAndar][novoApto] = nome;
			// atualiza apto antigo
			condominio[aptoAtual[0]][aptoAtual[1]] = texto;

			System.out.println("Transferencia realizada com sucesso !");
		} else {
			System.out.println("O andar/apto digitado não está livre");
		}

	}

	public static int[] getIJMatrizPorNome(String[][] condominio, String nome) {
		int[] IJ = new int[2];
		for (int i = 0; i < condominio.length; i++) {
			for (int j = 0; j < condominio[0].length; j++) {
				if (condominio[i][j].equalsIgnoreCase(nome)) {
					IJ[0] = i;
					IJ[1] = j;
					return IJ;
				}
			}
		}
		return null;
	}

	public static boolean isAptoVago(String[][] condominio, int novoAndar, int novoApto, String texto) {
		if (condominio[novoAndar][novoApto].equalsIgnoreCase(texto)) {
			return true;
		}
		return false;
	}

	public static boolean isOnMatrix(String[][] condominio, String texto) {
		for (int i = 0; i < condominio.length; i++) {
			for (int j = 0; j < condominio[0].length; j++) {
				if (condominio[i][j].equalsIgnoreCase(texto)) {
					return true;
				}
			}
		}
		return false;
	}

	public static void removeDoCondominioPorNome(String[][] condominio, String nome, String texto) {
		// Verifica se o condômino está no condomínio
		if (Util.isOnMatrix(condominio, nome)) {
			int[] aptoAtual = Util.getIJMatrizPorNome(condominio, nome);
			condominio[aptoAtual[0]][aptoAtual[1]] = texto;
			System.out.println("Desapropriação realizada com sucesso !");
		} else {
			System.out.println("O nome digitado não está no condomínio, " + "portanto não pode ser transferido.");
		}

	}

	public static void removeDoCondominioPorPosicao(String[][] condominio, int novoAndar, int novoApto, String texto) {
		// Verifica se o novo apto está vago
		if (!Util.isAptoVago(condominio, novoAndar, novoApto, texto)) {
			condominio[novoAndar][novoApto] = texto;

			System.out.println("Desapropriação realizada com sucesso !");
		} else {
			System.out.println("O andar/apto digitado está livre");
		}
	}

	public static int[] pushPilha(int[] pilha, int numero, int[] qtdTermos) {
		// Se você for capaz de empilhar
		if (qtdTermos[0] < pilha.length) {
			pilha[qtdTermos[0]] = numero;
			qtdTermos[0]++;
			return pilha;
		} else {
			// cria uma pilha nova, sem nada
			int[] novaPilha = new int[pilha.length + 1];

			// Transfere os dados da pilha nova para a antiga
			for (int i = 0; i < pilha.length; i++) {
				novaPilha[i] = pilha[i];
			}

			// Adiciona o ultimo termo
			novaPilha[qtdTermos[0]] = numero;
			qtdTermos[0]++;
			return novaPilha;
		}
	}

	public static void imprimeUltimoTermo(int[] pilha) {
		int termoDesempilhado = pilha[pilha.length - 1];
		System.out.println("Termo desempilhado: " + termoDesempilhado);

	}

	public static int[] getPilhaSemUltimo(int[] pilha, int[] qtdTermos) {
		// cria uma pilha nova, sem nada, com 1 posição a menos
		int[] novaPilha = new int[pilha.length - 1];

		// Transfere os dados da pilha nova para a antiga
		for (int i = 0; i < novaPilha.length; i++) {
			novaPilha[i] = pilha[i];
		}

		// reduz o contador, porque tem 1 termo a menos
		qtdTermos[0]--;

		// Retorna a nova Pilha, sem o termo desempilhado
		return novaPilha;
	}

	public static int[][] getMatrizAlternada(int[][] mat1, int[][] mat2) {
		int[][] matAlternada = new int[mat1.length][mat1[0].length];
		boolean alterna = false;

		for (int i = 0; i < matAlternada.length; i++) {
			for (int j = 0; j < matAlternada.length; j++) {
				if (alterna) {
					matAlternada[i][j] = mat2[i][j];
					alterna = Util.getBooleanInvertido(alterna);
				} else {
					matAlternada[i][j] = mat1[i][j];
					alterna = Util.getBooleanInvertido(alterna);
				}
			}
			alterna = false;
		}
		return matAlternada;
	}

	public static boolean getBooleanInvertido(boolean b) {
		if (b == true) {
			return false;
		} else {
			return true;
		}

	}

	public static int calcularFatorial(int numero) {
		int resultado;
		// se o número que entrou é zero
		if (numero == 0) {
			resultado = 1;
			// senão, chama o método de novo
		} else {
			resultado = numero * calcularFatorial(numero - 1);
		}
		return resultado;
	}

	public static String euAdoroProg(int numero) throws StackOverflowError {
		String result = "";

		if (numero == 0) {
			result = "";
		} else {
			result = "Eu adoro programação!\n" + euAdoroProg(numero - 1);
		}
		return result;

	}

	// método para imprimir Fibonacci
	public static String imprimeFibonacci(int n1, int n2, int n, int cont) {
		String saida = "";
		if (cont == 0) {
			saida += n1 + ", " + n2 + ", ";
		}
		if (cont <= n) {
			int n3 = n1 + n2;
			saida += n3 + ", " + imprimeFibonacci(n2, n3, n, ++cont);
		}
		return saida;
	}

	// método pra calcular Fibonacci
	public static int calculaFibonacci(int N) {
		int saida;
		if (N == 0) {
			saida = 0;
		} else {
			if (N == 1) {
				saida = 1;
			} else {
				saida = (calculaFibonacci(N - 2) +
						calculaFibonacci(N - 1));
			}
		}
		return saida;
	}
	
	public static String exibePares(int n) {
		String saida = "";
		if (n >= 0) {
			if (n % 2 == 0) {
				saida = exibePares(n - 1) + n + ", ";
			} else {
				saida += exibePares(--n);
			}
		}
		return saida;
	}

	public static double elevarPotencia(double X, int n) {
		double resp = X;
		if (n > 1) {
			resp = X * elevarPotencia(X, --n);
		}
		return resp;
	}
	
	public static String escrevePotencia(double X, int n) {
		String resp = String.valueOf(X);
		if (n > 1) {
			resp = X + "^" + n + " = " +
					X + " * " + X + "^" + (n-1) 
					+ " \n" + escrevePotencia(X, --n);
		}
		return resp;
	}

	public static int calculaSomaDecr(int N) {
		int result;
		if (N == 0) {
			result = 0;
		} else {
			result = N + calculaSomaDecr(N - 1);
		}
		return result;

	}

	public static int inverteNum(int num, String texto) {
		if (num < 10) {
			texto = num + "";
		} else {
			texto += num % 10 +
					"" + inverteNum(num / 10, texto);
		}
		return Integer.parseInt(texto);
	}

	public static int somaVetRecursao(int[] vet, int i) {
		int soma = 0;

		if (i < vet.length) {
			soma += vet[i] + somaVetRecursao(vet, (i + 1));
		}
		return soma;
	}

	public static void inverteVet(int[] vet, int i) {
		if (i < vet.length / 2) {
			int aux = vet[i];
			vet[i] = vet[vet.length - i - 1];
			vet[vet.length - i - 1] = aux;
			inverteVet(vet, (i + 1));
		}
	}

	public static int contaKNoVetor(int[] vetor,
			int K, int indice) {
		int cont = 0;
		if (indice == vetor.length) {
			return 0;
		} else {
			if (vetor[indice] == K) {
				cont++;
			}
			cont += contaKNoVetor(vetor, K, (indice + 1));
		}

		return cont;

	}

	public static int[] ordenaVetRecurs(int[] vetor, int posFixa, int posCompara) {
		// Se posFixa sair do vetor, retorna antes do erro
		if (posFixa == vetor.length) {
			return vetor;
		} else {
			// Se posFixa sair do vetor, avança o posFixa
			if (posCompara == vetor.length) {
				ordenaVetRecurs(vetor, posFixa + 1, posFixa + 2);
			} else {
				if (vetor[posCompara] < vetor[posFixa]) {
					int aux = vetor[posFixa];
					vetor[posFixa] = vetor[posCompara];
					vetor[posCompara] = aux;

				}
				ordenaVetRecurs(vetor, posFixa, posCompara + 1);
			}
		}
		return vetor;
	}

	public static int countMultiplos(int[] vetor, int N, int i) {
		int cont = 0;
		if (i == vetor.length) {
			return 0;
		} else {
			if (vetor[i] % N == 0) {
				cont++;
			}

			return cont + countMultiplos(vetor, N, (i + 1));
		}
	}

	public static String exibeMultiplos(int[] vetor, int N, int i) {
		if (i == vetor.length) {
			return "";
		} else {
			if (vetor[i] % N == 0) {
				return "," + String.valueOf(vetor[i]) + exibeMultiplos(vetor, N, (i + 1));
			} else {
				return exibeMultiplos(vetor, N, (i + 1));
			}

		}
	}

	public static int resolveEquacao(int x) {
		int conta;
		if (x == 1) {

			return 2;
		} else {
			conta = resolveEquacao(x - 1);
			conta *= conta;

			return conta;
		}
	}

	public static long resolveEImprimeEquacao(int x, String path) throws IOException {
		long conta;
		if (x == 0) {
			GerenciadorDeArquivos.salvarComAppend(path, "f(" + x + ") = " + 1);
			return 1;
		} else {
			if (x == 1) {
				GerenciadorDeArquivos.salvarComAppend(path, "f(" + x + ") = " + 2);
				return 2;
			} else {
				conta = resolveEImprimeEquacao(x - 1, path);
				conta *= conta;
				GerenciadorDeArquivos.salvarComAppend(path, "f(" + x + ") = " + conta);
				return conta;
			}

		}
	}

	public static int getQtdDivisoresRecurs(int numero, 
			int divisor) {
		int cont = 0;

		if (divisor > 0) {
			if (numero % divisor == 0) {
				cont++;
			}
			return cont + getQtdDivisoresRecurs(numero, divisor - 1);
		} else {
			return 0;
		}

	}

	public static boolean isPrimoRecurs(int numero) {
		int qtdDivisores = getQtdDivisoresRecurs(
				numero, numero);

		if (qtdDivisores == 0) {
			return true;
		} else {
			return false;
		}
	}

	public static int buscaBinaria(int[] vetor, int valorProcurado) {
		int inicio = 0;
		int fim = vetor.length - 1;
		int meio;
		int cont = 0;
		while (inicio <= fim) {
			meio = ((fim + inicio) / 2);
			System.out.println("entrei " + ++cont +
					" vez. valor do meio: " + vetor[meio]);

			if (vetor[meio] < valorProcurado) {
				inicio = meio + 1;
			} else if (vetor[meio] > valorProcurado) {
				fim = meio - 1;
			} else {
				// return meio;
				return cont;
			}
		}
		// return -1;
		System.out.println("não encontrado");
		return cont;
	}

	public static int buscaSequencial(int[] vetor, int valorProcurado) {
		int cont = 0;
		for (int i = 0; i < vetor.length; i++) {
			System.out.println("entrei " + ++cont + " vez. valor comparado: " + vetor[i]);
			if (vetor[i] == valorProcurado) {
				return cont;
			}
		}
		return cont;
	}
}