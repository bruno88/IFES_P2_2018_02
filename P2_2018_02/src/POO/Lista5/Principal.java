package POO.Lista5;

public class Principal {
	public static void main(String[] args) {
		Pessoa pessoa1 = new Pessoa(1234, 29102018, "Ana", "Clemente", "bruno@a.b.c");
		GerenciaPessoa.adicionaPessoa(pessoa1);
		Pessoa pessoa2 = new Pessoa(1234, 29102018, "Bruno", "Clemente", "bruno@a.b.c");
		GerenciaPessoa.adicionaPessoa(pessoa2);
		Pessoa pessoa3 = new Pessoa(1234, 29102018, "Caio", "Clemente", "bruno@a.b.c");
		GerenciaPessoa.adicionaPessoa(pessoa3);

		System.out.println(pessoa1.toString());
		System.out.println(pessoa2.toString());
		System.out.println(pessoa3.toString());
		
		GerenciaPessoa.imprimeTodasPessoas();
		
	}
}
