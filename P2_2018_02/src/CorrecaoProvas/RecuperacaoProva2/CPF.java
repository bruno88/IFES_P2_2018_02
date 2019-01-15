package CorrecaoProvas.RecuperacaoProva2;

public class CPF {
	private int numero;
	private String dataEmissao;
	
	public CPF(int numero, String dataEmissao) {
		super();
		this.numero = numero;
		this.dataEmissao = dataEmissao;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getDataEmissao() {
		return dataEmissao;
	}

	public void setDataEmissao(String dataEmissao) {
		this.dataEmissao = dataEmissao;
	}

	@Override
	public String toString() {
		return "CPF [numero=" + numero + ", dataEmissao=" + dataEmissao + "]";
	}
	
	
}
