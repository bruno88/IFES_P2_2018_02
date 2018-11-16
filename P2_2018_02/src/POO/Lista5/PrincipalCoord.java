package POO.Lista5;

import java.util.Scanner;

import POO.Coordenada;
import POO.GerenciarCoordenada;

public class PrincipalCoord {
	public static void main(String[] args) {
		boolean sair = false;
		Scanner entrada = new Scanner(System.in);
		do {
			try {
			System.out.println("Escolha: \n\n"
					+ "1 - Inserir Coordenada \n"
					+ "2 - Listar todas\n"
					+ "3 - Achar Dist�ncia\n\n"
					+ "0 - Sair");
			int op = Integer.valueOf(entrada.nextLine());
			switch (op) {
			case 1:
				System.out.println("Digite a coordenada X");
				int novoX = Integer.valueOf(entrada.nextLine());
				System.out.println("Digite a coordenada Y");
				int novoY = Integer.valueOf(entrada.nextLine());
				Coordenada novaCoord = new Coordenada(
						novoX, novoY);
				GerenciarCoordenada.addCoordenada(novaCoord);
				break;
			case 2:
				GerenciarCoordenada.listarTodos();
				break;
			case 3:
				System.out.println("1� Coord: Digite X");
				int eixoX = Integer.valueOf(entrada.nextLine());
				System.out.println("1� Coord: Digite Y");
				int eixoY = Integer.valueOf(entrada.nextLine());
				Coordenada coordenada1 = GerenciarCoordenada.consultaCoordenada(eixoX, eixoY);
				if (coordenada1 != null) {
					System.out.println("2� Coord: Digite X");
					eixoX = Integer.valueOf(entrada.nextLine());
					System.out.println("2� Coord: Digite Y");
					eixoY = Integer.valueOf(entrada.nextLine());
					Coordenada coordenada2 = GerenciarCoordenada.
							consultaCoordenada(eixoX, eixoY);
					if (coordenada2 != null) {
						double distancia = GerenciarCoordenada.achaDistancia(
								coordenada1, coordenada2);
						System.out.println(distancia);
					} else {
						System.out.println("2� Coordenada n�o encontrada.");
					}
				} else {
					System.out.println("1� Coordenada n�o encontrada.");
				}
				break;
			case 0:
				System.out.println("Encerrado pelo usuario");
				sair = true;
				break;
			default:
				System.out.println("Entrada inv�lida");
				break;
			}
			} catch (Exception e) {
				System.out.println("Erro: \n");
				e.printStackTrace();
			}
		} while (!sair);
		entrada.close();
	}
}
