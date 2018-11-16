package POO.Lista6;

public class ControleAutomovel {
	private final static int TAM = 100; 
	private static Automovel[] automoveis = new Automovel[TAM];
	private static int qtdAutomoveis = 0;
	
	public static int getQtdAutomoveis() {
		return qtdAutomoveis;
	}
	
	public static void adicionar(Automovel auto1) {
		automoveis[qtdAutomoveis++] = auto1;
		/*automoveis[qtdAutomoveis] = auto1;
		qtdAutomoveis++;*/
	}
	
	public static void remover(Automovel auto1) {
		Automovel[] novoVetor = new 
				Automovel[automoveis.length];
		int novoQtd = 0;
		
		for (int i = 0; i < qtdAutomoveis; i++) {
			// Se o automovel nesta posição for igual ao automovel passado
			if (!automoveis[i].equals(auto1)) {
				novoVetor[novoQtd++] = automoveis[i];  
			}
		}
		qtdAutomoveis--;
		automoveis = novoVetor;
	}
	
	public static void imprime(Automovel auto1) {
		System.out.println(auto1.toString());

	}
	
	public static Automovel getAutomovel (int codAuto) {
		Automovel autoEncontrado = null;
		boolean encontrou = false;
		for (int i = 0; !encontrou 
				&& i < qtdAutomoveis; i++) {
			if (automoveis[i].getCodAuto() == codAuto){
				autoEncontrado = automoveis[i];
				encontrou = true;
			}
		}
		return autoEncontrado;
	}
	
	public static void imprimeTodos() {
		String result = "Imprimindo Automóveis: \n";
		for (int i = 0; i < qtdAutomoveis; i++) {
			result += automoveis[i].toString() + "\n";
		}
		System.out.println(result);

	}

}
