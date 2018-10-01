package POO;

public class Conta {
	// Atributos : o que definem O QUE É uma Conta
	int numero;
	String titular;
	double saldo, limite;
	
	public void deposita(double valor) {
		this.saldo += valor;
		System.out.println("Depósito de " + valor +
				" realizado com sucesso na conta de "
				+ this.titular +"!");
	}
	
	public double getSaldo() {
		return this.saldo;
	}
}
