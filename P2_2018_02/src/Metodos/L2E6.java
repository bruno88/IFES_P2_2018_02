package Metodos;

import java.util.Scanner;

import Util.Util;

public class L2E6 {
	public static void main(String[] args) {
		final int tam = 3;
		boolean sair = false;
		String result = "";
		String[] sexo = new String[tam];
		String[] corOlhos = new String[tam];
		String[] corCabelos = new String[tam];
		int[] idade = new int[tam];
		int[] vetorQtd = null;
		Scanner entrada = new Scanner(System.in);

		do {
			try {
				System.out.println("Digite uma opção:\n" + "1 - Preenchimento pelo usuário\n"
						+ "2 - Preenchimento automático\n" + "3 - Exibir pessoas por sexo\n"
						+ "4 - Exibir pessoas por cor dos olhos\n" + "5 - Exibir pessoas por cor dos cabelos\n"
						+ "6 - Exibir maior idade\n\n" + "0 - Encerrar o programa");

				int op = Integer.valueOf(entrada.nextLine());

				switch (op) {
				case 1:
					preencheVetoresManual(entrada, sexo, corOlhos, corCabelos, idade);
					result = "Cadasto manual concluido " + "com sucesso !";
					break;

				case 2:
					preencheVetoresAuto(entrada, sexo, corOlhos, corCabelos, idade);
					result = "Cadasto automático concluido " + "com sucesso !";
					break;
				case 3:
					result = "Quantidade (masc.) " + getQtdSexo(sexo, "M");
					result += "\nQuantidade (fem.) " + getQtdSexo(sexo, "F");
					break;
				case 4:
					vetorQtd = getQtdCorOlhos(corOlhos);
					result = "azuis = " + vetorQtd[0] + "\n" + "verdes = " + vetorQtd[1] + "\n" + "castanhos = "
							+ vetorQtd[2];
					break;
				case 5:
					String[] cores = { "louros", "pretos", "castanhos" };
					vetorQtd = getQtdCorCabelos(corCabelos, cores);
					result = "";
					for (int i = 0; i < vetorQtd.length; i++) {
						result += cores[i] + " = " + vetorQtd[i] + "\n";
					}
					break;
				case 6:
					int maiorIdade = Util.getMaiorInt(idade);
					result = "Maior idade = " + maiorIdade;
					break;
				case 7:
					Util.imprimeVetorStr(sexo);
					Util.imprimeVetorStr(corOlhos);
					Util.imprimeVetorStr(corCabelos);
					Util.imprimeVetorInt(idade);
					break;
				case 0:
					result = "Encerrado por comando do usuário";
					sair = true;
					break;
				default:
					result = "Entrada inválida!";
					break;
				}

				// Imprime a mensagem obtida nos cases
				System.out.println(result + "\n");
			} catch (Exception e) {
				System.err.println("Erro na leitura");
			}
		} while (!sair);

		entrada.close();

	}

	private static int getQtdSexo(String[] vetor, String sexo) {
		int qtd = 0;
		for (int i = 0; i < vetor.length; i++) {
			if (vetor[i].equalsIgnoreCase(sexo)) {
				qtd++;
			}
		}
		return qtd;
	}

	private static int[] getQtdCorOlhos(String[] vetor) {
		String[] cores = { "azuis", "verdes", "castanhos" };
		int[] quantidades = new int[3];
		// Falar aqui sobre eficiência do código
		for (int i = 0; i < vetor.length; i++) {
			for (int j = 0; j < cores.length; j++) {
				if (vetor[i].equalsIgnoreCase(cores[j])) {
					quantidades[j]++;
				}
			}
		}

		return quantidades;
	}

	private static int[] getQtdCorCabelos(String[] vetor, String[] vetCorCabelos) {

		int[] quantidades = new int[3];
		// Falar aqui sobre eficiência do código
		for (int i = 0; i < vetor.length; i++) {
			for (int j = 0; j < vetCorCabelos.length; j++) {
				if (vetor[i].equalsIgnoreCase(vetCorCabelos[j])) {
					quantidades[j]++;
				}
			}
		}

		return quantidades;
	}

	private static void preencheVetoresManual(Scanner entrada, String[] vetSexo, String[] vetCorOlhos,
			String[] vetCorCabelos, int[] vetIdade) {

		String sexo = "", corOlhos = "", corCabelos = "";
		int idade = 0;
		boolean continuar = false;
		for (int i = 0; i < vetSexo.length; i++) {
			System.out.println((i + 1) + "ª pessoa: \n");
			// lendo sexo
			while (!continuar) {
				System.out.println("Digite M para masculino " + "e F para feminino");
				sexo = entrada.nextLine();
				if (sexo.equalsIgnoreCase("F") || sexo.equalsIgnoreCase("M")) {
					continuar = true;
				}
			}
			continuar = false;

			// lendo corOlhos
			while (!continuar) {
				System.out.println("Digite azuis, verdes " + "ou castanhos");
				corOlhos = entrada.nextLine();
				if (corOlhos.equalsIgnoreCase("azuis") || corOlhos.equalsIgnoreCase("verdes")
						|| corOlhos.equalsIgnoreCase("castahos")) {
					continuar = true;
				}
			}
			continuar = false;

			// lendo corCabelos
			while (!continuar) {
				System.out.println("Digite louros, pretos " + "ou castanhos");
				corCabelos = entrada.nextLine();
				if (corCabelos.equalsIgnoreCase("louros") || corCabelos.equalsIgnoreCase("pretos")
						|| corCabelos.equalsIgnoreCase("castanhos")) {
					continuar = true;
				}
			}
			continuar = false;

			// lendo idade
			System.out.println("Digite a idade");
			idade = Integer.valueOf(entrada.nextLine());

			// Preenchendo os vetores com mesmo indice:
			vetSexo[i] = sexo;
			vetCorOlhos[i] = corOlhos;
			vetCorCabelos[i] = corCabelos;
			vetIdade[i] = idade;
		}

	}

	private static void preencheVetoresAuto(Scanner entrada, String[] vetSexo, String[] vetCorOlhos,
			String[] vetCorCabelos, int[] vetIdade) {

		String sexo = "", corOlhos = "", corCabelos = "";
		int idade = 0, aleatorio = 0;
		for (int i = 0; i < vetSexo.length; i++) {
			// Gerando sexo
			aleatorio = Util.geraIntAleatorio(1, 2);
			switch (aleatorio) {
			case 1:
				sexo = "M";
				break;
			case 2:
				sexo = "F";
				break;
			}

			// Gerando corOlhos
			aleatorio = Util.geraIntAleatorio(1, 3);
			switch (aleatorio) {
			case 1:
				corOlhos = "azuis";
				break;
			case 2:
				corOlhos = "verdes";
				break;
			case 3:
				corOlhos = "castanhos";
				break;
			}

			// Gerando corCabelos
			aleatorio = Util.geraIntAleatorio(1, 3);
			switch (aleatorio) {
			case 1:
				corCabelos = "louros";
				break;
			case 2:
				corCabelos = "pretos";
				break;
			case 3:
				corCabelos = "castanhos";
				break;
			}

			// Gerando idade
			idade = Util.geraIntAleatorio(1, 105);

			// Preenchendo os vetores com mesmo indice:
			vetSexo[i] = sexo;
			vetCorOlhos[i] = corOlhos;
			vetCorCabelos[i] = corCabelos;
			vetIdade[i] = idade;
		}

	}

}
