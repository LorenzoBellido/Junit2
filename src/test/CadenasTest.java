package test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.stream.Stream;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import clases.Cadenas;
import junit.framework.Assert;

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
				Arguments.of("h", 0),
				Arguments.of("hola que tal", 2)
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
				Arguments.of("", ""),
				Arguments.of("h", "h"),
				Arguments.of("hola", "aloh")
				);
	}

	@ParameterizedTest
	@MethodSource("contar")
	void testContarPalabra(String frase, String palabra, int esperado) {
		Cadenas cad = new Cadenas(frase);
		int resultado = cad.contarPalabra(palabra);
		assertEquals(esperado, resultado);
		
		}
	
	private static Stream<Arguments> contar() {
		return Stream.of(
				Arguments.of("hola, hola", 2),
				Arguments.of("adios", 0),
				Arguments.of("hola", 1)
				);
	}
}
