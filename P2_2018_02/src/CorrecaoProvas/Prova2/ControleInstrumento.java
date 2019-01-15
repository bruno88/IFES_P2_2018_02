package CorrecaoProvas.Prova2;

public class ControleInstrumento {
	private static final int TAM = 100;
	private static int qtdInstr = 0;
	private static Instrumento[] instrumentos =
			new Instrumento[TAM];

	public static void adiciona(Instrumento instr1) {
		instrumentos[qtdInstr++] = instr1;
	}

	public static void remove(Instrumento instr1) {
		Instrumento[] novoVetor = new Instrumento[TAM];
		int novoQtd = 0;
		for (int i = 0; i < qtdInstr; i++) {
			if (!instrumentos[i].equals(instr1)) {
				novoVetor[novoQtd++] = instrumentos[i];
			} else {
				System.out.println(instrumentos[i].getDescricao() +
						" removido com sucesso");
			}
		}
		qtdInstr = novoQtd;
		instrumentos = novoVetor;
	}

	public static Instrumento consulta(int codigo) {
		Instrumento instrumento = null;
		boolean encontrado = false;
		for (int i = 0; !encontrado && i < qtdInstr; i++) {
			if (instrumentos[i].getCodigo() == codigo) {
				instrumento = instrumentos[i];
				encontrado = true;
			}
		}
		return instrumento;
	}

	public static void imprimeTodos() {
		String result = "------ Imprimindo todos os Instrumentos ------\n";
		for (int i = 0; i < qtdInstr; i++) {
			result += instrumentos[i].toString() + "\n";
		}
		System.out.println(result);
	}

	public static int getProximo() {
		return qtdInstr + 1;
	}

	public static boolean fornecedorUsado(Fornecedor f1) {
		boolean isUsado = false;
		for (int i = 0; !isUsado && i < qtdInstr; i++) {
			if(instrumentos[i].getFornecedor().equals(f1)) {
				isUsado = true;
			}
		}
		return isUsado;

	}
}
