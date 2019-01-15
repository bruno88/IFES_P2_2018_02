package CorrecaoProvas.Prova2;

public class ExProva {

	public static void main(String[] args) {
		// Fornecedores
		Fornecedor f1 = new Fornecedor("Ana", "1234");
		ControleFornecedor.adiciona(f1);
		Fornecedor f2 = new Fornecedor("Bruno", "4321");
		ControleFornecedor.adiciona(f2);

		// Instrumentos
		Instrumento instr1 = new Instrumento("Guitarra", 1000, f1);
		ControleInstrumento.adiciona(instr1);
		Instrumento instr2 = new Instrumento("Baixo", 1200, f2);
		ControleInstrumento.adiciona(instr2);
		Instrumento instr3 = new Instrumento("Bateria", 3000, f1);
		ControleInstrumento.adiciona(instr3);
		
		// Testando Instrumentos
		final int testaInstrumento = 1;
		Instrumento instrConsultado = 
				ControleInstrumento.consulta(testaInstrumento);
		if (instrConsultado != null) {
			System.out.println(instrConsultado.toString());
		} else {
			System.out.println("Instrumento não encontrado");
		}
		
		ControleInstrumento.imprimeTodos();
		ControleInstrumento.remove(instr2);
		ControleInstrumento.imprimeTodos();
		
		
		// Testando Fornecedores
		final int testaFornecedor = 3;
		Fornecedor fornConsultado = ControleFornecedor.
				consulta(testaFornecedor);
		if (fornConsultado != null) {
			System.out.println(fornConsultado.toString());
		} else {
			System.out.println("Fornecedor não encontrado");
		}
		
		ControleFornecedor.imprimeTodos();
		ControleFornecedor.remove(f1);
		ControleFornecedor.imprimeTodos();
		ControleFornecedor.remove(f2);
		ControleFornecedor.imprimeTodos();
		
	}
}
