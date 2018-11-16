package POO;

public class GerenciaPessoa {
	private final static int tam = 10;
	private static Pessoa[] pessoas = new Pessoa[tam];
	private static int quantidade = 0;
	
	public static void adicionaPessoa(Pessoa p1) {
		pessoas[quantidade] = p1;
		quantidade++;
	}
	
	public static int getQuantidade() {
		return quantidade;
	}
	
	public static void setQuantidade(int novaQuantidade) {
		quantidade = novaQuantidade;
	}
	
}
