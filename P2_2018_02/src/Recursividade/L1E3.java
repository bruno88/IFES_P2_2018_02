package Recursividade;

import java.io.IOException;
import java.util.Scanner;

import Util.GerenciadorDeArquivos;

public class L1E3 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		int num1 = 0;
		int num2 = 1;

		System.out.println("Informe o primeiro número");
		num1 = Integer.valueOf(entrada.nextLine());
		System.out.println("Informe o segundo número");
		num2 = Integer.valueOf(entrada.nextLine());

		// Calculo do MDC
		int result = calculaMDC(num1, num2);
		String paraArquivo = "MDC de " + num1 + " e " + num2 + " = " + result + "\n"; 
			
		// Calculo do MMC
		result = calculaMMC(num1, num2);
		paraArquivo += "MMC de " + num1 + " e " + num2 + " = " + result;
		try {
			// Salvando
			GerenciadorDeArquivos.salvarComAppend("continhaMMC_MDC.txt", paraArquivo);
			System.out.println("Arquivo salvo");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		entrada.close();
	}

	private static int calculaMMC(int num1, int num2) {

		return num1 * (num2 /
				calculaMDC(num1, num2));
	}

	private static int calculaMDC(int num1, 
			int num2) {
		int resultado = 0;
		
		if (num1 % num2 == 0) {
			resultado =  num2;
		} else {
			resultado = calculaMDC(num2, 
					num1 % num2);
		}
		return resultado;

	}
}
