package View;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.Image;
import java.awt.Toolkit;

public class View_Game extends JFrame {

    JLabel lBackground;
    JButton bAttack,bReload,bInspect,bChange,bExit;
    ImageIcon iBackground,iAttack,iReload,iInspect,iChange,iExit;
    Image icon;

    public View_Game() {

        iBackground = new ImageIcon("data/1920x1080/6game/gameprocess_akm.jpg");
        iAttack = new ImageIcon("data/1920x1080/6game/attack.png");
        iReload = new ImageIcon("data/1920x1080/6game/reload.png");
        iChange = new ImageIcon("data/1920x1080/6game/change.png");
        iInspect = new ImageIcon("data/1920x1080/6game/inspect.png");
        iExit = new ImageIcon("data/1920x1080/6game/exit.png");

        this.setSize(1920,1080);
        this.setTitle("Cont Striek: ISIS Conflict");
        this.icon = Toolkit.getDefaultToolkit().getImage("C:\\Users\\MTX\\eclipse-workspace\\CSFinal\\data\\icon.jpg"); //jakis behemot do kreowania ikonki
        this.setIconImage(icon);
        this.setVisible(true);
        this.setLayout(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);

        bAttack = new JButton(iAttack);
        bAttack.setBounds(710, 950, 100, 100);
        bAttack.setOpaque(false);
        bAttack.setContentAreaFilled(false);
        //bAttack.setBorderPainted(false);
        add(bAttack);

        bReload = new JButton(iReload);
        bReload.setBounds(810, 950, 100, 100);
        bReload.setOpaque(false);
        bReload.setContentAreaFilled(false);
        //bReload.setBorderPainted(false);
        add(bReload);

        bInspect = new JButton(iInspect);
        bInspect.setBounds(910, 950, 100, 100);
        bInspect.setOpaque(false);
        bInspect.setContentAreaFilled(false);
        //bInspect.setBorderPainted(false);
        add(bInspect);

        bChange = new JButton(iChange);
        bChange.setBounds(1010, 950, 100, 100);
        bChange.setOpaque(false);
        bChange.setContentAreaFilled(false);
        //bChange.setBorderPainted(false);
        add(bChange);

        bExit = new JButton(iExit);
        bExit.setBounds(1110, 950, 100, 100);
        bExit.setOpaque(false);
        bExit.setContentAreaFilled(false);
        //bExit.setBorderPainted(false);
        add(bExit);

        lBackground = new JLabel(iBackground);
        lBackground.setBounds(0,0,1920,1080);
        this.add(lBackground);
    }

    public static void main(String[] args) {
        View_Game xd = new View_Game();
    }
}