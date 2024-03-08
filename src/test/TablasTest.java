package test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.stream.Stream;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import clases.Tablas;

class TablasTest {


	@ParameterizedTest
	@MethodSource("esMagica")
	void esMagica(int [][]tabla, boolean esperado) {
		boolean resultado = Tablas.esMagica(tabla);
	}
	
	private static Stream<Arguments> esMagica() {
		return Stream.of(
				Arguments.of((Object) new int [][]{{1,1},{1,1}}, true),
				Arguments.of((Object) new int [][]{{1},{2}}, false),
				Arguments.of((Object) new int [][]{{1,2},{1,1}}, false)
				);
	}

	@ParameterizedTest
	@MethodSource("gira90")
	void testgira90(int tabla[][], int[][] esperado) {
		int[][] resultado = Tablas.gira90(tabla);
		assertArrayEquals(esperado, resultado);
	}
	
	private static Stream<Arguments> gira90() {
		return Stream.of(Arguments.of(null, null),
				Arguments.of((Object) new int[][] { { 1, 1, 1}, { 1, 1, 1} }, null),
				Arguments.of((Object) new int[][] { { 1, 1, 1}, { 1, 1, 1}, { 1, 1, 1} },
						new int[][] { { 1, 1, 1}, { 1, 1, 1}, { 1, 1, 1}}));
	}
}
