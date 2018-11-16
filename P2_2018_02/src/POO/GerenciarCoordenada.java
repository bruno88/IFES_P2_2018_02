package POO;

public class GerenciarCoordenada {
	private final static int tam = 1000;
	private static int qtdCoord = 0;
	private static Coordenada[] coordenadas = 
			new Coordenada[tam];

	public static Coordenada[] getCoordenadas() {
		return GerenciarCoordenada.coordenadas;
	}

	public static void setCoordenadas(Coordenada[] coordenadas) {
		GerenciarCoordenada.coordenadas = coordenadas;
	}

	public static void addCoordenada(
			Coordenada c1) {
		coordenadas[qtdCoord] = c1;
		qtdCoord++;
	}
	
	public static Coordenada consultaCoordenada(
			int eixoX, int eixoY) {
		Coordenada coordEncontrada = null;
		boolean encontrou = false;
		for (int i = 0; !encontrou 
				&& i < qtdCoord; i++) {
			if ((coordenadas[i].getEixoX() == eixoX)
				&& (coordenadas[i].getEixoY() 
						== eixoY)){
				coordEncontrada = coordenadas[i];
				encontrou = true;
			}
		}
		return coordEncontrada;
		
	}
	
	public static double achaDistancia(Coordenada c1,
									Coordenada c2) {
		 double distancia = 
				Math.sqrt(
						Math.pow(
								(c1.getEixoX() - 
								c2.getEixoX()),2 ) +
						Math.pow(
								(c1.getEixoY() - 
								c2.getEixoY()),2 )
						);
		
		return distancia;
	}

	public static void listarTodos() {
		String result = "";
		for (int i = 0; i < qtdCoord; i++) {
			result += coordenadas[i].toString() + "\n";
		}
		System.out.println(result);
		
	}
	

}
