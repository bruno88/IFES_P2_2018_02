package RevisaoProvaFinal;

import java.util.Scanner;

public class Ex3 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		System.out.println("Digite o num1");
		int num1 = Integer.valueOf(entrada.nextLine());

		System.out.println("Digite o num2");
		int num2 = Integer.valueOf(entrada.nextLine());

		System.out.println("Digite o limite");
		int limite = Integer.valueOf(entrada.nextLine());

		int resultado = contaSomas(num1, num2, limite);
		System.out.println("O método foi chamado " + resultado 
				+ " vezes");
	}

	private static int contaSomas(int num1, int num2, int limite) {
		int cont = 0;
		System.out.println("contaSomas(" 
		+ num1 + "," 
		+ num2 + ","
		+ limite + ")");
		if (num1 + num2 >= limite) {
			cont = 1;
		} else {
			cont = 1 + contaSomas(num1 + num2, num2, limite);
		}
		
		return cont;
	}
}
