package View;

import Controller.Controller_Main;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class View_MainMenu extends JFrame implements ActionListener {

    //Components name tutorial: <lower case letter for component type> + <Uppercase component's panel> + <component's name and function>

    //<editor-fold desc="Class fields">
    //frame fields
        private Controller_Main controller;

        private JPanel MainPanel;
        private CardLayout CardLayout;
    //menu panel
        private JPanel pMenu;

        private JLabel lMenuBackground;
        private JButton bMenuSingleplayer,bMenuMultiplayer,bMenuSettings,bMenuCredits,bMenuExit;
        private ImageIcon iMenuBackground,iMenuSingleplayer,iMenuMultiplayer,iMenuSettings,iMenuCredits,iMenuExit;
    //team selection panel
        private JPanel pTeamSelect;

        private JLabel lTeamselectBackground;
        private JButton bTeamselectCT,bTeamselectT,bTeamselectExit;
        private ImageIcon iTeamselectBackground,iTeamselectCT,iTeamselectT,iTeamselectExit;
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

    public View_MainMenu(Controller_Main controller) {

        //controller setup
            this.controller = controller;
        //frame setup
            this.setSize(1920,1080);
            this.setTitle("Cont Striek: ISIS Conflict");
            this.setIconImage(Toolkit.getDefaultToolkit().getImage("data\\icon.jpg"));
            this.setLayout(null);
            this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //components setup
            //<editor-fold desc="menu panel">
                pMenu = new JPanel();
                pMenu.setLayout(null);

                iMenuBackground = new ImageIcon("data/res/background.jpg");
                iMenuSingleplayer = new ImageIcon("data/1920x1080/buttons/iSingleplayer.png");
                iMenuMultiplayer = new ImageIcon("data/1920x1080/buttons/iMultiplayer.png");
                iMenuSettings = new ImageIcon("data/1920x1080/buttons/iSettings.png");
                iMenuCredits = new ImageIcon("data/1920x1080/buttons/iCredits.png");
                iMenuExit = new ImageIcon("data/1920x1080/buttons/iExit.png");

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

            //<editor-fold desc="teamselect panel">
                pTeamSelect = new JPanel();
                pTeamSelect.setLayout(null);
            //</editor-fold>

            //<editor-fold desc="settings panel">
                pSettings = new JPanel();
                pSettings.setLayout(null);

                iSettingsBackground = new ImageIcon("data/1920x1080/3settings/background.jpg");
                iSettingsExit = new ImageIcon("data/1920x1080/buttons/iBack.png");

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

            //<editor-fold desc="credits panel">
                pCredits = new JPanel();
                pCredits.setLayout(null);

                iCreditsBackground = new ImageIcon("data/1920x1080/4credits/background.jpg");
                iCreditsExit = new ImageIcon("data/1920x1080/buttons/iBack.png");

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
            MainPanel.add(pMenu,"menu");
            MainPanel.add(pTeamSelect,"teamselect");
            MainPanel.add(pSettings,"settings");
            MainPanel.add(pCredits,"credits");
            CardLayout.show(MainPanel,"menu");

        //finishing
            this.add(MainPanel);
            this.setVisible(true);
            //.requestFocus();
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
            } else if(source == bTeamselectExit){
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

    /*public static void main(String[] args){
        new View_MainMenu(new Controller_Main());
    }*/
}