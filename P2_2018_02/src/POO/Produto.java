package POO;

public class Produto {
	private int codigo;
	private String nome, unidade;
	private double preco;

	public Produto(String nome, double preco, String unidade) {
		this.codigo = 1;
		this.nome = nome;
		this.preco = preco;
		this.unidade = unidade;

	}

	public int getCodigo() {
		return codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getUnidade() {
		return unidade;
	}

	public void setUnidade(String unidade) {
		this.unidade = unidade;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	@Override
	public String toString() {
		return "Imprimindo dados do produto (Cód "+ this.codigo + "): \n" +
				"Nome: " + this.nome + "\n" +
				"Preço: " + this.preco + "\n" +
				"Unidade: " + this.unidade + "\n";
	}

}