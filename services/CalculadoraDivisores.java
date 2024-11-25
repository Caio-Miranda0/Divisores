package services;

import entities.NumeroInteiro;

public class CalculadoraDivisores {
	
	public static void calculaDivisores(NumeroInteiro numero) {
		numero.getDivisores().add(1);
		for (int i = 2; i <= numero.getValor(); i++) {
			if (numero.getValor() % i == 0) {
				numero.getDivisores().add(i);
			}
		}
	}
}
