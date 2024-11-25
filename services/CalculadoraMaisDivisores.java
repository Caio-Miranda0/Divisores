package services;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import entities.NumeroInteiro;

public class CalculadoraMaisDivisores {

	public static void calculaMaiorQtd(Set<NumeroInteiro> valoresDigitados) {

		List<NumeroInteiro> numeros = new ArrayList<>();
		for (NumeroInteiro numeroInteiro : valoresDigitados) {
			numeros.add(numeroInteiro);
		}

		int qtdDivisores = numeros.get(0).getDivisores().size();
		int valor = numeros.get(0).getValor();
		int indice = 0;
		for (int i = 1; i < numeros.size(); i++) {
			if (numeros.get(i).getDivisores().size() > qtdDivisores && numeros.get(i).getValor() != valor) {
				qtdDivisores = numeros.get(i).getDivisores().size();
				valor = numeros.get(i).getValor();
				indice = i;
			}
		}

		System.out.println(
				"Dos valores para os quais calculamos os seus respectivos divisores, o que possui mais divisores é "
						+ valor + ".");
		System.out.println("Sua quantidade de divisores é igual a " + qtdDivisores + ".");
		System.out.println("Divisores: " + numeros.get(indice).getDivisores());
	}
}
