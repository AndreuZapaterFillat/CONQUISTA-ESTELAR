package Tablero;

import javax.swing.*;
import javax.sound.sampled.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;
import java.awt.event.*;
import java.io.*;


public class Tablero extends JFrame {
	
public Tablero() {
		
        // Configuración de la ventana principal
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        int screenWidth = screenSize.width;
        int screenHeight = screenSize.height;
        
        setSize(screenWidth, screenHeight);
        setTitle("CONQUISTA ESTELAR");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		 // Establecer el icono de la ventana
        Image iconImage = new ImageIcon("logo.jpg").getImage();
        setIconImage(Toolkit.getDefaultToolkit().getImage("F:\\ILERNA\\M03 PROGRAMACIÓ\\UF1\\CONQUISTA ESTELAR\\logo.jpg"));
        getContentPane().setLayout(null);
        
        JLabel Mapa = new JLabel("");
        Mapa.setIcon(new ImageIcon("F:\\ILERNA\\M03 PROGRAMACIÓ\\UF1\\CONQUISTA ESTELAR\\Mapa_conquista_2 - copia.jpg"));
        Mapa.setBounds(0, 0, 1264, 985);
        getContentPane().add(Mapa);
        
        setVisible(true);
	}
}
