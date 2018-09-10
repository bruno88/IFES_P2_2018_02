package Metodos;

import java.util.Scanner;

import Util.Util;

public class L3E2 {
	public static void main(String[] args) {
		int op = 0, loginsCadastrados = 0;
		String novoLogin = "", novaSenha = "";

		// lê o número máximo de contas 
		// permitidas no sistema
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite a quantidade máxima de contas: ");
		int N = Integer.valueOf(entrada.nextLine());

		String[] login = new String[N], senhas = new String[N];

		do {
			try {				
				System.out.println("Digite a opção desejada:\n" 
						+ "\n1 - Cadastrar usuário" 
						+ "\n2 - Fazer Login"
						+ "\n3 - Recuperar senha" 
						+ "\n4 - Definir nova senha" 
						+ "\n\n0 - Sair");

				op = Integer.parseInt(entrada.nextLine());
				//op = Integer.valueOf(entrada.nextLine());

				switch (op) {
				case 1:
					System.out.println("Digite seu nome de usuário");
					novoLogin = entrada.nextLine();
					System.out.println("Digite sua senha");
					novaSenha = entrada.nextLine();

					login[loginsCadastrados] = novoLogin;
					senhas[loginsCadastrados] = novaSenha;
					loginsCadastrados++;

					System.out.println("Cadastro realizado com sucesso");
					break;
				case 2:
					System.out.println("Digite seu nome de usuário");
					novoLogin = entrada.nextLine();

					if (Util.isOnArray(login, novoLogin)) {
						System.out.println("Digite sua senha");
						novaSenha = entrada.nextLine();
						
						int index = Util.getIndexOf(login, novoLogin);
						if (senhas[index].equalsIgnoreCase(novaSenha)) {
							System.out.println("Login realizado com sucesso !");
						} else {
							System.out.println("Senha incorreta");
						}

					} else {
						System.out.println("Nome de usuário não encontrado");
					}

					break;
				case 3:
					System.out.println("Digite seu nome de usuário");
					novoLogin = entrada.nextLine();
					if (Util.isOnArray(login, novoLogin)) {
						System.out.println("Sua senha é : " 
								+ senhas[Util.getIndexOf(login, novoLogin)]);
					} else {
						System.out.println("Nome de usuário não encontrado");
					}

					break;
				case 4:
					System.out.println("Digite seu nome de usuário");
					novoLogin = entrada.nextLine();

					if (Util.isOnArray(login, novoLogin)) {
						int indiceLogin = Util.getIndexOf(login, novoLogin); 
						System.out.println("Digite sua senha");
						novaSenha = entrada.nextLine();
						if (senhas[indiceLogin].
								equalsIgnoreCase(novaSenha)) {
							System.out.println("Digite a nova senha");
							novaSenha = entrada.nextLine();

							senhas[indiceLogin] = novaSenha;

							System.out.println("Senha alterada com sucesso");
						} else {
							System.out.println("Senha incorreta");
						}
					} else {
						System.out.println("Nome de usuário não encontrado");
					}

					break;
				case 0:
					System.out.println("Programa encerrado por comando do usuário");
					break;
				default:
					System.out.println("Entrada inválida");
					break;
				}
			
			} catch (Exception e) {
				System.out.println("Ocorreu um erro geral no programa");
				e.printStackTrace();
			}
		} while (op != 0);
		entrada.close();

	}

}
