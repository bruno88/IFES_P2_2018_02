package CorrecaoProvas.RecuperacaoProva2;

public class Pessoa {
	private final int TAM = 10;
	private String nome;
	private int idade, qtdIDs = 0;
	private double altura, peso;
	private DocIdentidade[] IDs = new DocIdentidade[TAM];
	private CPF CPF;
	
	public Pessoa(String nome, int idade, double altura, double peso, DocIdentidade iDs) {
		super();
		this.nome = nome;
		this.idade = idade;
		this.altura = altura;
		this.peso = peso;
		this.IDs[qtdIDs++] = iDs;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public int getQtdIDs() {
		return qtdIDs;
	}

	public void setCPF(CPF cpf) {
		this.CPF = cpf;
	}
	
	public CPF getCPF() {
		return CPF;
	}
	
	public void adicionarDocIdentidade(DocIdentidade ID) {
		this.IDs[qtdIDs++] = ID;		
	}
	
	public void trocarCPF(CPF cpf) {
		setCPF(cpf);
	}

	@Override
	public String toString() {
		String CPF, IDs = "", result; 
		
		result = "Nome: " + nome + "\n" + 
			"Idade: " + idade +  "\n" +
			"Altura: " + altura +  "\n" +
			"Peso: " + peso +  "\n" +
			"CPF: ";
		// CPF
		if (this.CPF != null) {
			CPF = this.CPF.toString();
		} else {
			CPF = "Ainda não cadastrado.";
		}
		result += CPF + "\n";
		
		// Identidades
		IDs = "Documentos de identidade: \n";
		for (int i = 0; i < this.qtdIDs; i++) {
			if (this.IDs[i].isAtivo()) {
				IDs += this.IDs[i].toString() + "\n";	
			}
		}
		result += IDs + "\n";
		
		return result;
	}
	
	
}
