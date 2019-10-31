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
                try{
                    musicPlayer.stop();
                } catch(NullPointerException e){}
                musicPlayer.playCTtheme();
                break;

            case "T":
                try{
                    musicPlayer.stop();
                } catch(NullPointerException e){}
                musicPlayer.playTtheme();
                break;

            case "main":
                try{
                    musicPlayer.stop();
                } catch(NullPointerException e){}
                musicPlayer.playMain();
                break;
        }
    }

    public void stopMusic() {
        try{
            musicPlayer.stop();
        } catch(NullPointerException e){}
    }
}