package test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.stream.Stream;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import clases.Numeros;

class NumerosTest {

	@ParameterizedTest
	@MethodSource("capicua")
	void testcapicua(int numero, boolean esperado) {
		Numeros num = new Numeros(numero);
		boolean resultado = num.esCapicua();
		assertEquals(esperado, resultado);
	}

	private static Stream<Arguments> capicua() {
		return Stream.of(
				Arguments.of(0, true),
				Arguments.of(1221, true),
				Arguments.of(123, false)
				);
	}
}
