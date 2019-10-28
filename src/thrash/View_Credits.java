package thrash;

import Controller.Controller_Main;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class View_Credits extends JFrame implements ActionListener {

    //<editor-fold desc="Class fields">
    private Controller_Main controller;
    private JLabel lBackground;
    private JButton bExit;
    private ImageIcon iBackground,iExit;
    //</editor-fold>

    public View_Credits(Controller_Main controller) {

        //controller setup
            this.controller = controller;
        //icons setup
            iBackground = new ImageIcon("data/1920x1080/4credits/background.jpg");
            iExit = new ImageIcon("data/1920x1080/buttons/iBack.png");
        //frame setup
            this.setSize(1920,1080);
            this.setTitle("Cont Striek: ISIS Conflict");
            this.setIconImage(Toolkit.getDefaultToolkit().getImage("data\\icon.jpg"));
            this.setLayout(null);
            this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            // ? this.setExtendedState(JFrame.MAXIMIZED_BOTH);
        //components setup
            bExit = new JButton(iExit);
            bExit.setBounds(1620, 1000, 200, 50);
            bExit.setOpaque(false);
            bExit.setContentAreaFilled(false);
            //bExit.setBorderPainted(false);
            bExit.addActionListener(this);
            add(bExit);

            lBackground = new JLabel(iBackground);
            lBackground.setBounds(0,0,1920,1080);
            add(lBackground);

            this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}