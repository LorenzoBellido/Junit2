package test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.stream.Stream;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import clases.Cadenas;
import clases.Numeros;

class CadenasTest {

	@ParameterizedTest
	@MethodSource("cuentaEspacios")
	void testCuentaEspacios(String frase, int esperado) {
		Cadenas cad = new Cadenas(frase);
		int resultado = cad.cuentaEspacios();
		assertEquals(esperado, resultado);
	}
	
	private static Stream<Arguments> cuentaEspacios() {
		return Stream.of(
				Arguments.of("Hola", 0),
				Arguments.of("Hola Mundo", 1),
				Arguments.of("Hola Mundo que tal?", 3),
				Arguments.of("", 0)
				);
	}

	@ParameterizedTest
	@MethodSource("delReves")
	void testDelReves(String frase, String esperado) {
		Cadenas cad = new Cadenas(frase);
		String resultado = cad.delReves();
		assertEquals(esperado, resultado);
	}
	
	
	private static Stream<Arguments> delReves() {
		return Stream.of(
				Arguments.of("Hola", "aloH"),
				Arguments.of("h", "h"),
				Arguments.of("", "")
				);
	}


	@ParameterizedTest
	@MethodSource("contarPalabra")
	void testContarPalabra(String frase, int esperado) {
		Cadenas cad = new Cadenas(frase);
		int resultado = cad.contarPalabra();
		assertEquals(esperado, resultado);
	}
	
	private static Stream<Arguments> contarPalabra() {
		return Stream.of(
				Arguments.of("Hola", 4),
				Arguments.of("Hola que tal", 12),
				Arguments.of("", 0)
				);
	}

}

