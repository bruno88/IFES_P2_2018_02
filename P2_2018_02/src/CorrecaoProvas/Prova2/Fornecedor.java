package CorrecaoProvas.Prova2;

public class Fornecedor {

	private int codigo;
	private String nome, CNPJ;
	
	public Fornecedor(String nome, String CNPJ) {
		this.codigo = ControleFornecedor.getProximo();
		this.nome = nome;
		this.CNPJ = CNPJ;
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

	public String getCNPJ() {
		return CNPJ;
	}

	public void setCNPJ(String cNPJ) {
		CNPJ = cNPJ;
	}

	@Override
	public String toString() {
		return "Fornecedor [codigo=" + codigo + ", nome=" + nome + ", CNPJ=" + CNPJ + "]";
	}
	
	
	
}
