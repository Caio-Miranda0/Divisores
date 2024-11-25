package exceptions;

public class ValorInvalido extends IllegalArgumentException {

	private static final long serialVersionUID = 1L;

	public ValorInvalido(String msg) {
		System.out.println(msg);
	}

}
