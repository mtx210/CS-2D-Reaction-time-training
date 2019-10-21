import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Window_teamselect extends JFrame implements ActionListener {
	
	JButton button_ct,button_t,button_back;

	public Window_teamselect() {
		setLayout(null);							
		setSize(1920,1080);
		
		JLabel chooseteam_message = new JLabel("Choose your team:",SwingConstants.CENTER);
		chooseteam_message.setBounds(550,200,820,100);
		chooseteam_message.setFont(new Font("Arial Black",Font.BOLD, 40));
		add(chooseteam_message);
		chooseteam_message.setForeground(Color.white);
		
		JLabel background_label = new JLabel();
		Icon background = new ImageIcon("teamselect_background.jpg");
		background_label.setIcon(background);
		background_label.setBounds(0,0,1920,1080);
		add(background_label);
		
		setTitle("Cont Striek: ISIS Conflict v2.0 by MTX");
		setLocationRelativeTo(null);				
		setVisible(true);	
		
		Icon CTicon = new ImageIcon("teamselect_backgroundCT.jpg");
		button_ct = new JButton(CTicon);
		button_ct.setBounds(150,300,800,400);
		add(button_ct);
		button_ct.addActionListener(this);	
		
		Icon Ticon = new ImageIcon("teamselect_backgroundT.jpg");
		button_t = new JButton(Ticon);
		button_t.setBounds(970,300,800,400);
		add(button_t);
		button_t.addActionListener(this);
		
		Icon exitIcon = new ImageIcon("teamselect_iconExit.jpg");
		button_back = new JButton(exitIcon);
		button_back.setBounds(30,980,200,50);
		add(button_back);
		button_back.addActionListener(this);
		
			
	}

	public static void main(String[] args) {
			
	}
	
	@Override				
	public void actionPerformed(ActionEvent arg) {
		Object source = arg.getSource();
		if (source==button_ct) {
			dispose();
			Window_gameprocess window1 = new Window_gameprocess(1);
		}
		else if (source==button_t) {
			dispose();
			Window_gameprocess window2 = new Window_gameprocess(2);
		}
		else if (source==button_back) {
			dispose();
			Window_main window3 = new Window_main();
		}		
	}

}