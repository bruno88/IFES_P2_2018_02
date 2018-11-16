package POO.Lista5;

public class GerenciaPessoa {
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
		GerenciaPessoa.qtdPessoas = qtdPessoas;
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
	/*
	public static Conta pesquisaPorNumero(Conta[] vetor, 
			int numero) {
		Conta contaEncontrada = null;
		boolean encontrada = false;
		
		for (int i = 0; !encontrada && i < vetor.length; i++) {
			if (vetor[i].getNumero() == numero) {
				contaEncontrada = vetor[i];
				encontrada = true;
			}
		}
		
		return contaEncontrada;

	}
	*/
}
