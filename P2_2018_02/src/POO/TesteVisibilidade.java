package POO;

public class TesteVisibilidade {
	public static void main(String[] args) {
		Conta contaBruno = new Conta(1234, "Bruno", 100, 800);
		Conta contaAna = new Conta(4321, "Ana", 300);

		System.out.println("contaBruno.limite = " 
		+ contaBruno.getLimite());
		
		System.out.println("contaAna.limite = " 
				+ contaAna.getLimite());

	}
}