package View;

import Controller.Controller;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class View_MainMenu extends JFrame implements ActionListener {

    //Components name tutorial: <lower case letter for component type> + <Uppercase component's panel> + <component's name and function>

    //<editor-fold desc="Class fields">
    //frame fields
    private Controller controller;
    private JPanel MainPanel;
    private CardLayout CardLayout;

    //intro panel
    private JPanel pIntro;
    private JLabel lIntroBackground;
    private ImageIcon iIntroBackground;

    //menu panel
    private JPanel pMenu;
    private JLabel lMenuBackground;
    private JButton bMenuSingleplayer,bMenuMultiplayer,bMenuSettings,bMenuCredits,bMenuExit;
    private ImageIcon iMenuBackground,iMenuSingleplayer,iMenuMultiplayer,iMenuSettings,iMenuCredits,iMenuExit;

    //team selection panel
    private JPanel pTeamSelect;
    private JLabel lTeamselectBackground;
    private JButton bTeamselectCT,bTeamselectT, bTeamselectBack;
    private ImageIcon iTeamselectBackground,iTeamselectCT,iTeamselectT, iTeamselectBack;

    //settings panel
    private JPanel pSettings;
    private JLabel lSettingsBackground;
    private JButton bSettingsExit;
    private ImageIcon iSettingsBackground,iSettingsExit;

    //credits panel
    private JPanel pCredits;
    private JLabel lCreditsBackground;
    private JButton bCreditsExit;
    private ImageIcon iCreditsBackground,iCreditsExit;
    //</editor-fold>

    public View_MainMenu(Controller controller) {

        //setting controller
        this.controller = controller;

        //setting frame
        this.setSize(1920,1080);
        this.setTitle("Cont Striek: ISIS Conflict");
        this.setIconImage(Toolkit.getDefaultToolkit().getImage("data/icon.jpg"));
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);

        //setting components
        //<editor-fold desc="Intro panel">
        pIntro = new JPanel();
        pIntro.setLayout(null);

        iIntroBackground = new ImageIcon("data/images/1920x1080/1intro/backgroundd.jpg");

        lIntroBackground = new JLabel(iIntroBackground);
        lIntroBackground.setBounds(0,0,1920,1080);
        pIntro.add(lIntroBackground);
        //</editor-fold>

        //<editor-fold desc="Menu panel">
        pMenu = new JPanel();
        pMenu.setLayout(null);

        iMenuBackground = new ImageIcon("data/images/1920x1080/2mainmenu/background.jpg");
        iMenuSingleplayer = new ImageIcon("data/images/1920x1080/buttons/iSingleplayer.png");
        iMenuMultiplayer = new ImageIcon("data/images/1920x1080/buttons/iMultiplayer.png");
        iMenuSettings = new ImageIcon("data/images/1920x1080/buttons/iSettings.png");
        iMenuCredits = new ImageIcon("data/images/1920x1080/buttons/iCredits.png");
        iMenuExit = new ImageIcon("data/images/1920x1080/buttons/iExit.png");

        bMenuSingleplayer = new JButton(iMenuSingleplayer);
        bMenuSingleplayer.setBounds(1620, 600, 200, 50);
        bMenuSingleplayer.setOpaque(false);
        bMenuSingleplayer.setContentAreaFilled(false);
        bMenuSingleplayer.addActionListener(this);
        pMenu.add(bMenuSingleplayer);

        bMenuMultiplayer = new JButton(iMenuMultiplayer);
        bMenuMultiplayer.setBounds(1620, 700, 200, 50);
        bMenuMultiplayer.setOpaque(false);
        bMenuMultiplayer.setContentAreaFilled(false);
        bMenuMultiplayer.addActionListener(this);
        pMenu.add(bMenuMultiplayer);

        bMenuSettings = new JButton(iMenuSettings);
        bMenuSettings.setBounds(1620, 800, 200, 50);
        bMenuSettings.setOpaque(false);
        bMenuSettings.setContentAreaFilled(false);
        bMenuSettings.addActionListener(this);
        pMenu.add(bMenuSettings);

        bMenuCredits = new JButton(iMenuCredits);
        bMenuCredits.setBounds(1620, 900, 200, 50);
        bMenuCredits.setOpaque(false);
        bMenuCredits.setContentAreaFilled(false);
        bMenuCredits.addActionListener(this);
        pMenu.add(bMenuCredits);

        bMenuExit = new JButton(iMenuExit);
        bMenuExit.setBounds(1620, 1000, 200, 50);
        bMenuExit.setOpaque(false);
        bMenuExit.setContentAreaFilled(false);
        bMenuExit.addActionListener(this);
        pMenu.add(bMenuExit);

        lMenuBackground = new JLabel(iMenuBackground);
        lMenuBackground.setBounds(0,0,1920,1080);
        pMenu.add(lMenuBackground);
        //</editor-fold>

        //<editor-fold desc="Teamselect panel">
        pTeamSelect = new JPanel();
        pTeamSelect.setLayout(null);

        iTeamselectBackground = new ImageIcon("data/images/1920x1080/5teamselect/background.jpg");
        iTeamselectCT = new ImageIcon("data/images/1920x1080/5teamselect/backgroundCT.jpg");
        iTeamselectT = new ImageIcon("data/images/1920x1080/5teamselect/backgroundT.jpg");
        iTeamselectBack = new ImageIcon("data/images/1920x1080/buttons/iBack.png");

        bTeamselectCT = new JButton(iTeamselectCT);
        bTeamselectCT.setBounds(110, 340, 800, 400);
        bTeamselectCT.setOpaque(false);
        bTeamselectCT.setContentAreaFilled(false);
        bTeamselectCT.addActionListener(this);
        pTeamSelect.add(bTeamselectCT);

        bTeamselectT = new JButton(iTeamselectT);
        bTeamselectT.setBounds(1010, 340, 800, 400);
        bTeamselectT.setOpaque(false);
        bTeamselectT.setContentAreaFilled(false);
        bTeamselectT.addActionListener(this);
        pTeamSelect.add(bTeamselectT);

        bTeamselectBack = new JButton(iTeamselectBack);
        bTeamselectBack.setBounds(1620, 1000, 200, 50);
        bTeamselectBack.setOpaque(false);
        bTeamselectBack.setContentAreaFilled(false);
        bTeamselectBack.addActionListener(this);
        pTeamSelect.add(bTeamselectBack);

        lTeamselectBackground = new JLabel(iTeamselectBackground);
        lTeamselectBackground.setBounds(0,0,1920,1080);
        pTeamSelect.add(lTeamselectBackground);
        //</editor-fold>

        //<editor-fold desc="Settings panel">
        pSettings = new JPanel();
        pSettings.setLayout(null);

        iSettingsBackground = new ImageIcon("data/images/1920x1080/3settings/background.jpg");
        iSettingsExit = new ImageIcon("data/images/1920x1080/buttons/iBack.png");

        bSettingsExit = new JButton(iSettingsExit);
        bSettingsExit.setBounds(1620, 1000, 200, 50);
        bSettingsExit.setOpaque(false);
        bSettingsExit.setContentAreaFilled(false);
        bSettingsExit.addActionListener(this);
        pSettings.add(bSettingsExit);

        lSettingsBackground = new JLabel(iSettingsBackground);
        lSettingsBackground.setBounds(0,0,1920,1080);
        pSettings.add(lSettingsBackground);
        //</editor-fold>

        //<editor-fold desc="Credits panel">
        pCredits = new JPanel();
        pCredits.setLayout(null);

        iCreditsBackground = new ImageIcon("data/images/1920x1080/4credits/background.jpg");
        iCreditsExit = new ImageIcon("data/images/1920x1080/buttons/iBack.png");

        bCreditsExit = new JButton(iCreditsExit);
        bCreditsExit.setBounds(1620, 1000, 200, 50);
        bCreditsExit.setOpaque(false);
        bCreditsExit.setContentAreaFilled(false);
        bCreditsExit.addActionListener(this);
        pCredits.add(bCreditsExit);

        lCreditsBackground = new JLabel(iCreditsBackground);
        lCreditsBackground.setBounds(0,0,1920,1080);
        pCredits.add(lCreditsBackground);
        //</editor-fold>

        //setting CardLayout
        MainPanel = new JPanel();
        CardLayout = new CardLayout();
        MainPanel.setLayout(CardLayout);
        MainPanel.add(pIntro,"intro");
        MainPanel.add(pMenu,"menu");
        MainPanel.add(pTeamSelect,"teamselect");
        MainPanel.add(pSettings,"settings");
        MainPanel.add(pCredits,"credits");
        CardLayout.show(MainPanel,"menu");
        this.add(MainPanel);

        this.setUndecorated(true);
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object source = e.getSource();

        //Menu actions
            if(source == bMenuSingleplayer){
                CardLayout.show(MainPanel,"teamselect");
            } else if(source == bMenuMultiplayer){
                //
            } else if(source == bMenuSettings){
                CardLayout.show(MainPanel,"settings");
            } else if(source == bMenuCredits){
                CardLayout.show(MainPanel,"credits");
            } else if(source == bMenuExit){
                this.dispose();
                controller.terminate();
            }
        //Teamselect actions
            else if(source == bTeamselectCT){
                //
            } else if(source == bTeamselectT){
                //
            } else if(source == bTeamselectBack){
                CardLayout.show(MainPanel,"menu");
            }
        //Settings actions
            else if(source == bSettingsExit){
                CardLayout.show(MainPanel,"menu");
            }
        //Credits actions
            else if(source == bCreditsExit){
                CardLayout.show(MainPanel,"menu");
            }
    }
}