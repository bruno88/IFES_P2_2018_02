package POO.Lista6;

public class Automovel {
	private int codAuto, placa;
	private String marca, modelo, cor;

	// Construtor
	public Automovel(int codAuto, int placa, 
			String marca, String modelo, String cor) {
		this.codAuto = codAuto;
		this.placa = placa;
		this.marca = marca;
		this.modelo = modelo;
		this.cor = cor;
	}

	public int getPlaca() {
		return placa;
	}

	public void setPlaca(int placa) {
		this.placa = placa;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public int getCodAuto() {
		return codAuto;
	}

	@Override
	public String toString() {
		String result = "Automovel "+ this.codAuto + ": " 
	+ this.placa + ".\n";
		result += "Multas: \n" +
				ControleMulta.getMultas(this);
		return result;
	}

}
