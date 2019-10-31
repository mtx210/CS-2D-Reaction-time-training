package Controller;

import Model.*;
import View.*;

public class Controller {

    private MusicPlayer musicPlayer = new MusicPlayer();

    public Controller(){
        new View_Startup(this);
    }

    public void startMainMenu() {
        new View_MainMenu(this);
    }

    public void terminate() {
        //code to close the program
    }

    public void playMusic(String theme){
        switch(theme){
            case "CT":
                musicPlayer.playCTtheme();
                break;

            case "T":
                musicPlayer.playTtheme();
                break;

            case "main":
                musicPlayer.playMain();
                break;
        }
    }
}