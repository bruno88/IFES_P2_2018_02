package Introdução;

import java.util.Scanner;

public class EntradasSaidas {

	public static void main(String[] args) {
Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite seu nome: ");
		String saida = entrada.nextLine();
		
		System.out.println(saida);
		
		
		
		System.out.println("Digite seu nome: ");
		saida = entrada.nextLine();
		
		System.out.println(saida);
		
		entrada.close();

	}

}
