
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

}
