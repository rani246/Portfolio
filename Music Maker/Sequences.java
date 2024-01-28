import org.jfugue.pattern.Pattern;
import org.jfugue.player.Player;
import org.jfugue.theory.Note;
import org.jfugue.theory.ChordProgression;
import java.lang.Math;
import org.jfugue.theory.Chord;

public class Sequences{
   //making the note values
   public static String randSixteenthNote(){
      //controls the probability 
      int num = (int)(Math.random() * 4);
      //root of triad
      if(num == 0){
         return "$0s ";
      }
      //third of triad
      if(num == 1){
         return "$1s ";
      }
      //fifth of triad
      if(num == 2){
         return "$2s ";
      }
      //rest
      if(num == 3){
         return "Rs ";
      }
      return "";
   }
   public static String randEighthNote(){
      int num = (int)(Math.random() * 4);
      if(num == 0){
         return "$0i ";
      }
      if(num == 1){
         return "$1i ";
      }
      if(num == 2){
         return "$2i ";
      }
      if(num == 3){
         return "Ri ";
      }
      return "";
   }
   public static String randQuaterNote(){
      int num = (int)(Math.random() * 4);
      if(num == 0){
         return "$0q ";
      }
      if(num == 1){
         return "$1q ";
      }
      if(num == 2){
         return "$2q ";
      }
      if(num == 3){
         return "Rq ";
      }
      return "";
   }
   public static String randHalfNote(){
      int num = (int)(Math.random() * 4);
      if(num == 0){
         return "$0h ";
      }
      if(num == 1){
         return "$1h ";
      }
      if(num == 2){
         return "$2h ";
      }
      if(num == 3){
         return "Rh ";
      }
      return "";
   }
   public static String randDotQuaterNote(){
      int num = (int)(Math.random() * 4);
      if(num == 0){
         return "$0qi ";
      }
      if(num == 1){
         return "$1qi ";
      }
      if(num == 2){
         return "$2qi ";
      }
      if(num == 3){
         return "Rqi ";
      }
      return "";
   }
   public static String randDotHalfNote(){
      int num = (int)(Math.random() * 4);
      if(num == 0){
         return "$0hq ";
      }
      if(num == 1){
         return "$1hq ";
      }
      if(num == 2){
         return "$2hq ";
      }
      if(num == 3){
         return "Rhq ";
      }
      return "";
   }
   //building the beats
   public static String randEighthBeat(int i){
      int num = (int)(Math.random() * 5);
      //0 is normal chord
      if(i == 0){
         if(num <= 2){
            return randEighthNote();
         }
         if(num > 2){
            return randSixteenthNote() + randSixteenthNote();
         }
      }
      //when i != 0, pattern for chord is more likely to be a longer note
      else{
         return randEighthNote();
      }
      return "";
   }
   public static String randQuaterBeat(int i){
      int num = (int)(Math.random() * 5);
      if(i == 0){
         if(num <= 2){
            return randQuaterNote();
         }
         if(num > 2){
            return randEighthBeat(i) + randEighthBeat(i);
         }
      }
      else{
         if(num <= 3){
            return randQuaterNote();
         }
         if(num > 3){
            return randEighthBeat(i) + randEighthBeat(i);
         }
      }
      return "";
   }
   public static String randDotQuaterBeat(int i){
      int num = (int)(Math.random() * 8);
      if(i == 0){
         if(num == 0 || num == 1){
            return randDotQuaterNote();
         }
         if(num == 2 || num == 3){
            return randEighthBeat(i) + randEighthBeat(i) + randEighthBeat(i);
         }
         if(num == 4 || num == 5){
            return randQuaterBeat(i) + randEighthBeat(i);
         }
         if(num == 6 || num == 7){
            return randEighthBeat(i) + randQuaterBeat(i);
         }
      }
      else{
         if(num <= 4){
            return randDotQuaterNote();
         }
         if(num == 5){
            return randQuaterBeat(i) + randEighthBeat(i);
         }
         if(num == 6 || num == 7){
            return randEighthBeat(i) + randQuaterBeat(i);
         }
      }
      return "";
   }
   public static String randHalfBeat(int i){
      int num = (int)(Math.random() * 8);
      if(i == 0){
         if(num == 0){
            return randHalfNote();
         }
         if(num == 1 || num == 2 || num == 3){
            return randQuaterBeat(i) + randQuaterBeat(i);
         }
         if(num == 4 || num == 5){
            return randDotQuaterBeat(i) + randEighthBeat(i);
         }
         if(num == 6 || num == 7){
            return randEighthBeat(i) + randDotQuaterBeat(i);
         }
      }
      else{
         if(num == 0 || num == 1 || num == 2){
            return randHalfNote();
         }
         if(num == 3 || num == 4){
            return randQuaterBeat(i) + randQuaterBeat(i);
         }
         if(num == 5){
            return randDotQuaterBeat(i) + randEighthBeat(i);
         }
         if(num == 6 || num == 7){
            return randEighthBeat(i) + randDotQuaterBeat(i);
         }
      }
      return "";
   }
   public static String randDotHalfBeat(int i){
      int num = (int)(Math.random() * 8);
      if(i == 0){
         if(num == 0 || num == 1){
            return randDotHalfNote();
         }
         if(num == 2 || num == 3){
            return randQuaterBeat(i) + randQuaterBeat(i) + randQuaterBeat(i);
         }
         if(num == 4 || num == 5){
            return randHalfBeat(i) + randQuaterBeat(i);
         }
         if(num == 6 || num == 7){
            return randQuaterBeat(i) + randHalfBeat(i);
         }
      }
      else{
         if(num <= 4){
            return randDotHalfNote();
         }
         if(num == 5){
            return randHalfBeat(i) + randQuaterBeat(i);
         }
         if(num == 6 || num == 7){
            return randQuaterBeat(i) + randHalfBeat(i);
         }
      }
      return "";
   }
   public static String randWholeBeat(int i){
      int num = (int)(Math.random() * 3);
      if(i == 0){
         if(num == 0){
            return randHalfBeat(i) + randHalfBeat(i);
         }
         if(num == 1){
            return randDotHalfBeat(i) + randQuaterBeat(i);
         }
         if(num == 2){
            return randQuaterBeat(i) + randDotHalfBeat(i);
         }
      }
      else{
         if(num == 0 || num == 1){
            return randHalfBeat(i) + randHalfBeat(i);
         }
         if(num == 2){
            return randQuaterBeat(i) + randDotHalfBeat(i);
         }
      }
      return "";
   }
   //returns the chord along with desired length
   public static String getChord(ChordProgression cp, String s){
      Chord[] chords = cp.getChords();
      return chords[0] + s;
   }
   
   
   //test
   public static void main(String[] args){
      Player player = new Player();
      Pattern pattern = new Pattern("V0");
      ChordProgression cp = new ChordProgression("I");
      String str = randWholeBeat(0);
      cp.eachChordAs(str);
      pattern.add(cp);
      System.out.println(str);
      
      cp = new ChordProgression("IV");
      str = randWholeBeat(0);
      cp.eachChordAs(str);
      pattern.add(cp);
      System.out.println(str);
      
      cp = new ChordProgression("V");
      str = randWholeBeat(0);
      cp.eachChordAs(str);
      pattern.add(cp);
      System.out.println(str);
      
      cp = new ChordProgression("I");
      str = randWholeBeat(1);
      cp.eachChordAs(str);
      pattern.add(cp);
      System.out.println(str);
      
      Pattern pat = new Pattern("V1 Cmajw Fmajw Gmajw Cmajw");
      player.play(pattern, pat);
      
      ChordProgression cp1 = new ChordProgression("viid");
      String str1 = getChord(cp, "w");
      System.out.println(str);
   }  
}