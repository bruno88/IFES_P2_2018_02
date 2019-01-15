package Recursividade;

public class Ex2 {
	public static void main(String[] args) {
		final int numVezes = 4;
		imprimeProgramacao(numVezes);
		System.out.println(imprimeRecursivo(numVezes));
	}
	private static String imprimeRecursivo(int numVezes) {
		String result = "";
		
		// Ou entra na condição de parada,
		// logo encerra recursividade
		if (numVezes == 0) {
			result = "";
		// Ou não entra na condição de parada
		// logo chama novamente o método recursivo
		} else {
			result = numVezes + " - Eu amo programação\n" + 
					imprimeRecursivo (numVezes-1);
		}
		return result;
	}
	
	private static void imprimeProgramacao(int numVezes) {
		for (int i = 0; i < numVezes; i++) {
			System.out.println(i + " - Eu adoro programação !");
		}
	}
}
