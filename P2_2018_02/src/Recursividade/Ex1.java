package Recursividade;

import java.util.Scanner;

public class Ex1 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite o numero do fatorial: ");
		int numero = Integer.valueOf(entrada.nextLine());
		int resultado = calcularFatorial(numero);
		System.out.println("Resultado de : " + numero + "! = "
				+ resultado);
		entrada.close();
	}

	private static int calcularFatorial(int numero) {
		int resultado;
//		if (numero == 0) {
//			resultado = 1;
//		} else {
			resultado = numero * calcularFatorial(numero - 1);
		//}
		
		return resultado;
	}
}
