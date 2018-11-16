package POO;

public class TesteEstatico {
	public static void main(String[] args) {
		Pessoa ana = new Pessoa("ana");
		Pessoa bruno = new Pessoa("bruno");
		Pessoa caio = new Pessoa("caio");
		
		System.out.println(ana.toString());
		System.out.println(bruno.toString());
		System.out.println(caio.toString());

	}
}
