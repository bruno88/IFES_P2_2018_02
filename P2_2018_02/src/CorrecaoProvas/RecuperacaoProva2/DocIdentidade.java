package CorrecaoProvas.RecuperacaoProva2;

public class DocIdentidade {
	private String tipo, vencimento;
	private boolean ativo;

	public DocIdentidade(String tipo, String vencimento) {
		super();
		this.tipo = tipo;
		this.vencimento = vencimento;
		this.ativo = true;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getVencimento() {
		return vencimento;
	}

	public void setVencimento(String vencimento) {
		this.vencimento = vencimento;
	}

	public boolean isAtivo() {
		return ativo;
	}

	public void setAtivo(boolean ativo) {
		this.ativo = ativo;
	}

	
	public void ativar() {
		setAtivo(true);
	}
	
	public void desativar() {
		setAtivo(false);
	}

	@Override
	public String toString() {
		return tipo + " (Válido até: " + vencimento + ")";
	}
	
	
}
