import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Window_main extends JFrame implements ActionListener {
	
	JButton button_startgame,button_credits,button_exit;

	public Window_main() {
		JLabel background_label = new JLabel();
		Icon background = new ImageIcon("main_background.jpg");
		background_label.setIcon(background);
		background_label.setBounds(0,0,1920,1080);
		add(background_label);
		
		setSize(1920,1080);
		setTitle("Cont Striek: ISIS Conflict v2.0 by MTX");
		setLocationRelativeTo(null);
		setVisible(true);
		getContentPane().setLayout(null);
		
		Icon startIcon = new ImageIcon("main_iconStart.jpg");
		button_startgame = new JButton(startIcon);
		button_startgame.setBounds(30, 820, 200, 50);
		getContentPane().add(button_startgame);
		button_startgame.addActionListener(this);
		
		Icon creditsIcon = new ImageIcon("main_iconCredits.jpg");
		button_credits = new JButton(creditsIcon);
		button_credits.setBounds(30, 900, 200, 50);
		getContentPane().add(button_credits);
		button_credits.addActionListener(this);
		
		Icon exitIcon = new ImageIcon("main_iconExit.jpg");
		button_exit = new JButton(exitIcon);
		button_exit.setBounds(30, 980, 200, 50);
		getContentPane().add(button_exit);
		button_exit.addActionListener(this);
	}

	public static void main(String[] args) {
			Window_main window1 = new Window_main();
	}

	@Override
	public void actionPerformed(ActionEvent arg) {
		Object source = arg.getSource();
		if (source==button_startgame) {
			dispose();
			Window_teamselect nextWindow = new Window_teamselect();
		}
		else if (source==button_credits) {
			dispose();
			Window_credits nextWindow = new Window_credits();
		}
		else if (source==button_exit) {
			dispose();
		}		
	}

}