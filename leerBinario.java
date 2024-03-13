package Pandemic;

import java.io.*;

public class leerBinario {

	public static void main(String[] args) {
		File NomFit = new File("CCP.bin");
		
		
		try {
			DataInputStream leerFichero = new DataInputStream(new FileInputStream(NomFit));
			
			do {
				System.out.println(leerFichero.readUTF());
				System.out.println(leerFichero.readInt());
				System.out.println(leerFichero.readUTF());
				System.out.println(leerFichero.readUTF());
				
				System.out.println(leerFichero.readInt());
				System.out.println(leerFichero.readUTF());
				System.out.println(leerFichero.readUTF());
				
				System.out.println(leerFichero.readInt());
				System.out.println(leerFichero.readUTF());
				System.out.println(leerFichero.readUTF());
				
				System.out.println(leerFichero.readInt());
				System.out.println(leerFichero.readUTF());
				System.out.println(leerFichero.readUTF());
				
				System.out.println(leerFichero.readInt());
				System.out.println(leerFichero.readInt());
				leerFichero.close();
			}while(true);
					
		}catch(EOFException e) {
			System.out.println("Final fichero");
		} catch (IOException e) {
			System.out.println("Error I/O: " + e);
		}

	}

}
