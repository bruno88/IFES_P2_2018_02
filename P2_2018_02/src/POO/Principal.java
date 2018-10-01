package POO;

import java.util.Scanner;

public class Principal {
	public static void main(String[] args) {
		final int tam = 3;
		Conta contaBruno = new Conta();
		Conta contaAna = new Conta();
		
		// Definindo os atributos do Objeto contaBruno
		contaBruno.titular = "Bruno";
		contaBruno.numero = 1234;
		contaBruno.saldo = 100;
		contaBruno.limite = 300;
		
		// Definindo os atributos do Objeto contaAna
		contaAna.titular = "Ana";
		contaAna.numero = 4321;
		contaAna.saldo = 800;
		contaAna.limite = 400;
		
		// Fazendo uso dos métodos da classe Conta
		/*System.out.println(contaBruno.getSaldo());
		contaBruno.deposita(80);
		System.out.println(contaBruno.getSaldo());
		
		contaAna.deposita(30);
		System.out.println(contaAna.getSaldo());
		*/
		// Criando vetor de Contas
		Scanner entrada = new Scanner(System.in);
		
		Conta[] contas = new Conta[tam];
		
		for (int i = 0; i < contas.length; i++) {
			contas[i] = new Conta();
			System.out.println("Digite o nome do titular da conta " + (i+1));
			contas[i].titular = entrada.nextLine();
			System.out.println("Digite o saldo da conta " + (i+1));
			contas[i].saldo = Integer.valueOf(entrada.nextLine());
		}
		
		for (int i = 0; i < contas.length; i++) {
			contas[i].deposita(100);
			System.out.println(contas[i].titular + ", Saldo: R$" + contas[i].saldo);
		}
	}
}
