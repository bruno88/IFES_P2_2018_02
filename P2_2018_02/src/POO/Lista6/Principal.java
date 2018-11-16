package POO.Lista6;

public class Principal {
	public static void main(String[] args) {
		// Criando e adicionando Automoveis
		Automovel auto1 = new Automovel(1, 12345, "Fiat", "Fire", "Preto");
		ControleAutomovel.adicionar(auto1);
		Automovel auto2 = new Automovel(2, 54321, "Ford", "Ka", "Cinza");
		ControleAutomovel.adicionar(auto2);
		Automovel auto3 = new Automovel(8, 95147, "Nissan", "Kicks", "Branco");
		ControleAutomovel.adicionar(auto3);
		
		// Testando os m�todos de Automovel
		System.out.println("----------- testando Automoveis -----------");
		ControleAutomovel.imprime(auto1);
		ControleAutomovel.imprimeTodos();
		ControleAutomovel.remover(auto2);		
		ControleAutomovel.imprimeTodos();
		
		// Criando e adicionando Multas

		// Busca de autom�vel por c�digo
		/*System.out.println("Digite o c�digo do automovel");
		//int codigo = Integer.valueOf(entrada.nextLine());
		Automovel consultado = ControleAutomovel.
				getAutomovel(codigo);
		if (consultado != null) {
			Multa multa1 = new Multa("13:52", "11/11/2018", 
					"Atropelou um pedestre", 
					"Patrim�nio", consultado);
			ControleMulta.adicionar(multa1);	
		} else {
			System.out.println("C�digo de autom�vel n�o encontrado");
		}*/
		Multa multa1 = new Multa("13:52", "11/11/2018", 
				"Atropelou um pedestre", 
				"Patrim�nio", auto1);
		ControleMulta.adicionar(multa1);
		// Cria��o autom�tica, pra facilitar
		Multa multa2 = new Multa("14:52", "12/11/2018", 
				"Furou sinal vermelho", "S�o Roque", auto3);
		ControleMulta.adicionar(multa2);
		Multa multa3 = new Multa("15:52", "13/11/2018", 
				"Furou sinal vermelho", "Santa Teresa", auto3);
		ControleMulta.adicionar(multa3);
		Multa multa4 = new Multa("16:52", "14/11/2018", 
				"Invadiu a cal�ada", "Fund�o", auto1);
		ControleMulta.adicionar(multa4);
		
		System.out.println("----------- testando Multas -----------");
		// Testando os m�todos de Multa 
		ControleAutomovel.imprimeTodos();
	}
}
