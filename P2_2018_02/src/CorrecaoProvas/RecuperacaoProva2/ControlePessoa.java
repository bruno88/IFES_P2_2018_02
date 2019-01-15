package CorrecaoProvas.RecuperacaoProva2;

public class ControlePessoa {
	private final static int TAM = 100;
	private static int qtdPessoas = 0;
	private static Pessoa[] pessoasCadastradas = new Pessoa[TAM];
	
	
	public static int getQtdPessoas() {
		return qtdPessoas;
	}
	
	public static int getProxCod() {
		return qtdPessoas+1;
	}

	public static void setQtdPessoas(int qtdPessoas) {
		ControlePessoa.qtdPessoas = qtdPessoas;
	}

	public static void adicionaPessoa(Pessoa novaPessoa) {
		pessoasCadastradas[qtdPessoas] = novaPessoa;
		qtdPessoas++;
	}
	
	public static void imprimeTodasPessoas() {
		for (int i = 0; i < qtdPessoas; i++) {
			System.out.println(pessoasCadastradas[i].toString() + "\n");
		}
	}
}
