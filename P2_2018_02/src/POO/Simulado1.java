package POO;

public class Simulado1 {

	public static void main(String[] args) {
		
		Coordenada c1 = new Coordenada(9, 13);
		
		
		Coordenada c2 = new Coordenada(7, 2);
		
		System.out.println(
				"Dist�ncia euclidiana entre "
				+ "os dois pontos:\n"
				+ GerenciarCoordenada.
						achaDistancia(c1, c2));
		
	}
}
