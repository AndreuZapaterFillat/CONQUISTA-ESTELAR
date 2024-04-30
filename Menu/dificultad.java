package Menu;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Scanner;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

import Partida.Ciudad;
import Partida.Vacunas;
import Partida.Virus;

import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JButton;

public class dificultad extends JFrame implements ActionListener {

	JButton facil, normal, dificil, personalizado;
	
	public dificultad() {
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(1280,720);
		this.setTitle("Dificultad test");
		this.setLocationRelativeTo(null);
		getContentPane().setLayout(null);
		
		JLabel Dificultad = new JLabel("Elige la dificultad");
		Dificultad.setFont(new Font("Nadeem", Font.BOLD, 39));
		Dificultad.setForeground(new Color(255, 255, 255));
		Dificultad.setBounds(471, 50, 360, 73);
		getContentPane().add(Dificultad);
		
		facil = new JButton("Fácil");
		facil.setBounds(555, 124, 117, 29);
		getContentPane().add(facil);
		facil.addActionListener(this);
		
		normal = new JButton("Normal");
		normal.setBounds(555, 192, 117, 29);
		getContentPane().add(normal);
		normal.addActionListener(this);
		
		dificil = new JButton("Difícil");
		dificil.setBounds(555, 262, 117, 29);
		getContentPane().add(dificil);
		dificil.addActionListener(this);
		
		personalizado = new JButton("Personalizado");
		personalizado.setBounds(555, 341, 117, 29);
		getContentPane().add(personalizado);
		personalizado.addActionListener(this);
		
		JLabel Fondo = new JLabel("fondo");
		Fondo.setIcon(new ImageIcon("/Users/alejandrorodriguezvallin/Desktop/Ilerna/Prog/Pandemic/src/Menu/fondoSW3.jpeg"));
		Fondo.setBounds(0, -17, 1314, 709);
		getContentPane().add(Fondo);
	
		
		
		
		setVisible(true);
		
	}
	
	
	@Override
	public void actionPerformed(ActionEvent evt) {
		// TODO Auto-generated method stub
		
		if(evt.getSource() == facil) {
			
			String linea = "";
			String linea1 = "";
			int infectadas = 0;
			int i = 0;
			int j = 0;
			File NomFit = new File("modo_facil.xml");
			
			Ciudad[] ciudades = new Ciudad[48];
			Virus[] viruses = new Virus [4];
			Vacunas [] vacuna = new Vacunas [4];
			
			ciudades = llenarCiudades();
			viruses = llenarVirus();
			vacuna = llenarVacunas();
	
			try {
				FileReader fr = new FileReader(NomFit);
				BufferedReader br = new BufferedReader(fr);
				
				linea = br.readLine();
				linea = br.readLine();
				linea = br.readLine();
				
				for(i = 0; i < linea.length() - 1; i++) {
					if(linea.charAt(i) == '>') {
						i++;
						while(linea.charAt(i) != '<') {
							linea1 = linea1 + linea.charAt(i);
							i++;
						}
					}
				}		
				
				br.close();
				fr.close();
			} catch (Exception e) {
				System.out.println("Error E/S: " + e);	
			}
			
			infectadas = Integer.valueOf(linea1);
			System.out.println(infectadas);
			i = 0;
			while(j != infectadas) {
				if((int)(Math.random()*20) == 2) {
					
					if(ciudades[i].getinfeccion() == 0) {
						ciudades[i].setinfeccion(ciudades[i].getinfeccion() + 1);
						j++;
					}
				}
				
				if(i == 47) {
					i = 0;
				}else {
					i++;
				}
				
			}
			
			for(i = 0; i < 48; i++) {
				if(ciudades[i].getinfeccion() != 0) {
					JOptionPane.showMessageDialog(null, ciudades[i].getnombre());
					System.out.println(ciudades[i].getnombre());
					System.out.println(ciudades[i].getenfermedad());
					System.out.println(ciudades[i].getinfeccion());
					System.out.println(ciudades[i].coordenadas[0]);
					System.out.println(ciudades[i].coordenadas[1]);
					for(j = 0; j < ciudades[i].ciudadesColindantes.length; j++) {
						System.out.println(ciudades[i].ciudadesColindantes[j]);
					}
					System.out.println();
				}	
			}
			
			
			
		}
		
		
		if(evt.getSource() == normal) {
			String linea = "";
			String linea1 = "";
			int infectadas = 0;
			int i = 0;
			int j = 0;
			File NomFit = new File("modo_normal.xml");
			
			Ciudad[] ciudades = new Ciudad[48];
			Virus[] viruses = new Virus [4];
			Vacunas [] vacuna = new Vacunas [4];
			
			ciudades = llenarCiudades();
			viruses = llenarVirus();
			vacuna = llenarVacunas();
			
			
			linea1 = "";
			try {
				FileReader fr = new FileReader(NomFit);
				BufferedReader br = new BufferedReader(fr);
				
				linea = br.readLine();
				linea = br.readLine();
				linea = br.readLine();
				
				for(i = 0; i < linea.length() - 1; i++) {
					if(linea.charAt(i) == '>') {
						i++;
						while(linea.charAt(i) != '<') {
							linea1 = linea1 + linea.charAt(i);
							i++;
						}
					}
				}		
				
				br.close();
				fr.close();
			} catch (Exception e) {
				System.out.println("Error E/S: " + e);	
			}
			
			infectadas = Integer.valueOf(linea1);
			
			i = 0;
			while(j != infectadas) {
				if((int)(Math.random()*20) == 2) {
					
					if(ciudades[i].getinfeccion() == 0) {
						ciudades[i].setinfeccion(ciudades[i].getinfeccion() + 1);
						j++;
					}
				}
				
				if(i == 47) {
					i = 0;
				}else {
					i++;
				}
				
			}
			
			for(i = 0; i < 48; i++) {
				if(ciudades[i].getinfeccion() != 0) {
					JOptionPane.showMessageDialog(null, ciudades[i].getnombre());
					System.out.println(ciudades[i].getnombre());
					System.out.println(ciudades[i].getenfermedad());
					System.out.println(ciudades[i].getinfeccion());
					System.out.println(ciudades[i].coordenadas[0]);
					System.out.println(ciudades[i].coordenadas[1]);
					for(j = 0; j < ciudades[i].ciudadesColindantes.length; j++) {
						System.out.println(ciudades[i].ciudadesColindantes[j]);
					}
					System.out.println();
				}	
			}
			
		}
		
		if(evt.getSource() == dificil) {
			String linea = "";
			String linea1 = "";
			int infectadas = 0;
			int i = 0;
			int j = 0;
			File NomFit = new File("modo_dificil.xml");
			
			Ciudad[] ciudades = new Ciudad[48];
			Virus[] viruses = new Virus [4];
			Vacunas [] vacuna = new Vacunas [4];
			
			ciudades = llenarCiudades();
			viruses = llenarVirus();
			vacuna = llenarVacunas();
			
			
			linea1 = "";
			try {
				FileReader fr = new FileReader(NomFit);
				BufferedReader br = new BufferedReader(fr);
				
				linea = br.readLine();
				linea = br.readLine();
				linea = br.readLine();
				
				for(i = 0; i < linea.length() - 1; i++) {
					if(linea.charAt(i) == '>') {
						i++;
						while(linea.charAt(i) != '<') {
							linea1 = linea1 + linea.charAt(i);
							i++;
						}
					}
				}		
				
				br.close();
				fr.close();
			} catch (Exception e) {
				System.out.println("Error E/S: " + e);	
			}
			
			infectadas = Integer.valueOf(linea1);
			
			i = 0;
			while(j != infectadas) {
				if((int)(Math.random()*20) == 2) {
					
					if(ciudades[i].getinfeccion() == 0) {
						ciudades[i].setinfeccion(ciudades[i].getinfeccion() + 1);
						j++;
					}
				}
				
				if(i == 47) {
					i = 0;
				}else {
					i++;
				}
				
			}
			
			for(i = 0; i < 48; i++) {
				if(ciudades[i].getinfeccion() != 0) {
					JOptionPane.showMessageDialog(null, ciudades[i].getnombre());
					System.out.println(ciudades[i].getnombre());
					System.out.println(ciudades[i].getenfermedad());
					System.out.println(ciudades[i].getinfeccion());
					System.out.println(ciudades[i].coordenadas[0]);
					System.out.println(ciudades[i].coordenadas[1]);
					for(j = 0; j < ciudades[i].ciudadesColindantes.length; j++) {
						System.out.println(ciudades[i].ciudadesColindantes[j]);
					}
					System.out.println();
				}	
			}
			
		}
		
		if(evt.getSource() == personalizado) {
			String linea = "";
			String linea1 = "";
			int infectadas = 0;
			int i = 0;
			int j = 0;
			File NomFit = new File("modo_personalizado.xml");
			
			Ciudad[] ciudades = new Ciudad[48];
			Virus[] viruses = new Virus [4];
			Vacunas [] vacuna = new Vacunas [4];
			
			//LineaTot se usa para guardar todas las líneas modificadas del fichero
			String lineaTot = "";
			//usuario se usa para guardar lo que introduce el usuario
			String usuario = "";
			
			ciudades = llenarCiudades();
			viruses = llenarVirus();
			vacuna = llenarVacunas();
			Scanner entrada= new Scanner(System.in);
			
			linea1 = "";
			try {
				FileReader fr = new FileReader(NomFit);
				BufferedReader br = new BufferedReader(fr);
									
				//Obtenemos primero todo el fichero modificado
				lineaTot = lineaCompleta(entrada, lineaTot, usuario, lineaTot, linea1, fr, br);
									
				FileWriter fw = new FileWriter(NomFit,false);
				BufferedWriter bw = new BufferedWriter(fw);
									
				//Escribimos el fichero modificado
				bw.write(lineaTot);							
				bw.close();
				fw.close();
				br.close();
				fr.close();
									
			} catch (Exception e) {
				System.out.println("Error E/S: " + e);	
			}
			
			
			linea1 = "";
			try {
				FileReader fr = new FileReader(NomFit);
				BufferedReader br = new BufferedReader(fr);
				
				linea = br.readLine();
				linea = br.readLine();
				linea = br.readLine();
				
				for(i = 0; i < linea.length() - 1; i++) {
					if(linea.charAt(i) == '>') {
						i++;
						while(linea.charAt(i) != '<') {
							linea1 = linea1 + linea.charAt(i);
							i++;
						}
					}
				}		
				
				br.close();
				fr.close();
			} catch (Exception e) {
				System.out.println("Error E/S: " + e);	
			}
			
			infectadas = Integer.valueOf(linea1);
			
			i = 0;
			while(j != infectadas) {
				if((int)(Math.random()*20) == 2) {
					
					if(ciudades[i].getinfeccion() == 0) {
						ciudades[i].setinfeccion(ciudades[i].getinfeccion() + 1);
						j++;
					}
				}
				
				if(i == 47) {
					i = 0;
				}else {
					i++;
				}
				
			}
			
			for(i = 0; i < 48; i++) {
				if(ciudades[i].getinfeccion() != 0) {
					JOptionPane.showMessageDialog(null, ciudades[i].getnombre());
					System.out.println(ciudades[i].getnombre());
					System.out.println(ciudades[i].getenfermedad());
					System.out.println(ciudades[i].getinfeccion());
					System.out.println(ciudades[i].coordenadas[0]);
					System.out.println(ciudades[i].coordenadas[1]);
					for(j = 0; j < ciudades[i].ciudadesColindantes.length; j++) {
						System.out.println(ciudades[i].ciudadesColindantes[j]);
					}
					System.out.println();
				}	
			}
		}
		
	}
	
	
	
	
		public static Ciudad[] llenarCiudades() {
			Ciudad[] ciudades = new Ciudad[48];
			File ciu = new File("ciudades.txt");
			String texto = "";
			String ciudad = "";
			ArrayList<String> imperio = new ArrayList<String>();
			String [] colindantes;
			int i = 0;
			int j = 0;
			int z = 0;
			int comas = 0;
			int [] val = new int[1];
			int [] coord = new int[2];
			imperio.add("Darth Sidious");
			imperio.add("Darth Vader");
			imperio.add("General Grievous");
			imperio.add("Darth Maul");
			
		
			try {
				FileReader fr = new FileReader(ciu);
			    BufferedReader br = new BufferedReader(fr); 
			     while(texto != null) {
			    	coord = new int [2];
			    	ciudades[i] = new Ciudad();
			    	ciudades[i].coordenadas = new int[2];
					texto = br.readLine();
					val[0] = 0;
					if(texto != null) {
						ciudad = devolverCiudad(texto, val);
						ciudades[i].setnombre(ciudad);
						
	                    //Número 1
						val[0] = val[0] + 2;
	                    //Número 2
	                    coord[0] = Integer.valueOf(devolverCoordenada(texto, val));
	                    //Número 3
	                    coord[1] = Integer.valueOf(devolverCoordenada(texto, val));                    
	                    
						ciudades[i].setcoordenadas(coord);
						ciudades[i].setcolor(imperio.get(j));
						ciudades[i].setinfeccion(0);
						
						comas = 0;
						for(z = 0; z != texto.length(); z++) {
							if(texto.charAt(z) == ',')
								comas++;
						}
	
						colindantes = new String [comas + 1];
						
						comas = 0;
	
						while(val[0] != texto.length()) {
							ciudad = "";
							for(z = val[0]; texto.charAt(z) != ',' && texto.charAt(z) != ';'; z++) {
								ciudad = ciudad +  texto.charAt(z);
							}
							val[0] = z + 1;
							colindantes[comas] = ciudad;
							comas++;
						}
						ciudades[i].setciudadesColindantes(colindantes);
						
					}
					
					//Cambiamos la palabra del arrayList cada 12 ciudades
					if(((i+1)%12) == 0 && i != 0) {
						j++;
					}
				    
				    if(i != 48) {
						i++;
					}
		        }
			    br.close();
			    fr.close();
			} catch (Exception e) {
					// TODO: handle exception
			}
					
			return ciudades;
		}
		
		
		public static Virus[] llenarVirus() {
			Virus[] viruses = new Virus [4];
			int i = 0;
			String id = "";
			String[] colores = new String [] {"azul", "rojo", "verde", "amarillo"};
			String[] imperio = new String [] {"Darth Sidious", "Darth Vader", "General Grievous", "Darth Maul"};
	
		
			for(i = 0; i < 4; i++) {
				id = "";
				viruses[i] = new Virus();
				viruses[i].setcolor(colores[i]);
				viruses[i].setnombre(imperio[i]);
				id = id + i;
				viruses[i].setidentificador(id);	
			}
			
			return viruses;
		}
	
		
		public static Vacunas[] llenarVacunas() {
		Vacunas [] vacuna = new Vacunas [4];
		int i = 0;
		String[] colores = new String [] {"azul", "rojo", "verde", "amarillo"};
		String[] imperio = new String [] {"Inutilización de Darth Sidious", "Inutilización de Darth Vader", "Inutilización de General Grievous", "Inutilización de Darth Maul"};
			
		for(i = 0; i < 4; i++) {
			vacuna[i] = new Vacunas();
			vacuna[i].setcolor(colores[i]);
			vacuna[i].setporcentaje((float)0);
			vacuna[i].setnombre(imperio[i]);
		}
			
		return vacuna;	
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
			
			for(i = 0; total.charAt(i) != ';' && total.charAt(i) != ','; i++) {
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
		//** Nombre de la función: devolverXml
		//** Explicación del que hace la función: Devuelve en string la línea con el valor introducido por el usuario
		//** Parámetros de entrada: String usuario, String linea, String linea1, Scanner entrada
		//** Parámetros de salida: String linea1
		//************************************************************************************
		public static String devolverXml(String usuario, String linea, String linea1, Scanner entrada) {
			int i = 0;
			int j = 0;
			linea1 = "";
			 
			//For para copiar todo el string hasta '>'
			for(i = 0; linea.charAt(i) != '>'; i++) {
				linea1 = linea1 + linea.charAt(i);
			}
			i++;
			//Cerramos el atributo de XML y añadimos el valor del usuario
			linea1 = linea1 + '>' + usuario;
			
			while(linea.charAt(i) != '<') {
				i++;
			}
			
			//For para copiar todo el string hasta '>'
			for(j = i; linea.charAt(j) != '>'; j++) {
				linea1 = linea1 + linea.charAt(j);
			}
			//Añadimos '>'
			linea1 = linea1 + '>';
			
			return linea1;
			
		}
		
		
		//************************************************************************************
		//** Nombre de la función: lineaCompleta
		//** Explicación del que hace la función: Devuelve en string todo el fichero modificado con los valores del usuario
		//** Parámetros de entrada: Scanner entrada, String lineaTot, String usuario, String linea, String linea1, FileReader fr, BufferedReader br
		//** Parámetros de salida: String lineaTot
		//************************************************************************************
		public static String lineaCompleta(Scanner entrada, String lineaTot, String usuario, String linea, String linea1, FileReader fr, BufferedReader br) {
			
			String respuesta = "";
			try {
				linea = br.readLine();
				lineaTot = linea + "\n";
				linea = br.readLine();
				lineaTot = lineaTot + linea + "\n";
				
				
				// Crear un campo de texto
				
				JTextField texto = new JTextField();

				// Crear un panel que contenga el campo de texto
				JPanel panel = new JPanel();
				panel.add(new JLabel("Introduce el número de ciudades infectadas al inicio: "));
				panel.add(texto);

				// Mostrar un cuadro de diálogo personalizado
				int result = JOptionPane.showConfirmDialog(null, panel, "Personalizado",
		                JOptionPane.OK_OPTION, JOptionPane.PLAIN_MESSAGE);

				// Si el usuario presiona OK, obtener el texto ingresado
				if (result == JOptionPane.OK_OPTION) {
				     respuesta = texto.getText();
				}
				
				//System.out.println(respuesta);
				
				
				//System.out.println("Introduce el número de ciudades infectadas al inicio: ");
				usuario = respuesta;			
				linea = br.readLine();
				linea1 = devolverXml(usuario, linea, linea1, entrada);
				lineaTot = lineaTot + linea1 + "\n";
				
				panel = new JPanel();
				panel.add(new JLabel("Introduce el número de ciudades infectadas por ronda: "));
				panel.add(texto);

				// Mostrar un cuadro de diálogo personalizado
				result = JOptionPane.showConfirmDialog(null, panel, "Personalizado",
		                JOptionPane.OK_OPTION, JOptionPane.PLAIN_MESSAGE);

				// Si el usuario presiona OK, obtener el texto ingresado
				if (result == JOptionPane.OK_OPTION) {
				     respuesta = texto.getText();
				}
				
				
				//System.out.println("Introduce el número de ciudades infectadas por ronda: ");
				usuario = respuesta;
				linea = br.readLine();
				linea1 = devolverXml(usuario, linea, linea1, entrada);
				lineaTot = lineaTot + linea1 + "\n";
				
				panel = new JPanel();
				panel.add(new JLabel("Introduce el número de enfermedades activas para perder: "));
				panel.add(texto);

				// Mostrar un cuadro de diálogo personalizado
				result = JOptionPane.showConfirmDialog(null, panel, "Personalizado",
		                JOptionPane.OK_OPTION, JOptionPane.PLAIN_MESSAGE);

				// Si el usuario presiona OK, obtener el texto ingresado
				if (result == JOptionPane.OK_OPTION) {
				     respuesta = texto.getText();
				}
				//System.out.println("Introduce el número de enfermedades activas para perder: ");
				usuario = respuesta;
				linea = br.readLine();
				linea1 = devolverXml(usuario, linea, linea1, entrada);
				lineaTot = lineaTot + linea1 + "\n";
				
				
				panel = new JPanel();
				panel.add(new JLabel("Introduce el número de brotes para perder: "));
				panel.add(texto);

				// Mostrar un cuadro de diálogo personalizado
				result = JOptionPane.showConfirmDialog(null, panel, "Personalizado",
		                JOptionPane.OK_OPTION, JOptionPane.PLAIN_MESSAGE);

				// Si el usuario presiona OK, obtener el texto ingresado
				if (result == JOptionPane.OK_OPTION) {
				     respuesta = texto.getText();
				}
				
				//System.out.println("Introduce el número de brotes para perder: ");
				usuario = respuesta;
				linea = br.readLine();
				linea1 = devolverXml(usuario, linea, linea1, entrada);
				lineaTot = lineaTot + linea1 + "\n";
				
				
				panel = new JPanel();
				panel.add(new JLabel("Introduce el porcentaje de desarrollo de la vacuna: "));
				panel.add(texto);

				// Mostrar un cuadro de diálogo personalizado
				result = JOptionPane.showConfirmDialog(null, panel, "Personalizado",
		                JOptionPane.OK_OPTION, JOptionPane.PLAIN_MESSAGE);

				// Si el usuario presiona OK, obtener el texto ingresado
				if (result == JOptionPane.OK_OPTION) {
				     respuesta = texto.getText();
				}
				//System.out.println("Introduce el porcentaje de desarrollo de la vacuna: ");
				usuario = respuesta;
				linea = br.readLine();
				linea1 = devolverXml(usuario, linea, linea1, entrada);
				lineaTot = lineaTot + linea1 + "\n";
				
				linea = br.readLine();
				lineaTot = lineaTot + linea + "\n";
			} catch (Exception e) {
				System.out.println("Error E/S: " + e);
			}
			
			return lineaTot;
			
		}
	
	
	
	
	
	
}
