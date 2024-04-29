package Tablero;

import javax.swing.*;
import javax.sound.sampled.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import javax.swing.plaf.basic.BasicProgressBarUI;

import java.awt.*;
import java.awt.event.*;
import java.io.*;

public class Tablero extends JFrame {
	
public Tablero() {
	

    	Font customFont = loadFont("Starjedi.ttf");
    	Font buttonFont = customFont.deriveFont(Font.PLAIN, 14);
		
        // Configuración de la ventana principal
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        int screenWidth = screenSize.width;
        int screenHeight = screenSize.height;
        
        setSize(screenWidth, screenHeight);
        setTitle("CONQUISTA ESTELAR");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		 // Establecer el icono de la ventana
        Image iconImage = new ImageIcon("logo.jpg").getImage();
        setIconImage(Toolkit.getDefaultToolkit().getImage("logo.jpg"));
        getContentPane().setLayout(null);
        
        JProgressBar progressBar_3 = new JProgressBar();
        progressBar_3.setToolTipText("");
        progressBar_3.setStringPainted(true);
        progressBar_3.setForeground(new Color(255, 0, 0));
        progressBar_3.setBounds(319, 915, 250, 30);
        getContentPane().add(progressBar_3);
        progressBar_3.setUI(new BasicProgressBarUI() {
            protected Color getSelectionForeground() {
                return Color.BLACK; // Cambiamos el color del texto del porcentaje
            }
        });
        progressBar_3.setValue(100);
        
        JProgressBar progressBar_2 = new JProgressBar();
        progressBar_2.setStringPainted(true);
        progressBar_2.setForeground(new Color(128, 255, 0));
        progressBar_2.setBounds(319, 874, 250, 30);
        getContentPane().add(progressBar_2);
        progressBar_2.setUI(new BasicProgressBarUI() {
            protected Color getSelectionForeground() {
                return Color.BLACK; // Cambiamos el color del texto del porcentaje
            }
        });
        progressBar_2.setValue(75);
        
        JProgressBar progressBar_1 = new JProgressBar();
        progressBar_1.setForeground(new Color(255, 255, 0));
        progressBar_1.setStringPainted(true);
        progressBar_1.setBounds(12, 915, 250, 30);
        getContentPane().add(progressBar_1);
        progressBar_1.setUI(new BasicProgressBarUI() {
            protected Color getSelectionForeground() {
                return Color.BLACK; // Cambiamos el color del texto del porcentaje
            }
        });
        progressBar_1.setValue(50);
        
        JProgressBar progressBar = new JProgressBar();
        progressBar.setForeground(new Color(0, 255, 255));
        progressBar.setStringPainted(true);
        progressBar.setBounds(12, 874, 250, 30);
        getContentPane().add(progressBar);
        progressBar.setUI(new BasicProgressBarUI() {
            protected Color getSelectionForeground() {
                return Color.BLACK; // Cambiamos el color del texto del porcentaje
            }
        });
        progressBar.setValue(25);
        
        JButton Iego = new JButton("iego");
        Iego.setForeground(new Color(255, 0, 0));
        Iego.setBounds(1113, 428, 125, 23);
        getContentPane().add(Iego);
        Iego.setFont(buttonFont);
        setButtonProperties(Iego);
        
        JButton Jedah = new JButton("jedah");
        Jedah.setForeground(new Color(255, 0, 0));
        Jedah.setBounds(1147, 769, 125, 23);
        getContentPane().add(Jedah);
        Jedah.setFont(buttonFont);
        setButtonProperties(Jedah);
        
        JButton Scarif = new JButton("scarif");
        Scarif.setForeground(new Color(255, 0, 0));
        Scarif.setBounds(1076, 656, 125, 23);
        getContentPane().add(Scarif);
        Scarif.setFont(buttonFont);
        setButtonProperties(Scarif);
        
        JButton Exegol = new JButton("exegol");
        Exegol.setForeground(new Color(255, 0, 0));
        Exegol.setBounds(1040, 184, 125, 23);
        getContentPane().add(Exegol);
        Exegol.setFont(buttonFont);
        setButtonProperties(Exegol);
        
        JButton Crait = new JButton("crait");
        Crait.setForeground(new Color(255, 0, 0));
        Crait.setBounds(1147, 239, 125, 23);
        getContentPane().add(Crait);
        Crait.setFont(buttonFont);
        setButtonProperties(Crait);
        
        JButton Ahch_To = new JButton("ahch to");
        Ahch_To.setForeground(new Color(255, 0, 0));
        Ahch_To.setBounds(1103, 123, 125, 23);
        getContentPane().add(Ahch_To);
        Ahch_To.setFont(buttonFont);
        setButtonProperties(Ahch_To);
        
        JButton Korriban = new JButton("korriban");
        Korriban.setForeground(new Color(255, 0, 0));
        Korriban.setBounds(1103, 22, 125, 23);
        getContentPane().add(Korriban);
        Korriban.setFont(buttonFont);
        setButtonProperties(Korriban);
        
        JButton Ithor = new JButton("ithor");
        Ithor.setForeground(new Color(255, 0, 0));
        Ithor.setBounds(949, 43, 125, 23);
        getContentPane().add(Ithor);
        Ithor.setFont(buttonFont);
        setButtonProperties(Ithor);
        
        JButton Duro = new JButton("duro");
        Duro.setForeground(new Color(255, 0, 0));
        Duro.setBounds(938, 133, 125, 23);
        getContentPane().add(Duro);
        Duro.setFont(buttonFont);
        setButtonProperties(Duro);
        
        JButton Bothawui = new JButton("bothawui");
        Bothawui.setForeground(new Color(255, 0, 0));
        Bothawui.setBounds(1006, 338, 125, 23);
        getContentPane().add(Bothawui);
        Bothawui.setFont(buttonFont);
        setButtonProperties(Bothawui);
        
        JButton Eriadu = new JButton("eriadu");
        Eriadu.setForeground(new Color(255, 0, 0));
        Eriadu.setBounds(971, 552, 125, 23);
        getContentPane().add(Eriadu);
        Eriadu.setFont(buttonFont);
        setButtonProperties(Eriadu);
        
        JButton Ilum = new JButton("ilum");
        Ilum.setForeground(new Color(255, 0, 0));
        Ilum.setBounds(867, 736, 125, 23);
        getContentPane().add(Ilum);
        Ilum.setFont(buttonFont);
        setButtonProperties(Ilum);
        
        JButton Bakura = new JButton("bakura");
        Bakura.setForeground(new Color(128, 255, 0));
        Bakura.setBounds(912, 478, 125, 23);
        getContentPane().add(Bakura);
        Bakura.setFont(buttonFont);
        setButtonProperties(Bakura);
        
        JButton Wayland = new JButton("wayland");
        Wayland.setForeground(new Color(128, 255, 0));
        Wayland.setBounds(829, 598, 125, 23);
        getContentPane().add(Wayland);
        Wayland.setFont(buttonFont);
        setButtonProperties(Wayland);
        
        JButton Hapes = new JButton("hapes");
        Hapes.setForeground(new Color(128, 255, 0));
        Hapes.setBounds(680, 563, 125, 23);
        getContentPane().add(Hapes);
        Hapes.setFont(buttonFont);
        setButtonProperties(Hapes);
        
        JButton Rishi = new JButton("rishi");
        Rishi.setForeground(new Color(128, 255, 0));
        Rishi.setBounds(877, 386, 125, 23);
        getContentPane().add(Rishi);
        Rishi.setFont(buttonFont);
        setButtonProperties(Rishi);
        
        JButton Dathomir = new JButton("dathomir");
        Dathomir.setForeground(new Color(128, 255, 0));
        Dathomir.setBounds(770, 449, 125, 23);
        getContentPane().add(Dathomir);
        Dathomir.setFont(buttonFont);
        setButtonProperties(Dathomir);
        
        JButton Onderon = new JButton("onderon");
        Onderon.setForeground(new Color(128, 255, 0));
        Onderon.setBounds(877, 296, 125, 23);
        getContentPane().add(Onderon);
        Onderon.setFont(buttonFont);
        setButtonProperties(Onderon);
        
        JButton Manaan = new JButton("manaan");
        Manaan.setForeground(new Color(128, 255, 0));
        Manaan.setBounds(812, 207, 125, 23);
        getContentPane().add(Manaan);
        Manaan.setFont(buttonFont);
        setButtonProperties(Manaan);
        
        JButton Mygeeto = new JButton("mygeeto");
        Mygeeto.setForeground(new Color(128, 255, 0));
        Mygeeto.setBounds(738, 350, 125, 23);
        getContentPane().add(Mygeeto);
        Mygeeto.setFont(buttonFont);
        setButtonProperties(Mygeeto);
        
        JButton Zeltros = new JButton("zeltros");
        Zeltros.setForeground(new Color(128, 255, 0));
        Zeltros.setBounds(709, 253, 125, 23);
        getContentPane().add(Zeltros);
        Zeltros.setFont(buttonFont);
        setButtonProperties(Zeltros);
        
        JButton Malachor = new JButton("malachor");
        Malachor.setForeground(new Color(128, 255, 0));
        Malachor.setBounds(680, 499, 125, 23);
        getContentPane().add(Malachor);
        Malachor.setFont(buttonFont);
        setButtonProperties(Malachor);
        
        JButton Kessel = new JButton("kessel");
        Kessel.setForeground(new Color(128, 255, 0));
        Kessel.setBounds(602, 397, 125, 23);
        getContentPane().add(Kessel);
        Kessel.setFont(buttonFont);
        setButtonProperties(Kessel);
        
        JButton Mon_Cala = new JButton("mon cala");
        Mon_Cala.setForeground(new Color(128, 255, 0));
        Mon_Cala.setBounds(568, 286, 125, 23);
        getContentPane().add(Mon_Cala);
        Mon_Cala.setFont(buttonFont);
        setButtonProperties(Mon_Cala);
        
        JButton Lothal = new JButton("lothal");
        Lothal.setForeground(new Color(255, 255, 0));
        Lothal.setBounds(462, 780, 125, 23);
        getContentPane().add(Lothal);
        Lothal.setFont(buttonFont);
        setButtonProperties(Lothal);
        
        JButton Nal_Hutta = new JButton("nal hutta");
        Nal_Hutta.setForeground(new Color(255, 255, 0));
        Nal_Hutta.setBounds(491, 619, 125, 23);
        getContentPane().add(Nal_Hutta);
        Nal_Hutta.setFont(buttonFont);
        setButtonProperties(Nal_Hutta);
        
        JButton Taris = new JButton("taris");
        Taris.setForeground(new Color(255, 255, 0));
        Taris.setBounds(340, 680, 89, 23);
        getContentPane().add(Taris);
        Taris.setFont(buttonFont);
        setButtonProperties(Taris);
        
        JButton Felucia = new JButton("felucia");
        Felucia.setForeground(new Color(255, 255, 0));
        Felucia.setBounds(419, 466, 125, 23);
        getContentPane().add(Felucia);
        Felucia.setFont(buttonFont);
        setButtonProperties(Felucia);
        
        JButton Dantooine = new JButton("dantooine");
        Dantooine.setForeground(new Color(255, 255, 0));
        Dantooine.setBounds(284, 466, 125, 23);
        getContentPane().add(Dantooine);
        Dantooine.setFont(buttonFont);
        setButtonProperties(Dantooine);
        
        JButton Mandalore = new JButton("mandalore");
        Mandalore.setForeground(new Color(255, 255, 0));
        Mandalore.setBounds(127, 563, 135, 23);
        getContentPane().add(Mandalore);
        Mandalore.setFont(buttonFont);
        setButtonProperties(Mandalore);
        
        JButton Ryloth = new JButton("ryloth");
        Ryloth.setForeground(new Color(255, 255, 0));
        Ryloth.setBounds(54, 747, 125, 23);
        getContentPane().add(Ryloth);
        Ryloth.setFont(buttonFont);
        setButtonProperties(Ryloth);
        
        JButton Sullust = new JButton("sullust");
        Sullust.setForeground(new Color(255, 255, 0));
        Sullust.setBounds(54, 478, 125, 23);
        getContentPane().add(Sullust);
        Sullust.setFont(buttonFont);
        setButtonProperties(Sullust);
        
        JButton Corellia = new JButton("corellia");
        Corellia.setForeground(new Color(255, 255, 0));
        Corellia.setBounds(284, 308, 125, 23);
        getContentPane().add(Corellia);
        Corellia.setFont(buttonFont);
        setButtonProperties(Corellia);
        
        JButton Chandrilla = new JButton("chandrilla");
        Chandrilla.setForeground(new Color(255, 255, 0));
        Chandrilla.setBounds(182, 253, 135, 23);
        getContentPane().add(Chandrilla);
        Chandrilla.setFont(buttonFont);
        setButtonProperties(Chandrilla);
        
        JButton Jakku = new JButton("jakku");
        Jakku.setForeground(new Color(255, 255, 0));
        Jakku.setBounds(295, 228, 125, 23);
        getContentPane().add(Jakku);
        Jakku.setFont(buttonFont);
        setButtonProperties(Jakku);
        
        JButton Utapau = new JButton("utapau");
        Utapau.setForeground(new Color(255, 255, 0));
        Utapau.setBounds(54, 184, 125, 23);
        getContentPane().add(Utapau);
        Utapau.setFont(buttonFont);
        setButtonProperties(Utapau);
        
        JButton Yavin = new JButton("yavin");
        Yavin.setForeground(new Color(0, 255, 255));
        Yavin.setBounds(829, 22, 125, 23);
        getContentPane().add(Yavin);
        Yavin.setFont(buttonFont);
        setButtonProperties(Yavin);
        
        JButton Dagobah = new JButton("dagobah");
        Dagobah.setForeground(new Color(0, 255, 255));
        Dagobah.setBounds(626, 161, 125, 23);
        getContentPane().add(Dagobah);
        Dagobah.setFont(buttonFont);
        setButtonProperties(Dagobah);
        
        JButton Mustafar = new JButton("mustafar");
        Mustafar.setForeground(new Color(0, 255, 255));
        Mustafar.setBounds(709, 67, 125, 23);
        getContentPane().add(Mustafar);
        Mustafar.setFont(buttonFont);
        setButtonProperties(Mustafar);
        
        JButton Geonosis = new JButton("geonosis");
        Geonosis.setForeground(new Color(0, 255, 255));
        Geonosis.setBounds(614, 123, 125, 23);
        getContentPane().add(Geonosis);
        Geonosis.setFont(buttonFont);
        setButtonProperties(Geonosis);
        
        JButton Kamino = new JButton("kamino");
        Kamino.setForeground(new Color(0, 255, 255));
        Kamino.setBounds(385, 194, 125, 23);
        getContentPane().add(Kamino);
        Kamino.setFont(buttonFont);
        setButtonProperties(Kamino);
        
        JButton Naboo = new JButton("naboo");
        Naboo.setForeground(new Color(0, 255, 255));
        Naboo.setBounds(602, 11, 125, 23);
        getContentPane().add(Naboo);
        Naboo.setFont(buttonFont);
        setButtonProperties(Naboo);
        
        JButton Hoth = new JButton("hoth");
        Hoth.setForeground(new Color(0, 255, 255));
        Hoth.setBounds(366, 133, 89, 23);
        getContentPane().add(Hoth);
        Hoth.setFont(buttonFont);
        setButtonProperties(Hoth);
        
        JButton Endor = new JButton("endor");
        Endor.setForeground(new Color(0, 255, 255));
        Endor.setBounds(462, 82, 125, 23);
        getContentPane().add(Endor);
        Endor.setFont(buttonFont);
        setButtonProperties(Endor);
        
        JButton Kashyyyk = new JButton("kashyyyk");
        Kashyyyk.setForeground(new Color(0, 255, 255));
        Kashyyyk.setBounds(352, 0, 125, 23);
        getContentPane().add(Kashyyyk);
        Kashyyyk.setFont(buttonFont);
        setButtonProperties(Kashyyyk);
        
        JButton Alderaan = new JButton("alderaan");
        Alderaan.setForeground(new Color(0, 255, 255));
        Alderaan.setBounds(237, 143, 125, 23);
        getContentPane().add(Alderaan);
        Alderaan.setFont(buttonFont);
        setButtonProperties(Alderaan);
        
        JButton Tatooine = new JButton("tatooine");
        Tatooine.setForeground(new Color(0, 255, 255));
        Tatooine.setBounds(196, 33, 125, 23);
        getContentPane().add(Tatooine);
        Tatooine.setFont(buttonFont);
        setButtonProperties(Tatooine);
        
        JButton Coruscant = new JButton("coruscant");
        Coruscant.setForeground(new Color(0, 255, 255));
        Coruscant.setBounds(29, 22, 125, 23);
        getContentPane().add(Coruscant);
        Coruscant.setFont(buttonFont);
        setButtonProperties(Coruscant);
        
        JLabel Mapa = new JLabel("");
        Mapa.setForeground(new Color(0, 128, 255));
        Mapa.setBounds(0, 0, 1264, 985);
        Mapa.setIcon(new ImageIcon("F:\\ILERNA\\M03 PROGRAMACIÓ\\UF1\\CONQUISTA ESTELAR\\Mapa_conquista_final.jpg"));
        getContentPane().add(Mapa);
              
        setVisible(true);
	}

	private Font loadFont(String path) {
	    try {
	        return Font.createFont(Font.TRUETYPE_FONT, new File(path)).deriveFont(Font.PLAIN, 12);
	    } catch (IOException | FontFormatException e) {
	        e.printStackTrace();
	        // Si hay un error al cargar la fuente, devuelve una fuente por defecto (Tahoma)
	        return new Font("Tahoma", Font.PLAIN, 12);
	    }
}

	private void setButtonProperties(JButton button) {
		button.setOpaque(false); // Hace que el botón sea transparente
    	button.setContentAreaFilled(false); // Hace que el área de contenido del botón sea transparente
    	button.setBorderPainted(false); // Quita el borde del botón
	}
}
