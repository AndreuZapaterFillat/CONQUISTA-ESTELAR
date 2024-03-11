package Pandemic;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.lang.Math;

public class leerCiudades {

	public static void main(String[] args) {
		
		File NomFit = new File("ciudades.txt");
		File NomFit2 = new File("ciudades.txt");
		File ciudadesRed = new File("ciudadesRedactadas.txt");
		int i = 0;
		String texto = "";

		
		String nombreCiudad = "";
		String nombreVecina = "";
		int [] coordenadas = new int [3];
		int [] coordenadasVecina = new int[3];
		ArrayList<String> ciudadVecina = new ArrayList<String>();
		
		int [] val = new int [1];
		
		//leerFichero(NomFit);
		
		
		try {
			FileReader fr = new FileReader(NomFit);
			BufferedReader br = new BufferedReader(fr);
			//Miramos si el fichero tiene información
			if(NomFit.length() != 0) {
				do {
					texto = br.readLine();
					if(texto != null) {
						FileWriter fw = new FileWriter(ciudadesRed,false);
						BufferedWriter bw = new BufferedWriter(fw);
						
						//Obtener el nombre de la ciudad
						nombreCiudad = devolverCiudad(texto, val);
						
						//Número 1
						coordenadas[0] = Integer.valueOf(devolverCoordenada(texto, val));
						//Número 2
						coordenadas[1] = Integer.valueOf(devolverCoordenada(texto, val));
						//Número 3
						coordenadas[2] = Integer.valueOf(devolverCoordenada(texto, val));
						
						//Obtener el nombre de las ciudades vecinas
						devolverVecinas(ciudadVecina, texto, val);

						texto = "La ciudad " +nombreCiudad+ " está en las coordenadas (" +coordenadas[1]+ "," +coordenadas[2]+ ") sus ciudades colindantes son:";
						System.out.println(ciudadVecina);
						for(i = 0; i < ciudadVecina.size(); i++) {
							System.out.println(ciudadVecina.get(i));
						}
						bw.write(texto);
						bw.newLine();
						val[0] = 0;
						try {
							FileReader fr2 = new FileReader(NomFit2);
							BufferedReader br2 = new BufferedReader(fr);
							if(NomFit2.length() != 0) {
								System.out.println("hola1");
								val[0] = 0;
								do {
									System.out.println("hola2");
									texto = br2.readLine();
									System.out.println(texto);
									nombreVecina = devolverCiudad(texto, val);
									System.out.println("hola5");
									for(i = 0; i < ciudadVecina.size(); i++) {
										System.out.println("hola3");
										if(nombreVecina.equals(ciudadVecina.get(i))) {
											System.out.println("hola4");
											//Número 1
											coordenadasVecina[0] = Integer.valueOf(devolverCoordenada(texto, val));
											//Número 2
											coordenadasVecina[1] = Integer.valueOf(devolverCoordenada(texto, val));
											//Número 3
											coordenadasVecina[2] = Integer.valueOf(devolverCoordenada(texto, val));
											
											texto = "\t- " +nombreVecina+ ", que está a una distancia de " + (Math.sqrt(Math.pow(coordenadasVecina[1], coordenadas[1]) + Math.pow(coordenadasVecina[2], coordenadas[2])) );
											bw.write(texto);
											bw.newLine();
										}
										
										
									}
									val[0] = 0;
									fr2.close();
									br2.close();
								}while(texto != null);
								
							}else {
								System.out.println("El fichero está vacío");
							}
							
						} catch (Exception e) {
							System.out.println("Error try vecino: " + e);
						}
						
						
						bw.close();
						fw.close();
						val[0] = 0;
					}
				}while(texto != null);
			fr.close();
			br.close();
			}else {
				System.out.println("El fichero está vacío");
			}
				
			fr.close();
			br.close();
		} catch (IOException e) {
			System.out.println("Error E/S: " + e);
		}
			
			
		leerFichero(ciudadesRed);	
			
			
		

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
	
	
	//************************************************************************************
		//** Nombre de la función: leerFichero
		//** Explicación del que hace la función: Muestra por pantalla el contenido del fichero
		//** Parámetros de entrada: File NomFit
		//** Parámetros de salida: 
		//************************************************************************************
		public static void leerFichero(File NomFit) {
			String texto;
			try {
				FileReader fr = new FileReader(NomFit);
				BufferedReader br = new BufferedReader(fr);
				//Miramos si el fichero tiene información
				if(NomFit.length() != 0) {
					do {
						texto = br.readLine();
						if(texto != null) {
							System.out.println(texto);
						}
					}while(texto != null);
				}else {
					System.out.println("El fichero está vacío");
				}
				
				fr.close();
				br.close();
			} catch (IOException e) {
				System.out.println("Error E/S: " + e);
			}
		}
	
	




}
