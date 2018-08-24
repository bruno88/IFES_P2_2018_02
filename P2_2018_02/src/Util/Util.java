package Util;

public class Util {
	public static int geraIntAleatorio(int min, int max) {
		int numAleatorio = min + (int) (Math.random() * ((max - min) + 1));

		return numAleatorio;

	}

	public static void imprimeString(String texto) {
		System.out.println(texto);

	}
	
	public static double calculaMediaHarmonica(int num1,int num2,int num3) {
		int numerador = 3;
		double denominador = (1/num1)+(1/num2)+(1/num3);

		return numerador / denominador;
	}
	
	/**
	 * @author Bruno Clemente
	 * @param vetor
	 *            = vetor a ser impresso
	 * @return void
	 */
	/**
	 * Método utilizado para calcular média 
	 * Harmonica de um vetor de inteiros
	 * <br/>
	 * Média Harmonica: Caso de teste: {2,4,8,16}
	 * <br/>
	 * Resultado = 64/15 = 4.26666666667
	 * 
	 * @author: Bruno Clemente
	 * @param vetor = Vetor de inteiros
	 * @return Média Harmônica do vetor passado
	 */
	public static double calculaMediaHarmonica(int[] vetor) {
		int numerador = vetor.length;
		double denominador = 0;

		for (int i = 0; i < vetor.length; i++) {
			denominador += (1.0 / vetor[i]);
		}

		return numerador / denominador;
	}
	
	

	public static double calculaMediaArit(int num1, 
						int num2, int num3) {
		double conta = (double) (num1 + num2 + num3) / 3;
		return conta;
	}
	
	public static double calculaMediaArit(int[] vetor) {
		int soma = 0;
		for (int i = 0; i < vetor.length; i++) {
			soma += vetor[i];
		}
		return (double) soma / vetor.length;
	}

	public static double calculaMediaPond(int num1, int num2, int num3) {
		int peso1 = 5, peso2 = 3, peso3 = 2;
		int numerador = 0, denominador = 0;

		numerador = (num1*peso1)+(num2*peso2)+(num3*peso3);
		denominador = (peso1 + peso2 + peso3);
		
		return (double) numerador / denominador;
	}
	
	public static double calculaMediaPond(int[] numeros, int[] pesos) {
		int numerador = 0, denominador = 0;
		double mediaPond = 0;

		for (int i = 0; i < numeros.length; i++) {
			numerador += (numeros[i] * pesos[i]);
			denominador += pesos[i];
		}
		System.out.println("num = " + numerador);
		System.out.println("denominador = " + denominador);
		mediaPond = (double) numerador / denominador;
		return mediaPond;
	}

}
