import android.content.Intent;
import android.media.MediaPlayer;

import com.example.uytkownik.alarm.Main_activity;
import com.example.uytkownik.alarm.R;

import static com.example.uytkownik.alarm.R.raw.kbzb;

public class playSound {

    private String soundName;
    final static private int seconds;

    static {
        seconds = 10;
    }

    public playSound(String soundName) {
        this.soundName = soundName;
    }

    public String getSoundName() {
        return soundName;
    }

    public void setSoundName(String soundName) {
        this.soundName = soundName;
    }

    public int getSeconds() {
        return seconds;
    }


    public void playSoundTheme ()
    {
        MediaPlayer mediaPlayer;
        mediaPlayer = MediaPlayer.create(this, kbzb);
        mediaPlayer.start(); // no need to call prepare(); create() does that for you
    }

}
