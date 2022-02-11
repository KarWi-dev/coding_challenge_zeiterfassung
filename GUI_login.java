package CC_ze;

import java.awt.Color;
import java.awt.event.ActionEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPasswordField;
import javax.swing.JTextField;


public class GUI_login
{
	public static JFrame frame;
	
	
		public GUI_login()
		{
			frame = new JFrame("Zeiterfassung [login]");
			frame.setLayout(null);
			frame.setSize(350, 200);
			
			JTextField tf_id = new JTextField();
			tf_id.setBounds(28, 15, 280, 35);
			tf_id.setOpaque(true);
			tf_id.setBackground(Color.LIGHT_GRAY);
			
			JPasswordField tf_pw = new JPasswordField();
			tf_pw.setBounds(28, 55, 280, 35);
			tf_pw.setOpaque(true);
			tf_pw.setBackground(Color.LIGHT_GRAY);
			
			JButton bt_login = new JButton("Login");
			bt_login.setBounds(120, 110, 100, 25);
			
			
			
			
			
			bt_login.addActionListener((ActionEvent e) -> sql_handler.login(tf_id.getText(),tf_pw.getText()));
			
			
			
			frame.add(tf_id);
			frame.add(tf_pw);
			frame.add(bt_login);
			
			frame.setLocationRelativeTo(null); // set frame to middle of monitor
			frame.setVisible(true); // set frame visible
		}

		
		 
}
