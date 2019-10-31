package Model;

import java.io.File;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

public class MusicPlayer {

    private Clip clip;

    public void playMain() {
        try {
            AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(new File("data/sound/main.wav").getAbsoluteFile());
            clip = AudioSystem.getClip();
            clip.open(audioInputStream);
            clip.start();
        }
        catch(Exception ex) {
            System.out.println("Error with playing sound.");
            ex.printStackTrace();
        }
    }

    public void playCTtheme() {
        try {
            AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(new File("data/sound/theme_homeland_security.wav").getAbsoluteFile());
            clip = AudioSystem.getClip();
            clip.open(audioInputStream);
            clip.start();
        }
        catch(Exception ex) {
            System.out.println("Error with playing sound.");
            ex.printStackTrace();
        }
    }

    public void playTtheme() {
        try {
            AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(new File("data/sound/theme_islamic_state.wav").getAbsoluteFile());
            clip = AudioSystem.getClip();
            clip.open(audioInputStream);
            clip.start();
        }
        catch(Exception ex) {
            System.out.println("Error with playing sound.");
            ex.printStackTrace();
        }
    }

    public void stop(){
        clip.stop();
    }
}