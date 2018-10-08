package POO;

public class Conta {
	// Atributos : o que definem O QUE É uma Conta
	private int numero;
	private String titular;
	private double saldo, limite;
	private boolean status;

	// 3 Construtores
	public Conta() {
		this.numero = 999;
		this.titular = null;
		this.saldo = 0;
		this.limite = 500;
		this.status = true;
	}

	public Conta(int numero, String titular, double saldo) {
		this.numero = numero;
		this.titular = titular;
		this.saldo = saldo;
		this.limite = 500;
		this.status = true;
	}

	public Conta(int numero, String titular, double saldo, double limite) {
		this.numero = numero;
		this.titular = titular;
		this.saldo = saldo;
		this.limite = limite;
		this.status = true;
	}

	// Métodos:
	public double getSaldo() {
		return this.saldo;
	}

	public double getLimite() {
		return this.limite;
	}

	public String getTitular() {
		return this.titular;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		// Validar o cargo de quem pediu
		this.numero = numero;
	}

	/*
	 * public boolean saca(double valor) { boolean sucesso = false; // Verificando
	 * se a Conta tem saldo //if (valor <= this.saldo + this.limite) { if
	 * (validaSaldo(valor)) { this.saldo -= valor; System.out.println(valor +
	 * " sacado com sucesso!"); sucesso = true; } else {
	 * System.out.println("Não foi possível realizar o saque!"); }
	 * 
	 * return sucesso;
	 * 
	 * }
	 */

	public void deposita(double valor) {
		this.saldo += valor;
	}

	public int saca(double valor) {
		int resultado;
		// Verificando se a Conta tem saldo
		if (this.status) {
			if (valor <= this.saldo) {
				this.saldo -= valor;
				resultado = 1;
			} else if (valor <= this.saldo + this.limite) {
				this.saldo -= valor;
				resultado = 2;
			} else {
				resultado = 3;
			}
		} else {
			resultado = 4;
		}

		return resultado;

	}

	public boolean validaSaldo(double valor) {
		boolean valido = false;
		if (valor <= this.saldo + this.limite) {
			valido = true;
		}
		return valido;
	}

	public void inverteConta() {
		if (this.status) {
			this.status = false;
		} else {
			this.status = true;
		}
	}

	public boolean getStatus() {
		return this.status;
	}

	public void transferePara(Conta contaDestino, double valor) {
		int retorno = this.saca(valor);
		// Somente faz o depósito na conta destino
		// Se o saque na conta de origem
		// foi bem sucedido
		if (retorno == 1 || retorno == 2) {
			contaDestino.deposita(valor);
			System.out.println("Transferência realizada com sucesso");
		} else {
			System.out.println("Não foi possível realizar a transferencia!");
		}
	}

	@Override
	public String toString() {
		String status = "";
		if (this.status) {
			status = "Ativa";
		} else {
			status = "Inativa";
		}
		return "Imprimindo dados da Conta do " + titular + ":\n" + "Número = " + numero + "\n" + "Saldo atual = "
				+ saldo + "\n" + "Limite disponível = " + limite + "\n" + "(Conta " + status + ").";
	}

}
