package Model;

import java.io.File;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

public class MusicPlayer {

    private Clip clip;
    private String currentlyPlayed = "init";

    public void playMain() {
        if(currentlyPlayed == "init"){
            try {
                AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(new File("data/sound/main.wav").getAbsoluteFile());
                clip = AudioSystem.getClip();
                clip.open(audioInputStream);
                currentlyPlayed = "Main";
                clip.start();
            }
            catch(Exception ex) {
                System.out.println("Error with playing sound.");
                ex.printStackTrace();
            }
        }

        else if(currentlyPlayed != "Main"){
            try {
                clip.stop();
                AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(new File("data/sound/main.wav").getAbsoluteFile());
                clip = AudioSystem.getClip();
                clip.open(audioInputStream);
                currentlyPlayed = "Main";
                clip.start();
            }
            catch(Exception ex) {
                System.out.println("Error with playing sound.");
                ex.printStackTrace();
            }
        }
    }

    public void playCTtheme() {
        if(currentlyPlayed != "CT"){
            try {
                clip.stop();
                AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(new File("data/sound/theme_homeland_security.wav").getAbsoluteFile());
                clip = AudioSystem.getClip();
                clip.open(audioInputStream);
                currentlyPlayed = "CT";
                clip.start();
            }
            catch(Exception ex) {
                System.out.println("Error with playing sound.");
                ex.printStackTrace();
            }
        }
    }

    public void playTtheme() {
        if(currentlyPlayed != "T"){
            try {
                clip.stop();
                AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(new File("data/sound/theme_islamic_state.wav").getAbsoluteFile());
                clip = AudioSystem.getClip();
                clip.open(audioInputStream);
                currentlyPlayed = "T";
                clip.start();
            }
            catch(Exception ex) {
                System.out.println("Error with playing sound.");
                ex.printStackTrace();
            }
        }
    }
}