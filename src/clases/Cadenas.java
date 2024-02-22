package clases;

public class Cadenas {
	
	String frase;

	public Cadenas(String frase) {
		super();
		this.frase = frase;
	}

	public int cuentaEspacios() {
		int espacios = 0;
		
		for(int i=0; i<frase.length(); i++) {
			if(frase.charAt(i) == ' ') {
				espacios++;
			}
		}
		
		return espacios;
	}
	
	public String delReves() {
		String res = "";
		
		for(int i = frase.length()-1; i>=0; i--) {
			res += frase.charAt(i);
		}
		return res;
	}
	
	public int contarPalabra(String palabra) {
		int contador = 0;
		String[] array;

		// Dividir la frase en palabras
		array = frase.split(" ");

		// Para cada palabra en el array
		for (String str : array) {
			// Comprobar si es la palabra buscada
			if (palabra.equals(str)) {
				// Si coincide, añadir +1 al contador
				contador++;
			}
		}

		return contador;
	}
	
}
