package clases;

public class FuncionesRecursivas {

	public static int sumatorio(int numero) {
		int suma = 0;
		if(numero == 1) {
			suma = 1;
		} else {
			suma = numero + sumatorio(numero-1);
		}
		
		return suma;
	}
	
	public static double potencia(double a, int n) {
		double potencia = 1;
		
		if(n == 0) {
			potencia = 1;
		} else {
			potencia = a *potencia(a, n-1);
		}
		
		return potencia;
	}
	
	public static int fibonacci(int numero) {
		int result = 0;
		
		if(numero == 1 || numero ==2) {
			result = 1;
		} else {
			result = fibonacci(numero-1) + fibonacci(numero-2);
		}
		return result;
	}
	
	public static void main(String[] args) {
		System.out.println(fibonacci(7));
	}
}
