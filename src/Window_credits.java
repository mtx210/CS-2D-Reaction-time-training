import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Window_credits extends JFrame implements ActionListener {
	
	JButton button_back;

	public Window_credits() {
		JLabel background_label = new JLabel();
		Icon background = new ImageIcon("credits_background.jpg");
		background_label.setIcon(background);
		background_label.setBounds(0,0,1920,1080);
		add(background_label);
		
		setSize(1920,1080);
		setTitle("Cont Striek: ISIS Conflict v2.0 by MTX");
		setLocationRelativeTo(null);
		setVisible(true);
		getContentPane().setLayout(null);
		
		Icon exitIcon = new ImageIcon("credits_iconExit.jpg");
		button_back = new JButton(exitIcon);
		button_back.setBounds(30, 980, 200, 50);
		getContentPane().add(button_back);
		button_back.addActionListener(this);
	}

	public static void main(String[] args) {
			
	}
	
	@Override
	public void actionPerformed(ActionEvent arg) {
		dispose();	
		Window_main nextWindow = new Window_main();
	}
}