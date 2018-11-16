package POO.Lista6;

public class Multa {
	private int codMulta;
	private String hora, data, infracao, local;
	private Automovel veiculoMultado;
	
	// Construtor
	public Multa(String hora, String data, 
			String infracao, String local, 
			Automovel veiculoMultado) {
		this.codMulta = ControleMulta.getQtdMultas() + 1;
		this.hora = hora;
		this.data = data;
		this.infracao = infracao;
		this.local = local;
		this.veiculoMultado = veiculoMultado;
	}

	public String getInfracao() {
		return infracao;
	}

	public void setInfracao(String infracao) {
		this.infracao = infracao;
	}

	public String getLocal() {
		return local;
	}

	public void setLocal(String local) {
		this.local = local;
	}

	public int getCodMulta() {
		return codMulta;
	}

	public String getHora() {
		return hora;
	}

	public String getData() {
		return data;
	}

	public Automovel getVeiculoMultado() {
		return veiculoMultado;
	}

	@Override
	public String toString() {
		return "Multa [codMulta=" + codMulta +
				", hora=" + hora + ", data=" +
				data + ", infracao=" + infracao
				+ ", local=" + local +
				", veiculoMultado=" + veiculoMultado + "]";
	}
	
	
	
	
	
}
