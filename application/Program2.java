package application;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

import entities.NumeroInteiro;
import services.CalculadoraDivisores;
import services.CalculadoraMaisDivisores;
import services.VerificaPrimalidade;

public class Program2 {

	public static void main(String[] args) {
		int limiteInferior, limiteSuperior;

		Scanner sc;
		try {
			sc = new Scanner(System.in);

			System.out.println(
					"Deseja descobrir qual número de um intervalo de inteiros possui mais divisores? Vamos te ajudar nessa tarefa!");
			System.out.println();

			System.out.print("Digite o número de ponto de partida (limite inferior do intervalo): ");
			limiteInferior = sc.nextInt();

			System.out.print("Digite o número que representa o ponto fim (limite superior do intervalo): ");
			limiteSuperior = sc.nextInt();

			System.out.println();

			Set<NumeroInteiro> numerosCalculados = new HashSet<>();
			while (limiteInferior <= limiteSuperior) {
				NumeroInteiro numero = new NumeroInteiro(limiteInferior);
				numerosCalculados.add(numero);
				CalculadoraDivisores.calculaDivisores(numero);
				VerificaPrimalidade.verificarPrimalidade(numero);
				System.out.println(numero);
				limiteInferior++;
				System.out.println("--------------------------------------------------------");
			}

			CalculadoraMaisDivisores.calculaMaiorQtd(numerosCalculados);
			System.out.println();
			System.out.println("\\/\\/\\/\\/\\/\\/\\/\\/\\/\\/\\/\\/\\/\\/\\/\\/\\/\\/\\/\\/\\/\\/\\/");
			System.out.println("Aviso: saiba que, para um intervalo oferecido, é possível ter números que compartilham a mesma quantidade de divisores.");
			System.out.println("Para esse caso específico, a aplicação informará sempre o menor valor encontrado em um intervalo qualquer.");
			System.out.println("Isso será revisto de alguma forma depois.");

			sc.close();
		} catch (RuntimeException e) {
			e.getMessage();
		}
	}
}
