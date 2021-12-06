package Music.wind;
import Music.Playable;

public class Saxophone implements Playable {
    String playable;
    public Saxophone(String playable) {
        this.playable = playable;
    }


    public void play() {
        System.out.println("The sound of Saxophone is"+"  "+playable);

    }
}

