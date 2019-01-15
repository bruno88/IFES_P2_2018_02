package Metodos;

import java.util.Scanner;

import Util.Util;

public class L2E1 {
	public static void main(String[] args) {
		int[] vetor = { 2, 4, 8, 16 };
		//int[] pesos = { 2, 5, 3, 2, 1 };
		String op = "", saida = "";
		double media = 0;
		boolean sair = false;
		Scanner entrada = new Scanner(System.in);
		do {
			System.out.println("Digite:\n\n" 
					+ "A - M�dia Aritm�tica\n" 
					+ "P - M�dia Ponderada\n"
					+ "H - M�dia Harm�nica\n" 
					+ "0 - Encerrar o Programa");

			op = entrada.nextLine();

			switch (op) {
			case "A":
				//media = Util.calculamediaarit(9,2, 6);
				media = Util.calculaMediaArit(vetor);
				saida = "M�dia Aritm�tica = " + media;
				break;
			case "P":
				//media = Util.calculaMediaPond(2,9,1);
				//media = UtilERRADO.calculaMediaPond(vetor, pesos);
				saida = "M�dia Ponderada = " + media;
				break;
			case "H":
				//media = Util.calculaMediaHarmonica(2,4,8);
				//media = UtilERRADO.calculaMediaHarmonica(vetor);
				saida = "M�dia Harm�nica = " + media;
				break;
			case "0":
				sair = true;
				saida = "Programa encerrado por comando do usu�rio!";
				break;
			default:
				saida = "Entrada inv�lida! ";
				break;
			}
			System.out.println(saida);
		} while (!sair);
		
		// Fechando o Scanner
		entrada.close();
	}

}
