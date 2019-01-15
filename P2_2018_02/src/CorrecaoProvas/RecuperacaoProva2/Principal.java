package CorrecaoProvas.RecuperacaoProva2;

public class Principal {
	public static void main(String[] args) {
		DocIdentidade doc1 = new DocIdentidade("Carteira de Motorista", "10/12/2022");
		Pessoa p1 = new Pessoa("Ana", 21, 1.70, 70, doc1);
		ControlePessoa.adicionaPessoa(p1);
	
		System.out.println("====================== testando pessoa inicial ======================");
		ControlePessoa.imprimeTodasPessoas();
		
		DocIdentidade doc2 = new DocIdentidade("2ª via de RG", "10/12/2025");
		p1.adicionarDocIdentidade(doc2);
		DocIdentidade doc3 = new DocIdentidade("Documento com foto", "10/12/2023");
		p1.adicionarDocIdentidade(doc3);
		
		System.out.println("====================== testando pessoa com 3 docs ======================");
		ControlePessoa.imprimeTodasPessoas();
		
		System.out.println("====================== inativando 1 doc ======================");
		doc2.desativar();
		ControlePessoa.imprimeTodasPessoas();
		
		System.out.println("====================== adicionando CPF ======================");
		CPF cpf2 = new CPF(1234, "10/12/2018");
		p1.trocarCPF(cpf2);
		ControlePessoa.imprimeTodasPessoas();
		
		System.out.println("====================== trocando CPF ======================");
		CPF cpf3 = new CPF(4321, "11/12/2018");
		p1.trocarCPF(cpf3);
		ControlePessoa.imprimeTodasPessoas();
		
		System.out.println("====================== FIM DOS TESTES ======================");
		
		
	}
}
