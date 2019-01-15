package Recursividade.Extras;

public class L11E6 {
	public static void main(String[] args) {
		int teste = 300;
		String stringue = String.valueOf(teste);
		char[] aux = stringue.toCharArray();
		int[] vetInt = new int[aux.length];
		for (int i = 0; i < vetInt.length; i++) {
			vetInt[i] = Character.getNumericValue(aux[i]);
		}
		for (int i = 0; i < vetInt.length; i++) {
			System.out.println(vetInt[i] + " ");
		}
	}

}
