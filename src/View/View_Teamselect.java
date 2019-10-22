package View;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.Image;
import java.awt.Toolkit;

public class View_Teamselect extends JFrame {

    JLabel lBackground;
    JButton bCT,bT,bExit;
    ImageIcon iBackground,iCT,iT,iExit;
    Image icon;

    public View_Teamselect() {

        iBackground = new ImageIcon("data/1920x1080/5teamselect/background.jpg");
        iCT = new ImageIcon("data/1920x1080/5teamselect/backgroundCT.jpg");
        iT = new ImageIcon("data/1920x1080/5teamselect/backgroundT.jpg");
        iExit = new ImageIcon("data/1920x1080/buttons/iExit.png");

        this.setSize(1920,1080);
        this.setTitle("Cont Striek: ISIS Conflict");
        this.icon = Toolkit.getDefaultToolkit().getImage("C:\\Users\\MTX\\eclipse-workspace\\CSFinal\\data\\icon.jpg"); //jakis behemot do kreowania ikonki
        this.setIconImage(icon);
        this.setVisible(true);
        this.setLayout(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);

        bCT = new JButton(iCT);
        bCT.setBounds(150,300,800,400);
        //bCT.setBorderPainted(false);
        add(bCT);

        bT = new JButton(iT);
        bT.setBounds(970,300,800,400);
        //bT.setBorderPainted(false);
        add(bT);

        bExit = new JButton(iExit);
        bExit.setBounds(860, 1000, 200, 50);
        bExit.setOpaque(false);
        bExit.setContentAreaFilled(false);
        //bExit.setBorderPainted(false);
        add(bExit);

        lBackground = new JLabel(iBackground);
        lBackground.setBounds(0,0,1920,1080);
        this.add(lBackground);
    }

    public static void main(String[] args) {
        View_Teamselect xd = new View_Teamselect();
    }
}