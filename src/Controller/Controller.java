package Controller;

import Model.*;
import View.*;

public class Controller {

    MusicPlayer musicPlayer = new MusicPlayer();

    public Controller(){
        new View_Startup(this);
        musicPlayer.playGameSound();
    }

    public void startMainMenu() {
        new View_MainMenu(this);
    }

    public void terminate() {
        //code to close the program
    }
}