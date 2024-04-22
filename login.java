package menu;

//Video de referencia: https://www.youtube.com/watch?v=gBtuj_MjgtY

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.ImageIcon;
import java.awt.Color;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class login extends JFrame implements ActionListener{
	
	JPasswordField password;
	JTextField  username;
	JLabel label_password, label_username, message, title;
	JButton btn, reset_btn;
	JCheckBox showpassword;
	
	public login() {
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(800,600);
		this.setTitle("Login test");
		this.setLocationRelativeTo(null);
		getContentPane().setLayout(null);
		
		label_username = new JLabel("Usuario:");
		label_username.setFont(new Font("Comic Sans MS", Font.BOLD, 16));
		label_username.setForeground(new Color(0, 0, 0));
		label_username.setBounds(200,182,100,40);
		
		label_password = new JLabel("Contraseña:");
		label_password.setFont(new Font("Comic Sans MS", Font.BOLD, 16));
		label_password.setForeground(new Color(0, 0, 0));
		label_password.setBounds(199,233,200,40);
		
		message = new JLabel("Mensaje de ejemplo");
		message.setFont(new Font("Comic Sans MS", Font.BOLD, 21));
		message.setHorizontalAlignment(SwingConstants.CENTER);
		message.setForeground(new Color(255, 255, 255));
		message.setBackground(new Color(0, 0, 255));
		message.setBounds(118,445,626,130);
		
		username = new JTextField();
		username.setBounds(300,181,300,40);
		
		password = new JPasswordField();
		password.setBounds(300,232,300,40);
		
		showpassword = new JCheckBox("Mostrar contraseña");
		showpassword.setBounds(616,233,143,40);
		showpassword.addActionListener(this);
		
		btn = new JButton("Conectar");
		btn.setBounds(300,284,100,40);
		btn.addActionListener(this);
		
		reset_btn = new JButton("Reset");
		reset_btn.setBounds(500,284,100,40);
		reset_btn.addActionListener(this);
		
		getContentPane().add(showpassword);
		getContentPane().add(reset_btn);
		getContentPane().add(message);
		getContentPane().add(btn);
		getContentPane().add(username);
		getContentPane().add(label_username);
		getContentPane().add(label_password);
		getContentPane().add(password);
		
		JLabel lblNewLabel = new JLabel("Fondo");
		lblNewLabel.setIcon(new ImageIcon("E:\\ARODRIGUEZ\\Prog\\Pandemic\\learning_the_force_ll.jpg"));
		lblNewLabel.setBounds(0, -18, 1352, 579);
		getContentPane().add(lblNewLabel);
		this.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent evt) {
		// TODO Auto-generated method stub
		//String msg = "Conectando al servidor...";
		
		if(evt.getSource() == btn) {
			String userText = username.getText();
			String pwdText = new String(password.getPassword());
			
			if(userText.equalsIgnoreCase("Paco") && pwdText.equalsIgnoreCase("Paco")) {
				message.setText("Credenciales correctos");
				
			}else {
				message.setText("Credenciales incorrectos");
			}
		}
		
		if(evt.getSource() == reset_btn) {
			username.setText("");
			password.setText("");
			message.setText("");
		}
		
		if(evt.getSource() == showpassword) {
			if(showpassword.isSelected()) {
				password.setEchoChar((char) 0);
			}else {
				password.setEchoChar('*');
			}
		}
		
		//String msg = "Your username is : " + username.getText();
		//msg += " and your password is : " + new String(password.getPassword());
		//message.setText(msg);
	}
}
