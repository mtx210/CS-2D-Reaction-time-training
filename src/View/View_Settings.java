package View;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.Image;
import java.awt.Toolkit;

public class View_Settings extends JFrame {

    JLabel lBackground;
    JButton bExit;
    ImageIcon iBackground,iExit;
    Image icon;

    public View_Settings() {

        //Najpierw wpierdzielamy ikonki przed wszystkim innym
        iBackground = new ImageIcon("data/1920x1080/3settings/background.jpg");
        iExit = new ImageIcon("data/1920x1080/buttons/iBack.png");

        this.setSize(1920,1080);
        this.setTitle("Cont Striek: ISIS Conflict");
        this.icon = Toolkit.getDefaultToolkit().getImage("C:\\Users\\MTX\\eclipse-workspace\\CSFinal\\data\\icon.jpg"); //jakis behemot do kreowania ikonki
        this.setIconImage(icon);
        this.setVisible(true);
        this.setLayout(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);

        bExit = new JButton(iExit);
        bExit.setBounds(1620, 1000, 200, 50);
        bExit.setOpaque(false);
        bExit.setContentAreaFilled(false);
        //bExit.setBorderPainted(false);
        add(bExit);

        lBackground = new JLabel(iBackground);
        lBackground.setBounds(0,0,1920,1080);
        this.add(lBackground);
    }

    public static void main(String[] args) {
        View_Settings xd = new View_Settings();
    }
}