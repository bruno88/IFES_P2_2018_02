package POO.Lista6;

public class ControleMulta {
	private final static int TAM = 100; 
	private static Multa[] multas = new Multa[TAM];
	private static int qtdMultas = 0;
	
	public static int getQtdMultas() {
		return qtdMultas;
	}
	
	public static void adicionar(Multa multa1) {
		multas[qtdMultas++] = multa1;
	}
	
	public static void remover(Multa multa1) {
		Multa[] novoVetor = new Multa[multas.length];
		int novoQtd = 0;
		
		for (int i = 0; i < qtdMultas; i++) {
			// Se a multa nesta posição for igual 
			// a multa passada
			if (!multas[i].equals(multa1)) {
				novoVetor[novoQtd++] = multas[i];  
			} else {
				qtdMultas--;
			}
		}
		
		multas = novoVetor;
	}
	
	public static Multa getMulta(int codMulta) {
		Multa multaEncontrada = null;
		boolean encontrou = false;
		for (int i = 0; !encontrou 
				&& i < qtdMultas; i++) {
			if (multas[i].getCodMulta() == codMulta){
				multaEncontrada = multas[i];
				encontrou = true;
			}
		}
		return multaEncontrada;
	}

	public static String getMultas(Automovel auto1) {
		String result = "";
		int multasEncontradas = 0;
		for (int i = 0; i < qtdMultas; i++) {
			if (multas[i].getVeiculoMultado().
					equals(auto1)) {
				multasEncontradas++;
				result += "Multa " + multas[i].getCodMulta() 
						+ ": " + multas[i].getData() + "\n";  
			}
		}
		if (multasEncontradas == 0) {
			result = "Nenhuma multa encontrada";
		} 
		return result;
	}

}
