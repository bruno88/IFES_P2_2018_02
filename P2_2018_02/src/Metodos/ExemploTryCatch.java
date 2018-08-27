package Metodos;

import java.util.Scanner;

public class ExemploTryCatch {
	public static void main(String[] args) {
		boolean sair = false;
		Scanner entrada = new Scanner(System.in);
		do {
			try {
				System.out.println("Digite: \n" 
						+ "1 - Para somar\n"
						+ "2 - Para dividir\n\n" 
						+ "0 - Para Sair");
				int op = Integer.valueOf(entrada.nextLine());

				switch (op) {
				case 1:
					System.out.println("Digite num1");
					int num1 = Integer.valueOf(entrada.nextLine());
					System.out.println("Digite num2");
					int num2 = Integer.valueOf(entrada.nextLine());
					System.out.println(soma(num1, num2));
					break;
				case 2:
					System.out.println("Digite num3");
					int num3 = Integer.valueOf(entrada.nextLine());
					System.out.println(dividir(num3));
				default:
					break;
				}
			} 
			catch (ArithmeticException e) {
				System.err.println("Deu ruim em matematica\n");
			
			}catch (Exception e) {
				System.err.println("Deu ruim !\n");

			}
		} while (!sair);

		entrada.close();
	}

	private static double dividir(int num3) throws ArithmeticException {
		return num3/0;
	}

	private static int soma(int num1, int num2) {
		return num1 + num2;

	}
}
