package br.ufg.inf.bizzbuzz;

public class BizzBuzz {	
	
	public String jogarBizzBuzz(int numero) {
		return divisivelPor15(numero) ? "fizz buzz"
				: divisivelPor5Ou3(numero);
	}

	private String divisivelPor5Ou3(int numero) {
		return divisivelPor5(numero) ? "buzz" : checarDivisivelPor3(numero);
	}

	private String checarDivisivelPor3(int numero) {
		return divisivelPor3(numero) ? "fizz" : String.valueOf(numero);
	}

	private boolean divisivelPor3(int numero) {
		return numero % 3 == 0;
	}

	private boolean divisivelPor5(int numero) {
		return numero % 5 == 0;
	}

	private boolean divisivelPor15(int numero) {
		return numero % 15 == 0;
	}
}
