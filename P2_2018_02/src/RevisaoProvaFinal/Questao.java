package RevisaoProvaFinal;

public class Questao {
	private String assunto, texto;
	private double pontuacao;

	public Questao(String assunto, String texto, double pontuacao) {
		this.assunto = assunto;
		this.texto = texto;
		this.pontuacao = pontuacao;
	}

	public String getAssunto() {
		return assunto;
	}

	public void setAssunto(String assunto) {
		this.assunto = assunto;
	}

	public String getTexto() {
		return texto;
	}

	public void setTexto(String texto) {
		this.texto = texto;
	}

	public double getPontuacao() {
		return pontuacao;
	}

	public void setPontuacao(double pontuacao) {
		this.pontuacao = pontuacao;
	}

	@Override
	public String toString() {
		return "Questao [assunto=" + assunto + ", texto=" + texto + ", pontuacao=" + pontuacao + "]";
	}

}
