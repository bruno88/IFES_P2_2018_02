package POO;

import java.util.Scanner;

public class Principal {
	public static void main(String[] args) {
		final int tam = 2;
		
		// Definindo os atributos do Objeto contaBruno
		/*contaBruno.titular = "Bruno";
		contaBruno.numero = 1234;
		contaBruno.saldo = 100;
		contaBruno.limite = 300;
		
		// Definindo os atributos do Objeto contaAna
		contaAna.titular = "Ana";
		contaAna.numero = 4321;
		contaAna.saldo = 800;
		contaAna.limite = 400;*/
		
		// Fazendo uso dos métodos da classe Conta
		/*System.out.println(contaBruno.getSaldo());
		contaBruno.deposita(80);
		System.out.println(contaBruno.getSaldo());
		
		contaAna.deposita(30);
		System.out.println(contaAna.getSaldo());
		*/
		// Criando vetor de Contas
		Scanner entrada = new Scanner(System.in);
		
		//Conta[] contas = new Conta[tam];
		
		/*for (int i = 0; i < contas.length; i++) {
			contas[i] = new Conta();
			System.out.println("Digite o nome do titular da conta " + (i+1));
			//contas[i].getTitular() = entrada.nextLine();
			System.out.println("Digite o saldo da conta " + (i+1));
			contas[i].setNumero(Integer.valueOf(entrada.nextLine()));
		}
		
		for (int i = 0; i < contas.length; i++) {
			contas[i].deposita(100);
			System.out.println(contas[i].getTitular() +
					", Saldo: R$" + contas[i].getSaldo());
		}*/
		
		Conta[] contas = new Conta[tam];
		
		for (int i = 0; i < contas.length; i++) {
			System.out.println("Digite o numero da conta");
			int numero = Integer.valueOf(entrada.nextLine());
			
			System.out.println("Digite o nome do titular");
			String nome = entrada.nextLine();
			
			System.out.println("Digite o saldo");
			double saldo = Double.valueOf(entrada.nextLine());
			
			System.out.println("Digite o limite");
			double limite = Double.valueOf(entrada.nextLine());
			
			Conta novaConta = new Conta(
					numero, nome, saldo, limite);
			contas[i] = novaConta;
		}
		
		System.out.println(contas[0].toString());
		System.out.println(contas[1].toString());
		contas[0].transferePara(contas[1], 100);
		System.out.println(contas[0].toString());
		System.out.println(contas[1].toString());
		
		
	}
}
