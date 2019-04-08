package AdapterPattern;

public class VlcPlayer implements AdvancedeMediaPlayer {
    @Override
    public void playVlc(String fileName) {
        System.out.println("Playing Vlc file. name: "+fileName);
    }

    @Override
    public void playMp4(String fileName) {

    }
}
