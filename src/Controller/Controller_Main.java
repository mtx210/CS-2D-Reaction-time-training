package Controller;

import Model.*;
import View.*;
import View.View_MainMenu;

public class Controller_Main {

    MusicPlayer musicPlayer = new MusicPlayer();

    public Controller_Main(){
        new View_Startup(this);
        musicPlayer.playGameSound();
    }

    public void startIntro() {
        new View_Intro(this);
    }

    public void startMainMenu() {
        new View_MainMenu(this);
    }

    public void terminate() {
        //code to close the program
    }
}