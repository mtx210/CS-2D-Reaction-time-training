package View;

import Controller.Controller_Main;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class View_MainMenu extends JFrame implements ActionListener {

    //<editor-fold desc="Class fields">
    private Controller_Main controller;
    private JLabel lBackground;
    private JButton bSingleplayer,bMultiplayer,bSettings,bCredits,bExit;
    private ImageIcon iBackground,iSingleplayer,iMultiplayer,iSettings,iCredits,iExit;
    //</editor-fold>

    public View_MainMenu(Controller_Main controller) {

        //controller setup
        this.controller = controller;
        //icons setup
        iBackground = new ImageIcon("data/1920x1080/2mainmenu/background.jpg");
        iSingleplayer = new ImageIcon("data/1920x1080/buttons/iSingleplayer.png");
        iMultiplayer = new ImageIcon("data/1920x1080/buttons/iMultiplayer.png");
        iSettings = new ImageIcon("data/1920x1080/buttons/iSettings.png");
        iCredits = new ImageIcon("data/1920x1080/buttons/iCredits.png");
        iExit = new ImageIcon("data/1920x1080/buttons/iExit.png");
        //frame setup
        this.setSize(1920,1080);
        this.setTitle("Cont Striek: ISIS Conflict");
        this.setIconImage(Toolkit.getDefaultToolkit().getImage("data\\icon.jpg"));
        this.setLayout(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //components setup
        bSingleplayer = new JButton(iSingleplayer);
        bSingleplayer.setBounds(1620, 600, 200, 50);
        bSingleplayer.setOpaque(false);
        bSingleplayer.setContentAreaFilled(false);
        //bSingleplayer.setBorderPainted(false);
        bSingleplayer.addActionListener(this);
        add(bSingleplayer);

        bMultiplayer = new JButton(iMultiplayer);
        bMultiplayer.setBounds(1620, 700, 200, 50);
        bMultiplayer.setOpaque(false);
        bMultiplayer.setContentAreaFilled(false);
        //bMultiplayer.setBorderPainted(false);
        bMultiplayer.addActionListener(this);
        add(bMultiplayer);

        bSettings = new JButton(iSettings);
        bSettings.setBounds(1620, 800, 200, 50);
        bSettings.setOpaque(false);
        bSettings.setContentAreaFilled(false);
        //bSettings.setBorderPainted(false);
        bSettings.addActionListener(this);
        add(bSettings);

        bCredits = new JButton(iCredits);
        bCredits.setBounds(1620, 900, 200, 50);
        bCredits.setOpaque(false);
        bCredits.setContentAreaFilled(false);
        //bCredits.setBorderPainted(false);
        bCredits.addActionListener(this);
        add(bCredits);

        bExit = new JButton(iExit);
        bExit.setBounds(1620, 1000, 200, 50);
        bExit.setOpaque(false);
        bExit.setContentAreaFilled(false);
        //bExit.setBorderPainted(false);
        bExit.addActionListener(this);
        add(bExit);

        lBackground = new JLabel(iBackground);
        lBackground.setBounds(0,0,1920,1080);
        this.add(lBackground);

        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object source = e.getSource();

        if(source == bSingleplayer){
            //
        } else if(source == bMultiplayer){
            //
        } else if(source == bSettings){
            //
        } else if(source == bCredits){
            //
        } else if(source == bExit){
            this.dispose();
            controller.terminate();
        }
    }
}