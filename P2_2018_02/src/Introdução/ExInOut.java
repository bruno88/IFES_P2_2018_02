package Introdução;

import Util.InOut;

public class ExInOut {
	public static void main(String[] args) {
		InOut.MsgDeInformação("Olá", "Olá mundo!");
		int idade = InOut.leInt("Digite sua idade");
		InOut.MsgDeInformação("Sua idade", "Sua idade é : " + idade);

	}
}
