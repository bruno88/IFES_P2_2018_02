package CorrecaoProvas.Prova2;

public class ControleFornecedor {
	private static final int TAM = 100;
	private static int qtdForn = 0;
	private static Fornecedor[] fornecedores =
			new Fornecedor[TAM];

	public static void adiciona(Fornecedor f1) {
		fornecedores[qtdForn++] = f1;
	}

	public static void remove(Fornecedor f1) {
		Fornecedor[] novoVetor = new Fornecedor[TAM];
		boolean removido = false;
		int novoQtd = 0;
		for (int i = 0; !removido && i < qtdForn; i++) {
			if (!fornecedores[i].equals(f1)) {
				novoVetor[novoQtd++] = fornecedores[i];
			} else {
				// Verificar se o fornecedor está sendo usado
				if (!ControleInstrumento.fornecedorUsado(f1)) {
					removido = true;
					System.out.println(fornecedores[i].getNome() 
							+ " removido com sucesso");
				} else {
					novoVetor[novoQtd++] = fornecedores[i];
					System.out.println(fornecedores[i].getNome() 
							+ " não pode ser removido, pois está "
							+ "vinculado à um Instrumento");
				}

			}
		}
		qtdForn = novoQtd;
		fornecedores = novoVetor;
	}

	public static Fornecedor consulta(int codigo) {
		Fornecedor fornecedor = null;
		boolean encontrado = false;
		for (int i = 0; !encontrado && i < qtdForn; i++) {
			if (fornecedores[i].getCodigo() == codigo) {
				fornecedor = fornecedores[i];
				encontrado = true;
			}
		}
		return fornecedor;
	}

	public static void imprimeTodos() {
		String result = "------ Imprimindo todos os Fornecedores ------\n";
		for (int i = 0; i < qtdForn; i++) {
			result += fornecedores[i].toString() + "\n";
		}
		System.out.println(result);
	}

	public static int getProximo() {
		return qtdForn + 1;
	}

}
