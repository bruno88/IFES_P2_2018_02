package POO.Lista5;

public class Pessoa {
	private int codigo, CPF, dataNascimento, dataCadastro;
	private String nome, sobrenome, email;
	
	public Pessoa(int CPF, int dataCadastro, String nome, 
			String sobrenome, String email) {
		// Criando número auto-incremental
		int proxCod = GerenciaPessoa.getProxCod();
		this.codigo = proxCod;

		// Outros atributos
		this.CPF = CPF;
		this.dataCadastro = dataCadastro;
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.email = email;
	}

	public int getCPF() {
		return CPF;
	}

	public void setCPF(int cPF) {
		CPF = cPF;
	}

	public int getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(int dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSobrenome() {
		return sobrenome;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getCodigo() {
		return codigo;
	}

	public int getDataCadastro() {
		return dataCadastro;
	}

	public void altera() {
		
	}
	
	@Override
	public String toString() {
		return "Dados da pessoa " + codigo + ":" +
				"\n\nNome: " + this.nome + " " + this.sobrenome + 
				"\nCPF: " + this.CPF +
				"\nE-mail: " + this.email +
				"\nData de Cadastro: " + this.dataCadastro +
				"\nData de Nascimento: " + this.dataNascimento + "\n";
	}
}
