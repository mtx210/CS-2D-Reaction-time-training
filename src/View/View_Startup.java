package View;

import Controller.*;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.ImageIcon;
import java.awt.GraphicsDevice;
import java.awt.GraphicsEnvironment;
import java.awt.Rectangle;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class View_Startup extends JFrame implements ActionListener {

    //<editor-fold desc="Class fields">
    private Controller controller;
    private JLabel lBackground;
    private JButton bStart,bExit;
    private JComboBox cbResolutions;
    private ImageIcon iBackground,iStart,iExit;
    private String resolutions[] = {"1280x720 HD","1366x768 WXGA","1600x900 HD+","1920x1080 fullHD"};
    //</editor-fold>

    public View_Startup(Controller controller) {

        //controller setup
        this.controller = controller;

        //frame setup
        this.setSize(656,399);
        this.setTitle("Cont Striek: ISIS Conflict");
        this.setIconImage(Toolkit.getDefaultToolkit().getImage("data/icon.jpg"));
        this.setLayout(null);
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);

        //frame setup cd
        GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
        GraphicsDevice defaultScreen = ge.getDefaultScreenDevice();
        Rectangle rect = defaultScreen.getDefaultConfiguration().getBounds();
        int x=(int) rect.getMaxX();
        int y=(int) rect.getMaxY();
        this.setLocation(x/2-328,y/2-199);

        //components setup
        iStart = new ImageIcon("data/images/startup/iStart.png");
        bStart = new JButton(iStart);
        bStart.setBounds(490,240,150,50);
        bStart.setOpaque(false);
        bStart.setContentAreaFilled(false);
        bStart.addActionListener(this);
        this.add(bStart);

        iExit = new ImageIcon("data/images/startup/iExit.png");
        bExit = new JButton(iExit);
        bExit.setBounds(490,300,150,50);
        bExit.setOpaque(false);
        bExit.setContentAreaFilled(false);
        bExit.addActionListener(this);
        this.add(bExit);

        cbResolutions = new JComboBox(resolutions);
        cbResolutions.setBounds(490,205,150,25);
        cbResolutions.addActionListener(this);
        this.add(cbResolutions);

        iBackground = new ImageIcon("data/images/startup/background.jpg");
        lBackground = new JLabel(iBackground);
        lBackground.setBounds(0,0,640,360);
        this.add(lBackground);

        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        Object source = e.getSource();

        if(source == bStart){
            this.dispose();
            controller.startMainMenu();
        } else if(source == bExit) {
            this.dispose();
        } else {
            //
        }
    }
}