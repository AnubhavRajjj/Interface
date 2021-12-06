package Live;
import Music.Playable;
import Music.string.Veena;
import Music.wind.Saxophone;

public class Test  {
    public static void main(String[] args){
        Veena obj = new Veena("tin tin tin");
        obj.play();
        Saxophone obj1 = new Saxophone("pii pii pii");
        obj1.play();
    }
}
