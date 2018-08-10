package Introdução;

import java.util.Scanner;

public class EntradasSaidas {

	public static void main(String[] args) {

		// Inicializando um novo Scanner
		Scanner entrada = new Scanner(System.in);

		// Fazendo a leitura de um nome (String)
		System.out.println("Digite seu nome: ");
		String saida = entrada.nextLine();

		// Imprimindo a variável "saida"
		System.out.println(saida);

		// Fazendo a leitura de um Double pelo console
		System.out.println("Digite o numero da sua nota");
		double nota = Double.valueOf(entrada.nextLine());

		// Imprimindo a variável "nota"
		System.out.println("Nota: " + nota);
		
		// Fazendo a leitura de um Double pelo console
		System.out.println("Digite a sua idade");
		int idade = Integer.valueOf(entrada.nextLine());
		
		// Imprimindo a variável "nota"
		System.out.println("Idade : " + idade);
		
		// Fechando o Scanner apenas quando temos 
		// certeza que ele não será mais usado
		entrada.close();

	}

}
