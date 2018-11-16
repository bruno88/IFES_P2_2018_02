package POO;

public class Coordenada {
	// Atributos
	private int eixoX, eixoY;

	// Construtor
	public Coordenada(
			int eixoX, int eixoY) {
		this.eixoX = eixoX;
		this.eixoY = eixoY;
	}

	// Métodos
	public int getEixoX() {
		return eixoX;
	}

	public void setEixoX(int eixoX) {
		this.eixoX = eixoX;
	}

	public int getEixoY() {
		return eixoY;
	}

	public void setEixoY(int eixoY) {
		this.eixoY = eixoY;
	}

	@Override
	public String toString() {
		return "Coordenada [eixoX=" + eixoX + ", eixoY=" + eixoY + "]";
	}
}
