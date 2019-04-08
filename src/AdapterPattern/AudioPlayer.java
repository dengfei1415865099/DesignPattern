package AdapterPattern;

public class AudioPlayer implements MediaPlayer {
    MediaPlayer mediaPlayer;
    @Override
    public void play(String audioType, String fileName) {
        if (audioType.equalsIgnoreCase("mp3")){
            System.out.println("Playing mp3 file. name: "+fileName);
        }
        else if (audioType.equalsIgnoreCase("vlc")
                ||audioType.equalsIgnoreCase("mp4")){
            mediaPlayer = new MediaAdapter(audioType);
            mediaPlayer.play(audioType,fileName);
        }
        else {
            System.out.println("Invalid media");
        }
    }
}
