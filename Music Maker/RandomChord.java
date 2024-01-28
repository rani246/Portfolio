import org.jfugue.pattern.Pattern;
import org.jfugue.player.Player;
import org.jfugue.theory.Note;
import org.jfugue.theory.ChordProgression;
import java.lang.Math;
import org.jfugue.theory.Chord;

public class RandomChord{
   public static ChordProgression randMaj(){
      int num = (int)(Math.random() * 7);
      ChordProgression cp = new ChordProgression("");
      if(num == 0){
         cp = new ChordProgression("I");
      }
      if(num == 1){
         cp = new ChordProgression("ii");
      }
      if(num == 2){
         cp = new ChordProgression("iii");
      }  
      if(num == 3){
         cp = new ChordProgression("IV");
      }
      if(num == 4){
         cp = new ChordProgression("V");
      }
      if(num == 5){
         cp = new ChordProgression("vi");
      }
      if(num == 6){
         cp = new ChordProgression("viid");
      }
      return cp;
   }
   public static ChordProgression randMajTonic(){
      int num = (int)(Math.random() * 9);
      ChordProgression cp = new ChordProgression("");
      if(num <= 3){
         cp = new ChordProgression("I");
      }
      if(num == 4 || num == 5){
         cp = new ChordProgression("iii");
      }
      if(num == 6 || num == 7){
         cp = new ChordProgression("vi");
      }
      if(num == 8){
         cp = randMaj();
      }
      return cp;
   }
   public static ChordProgression randMajPreDom(){
      int num = (int)(Math.random() * 5);
      ChordProgression cp = new ChordProgression("");
      if(num <= 1){
         cp = new ChordProgression("IV");
      }
      else if(num <= 3){
         cp = new ChordProgression("ii");
      }
      if(num == 4){
         cp = randMaj();
      }
      return cp;
   }
   public static ChordProgression randMajDom(){
      int num = (int)(Math.random() * 7);
      ChordProgression cp = new ChordProgression("");
      if(num <= 3){
         cp = new ChordProgression("V");
      }
      if(num == 4 || num == 5){
         cp = new ChordProgression("viid");
      }
      if(num == 6){
         cp = randMaj();
      }
      return cp;
   }
   public static ChordProgression randMin(){
      int num = (int)(Math.random() * 7);
      ChordProgression cp = new ChordProgression("");
      if(num == 0){
         cp = new ChordProgression("i");
      }
      if(num == 1){
         cp = new ChordProgression("iid");
      }
      if(num == 2){
         cp = new ChordProgression("III");
      }  
      if(num == 3){
         cp = new ChordProgression("iv");
      }
      if(num == 4){
         cp = new ChordProgression("v");
      }
      if(num == 5){
         cp = new ChordProgression("VI");
      }
      if(num == 6){
         cp = new ChordProgression("VII");
      }
      return cp;
   }
   public static ChordProgression randMinTonic(){
      int num = (int)(Math.random() * 9);
      ChordProgression cp = new ChordProgression("");
      if(num <= 3){
         cp = new ChordProgression("i");
      }
      if(num == 4 || num == 5){
         cp = new ChordProgression("III");
      }
      if(num == 6 || num == 7){
         cp = new ChordProgression("VI");
      }
      if(num == 8){
         cp = randMin();
      }
      return cp;
   }
   public static ChordProgression randMinPreDom(){
      int num = (int)(Math.random() * 5);
      ChordProgression cp = new ChordProgression("");
      if(num <= 1){
         cp = new ChordProgression("iv");
      }
      else if(num <= 3){
         cp = new ChordProgression("iid");
      }
      if(num == 4){
         cp = randMin();
      }
      return cp;
   }
   public static ChordProgression randMinDom(){
      int num = (int)(Math.random() * 7);
      ChordProgression cp = new ChordProgression("");
      if(num <= 3){
         cp = new ChordProgression("v");
      }
      if(num == 4 || num == 5){
         cp = new ChordProgression("viid");
      }
      if(num == 6){
         cp = randMin();
      }
      return cp;
   }
}