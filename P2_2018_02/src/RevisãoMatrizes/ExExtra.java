package Revis�oMatrizes;

public class ExExtra {
	public static void main(String[] args) {
		final int maxAlunos = 5, maxNotas = 3;
		int posAtual, qtdAlunos = 0, op = 0, indiceAluno;
		double novaNota;
		
		String nome = "", result = "";

		String[] alunos = new String[maxAlunos];
		double[][] notas = new double[maxAlunos][maxNotas];

		do {
			// Reinicia vari�veis uma unica vez
			posAtual = 0;
			indiceAluno = -1;
			
			// Exibe Menu
			op = InOut.leInt("Digite a op��o: \n" 
					+ "1 - Cadastrar novo aluno\n" 
					+ "2 - Cadastrar nova nota\n"
					+ "3 - Consultar notas por nome\n" 
					+ "4 - Exibir relat�rio\n\n" 
					+ "0 - Encerrar o programa");

			// Op��es
			switch (op) {
			// 1 - Cadastrar novo aluno
			case 1:
				nome = InOut.leString("Digite o nome do aluno");
				alunos[qtdAlunos] = nome;
				qtdAlunos++;
				result = nome + " cadastrado com sucesso!";
				break;

			// 2 - Cadastrar nova nota
			case 2:
				nome = InOut.leString("Digite o nome do aluno");
				
				// Procura pelo aluno e guarda seu �ndice, se houver
				for (int i = 0; i < qtdAlunos; i++) {
					if (alunos[i].equalsIgnoreCase(nome)) {
						indiceAluno = i;
					}
				}

				if (indiceAluno != -1) {
					// Verifica qual a proxima posi��o a inserir
					int j = 0;
					// Explicar a "Malandragem" do curto circuito
					
					while (j < maxNotas && notas[indiceAluno][j] != 0) {
						posAtual++;
						j++;
					}
					// Verifica se ainda tem espa�o pra adicionar notas
					if (posAtual < maxNotas) {
						// L� nova nota
						novaNota = InOut.leDouble("Digite a nova nota");
						notas[indiceAluno][posAtual] = novaNota;
						result = "Nota inserida com sucesso!";
					} else {
						result = "Erro: O aluno j� possui 3 notas";
					}
				} else {
					result = "Aluno n�o encontrado!";
				}

				break;

			// Consultar notas por nome
			case 3:
				nome = InOut.leString("Digite o nome do aluno");
				
				// Procura pelo aluno e guarda seu �ndice, se houver
				for (int i = 0; i < qtdAlunos; i++) {
					if (alunos[i].equalsIgnoreCase(nome)) {
						indiceAluno = i;
					}
				}

				if (indiceAluno != -1) {
					// Verifica qual a proxima posi��o a inserir
					int j = 0;
					result = "notas do aluno " + alunos[indiceAluno] + ": \n";
					// Explicar a "Malandragem" do curto circuito
					while (j < maxNotas && notas[indiceAluno][j] != 0) {
						result += notas[indiceAluno][j] + " | ";
						j++;
					}
				} else {
					result = "Aluno n�o encontrado!";
				}

				break;

			// 4 - Exibir relat�rio
			case 4:
				result = "Nome  | N1 | N2 | N3 \n";
				for (int i = 0; i < maxAlunos; i++) {
					result += alunos[i] + " ";
					for (int j = 0; j < maxNotas; j++) {
						result += "| " + notas[i][j] + " ";
					}
					result += "|\n";
				}
				break;

			// 0 - Encerrar o programa
			case 0:
				result = "Programa encerrado por comando do usu�rio!";
				break;

			default:
				result = "Op��o inv�lida!";
				break;
			}
			InOut.MsgDeInforma��o("Resultado", result);
		} while (op != 0);

	}
}
