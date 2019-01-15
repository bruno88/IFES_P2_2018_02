package Arquivos;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ControlePessoa {
	private final static int TAM = 100;
	private static int qtdPessoas = 0;
	private static Pessoa[] pessoasCadastradas = new Pessoa[TAM];

	public static int getQtdPessoas() {
		return qtdPessoas;
	}

	public static int getProxCod() {
		return qtdPessoas + 1;
	}
	
	public static Pessoa[] getPessoasCadastradas () {
		return pessoasCadastradas;
	}

	public static void setQtdPessoas(int qtdPessoas) {
		ControlePessoa.qtdPessoas = qtdPessoas;
	}

	public static void adicionaPessoa(Pessoa novaPessoa) {
		pessoasCadastradas[qtdPessoas] = novaPessoa;
		qtdPessoas++;
	}

	public static void imprimeTodasPessoas() {
		for (int i = 0; i < qtdPessoas; i++) {
			System.out.println(pessoasCadastradas[i].toString());
		}
	}
	
	public static void salvar (String fileName, String texto) 
			throws IOException {
		// Neste método, concatena-se o novo texto
		// ao final do arquivo
		// Atenção para segundo parametro "true" (append)
		FileWriter arquivo = new FileWriter(fileName, true);
		BufferedWriter gravador = new BufferedWriter(arquivo);

		gravador.append(texto);
		gravador.newLine();
		gravador.close();
		arquivo.close();
	}

	public static void carregar (String fileName) 
			throws IOException {
		String linha = "";
		FileReader arquivo = new FileReader(fileName);
		BufferedReader leitor = new BufferedReader(arquivo);

		while (linha != null) {
			linha = leitor.readLine();
			if (linha != null) {
				String[] vetor = linha.split(";");
				String nome = vetor[0];
				String CPF = vetor[1];
				int idade = Integer.valueOf(vetor[2]);
				double altura = Double.valueOf(vetor[3]);
				double peso = Double.valueOf(vetor[4]);
				
				Pessoa novaPessoa = new Pessoa(nome,CPF,idade,altura,peso);
				ControlePessoa.adicionaPessoa(novaPessoa);
			}
		}
		
		leitor.close();
		arquivo.close();
	}
}
