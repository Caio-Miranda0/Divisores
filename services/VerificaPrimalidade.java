package services;

import entities.NumeroInteiro;

public class VerificaPrimalidade {

	public static void verificarPrimalidade(NumeroInteiro numero) {

		boolean controladorPrimalidade = true;

		if (numero.getValor() == 1) {
			controladorPrimalidade = false;
		} else {
			for (int i = 2; i < numero.getValor(); i++) {
				if (numero.getValor() % i == 0) {
					controladorPrimalidade = false;
					break;
				}
			}
		}

		if (controladorPrimalidade) {
			numero.setPrimalidade(controladorPrimalidade);
		}
	}
}
