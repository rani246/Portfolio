import org.jfugue.pattern.Pattern;
import org.jfugue.player.Player;
import org.jfugue.theory.Note;
import org.jfugue.theory.ChordProgression;
import java.lang.Math;
import org.jfugue.theory.Chord;
import java.util.Scanner;
import javax.sound.midi.MidiUnavailableException;
import java.io.IOException;

public class RandomMusic{
   public static void main(String[] args) throws IOException{
      
         Scanner scanner = new Scanner(System.in);    
         
         //getting the key 
         System.out.println("Enter a key (with major or minor) or random with no spaces: ");
         //true is major, false is minor
         Boolean mode = true;
         String key = scanner.next();
         if(key.equals("random") || key.equals("Random")){
            key = Checks.randomKey();
            System.out.println(key);
         }
         while(key.indexOf("minor") == -1 && key.indexOf("Minor") == -1 && key.indexOf("major") == -1 && key.indexOf("Major") == -1){
            System.out.println("Include whether major or minor: ");
            key = scanner.next();
         }
         if(key.indexOf("minor") != -1 || key.indexOf("Minor") != -1){
            mode = false;
         }
         else{
            mode = true;
         }
         int space;
         if(key.indexOf("m") != -1){
            space = key.indexOf("m");
            key = key.substring(0, space);
         }
         else{
            space = key.indexOf("M");
            key = key.substring(0, space);
         }
         while(!Checks.keyCheck(key)){
            System.out.println("Enter a viable key: ");
            key = scanner.next();
         }
         
         System.out.println("Enter an instrument or random: ");
         String instrument = scanner.next();
         if(instrument.equals("random") || instrument.equals("Random")){
            instrument = Checks.randomInstrument();
            System.out.println(instrument);
         }
         while(!Checks.instrumentCheck(instrument)){
            System.out.println("Instrument not found. Enter another:");
            instrument = scanner.next();
         }
         instrument = Checks.instrumentChange(instrument);
         
         System.out.println("Which time signature: 4/4, 3/4, 6/8, or random? ");
         String sign = scanner.next();
         if(sign.equals("random") || sign.equals("Random")){
            int num = (int)(Math.random() * 3);
            if(num == 0){
               sign = "4/4";
            }
            if(num == 1){
               sign = "3/4";
            }
            if(num == 2){
               sign = "6/8";
            }
            System.out.println(sign);
         }
         while(!sign.equals("4/4") && !sign.equals("3/4") && !sign.equals("6/8")){
            System.out.println("Time signature not available. Enter another: ");
            sign = scanner.next();
         }
         
         System.out.println("What length: short, medium, long, or random? ");
         String length = scanner.next();
         if(length.equals("random") || length.equals("Random")){
            int num = (int)(Math.random() * 3);
            if(num == 0){
               length = "short";
            }
            if(num == 1){
               length = "medium";
            }
            if(num == 2){
               length = "long";
            }
            System.out.println(length);
         }
         while(!length.equals("short") && !length.equals("medium") && !length.equals("long")){
            System.out.println("Length not available. Enter another: ");
            length = scanner.next();
         }
         
         System.out.println("Enter a tempo: ");
         int tempo = scanner.nextInt();

         scanner.close();
         
         Pattern p1 = new Pattern();
         Pattern p2 = new Pattern();
         Pattern[] p3 = {p1, p2};
         Player player = new Player();
         
         if(length.equals("short")){
            if(mode){
               if(sign.equals("4/4")){
                  p3 = Phrase.smallMajFourFour(true, key, instrument);
               }
               if(sign.equals("3/4")){
                  p3 = Phrase.smallMajThreeFour(true, key, instrument);
               }
               if(sign.equals("6/8")){
                  p3 = Phrase.smallMajSixEight(true, key, instrument);
               }
            }
            else{
               if(sign.equals("4/4")){
                  p3 = Phrase.smallMinFourFour(true, key, instrument);
               }
               if(sign.equals("3/4")){
                  p3 = Phrase.smallMinThreeFour(true, key, instrument);
               }
               if(sign.equals("6/8")){
                  p3 = Phrase.smallMinSixEight(true, key, instrument);
               }
            }
         }
         if(length.equals("medium")){
            if(mode){
               if(sign.equals("4/4")){
                  p3 = Phrase.medMajFourFour(true, key, instrument);
               }
               if(sign.equals("3/4")){
                  p3 = Phrase.medMajThreeFour(true, key, instrument);
               }
               if(sign.equals("6/8")){
                  p3 = Phrase.medMajSixEight(true, key, instrument);
               }
            }
            else{
               if(sign.equals("4/4")){
                  p3 = Phrase.medMinFourFour(true, key, instrument);
               }
               if(sign.equals("3/4")){
                  p3 = Phrase.medMinThreeFour(true, key, instrument);
               }
               if(sign.equals("6/8")){
                  p3 = Phrase.medMinSixEight(true, key, instrument);
               }
            }
         }
         if(length.equals("long")){
            if(mode){
               p3 = Phrase.majLong(sign, key, instrument);
            }
            else{
               p3 = Phrase.minLong(sign, key, instrument);
            }
         }
         p1 = p3[0];
         p2 = p3[1];
         
         p1.setTempo(tempo);
         p2.setTempo(tempo);
         
         System.out.println(p1);
         System.out.println(p2);
         
         player.play(p1, p2);
      }
}