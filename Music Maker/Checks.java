import java.lang.Math;

public class Checks{
   private static String[] keys = {"A", "B", "C", "D", "E", "F", "G", "Ab", "Bb", "Cb", "Db", "Eb", "Fb", "Gb", "A#", "B#", "C#", "D#", "E#", "F#", "G#", 
   "a", "b", "c", "d", "e", "f", "g", "ab", "bb", "cb", "db", "eb", "fb", "gb", "a#", "b#", "c#", "d#", "e#", "f#", "g#"};
   
   private static String[] instruments = {"piano", "electric piano", "harpischord", "clavinet", "celesta", "glockenspiel", "music box", "vibraphone", "marimba", 
   "xylophone", "dulcimer", "organ", "accordian", "harmonica", "guitar", "string guitar", "electric guitar", "acoustic bass", "violin", "viola", "cello", 
   "bass", "timpani", "voices", "trumpet", "trombone", "tuba", "soprano sax", "alto sax", "tenor sax", "baritone sax", "oboe", "english horn", "bassoon", 
   "clarinet", "piccolo", "flute", "recorder", "whistle", "ocarina", "sitar", "banjo", "kalimba", "bagpipe", "fiddle", "drums", "tinkle bell"};
   
   public static boolean instrumentCheck(String in){
      String str = in; 
      boolean check = false;
      str = str.toLowerCase();
      for(int i = 0; i < instruments.length; i++){
         if(str.equals(instruments[i])){
            check = true;
         }
      }
      return check;
   }
   public static String instrumentChange(String in){
      String str = in;
      if(str.equals("electric piano")){
         str = "electric_piano";
      }
      if(str.equals("music box")){
         str = "music_box";
      }
      if(str.equals("organ")){
         str = "church_organ";
      }
      if(str.equals("string guitar")){
         str = "steel_string_guitar";
      }
      if(str.equals("electric guitar")){
         str = "electric_clean_guitar";
      }
      if(str.equals("acoustic guitar")){
         str = "acoustic_guitar";
      }
      if(str.equals("bass")){
         str = "contrabass";
      }
      if(str.equals("acoustic bass")){
         str = "acoustic_bass";
      }
      if(str.equals("voices")){
         str = "voice_oohs";
      }
      if(str.equals("soprano sax")){
         str = "soprano_sax";
      }
      if(str.equals("alto sax")){
         str = "alto_sax";
      }
      if(str.equals("tenor sax")){
         str = "tenor_sax";
      }
      if(str.equals("baritone sax")){
         str = "baritone_sax";
      }
      if(str.equals("english horn")){
         str = "english_horn";
      }
      if(str.equals("drums")){
         str = "steel_drums";
      }
      if(str.equals("tinkle bell")){
         str = "tinkle_bell";
      }   
      return str;
   }
   
   public static String randomInstrument(){
      String str = "";
      int num = (int)(Math.random() * instruments.length);
      for(int i = 0; i < instruments.length; i++){
         if(num == i){
            str = instruments[i];
         }
      }
      return str;
   }
   
   public static boolean keyCheck(String k){
      for(int r = 0; r < keys.length; r++){
         if(k.equals(keys[r])){
            return true;
         }
      }
      return false;
   }
   public static String randomKey(){
      int num = (int)(Math.random() * keys.length);
      String str = "";
      for(int r = 0; r < keys.length; r++){
         if(num == r){
            str = keys[num];
         }
      }
      num = (int)(Math.random() * 2);
      if(num == 0){
         str += "major";
      }
      else{
         str += "minor";      
      }
      return str;
   }
   
   //test
   public static void main(String[] args){
      System.out.println(instrumentCheck("DRUMS"));
      String s = "electric guitar";
      System.out.println(randomKey());
   }
}