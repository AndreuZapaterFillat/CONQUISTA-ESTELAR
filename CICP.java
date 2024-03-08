package Pandemic;
import java.util.ArrayList;
import java.util.Scanner;

public class CICP {

	public static void main(String[] args) {
		
		String nombreCiudad = "";
		int [] coordenadas = new int [3];
		ArrayList<String> ciudadVecina = new ArrayList<String>();
		
		int [] val = new int [1];
		
		String total = "";
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Introduce el string: ");
		total = entrada.nextLine();
		entrada.close();
		
		//Obtener el nombre de la ciudad
		nombreCiudad = devolverCiudad(total, val);
		
		
		//Número 1
		coordenadas[0] = Integer.valueOf(devolverCoordenada(total, val));
		//Número 2
		coordenadas[1] = Integer.valueOf(devolverCoordenada(total, val));
		//Número 3
		coordenadas[2] = Integer.valueOf(devolverCoordenada(total, val));
		
		//Obtener el nombre de las ciudades vecinas
		devolverVecinas(ciudadVecina, total, val);
		
		
		System.out.println(nombreCiudad);
		System.out.println(coordenadas[0]);
		System.out.println(coordenadas[1]);
		System.out.println(coordenadas[2]);
		System.out.println(ciudadVecina);
		
	}
	
	//************************************************************************************
	//** Nombre de la función: devolverCiudad
	//** Explicación del que hace la función: Devuelve el nombre de la ciudad
	//** Parámetros de entrada: String total, int [] val
	//** Parámetros de salida: String nombreCiudad
	//************************************************************************************	
	public static String devolverCiudad(String total, int [] val) {
		String nombreCiudad = "";
		int i = 0;
		
		for(i = 0; total.charAt(i) != ';'; i++) {
			nombreCiudad = nombreCiudad + total.charAt(i);
		}
		val[0] = i + 1;
		
		
		
		return nombreCiudad;
	}
	
	//************************************************************************************
	//** Nombre de la función: devolverCoordenada
	//** Explicación del que hace la función: Devuelve la coordenada
	//** Parámetros de entrada: String total, int [] val
	//** Parámetros de salida: String coord
	//************************************************************************************	
	public static String devolverCoordenada(String total, int [] val) {
		int i = 0;
		String coord = "";
		
		for(i = val[0] ; total.charAt(i) != ';'; i++) {
			coord = coord + total.charAt(i);
		}
		
		val[0]  = i + 1;
		return coord;
		
		
	}
	
	//************************************************************************************
	//** Nombre de la función: devolverVecinas
	//** Explicación del que hace la función: Devuelve el nombre de las ciudades vecinas
	//** Parámetros de entrada: ArrayList<String> ciudadVecina, String total, int [] val
	//** Parámetros de salida:
	//************************************************************************************	
	public static void devolverVecinas(ArrayList<String> ciudadVecina, String total, int [] val) {
		int i = 0;
		String coord = "";
		
		for(i = val[0] ; total.charAt(i) != ';'; i++) {
			if(total.charAt(i) != ',') {
				coord = coord + total.charAt(i);
			}else {
				//i++;
				ciudadVecina.add(coord);
				coord = "";
			}
			if(total.charAt(i+1) == ';')
				ciudadVecina.add(coord);
			
		}
	}

}
