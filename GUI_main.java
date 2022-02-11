package CC_ze;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTabbedPane;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class GUI_main
{
	public static JFrame         frame;
	public static JTextField     tf_fname;
	public static JTextField     tf_lname;
	public static JTextField     tf_str;
	public static JTextField     tf_post;
	public static JTextField     tf_city;
	public static JTextField     tf_bDate;
	public static JTextField     tf_tel;
	public static JTextField     tf_mail;
	public static JTextField     tf_username;
	public static JPasswordField pw_pw;
	
	public GUI_main(int code)
	{
		// frame erzeugen
		JFrame frame = new JFrame("Zeiterfassung [Hauptansicht]");
		frame.setSize(360, 550);
		
		JMenuBar mn_bar = new JMenuBar();
		mn_bar.setBorderPainted(true);
		
		// Erzeugung eines Objektes der Klasse
		// JMenu-------------------------------------------------------------------
		JMenu jm_menu = new JMenu("Menü");
		
		// Erzeugung eines Objektes der Klasse JMenuItem
		JMenuItem it_print = new JMenuItem("drucken");
		it_print.addActionListener(new ActionListener()
		{
			@Override
			public void actionPerformed(ActionEvent e)
			{
				// TODO Auto-generated method stub
				
			}
		});
		
		JMenuItem it_help = new JMenuItem("hilfe");
		it_help.addActionListener(new ActionListener()
		{
			@Override
			public void actionPerformed(ActionEvent e)
			{
				// TODO Auto-generated method stub
				
			}
		});
		
		JMenuItem it_logout = new JMenuItem("abmelden");
		it_logout.addActionListener(new ActionListener()
		{
			@Override
			public void actionPerformed(ActionEvent e)
			{
				// TODO speichern!!!!!!!!!!
				frame.dispose();
				GUI_login init = new GUI_login();
				
			}
		});
		
		JMenuItem it_end = new JMenuItem("beenden");
		it_end.addActionListener(new ActionListener()
		{
			@Override
			public void actionPerformed(ActionEvent e)
			{
				// TODO speichern!!!!!!!
				frame.dispose();
			}
		});
		
		// Wir fügen das JMenuItem unserem JMenu hinzu
		jm_menu.add(it_print);
		jm_menu.add(it_help);
		jm_menu.add(it_logout);
		jm_menu.add(it_end);
		
		// Menü wird der Menüleiste hinzugefügt
		mn_bar.add(jm_menu);
		
		// Hier erzeugen wir unsere
		// JPanels-------------------------------------------------------------------
		JPanel pa_Data = new JPanel();
		pa_Data.setLayout(null);
		
		JPanel pa_Time = new JPanel();
		pa_Time.setLayout(null);
		
		JPanel pa_otherTime = new JPanel();
		pa_otherTime.setLayout(null);
		
		// erzeugen und hinzufügen der elemente für panel
		// pa_data-------labels---------------------------------------------
		JLabel lb_fname = new JLabel("Vorname", SwingConstants.CENTER);
		lb_fname.setBounds(10, 10, 150, 25);// 400 breite
		lb_fname.setOpaque(true);
		lb_fname.setBackground(Color.LIGHT_GRAY);
		
		JLabel lb_lname = new JLabel("Nachname", SwingConstants.CENTER);
		lb_lname.setBounds(10, 40, 150, 25);// 400 breite
		lb_lname.setOpaque(true);
		lb_lname.setBackground(Color.LIGHT_GRAY);
		
		JLabel lb_str = new JLabel("Straße/Nr", SwingConstants.CENTER);
		lb_str.setBounds(10, 70, 150, 25);// 400 breite
		lb_str.setOpaque(true);
		lb_str.setBackground(Color.LIGHT_GRAY);
		
		JLabel lb_post = new JLabel("Postleitzahl", SwingConstants.CENTER);
		lb_post.setBounds(10, 100, 150, 25);// 400 breite
		lb_post.setOpaque(true);
		lb_post.setBackground(Color.LIGHT_GRAY);
		
		JLabel lb_city = new JLabel("Ort", SwingConstants.CENTER);
		lb_city.setBounds(10, 130, 150, 25);// 400 breite
		lb_city.setOpaque(true);
		lb_city.setBackground(Color.LIGHT_GRAY);
		
		JLabel lb_bDate = new JLabel("Geburtstag", SwingConstants.CENTER);
		lb_bDate.setBounds(10, 160, 150, 25);// 400 breite
		lb_bDate.setOpaque(true);
		lb_bDate.setBackground(Color.LIGHT_GRAY);
		
		JLabel lb_tel = new JLabel("Telefon", SwingConstants.CENTER);
		lb_tel.setBounds(10, 190, 150, 25);// 400 breite
		lb_tel.setOpaque(true);
		lb_tel.setBackground(Color.LIGHT_GRAY);
		
		JLabel lb_mail = new JLabel("Email", SwingConstants.CENTER);
		lb_mail.setBounds(10, 220, 150, 25);// 400 breite
		lb_mail.setOpaque(true);
		lb_mail.setBackground(Color.LIGHT_GRAY);
		
		JLabel lb_username = new JLabel("Username", SwingConstants.CENTER);
		lb_username.setBounds(10, 250, 150, 25);// 400 breite
		lb_username.setOpaque(true);
		lb_username.setBackground(Color.LIGHT_GRAY);
		
		JLabel lb_pw = new JLabel("Passwort", SwingConstants.CENTER);
		lb_pw.setBounds(10, 280, 150, 25);// 400 breite
		lb_pw.setOpaque(true);
		lb_pw.setBackground(Color.LIGHT_GRAY);
		
		// textfelder------------------------------------------------------------
		tf_fname = new JTextField();
		tf_fname.setBounds(180, 10, 150, 25);// 400 breite
		
		tf_lname = new JTextField();
		tf_lname.setBounds(180, 40, 150, 25);// 400 breite
		
		tf_str = new JTextField();
		tf_str.setBounds(180, 70, 150, 25);// 400 breite
		
		tf_post = new JTextField();
		tf_post.setBounds(180, 100, 150, 25);// 400 breite
		
		tf_city = new JTextField();
		tf_city.setBounds(180, 130, 150, 25);// 400 breite
		
		tf_bDate = new JTextField();
		tf_bDate.setBounds(180, 160, 150, 25);
		
		tf_tel = new JTextField();
		tf_tel.setBounds(180, 190, 150, 25);// 400 breite
		
		tf_mail = new JTextField();
		tf_mail.setBounds(180, 220, 150, 25);// 400 breite
		
		tf_username = new JTextField();
		tf_username.setBounds(180, 250, 150, 25);// 400 breite
		
		pw_pw = new JPasswordField();
		pw_pw.setBounds(180, 280, 150, 25);
		
		// buttons-----------------------------------------------------------------
		JButton bt_save = new JButton("Speichern");
		bt_save.setBounds(180, 315, 150, 25);
		bt_save.addActionListener(new ActionListener()
		{
			@Override
			public void actionPerformed(ActionEvent e)
			{
				ZE_main.data[1]  = GUI_main.tf_fname.getText();
				ZE_main.data[2]  = GUI_main.tf_lname.getText();
				ZE_main.data[3]  = GUI_main.tf_str.getText();
				ZE_main.data[4]  = GUI_main.tf_post.getText();
				ZE_main.data[5]  = GUI_main.tf_city.getText();
				ZE_main.data[6]  = GUI_main.tf_bDate.getText();
				ZE_main.data[7]  = GUI_main.tf_tel.getText();
				ZE_main.data[8]  = GUI_main.tf_mail.getText();
				ZE_main.data[9]  = "2";
				ZE_main.data[10] = GUI_main.tf_username.getText();
				
				// for (String i : ZE_main.data)
				// { System.out.println(i); }
				
				
				try
				{
					
					
					if (ZE_main.data[10].equals(""))
					{
						sql_handler.manipulate(data_handler.ppInsert(ZE_main.data));
						data_handler.user(ZE_main.data);
					}
					else
					{
						sql_handler.manipulate(data_handler.update(ZE_main.data));
						
					}
					
					
					GUI_msg msg = new GUI_msg(9);
				}
				catch (Exception e2)
				{
					
					GUI_msg msg = new GUI_msg(404);
				}
				
				
			}
			
		});
		
		JButton bt_search = new JButton("Suchen");
		bt_search.setBounds(10, 315, 150, 25);
		bt_search.addActionListener(new ActionListener()
		{
			@Override
			public void actionPerformed(ActionEvent e)
			{
				data_handler.print(tf_username.getText());
				ZE_main.temp = tf_username.getText();
			}
		});
		
		JButton bt_pw = new JButton("Neues Passwort");
		bt_pw.setBounds(10, 345, 150, 25);
		bt_pw.addActionListener(new ActionListener()
		{
			@Override
			public void actionPerformed(ActionEvent e)
			{
				sql_handler.searchP(tf_username.getText()); // get tupel from db
				GUI_change change = new GUI_change(); // open new window to perform action in new window
			}
			
		});
		
		JButton bt_delete = new JButton("Löschen");
		bt_delete.setBounds(180, 345, 150, 25);
		bt_delete.addActionListener(new ActionListener()
		{
			@Override
			public void actionPerformed(ActionEvent e)
			{
				// TODO
				
			}
		});
		
		pa_Data.add(lb_fname);
		pa_Data.add(lb_lname);
		pa_Data.add(lb_str);
		pa_Data.add(lb_post);
		pa_Data.add(lb_city);
		pa_Data.add(lb_tel);
		pa_Data.add(lb_mail);
		pa_Data.add(lb_username);
		pa_Data.add(lb_pw);
		pa_Data.add(lb_bDate);
		
		pa_Data.add(tf_fname);
		pa_Data.add(tf_lname);
		pa_Data.add(tf_str);
		pa_Data.add(tf_post);
		pa_Data.add(tf_city);
		pa_Data.add(tf_tel);
		pa_Data.add(tf_mail);
		pa_Data.add(tf_username);
		pa_Data.add(pw_pw);
		pa_Data.add(tf_bDate);
		
		// TODO if admin:
		pa_Data.add(bt_search);
		pa_Data.add(bt_pw);
		pa_Data.add(bt_delete);
		// TODO if admin or mitarbeiter
		pa_Data.add(bt_save);
		
		// erzeugen und hinzufügen der elemente für panel
		// pa_Time--------------------------------------------------------
		JLabel lb_start = new JLabel("Begin:", SwingConstants.CENTER);
		lb_start.setBounds(10, 40, 150, 25);// 400 breite
		lb_start.setOpaque(true);
		lb_start.setBackground(Color.LIGHT_GRAY);
		
		JLabel lb_end = new JLabel("Ende:", SwingConstants.CENTER);
		lb_end.setBounds(10, 70, 150, 25);// 400 breite
		lb_end.setOpaque(true);
		lb_end.setBackground(Color.LIGHT_GRAY);
		
		JLabel lb_breaks = new JLabel("Pausen:", SwingConstants.CENTER);
		lb_breaks.setBounds(10, 100, 150, 25);// 400 breite
		lb_breaks.setOpaque(true);
		lb_breaks.setBackground(Color.LIGHT_GRAY);
		
		JTextField tf_bla = new JTextField("hier jspinner");
		tf_bla.setBounds(180, 10, 150, 25);// 400 breite
		
		JTextField tf_start = new JTextField();
		tf_start.setBounds(180, 40, 150, 25);// 400 breite
		
		JTextField tf_end = new JTextField();
		tf_end.setBounds(180, 70, 150, 25);// 400 breite
		
		JTextField tf_breaks = new JTextField("hier textarea?");
		tf_breaks.setBounds(180, 100, 150, 25);// 400 breite
		
		pa_Time.add(lb_start);
		pa_Time.add(lb_end);
		pa_Time.add(lb_breaks);
		
		pa_Time.add(tf_bla);
		pa_Time.add(tf_start);
		pa_Time.add(tf_end);
		pa_Time.add(tf_breaks);
		
		// erzeugen und hinzufügen der elemente für panel
		// pa_otherTime-------------------------------------------------
		JTextField tf_username2 = new JTextField("username", SwingConstants.CENTER);
		tf_username2.setBounds(10, 10, 150, 25);// 400 breite
		
		JLabel lb_start2 = new JLabel("Begin:", SwingConstants.CENTER);
		lb_start2.setBounds(10, 40, 150, 25);// 400 breite
		lb_start2.setOpaque(true);
		lb_start2.setBackground(Color.LIGHT_GRAY);
		
		JLabel lb_end2 = new JLabel("Ende:", SwingConstants.CENTER);
		lb_end2.setBounds(10, 70, 150, 25);// 400 breite
		lb_end2.setOpaque(true);
		lb_end2.setBackground(Color.LIGHT_GRAY);
		
		JLabel lb_breaks2 = new JLabel("Pausen:", SwingConstants.CENTER);
		lb_breaks2.setBounds(10, 100, 150, 25);// 400 breite
		lb_breaks2.setOpaque(true);
		lb_breaks2.setBackground(Color.LIGHT_GRAY);
		
		JTextField tf_bla2 = new JTextField("hier jspinner");
		tf_bla2.setBounds(180, 10, 150, 25);// 400 breite
		
		JTextField tf_start2 = new JTextField();
		tf_start2.setBounds(180, 40, 150, 25);// 400 breite
		
		JTextField tf_end2 = new JTextField();
		tf_end2.setBounds(180, 70, 150, 25);// 400 breite
		
		JTextField tf_breaks2 = new JTextField("hier textarea?");
		tf_breaks2.setBounds(180, 100, 150, 25);// 400 breite
		
		pa_otherTime.add(lb_start2);
		pa_otherTime.add(lb_end2);
		pa_otherTime.add(lb_breaks2);
		pa_otherTime.add(tf_username2);
		
		pa_otherTime.add(tf_bla2);
		pa_otherTime.add(tf_start2);
		pa_otherTime.add(tf_end2);
		pa_otherTime.add(tf_breaks2);
		
		// Erzeugung eines
		// JTabbedPane-Objektes-------------------------------------------------------------------
		JTabbedPane tabpane = new JTabbedPane(JTabbedPane.TOP, JTabbedPane.SCROLL_TAB_LAYOUT);
		
		// Hier werden die JPanels als Registerkarten hinzugefügt
		tabpane.addTab("Daten", pa_Data);
		tabpane.addTab("Zeiten", pa_Time);
		
		// TODO if rolle=mitarbeiter:
		tabpane.addTab("Teiln. Zeiten", pa_otherTime);
		
		// elemente werden dem frame
		// zugefügt-------------------------------------------------------------------
		frame.add(tabpane);
		frame.setJMenuBar(mn_bar);
		
		frame.setLocationRelativeTo(null); // set frame to middle of monitor
		frame.setVisible(true); // set frame visible
	}
}
