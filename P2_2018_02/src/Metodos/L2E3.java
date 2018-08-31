package Metodos;

import Util.Util;

public class L2E3 {
	public static void main(String[] args) {
		final int horas = 1;

		int minutos = Util.getMinutosFromHoras(horas);
		System.out.println(Util.getMinutosFromHoras(horas));
		System.out.println(Util.getSegundosFromHoras(horas));
		System.out.println(Util.getSegundosFromMinutos(minutos));
	}

}
