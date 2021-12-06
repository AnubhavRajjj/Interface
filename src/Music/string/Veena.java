package Music.string;
import Music.Playable;

 public class Veena implements Playable {
  String playable;
  public Veena(String playable){
   this.playable=playable;
  }

  public void play(){
   System.out.println("The sound of Veena is"+"  "+playable);

  }

}
