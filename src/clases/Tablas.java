package clases;

public class Tablas {

	static boolean esMagica(int tabla[][]) {
		boolean magica = true;
		int suma=0;
		int nuevaSuma=0;
		int i = 1;
		
		for(int j=0; j< tabla[0].length; j++) {
			suma += tabla[0][j];
		}
		
		while(i<tabla.length && magica) {
			nuevaSuma = 0;
			for(int j=0; j<tabla[i].length; j++) {
				nuevaSuma += tabla[i][j];
			}
			if(nuevaSuma != suma) {
				magica = false;				
			}
			i++;
		}
		
		if(magica) {
			i = 0;
			while(i<tabla.length && magica) {
				nuevaSuma = 0;
				for(int j=0; j<tabla[i].length; j++) {
					nuevaSuma += tabla[j][i];
				}
				if(nuevaSuma != suma) {
					magica = false;				
				}
				i++;
			}
		}
		
		return magica;
		
	}
	
	public static int[][] gira90(int tablaInicio[][]){
		int[][] tablaFinal = null;
		
		if(tablaInicio != null) {
			if(tablaInicio.length == tablaInicio[0].length) {
				tablaFinal = new int[tablaInicio.length][tablaInicio.length];
				
				for(int i=0; i<tablaInicio.length; i++) {
					for(int j=0; j<tablaInicio[0].length; j++) {
						tablaFinal[j][tablaInicio.length-i-1] = tablaInicio[i][j];
					}
				}
				
			}
		} 
		
		return tablaFinal;
		
	}
	
}
