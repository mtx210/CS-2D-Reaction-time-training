import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.Icon;
import javax.swing.ImageIcon;


public class main extends JFrame {

	public main() {
		JLabel background_label = new JLabel();
		Icon background = new ImageIcon("intro_background.jpg");
		background_label.setIcon(background);
		background_label.setBounds(0,0,1920,1080);
		add(background_label);
		
		setSize(1920,1080);
		setTitle("Cont Striek: ISIS Conflict v2.0 by MTX");
		setLocationRelativeTo(null);
		setVisible(true);
		getContentPane().setLayout(null);
	}

	public static void main(String[] args) throws InterruptedException {
		main window = new main();
		Thread.sleep(3000);
		window.dispose();
		Window_main window1 = new Window_main();
		
	}
}