package entities;

import java.util.ArrayList;
import java.util.List;

import exceptions.ValorInvalido;

public class NumeroInteiro {

	private int valor;
	private boolean primalidade;
	private List<Integer> divisores = new ArrayList<>();

	public NumeroInteiro(int valor) {
		if (valor == 0) {
			throw new ValorInvalido("Erro: O valor para o qual deseja calcular os divisores deve ser diferente de 0!");
		}
		if (valor < 0) {
			throw new ValorInvalido("Erro: O valor para o qual deseja calcular os divisores deve ser positivo e maior que 0!");
		}
		this.valor = valor;
	}

	public int getValor() {
		return valor;
	}

	public boolean isPrimalidade() {
		return primalidade;
	}

	public void setPrimalidade(boolean primalidade) {
		this.primalidade = primalidade;
	}

	public List<Integer> getDivisores() {
		return divisores;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Número: " + valor);
		if (valor != 1) {
			sb.append((primalidade ? "\nTrata-se de um número primo." : "\nTrata-se de um número composto."));
		} else {
			sb.append("\nNão é um número primo nem composto.");
		}
		sb.append("\nQuantidade de divisores: " + divisores.size());
		if (primalidade == false && valor != 1) {
			for (int i = 0; i < divisores.size(); i++) {
				if (i == 0) {
					sb.append("\nLista de divisores inteiros: {" + divisores.get(i) + ", ");
				} else if (i < divisores.size() - 1) {
					sb.append(divisores.get(i) + ", ");
				} else {
					sb.append(divisores.get(i) + "}");
				}
			}
		}
		return sb.toString();
	}

	public void imprimirDetalhes() {
		System.out.println(this);
	}
}
