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
		
		// Testando os métodos de Automovel
		System.out.println("----------- testando Automoveis -----------");
		ControleAutomovel.imprime(auto1);
		ControleAutomovel.imprimeTodos();
		ControleAutomovel.remover(auto2);		
		ControleAutomovel.imprimeTodos();
		
		// Criando e adicionando Multas

		// Busca de automóvel por código
		/*System.out.println("Digite o código do automovel");
		//int codigo = Integer.valueOf(entrada.nextLine());
		Automovel consultado = ControleAutomovel.
				getAutomovel(codigo);
		if (consultado != null) {
			Multa multa1 = new Multa("13:52", "11/11/2018", 
					"Atropelou um pedestre", 
					"Patrimônio", consultado);
			ControleMulta.adicionar(multa1);	
		} else {
			System.out.println("Código de automóvel não encontrado");
		}*/
		Multa multa1 = new Multa("13:52", "11/11/2018", 
				"Atropelou um pedestre", 
				"Patrimônio", auto1);
		ControleMulta.adicionar(multa1);
		// Criação automática, pra facilitar
		Multa multa2 = new Multa("14:52", "12/11/2018", 
				"Furou sinal vermelho", "São Roque", auto3);
		ControleMulta.adicionar(multa2);
		Multa multa3 = new Multa("15:52", "13/11/2018", 
				"Furou sinal vermelho", "Santa Teresa", auto3);
		ControleMulta.adicionar(multa3);
		Multa multa4 = new Multa("16:52", "14/11/2018", 
				"Invadiu a calçada", "Fundão", auto1);
		ControleMulta.adicionar(multa4);
		
		System.out.println("----------- testando Multas -----------");
		// Testando os métodos de Multa 
		ControleAutomovel.imprimeTodos();
	}
}
