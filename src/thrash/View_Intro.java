package thrash;

import Controller.*;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Toolkit;

public class View_Intro extends JFrame {

    //<editor-fold desc="Class fields">
    private Controller_Main controller;
    private JLabel lBackground;
    private ImageIcon iBackground;
    //</editor-fold>

    public View_Intro(Controller_Main controller) {

        //controller setup
            this.controller = controller;
        //icons setup
            iBackground = new ImageIcon("data/res/backgroundd.jpg");
        //frame setup
            this.setSize(1920,1080);
            this.setTitle("Cont Striek: ISIS Conflict");
            this.setIconImage(Toolkit.getDefaultToolkit().getImage("data\\icon.jpg"));
            this.setLayout(null);
            this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //components setup
            lBackground = new JLabel(iBackground);
            lBackground.setBounds(0,0,1920,1080);
            add(lBackground);

            this.setVisible(true);

        /*try {
            Thread.sleep(2000);} catch (InterruptedException e){}
        this.dispose();
        controller.startMainMenu();
    */}
}