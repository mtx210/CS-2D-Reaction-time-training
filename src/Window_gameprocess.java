import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Window_gameprocess extends JFrame implements ActionListener {
	
	JButton button_use,button_reload,button_inspect,button_change,button_exit;
	static JLabel main_screen_label,hud,hud1,hud2,hud3;
	static Equipment inventory;

	public Window_gameprocess(int teamchoice) {
		setLayout(null);							
		setSize(1920,1080);
		setTitle("Cunt Striek v1.0 by MTX");
		setLocationRelativeTo(null);				
		setVisible(true);							
		
		Icon useIcon = new ImageIcon("gameprocess_iconUse.jpg");
		button_use = new JButton(useIcon);
		button_use.setBounds(150,985,200,50);
		add(button_use);
		button_use.addActionListener(this);		
		Icon reloadIcon = new ImageIcon("gameprocess_iconReload.jpg");
		button_reload = new JButton(reloadIcon);
		button_reload.setBounds(500,985,200,50);
		add(button_reload);
		button_reload.addActionListener(this);	
		Icon inspectIcon = new ImageIcon("gameprocess_iconInspect.jpg");
		button_inspect = new JButton(inspectIcon);
		button_inspect.setBounds(850,985,200,50);
		add(button_inspect);
		button_inspect.addActionListener(this);	
		Icon changeIcon = new ImageIcon("gameprocess_iconChange.jpg");
		button_change = new JButton(changeIcon);
		button_change.setBounds(1250,985,200,50);
		add(button_change);
		button_change.addActionListener(this);	
		Icon exitIcon = new ImageIcon("gameprocess_iconExit.jpg");
		button_exit = new JButton(exitIcon);
		button_exit.setBounds(1600,985,200,50);
		add(button_exit);
		button_exit.addActionListener(this);
		inventory = new Equipment(teamchoice);
		
		hud = new JLabel("Ammo: ");
		hud.setBounds(30,800, 50, 150);
		hud.setForeground(Color.white);
		add(hud);		
		hud1 = new JLabel();
		hud1.setText(String.valueOf(inventory.active_slot.getCurrentAmmo()));
		hud1.setBounds(80,800, 25, 150);
		hud1.setForeground(Color.white);
		add(hud1);		
		hud2 = new JLabel("/");
		hud2.setBounds(105,800, 10, 150);
		hud2.setForeground(Color.white);
		add(hud2);	
		hud3 = new JLabel();
		hud3.setText(String.valueOf(inventory.active_slot.getMagCapacity()));
		hud3.setBounds(115,800, 25, 150);
		hud3.setForeground(Color.white);
		add(hud3);
		
		main_screen_label = new JLabel();
		Icon main_screen = new ImageIcon("gameprocess_backgroundDefault.jpg");
		main_screen_label.setIcon(main_screen);
		main_screen_label.setBounds(0,0,1920,980);
		add(main_screen_label);	
		main_screen_label.setIcon(inventory.active_slot.getIcon());		
		
	
		

	}

	public static void main(String[] args) {

	}
	
	@Override				
	public void actionPerformed(ActionEvent arg) {
		Object source = arg.getSource();
		if (source==button_use) {
			inventory.active_slot.use();
			hud1.setText(String.valueOf(inventory.active_slot.getCurrentAmmo()));
		}		
		else if (source==button_reload) {
			inventory.active_slot.reload();
			hud1.setText(String.valueOf(inventory.active_slot.getCurrentAmmo()));
		}
		else if (source==button_inspect) {
			
		}
		else if (source==button_change) {
			inventory.change_weapon();
			main_screen_label.setIcon(inventory.active_slot.getIcon());
			hud1.setText(String.valueOf(inventory.active_slot.getCurrentAmmo()));
			hud3.setText(String.valueOf(inventory.active_slot.getMagCapacity()));
		}
		else if (source==button_exit) {
			dispose();
			Window_main window1 = new Window_main();
		}
	}

}