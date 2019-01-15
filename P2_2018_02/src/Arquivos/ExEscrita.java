package Arquivos;

import java.io.IOException;

public class ExEscrita {
	public static void main(String[] args) {
		final String fileName = "Pessoas.txt";
		Pessoa p1 = new Pessoa("Bruno", "123", 28, 1.77, 100);
		ControlePessoa.adicionaPessoa(p1);
		Pessoa p2 = new Pessoa("Ana", "321", 28, 1.77, 100);
		ControlePessoa.adicionaPessoa(p2);
		Pessoa p3 = new Pessoa("Caio", "213", 28, 1.77, 100);
		ControlePessoa.adicionaPessoa(p3);
		Pessoa p4 = new Pessoa("Davyd", "213", 28, 1.77, 100);
		ControlePessoa.adicionaPessoa(p4);
		try {
			Pessoa[] pessoas = ControlePessoa.getPessoasCadastradas();
			for (int i = 0; i < ControlePessoa.getQtdPessoas(); i++) {
				ControlePessoa.salvar(fileName, pessoas[i].toSave());
				System.out.println("Arquivo salvo com sucesso");
			}
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
