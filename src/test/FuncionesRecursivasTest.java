package test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

import java.util.stream.Stream;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import clases.FuncionesRecursivas;

class FuncionesRecursivasTest {

	@ParameterizedTest
	@MethodSource("sumatorio")
	void testSumatorio(int numero, int esperado) {
		int resultado = FuncionesRecursivas.sumatorio(numero);
		assertEquals(esperado, resultado);
	}
	
	private static Stream<Arguments> sumatorio() {
		return Stream.of(
				Arguments.of(1, 1),
				Arguments.of(2, 3)
				);
	}

	@ParameterizedTest
	@MethodSource("potencia")
	void testPotencia(double a, int n, double esperado) {
		double resultado = FuncionesRecursivas.potencia(a, n);
		assertEquals(esperado, resultado);
	}
	private static Stream<Arguments> potencia() {
		return Stream.of(
				Arguments.of(3, 0, 1),
				Arguments.of(3, 3, 27)
				);
	}

	@ParameterizedTest
	@MethodSource("fibonacci")
	void testFibonacci(int numero, int esperado) {
		int resultado = FuncionesRecursivas.fibonacci(numero);
		assertEquals(esperado, resultado);
	}
	
	private static Stream<Arguments> fibonacci() {
		return Stream.of(
				Arguments.of(7, 13),
				Arguments.of(1, 1),
				Arguments.of(2, 1)
				);
	}


}
