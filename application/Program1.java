package application;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

import entities.NumeroInteiro;
import services.CalculadoraDivisores;
import services.CalculadoraMaisDivisores;
import services.VerificaPrimalidade;

public class Program1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Set<NumeroInteiro> numerosCalculados = new HashSet<>();
		while (true) {

			try {
				System.out.print("Insira um valor inteiro positivo diferente de 0: ");
				int valor = sc.nextInt();
				NumeroInteiro numero = new NumeroInteiro(valor);
				numerosCalculados.add(numero);
				CalculadoraDivisores.calculaDivisores(numero);
				VerificaPrimalidade.verificarPrimalidade(numero);
				System.out.println(numero);
			} catch (RuntimeException e) {
				e.getMessage();
			} finally {
				System.out.print("\nDeseja continuar calculando os divisores de um outro número qualquer (y/n)? ");
				char op = sc.next().charAt(0);
				System.out.println();
				if (op == 'n') {
					sc.close();
					break;
				}
			}
		}

		CalculadoraMaisDivisores.calculaMaiorQtd(numerosCalculados);
	}
}
