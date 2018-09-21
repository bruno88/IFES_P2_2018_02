package Metodos;

import java.util.Scanner;

public class L3E4 {
	public static void main(String[] args) {
		String[] nomeOperHist = new String [100];
		double[] valorOperHist = new double [100];
		int qtdTransacoes = 0;
		int op = 0;
		double valor, saldo = 0;
		
		
		Scanner entrada = new Scanner(System.in);
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Long.MAX_VALUE);
		
		do {
			try {
				System.out.println("Digite a op��o desejada:\n" 
						+ "\n1 - Realizar Saque" 
						+ "\n2 - Realizar Dep�sito"
						+ "\n3 - Consultar Transa��es" 
						+ "\n\n0 - Sair");

				op = Integer.parseInt(entrada.nextLine());

				switch (op) {
				// 1 - Realizar Saque
				case 1:
					System.out.println("Digite o valor a ser sacado");
					valor = Double.parseDouble(entrada.nextLine());
					
					// Deduz da Conta Corrente
					saldo -= valor;
					
					// Hist�rico
					salvaHistorico("Saque", valor, 
								nomeOperHist, valorOperHist,
								qtdTransacoes);
					qtdTransacoes++;
					
					System.out.println("Saque realizado com sucesso");
					System.out.println("Valor do saque: " + valor);
					break;
				case 2:
					System.out.println("Digite o valor a ser depositado");
					valor = Double.parseDouble(entrada.nextLine());
					
					// Soma na Conta Corrente
					saldo += valor;
					
					// Hist�rico
					salvaHistorico("Dep�sito", valor, 
							nomeOperHist, valorOperHist,
							qtdTransacoes);
					qtdTransacoes++;
					
					System.out.println("Dep�sito realizado com sucesso");
					System.out.println("Valor do Dep�sito: " + valor);
					break;
				case 3:
					imprimeHistorico(nomeOperHist, valorOperHist,
							qtdTransacoes);
					System.out.println("Saldo Atual: " + saldo);
					break;

				case 0:
					System.out.println("Programa encerrado por comando do usu�rio");
					break;
					
				default:
					System.out.println("C�digo inv�lido!");
					break;
				}

			} catch (Exception e) {
				System.out.println("Ocorreu um erro no processamento: " + e);
			}
		} while (op != 0);
		entrada.close();

	}

	private static void salvaHistorico(String operacao, double valor, String[] nomeOperHist, double[] valorOperHist,
			int qtdTransacoes) {
		nomeOperHist[qtdTransacoes] = operacao;
		valorOperHist[qtdTransacoes] = valor;

	}

	private static void imprimeHistorico(String[] nomeOperHist, double[] valorOperHist, int qtdTransacoes) {
		System.out.println("Listando transa��es:\n");
		for (int i = 0; i < qtdTransacoes; i++) {
			System.out.println("Opera��o " + (i + 1) +
					": " + nomeOperHist[i] + " no valor de: " 
					+ valorOperHist[i]);
		}
		System.out.println();

	}

}
