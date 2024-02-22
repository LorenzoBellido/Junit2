package clases;

public class Numeros {
	int numero;

	public Numeros(int numero) {
		this.numero = numero;
	}

	public boolean esPrimo() {
		boolean primo = true;
		int div = 2;

		if (numero == 1) {
			primo = false;
		} else {

			while (div <= Math.sqrt(numero) && primo) {
				if (numero % div == 0) {
					primo = false;
				}
				div++;
			}
		}
		return primo;
	}

	public boolean esCapicua() {
		boolean capicua = false;

		int numReves = 0;
		int copiaNum = this.numero;

		while (copiaNum > 0) {
			numReves = numReves * 10 + copiaNum % 10;
			copiaNum /= 10;
		}

		if(numReves == this.numero) {
			capicua = true;
			
		}
		return capicua;
	}
	
}
