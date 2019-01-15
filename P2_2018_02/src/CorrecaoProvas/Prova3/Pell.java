package CorrecaoProvas.Prova3;

import java.io.IOException;
import java.util.Scanner;

public class Pell {
	public static void main(String[] args) {
		//final String fileName = "src/Arquivos/Saida/pell.txt";
		final String fileName = "pell.txt";
		Scanner entrada = new Scanner(System.in);
		int num = 0;
		do {
			try {
				System.out.println("Digite o N");
				num = Integer.valueOf(entrada.nextLine());
				int valorPell = pell(num);
				String result =
						"Pell(" + num + ") = " + valorPell;
				System.out.println(result);

				Util.GerenciadorDeArquivos.salvarComAppend
					(fileName, result);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} while (num != 99);

		entrada.close();

	}

	private static int pell(int num) {
		int result = 0;

		if (num == 0) {
			result = 0;
		} else {
			if (num == 1) {
				result = 1;
			} else {
				result = (2 * pell(num - 1) + pell(num - 2));
			}
		}

		return result;
	}
}
