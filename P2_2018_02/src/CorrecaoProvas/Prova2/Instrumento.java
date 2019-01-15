package CorrecaoProvas.Prova2;

public class Instrumento {

	private int codigo;
	private String descricao;
	private double valorUnit;
	private Fornecedor fornecedor;
	
	public Instrumento(String descricao, double valorUnit, 
			Fornecedor fornecedor) {
		this.codigo = ControleInstrumento.getProximo();
		this.descricao = descricao;
		this.valorUnit = valorUnit;
		this.fornecedor = fornecedor;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public double getValorUnit() {
		return valorUnit;
	}

	public void setValorUnit(double valorUnit) {
		this.valorUnit = valorUnit;
	}

	public Fornecedor getFornecedor() {
		return fornecedor;
	}

	public void setFornecedor(Fornecedor fornecedor) {
		this.fornecedor = fornecedor;
	}

	public int getCodigo() {
		return codigo;
	}

	@Override
	public String toString() {
		return "Instrumento [codigo=" + codigo + ", descricao=" + descricao + ", valorUnit=" + valorUnit
				+ ", fornecedor=" + fornecedor + "]";
	}
	
	
	
	
}
