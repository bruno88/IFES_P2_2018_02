package POO;

public class Pessoa {
	String nome;
	int codigo, idade;

	public Pessoa(String nome) {
		this.nome = nome;
		int quantidadeAtual = GerenciaPessoa.
				getQuantidade();
		this.codigo = quantidadeAtual+1;
		GerenciaPessoa.setQuantidade(this.codigo);
		
	}
	
	public String toString() {
		return "Nome: " + this.nome +
				" (Código " + this.codigo + ") ";
	}
}
