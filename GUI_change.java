package CC_ze;



import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

	//====================================================================================
	//										      										  
	//		class gui_change:									      						  
	//										      										  
	//		this class just initializes the window where u can generate a new password     
	//										      										  
	//====================================================================================

public class GUI_change
{
	public GUI_change()
	{
		// ========================================================================================================
		// generate frame ->
		
		JFrame frame = new JFrame("PW User:XXXXXX Ändern"); // get from cc_main.dataset
		frame.setLayout(null);
		frame.setSize(350, 230);
		
		
		// ========================================================================================================
		// generate labels ->

		JLabel lb_userid = new JLabel(ZE_main.data[10], SwingConstants.CENTER);
		lb_userid.setBounds(25, 15, 280, 35);
		lb_userid.setOpaque(true);
		lb_userid.setBackground(Color.LIGHT_GRAY);

		JLabel lb_newpw = new JLabel("***", SwingConstants.CENTER);
		lb_newpw.setBounds(25, 60, 280, 35);
		lb_newpw.setOpaque(true);
		lb_newpw.setBackground(Color.LIGHT_GRAY);

		// ========================================================================================================
		// generate buttons ->

		JButton bt_newpw = new JButton("PW generieren");
		bt_newpw.setBounds(90, 120, 150, 25);
		bt_newpw.addActionListener(new ActionListener()
		{

			@Override
			public void actionPerformed(ActionEvent e)
			{
				data_handler.newpw(ZE_main.data); // create new PW
				lb_newpw.setText(Krypt.base64Decode(ZE_main.data[11])); // show new PW in lb_newpw
			}
		});

		JButton bt_savepw = new JButton("PW speichern");
		bt_savepw.setBounds(90, 150, 150, 25);
		bt_savepw.addActionListener(new ActionListener()
		{

			@Override
			public void actionPerformed(ActionEvent e)
			{
				sql_handler.manipulate(data_handler.updatePa(ZE_main.data)); // update in DB
				frame.dispose(); // close the window
			}
		});

		// ========================================================================================================
		// add all elements to frame ->

		frame.add(lb_newpw);
		frame.add(lb_userid);

		frame.add(bt_newpw);
		frame.add(bt_savepw);

		// ========================================================================================================
		// set frame to center + set frame visible ->
		
		frame.setLocationRelativeTo(null); // set frame to middle of monitor
		frame.setVisible(true); // set frame visible
	}
}
