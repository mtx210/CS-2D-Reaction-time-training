package Controller;

import Model.*;
import View.*;

public class Controller_Main {

    public Controller_Main(){
        new View_Startup(this);
        new MusicPlayer().playGameSound();
    }

    public void startIntro() {
        new View_Intro(this);
    }

    public void startMainMenu() {
        new View_MainMenu(this);
    }

    public void terminate() {
        //code to close program
    }
}