import org.jfugue.pattern.Pattern;
import org.jfugue.player.Player;
import org.jfugue.theory.Note;
import org.jfugue.theory.ChordProgression;
import java.lang.Math;
import org.jfugue.theory.Chord;

public class Phrase{
   public static Pattern[] smallMajFourFour(boolean e, String k, String in){
      //for chords
      Pattern p1 = new Pattern("V0").setInstrument(in);
      //for sequences
      Pattern p2 = new Pattern("V1");
      ChordProgression cp;
      Pattern[] p4 = {p1, p2};
      int num = (int)(Math.random() * 2);
      //one chord in tonic
      if(num == 0){
         cp = new ChordProgression("I").setKey(k);
         p1.add(cp.eachChordAs(Sequences.getChord(cp, "w")));
         p2.add(cp.eachChordAs(Sequences.randWholeBeat(0)).getPattern().setInstrument(in));
      }
      //two chords in tonic
      if(num == 1){
         cp = new ChordProgression("I").setKey(k);
         p1.add(cp.eachChordAs(Sequences.getChord(cp, "h")));
         p2.add(cp.eachChordAs(Sequences.randHalfBeat(0)).getPattern().setInstrument(in));
         cp = RandomChord.randMajTonic().setKey(k);
         p1.add(cp.eachChordAs(Sequences.getChord(cp, "h")));
         p2.add(cp.eachChordAs(Sequences.randHalfBeat(0)));
      }
      num = (int)(Math.random() * 2);
      //two chords in predom
      if(num == 0){
         for(int i = 0; i < 2; i++){
            cp = RandomChord.randMajPreDom().setKey(k);
            p1.add(cp.eachChordAs(Sequences.getChord(cp, "w")));
            p2.add(cp.eachChordAs(Sequences.randWholeBeat(0)));
         }
      }
      //four chords in predom
      if(num == 1){
         for(int i = 0; i < 4; i++){
            cp = RandomChord.randMajPreDom().setKey(k);
            p1.add(cp.eachChordAs(Sequences.getChord(cp, "h")));
            p2.add(cp.eachChordAs(Sequences.randHalfBeat(0)));
         }
      }
      //if e is false, then do half cadence
      //one chord in dom, one chord in tonic
      if(e){
         cp = new ChordProgression("V").setKey(k);
         p1.add(cp.eachChordAs(Sequences.getChord(cp, "h")));
         p2.add(cp.eachChordAs(Sequences.randHalfBeat(0)));
         cp = new ChordProgression("I").setKey(k);
         p1.add(cp.eachChordAs(Sequences.getChord(cp, "h")));
         p2.add(cp.eachChordAs(Sequences.randHalfBeat(1)));
      }
      else{
         cp = RandomChord.randMajDom().setKey(k);
         p1.add(cp.eachChordAs(Sequences.getChord(cp, "h")));
         p2.add(cp.eachChordAs(Sequences.randHalfBeat(0)));
         cp = new ChordProgression("V").setKey(k);
         p1.add(cp.eachChordAs(Sequences.getChord(cp, "h")));
         p2.add(cp.eachChordAs(Sequences.randHalfBeat(1)));
      }
      //p4[1].setInstrument("Violin");
      //p4[0].setInstrument("Violin");
      return p4;
   }
   public static Pattern[] smallMinFourFour(boolean e, String k, String in){
      //for chords
      Pattern p1 = new Pattern("V0");
      //for sequences
      Pattern p2 = new Pattern("V1");
      ChordProgression cp;
      Pattern[] p4 = {p1, p2};
      int num = (int)(Math.random() * 2);
      //one chord in tonic
      if(num == 0){
         cp = new ChordProgression("i").setKey(k);
         p1.add(cp.eachChordAs(Sequences.getChord(cp, "w")));
         p2.add(cp.eachChordAs(Sequences.randWholeBeat(0)).getPattern().setInstrument(in));
      }
      //two chords in tonic
      if(num == 1){
         cp = new ChordProgression("i").setKey(k);
         p1.add(cp.eachChordAs(Sequences.getChord(cp, "h")));
         p2.add(cp.eachChordAs(Sequences.randHalfBeat(0)).getPattern().setInstrument(in));
         cp = RandomChord.randMinTonic().setKey(k);
         p1.add(cp.eachChordAs(Sequences.getChord(cp, "h")));
         p2.add(cp.eachChordAs(Sequences.randHalfBeat(0)));
      }
      num = (int)(Math.random() * 2);
      //two chords in predom
      if(num == 0){
         for(int i = 0; i < 2; i++){
            cp = RandomChord.randMinPreDom().setKey(k);
            p1.add(cp.eachChordAs(Sequences.getChord(cp, "w")));
            p2.add(cp.eachChordAs(Sequences.randWholeBeat(0)));
         }
      }
      //four chords in predom
      if(num == 1){
         for(int i = 0; i < 4; i++){
            cp = RandomChord.randMinPreDom().setKey(k);
            p1.add(cp.eachChordAs(Sequences.getChord(cp, "h")));
            p2.add(cp.eachChordAs(Sequences.randHalfBeat(0)));
         }
      }
      //if e is false, then do half cadence
      //one chord in dom, one chord in tonic
      if(e){
         cp = new ChordProgression("V").setKey(k);
         p1.add(cp.eachChordAs(Sequences.getChord(cp, "h")));
         p2.add(cp.eachChordAs(Sequences.randHalfBeat(0)));
         cp = new ChordProgression("i").setKey(k);
         p1.add(cp.eachChordAs(Sequences.getChord(cp, "h")));
         p2.add(cp.eachChordAs(Sequences.randHalfBeat(1)));
      }
      else{
         cp = RandomChord.randMinDom().setKey(k);
         p1.add(cp.eachChordAs(Sequences.getChord(cp, "h")));
         p2.add(cp.eachChordAs(Sequences.randHalfBeat(0)));
         cp = new ChordProgression("V").setKey(k);
         p1.add(cp.eachChordAs(Sequences.getChord(cp, "h")));
         p2.add(cp.eachChordAs(Sequences.randHalfBeat(1)));
      }
      return p4;
   }
   public static Pattern[] smallMajThreeFour(boolean e, String k, String in){
      //for chords
      Pattern p1 = new Pattern("V0");
      //for sequences
      Pattern p2 = new Pattern("V1");
      ChordProgression cp;
      Pattern[] p4 = {p1, p2};
      int num = (int)(Math.random() * 2);
      //one chord in tonic
      if(num == 0){
         cp = new ChordProgression("I").setKey(k);
         p1.add(cp.eachChordAs(Sequences.getChord(cp, "hq")));
         p2.add(cp.eachChordAs(Sequences.randDotHalfBeat(0)).getPattern().setInstrument(in));
      }
      //three chords in tonic
      if(num == 1){
         cp = new ChordProgression("I").setKey(k);
         p1.add(cp.eachChordAs(Sequences.getChord(cp, "q")));
         p2.add(cp.eachChordAs(Sequences.randQuaterBeat(0)).getPattern().setInstrument(in));
         for(int i = 0; i < 2; i++){
            cp = RandomChord.randMajTonic().setKey(k);
            p1.add(cp.eachChordAs(Sequences.getChord(cp, "q")));
            p2.add(cp.eachChordAs(Sequences.randQuaterBeat(0)));
         }
      }
      num = (int)(Math.random() * 2);
      //two chords in predom
      if(num == 0){
         for(int i = 0; i < 2; i++){
            cp = RandomChord.randMajPreDom().setKey(k);
            p1.add(cp.eachChordAs(Sequences.getChord(cp, "hq")));
            p2.add(cp.eachChordAs(Sequences.randDotHalfBeat(0)));
         }
      }
      //six chords in predom
      if(num == 1){
         for(int i = 0; i < 6; i++){
            cp = RandomChord.randMajPreDom().setKey(k);
            p1.add(cp.eachChordAs(Sequences.getChord(cp, "q")));
            p2.add(cp.eachChordAs(Sequences.randQuaterBeat(0)));
         }
      }
      //if e is false, then do half cadence
      //one chord in dom, one chord in tonic
      if(e){
         cp = new ChordProgression("V").setKey(k);
         p1.add(cp.eachChordAs(Sequences.getChord(cp, "h")));
         p2.add(cp.eachChordAs(Sequences.randHalfBeat(0)));
         cp = new ChordProgression("I").setKey(k);
         p1.add(cp.eachChordAs(Sequences.getChord(cp, "q")));
         p2.add(cp.eachChordAs(Sequences.randQuaterBeat(1)));
      }
      else{
         cp = RandomChord.randMajDom().setKey(k);
         p1.add(cp.eachChordAs(Sequences.getChord(cp, "h")));
         p2.add(cp.eachChordAs(Sequences.randHalfBeat(0)));
         cp = new ChordProgression("V").setKey(k);
         p1.add(cp.eachChordAs(Sequences.getChord(cp, "q")));
         p2.add(cp.eachChordAs(Sequences.randQuaterBeat(1)));
      }
      return p4;
   }
   public static Pattern[] smallMinThreeFour(boolean e, String k, String in){
      //for chords
      Pattern p1 = new Pattern("V0");
      //for sequences
      Pattern p2 = new Pattern("V1");
      ChordProgression cp;
      Pattern[] p4 = {p1, p2};
      int num = (int)(Math.random() * 2);
      //one chord in tonic
      if(num == 0){
         cp = new ChordProgression("i").setKey(k);
         p1.add(cp.eachChordAs(Sequences.getChord(cp, "hq")));
         p2.add(cp.eachChordAs(Sequences.randDotHalfBeat(0)).getPattern().setInstrument(in));
      }
      //three chords in tonic
      if(num == 1){
         cp = new ChordProgression("i").setKey(k);
         p1.add(cp.eachChordAs(Sequences.getChord(cp, "q")));
         p2.add(cp.eachChordAs(Sequences.randQuaterBeat(0)).getPattern().setInstrument(in));
         for(int i = 0; i < 2; i++){
            cp = RandomChord.randMinTonic().setKey(k);
            p1.add(cp.eachChordAs(Sequences.getChord(cp, "q")));
            p2.add(cp.eachChordAs(Sequences.randQuaterBeat(0)));
         }
      }
      num = (int)(Math.random() * 2);
      //two chords in predom
      if(num == 0){
         for(int i = 0; i < 2; i++){
            cp = RandomChord.randMinPreDom().setKey(k);
            p1.add(cp.eachChordAs(Sequences.getChord(cp, "hq")));
            p2.add(cp.eachChordAs(Sequences.randDotHalfBeat(0)));
         }
      }
      //six chords in predom
      if(num == 1){
         for(int i = 0; i < 6; i++){
            cp = RandomChord.randMinPreDom().setKey(k);
            p1.add(cp.eachChordAs(Sequences.getChord(cp, "q")));
            p2.add(cp.eachChordAs(Sequences.randQuaterBeat(0)));
         }
      }
      //if e is false, then do half cadence
      //one chord in dom, one chord in tonic
      if(e){
         cp = new ChordProgression("V").setKey(k);
         p1.add(cp.eachChordAs(Sequences.getChord(cp, "h")));
         p2.add(cp.eachChordAs(Sequences.randHalfBeat(0)));
         cp = new ChordProgression("i").setKey(k);
         p1.add(cp.eachChordAs(Sequences.getChord(cp, "q")));
         p2.add(cp.eachChordAs(Sequences.randQuaterBeat(1)));
      }
      else{
         cp = RandomChord.randMinDom().setKey(k);
         p1.add(cp.eachChordAs(Sequences.getChord(cp, "h")));
         p2.add(cp.eachChordAs(Sequences.randHalfBeat(0)));
         cp = new ChordProgression("V").setKey(k);
         p1.add(cp.eachChordAs(Sequences.getChord(cp, "q")));
         p2.add(cp.eachChordAs(Sequences.randQuaterBeat(1)));
      }
      return p4;
   }
   public static Pattern[] smallMajSixEight(boolean e, String k, String in){
      //for chords
      Pattern p1 = new Pattern("V0");
      //for sequences
      Pattern p2 = new Pattern("V1");
      ChordProgression cp;
      Pattern[] p4 = {p1, p2};
      int num = (int)(Math.random() * 2);
      //one chord in tonic
      if(num == 0){
         cp = new ChordProgression("I").setKey(k);
         p1.add(cp.eachChordAs(Sequences.getChord(cp, "hq")));
         p2.add(cp.eachChordAs(Sequences.randDotHalfBeat(0)).getPattern().setInstrument(in));
      }
      //two chords in tonic
      if(num == 1){
         cp = new ChordProgression("I").setKey(k);
         p1.add(cp.eachChordAs(Sequences.getChord(cp, "qi")));
         p2.add(cp.eachChordAs(Sequences.randDotQuaterBeat(0)).getPattern().setInstrument(in));
         cp = RandomChord.randMajTonic().setKey(k);
         p1.add(cp.eachChordAs(Sequences.getChord(cp, "qi")));
         p2.add(cp.eachChordAs(Sequences.randDotQuaterBeat(0)));
      }
      num = (int)(Math.random() * 2);
      //two chords in predom
      if(num == 0){
         for(int i = 0; i < 2; i++){
            cp = RandomChord.randMajPreDom().setKey(k);
            p1.add(cp.eachChordAs(Sequences.getChord(cp, "hq")));
            p2.add(cp.eachChordAs(Sequences.randDotHalfBeat(0)));
         }
      }
      //four chords in predom
      if(num == 1){
         for(int i = 0; i < 4; i++){
            cp = RandomChord.randMajPreDom().setKey(k);
            p1.add(cp.eachChordAs(Sequences.getChord(cp, "qi")));
            p2.add(cp.eachChordAs(Sequences.randDotQuaterBeat(0)));
         }
      }
      //if e is false, then do half cadence
      //one chord in dom, one chord in tonic
      if(e){
         cp = new ChordProgression("V").setKey(k);
         p1.add(cp.eachChordAs(Sequences.getChord(cp, "qi")));
         p2.add(cp.eachChordAs(Sequences.randDotQuaterBeat(0)));
         cp = new ChordProgression("I").setKey(k);
         p1.add(cp.eachChordAs(Sequences.getChord(cp, "qi")));
         p2.add(cp.eachChordAs(Sequences.randDotQuaterBeat(1)));
      }
      else{
         cp = RandomChord.randMajDom().setKey(k);
         p1.add(cp.eachChordAs(Sequences.getChord(cp, "qi")));
         p2.add(cp.eachChordAs(Sequences.randDotQuaterBeat(0)));
         cp = new ChordProgression("V").setKey(k);
         p1.add(cp.eachChordAs(Sequences.getChord(cp, "qi")));
         p2.add(cp.eachChordAs(Sequences.randDotQuaterBeat(1)));
      }
      return p4;
   }
   public static Pattern[] smallMinSixEight(boolean e, String k, String in){
      //for chords
      Pattern p1 = new Pattern("V0");
      //for sequences
      Pattern p2 = new Pattern("V1");
      ChordProgression cp;
      Pattern[] p4 = {p1, p2};
      int num = (int)(Math.random() * 2);
      //one chord in tonic
      if(num == 0){
         cp = new ChordProgression("i").setKey(k);
         p1.add(cp.eachChordAs(Sequences.getChord(cp, "hq")));
         p2.add(cp.eachChordAs(Sequences.randDotHalfBeat(0)).getPattern().setInstrument(in));
      }
      //two chords in tonic
      if(num == 1){
         cp = new ChordProgression("i").setKey(k);
         p1.add(cp.eachChordAs(Sequences.getChord(cp, "qi")));
         p2.add(cp.eachChordAs(Sequences.randDotQuaterBeat(0)).getPattern().setInstrument(in));
         cp = RandomChord.randMinTonic().setKey(k);
         p1.add(cp.eachChordAs(Sequences.getChord(cp, "qi")));
         p2.add(cp.eachChordAs(Sequences.randDotQuaterBeat(0)));
      }
      num = (int)(Math.random() * 2);
      //two chords in predom
      if(num == 0){
         for(int i = 0; i < 2; i++){
            cp = RandomChord.randMinPreDom().setKey(k);
            p1.add(cp.eachChordAs(Sequences.getChord(cp, "hq")));
            p2.add(cp.eachChordAs(Sequences.randDotHalfBeat(0)));
         }
      }
      //four chords in predom
      if(num == 1){
         for(int i = 0; i < 4; i++){
            cp = RandomChord.randMinPreDom().setKey(k);
            p1.add(cp.eachChordAs(Sequences.getChord(cp, "qi")));
            p2.add(cp.eachChordAs(Sequences.randDotQuaterBeat(0)));
         }
      }
      //if e is false, then do half cadence
      //one chord in dom, one chord in tonic
      if(e){
         cp = new ChordProgression("V").setKey(k);
         p1.add(cp.eachChordAs(Sequences.getChord(cp, "qi")));
         p2.add(cp.eachChordAs(Sequences.randDotQuaterBeat(0)));
         cp = new ChordProgression("i").setKey(k);
         p1.add(cp.eachChordAs(Sequences.getChord(cp, "qi")));
         p2.add(cp.eachChordAs(Sequences.randDotQuaterBeat(1)));
      }
      else{
         cp = RandomChord.randMinDom().setKey(k);
         p1.add(cp.eachChordAs(Sequences.getChord(cp, "qi")));
         p2.add(cp.eachChordAs(Sequences.randDotQuaterBeat(0)));
         cp = new ChordProgression("V").setKey(k);
         p1.add(cp.eachChordAs(Sequences.getChord(cp, "qi")));
         p2.add(cp.eachChordAs(Sequences.randDotQuaterBeat(1)));
      }
      return p4;
   }
   public static Pattern[] medMajFourFour(boolean e, String k, String in){
      //for chords
      Pattern p1 = new Pattern("V0");
      //for sequences
      Pattern p2 = new Pattern("V1");
      ChordProgression cp;
      Pattern[] p4 = {p1, p2};
      int num = (int)(Math.random() * 2);
      //two chord in tonic
      if(num == 0){
         cp = new ChordProgression("I").setKey(k);
         p1.add(cp.eachChordAs(Sequences.getChord(cp, "w")));
         p2.add(cp.eachChordAs(Sequences.randWholeBeat(0)).getPattern().setInstrument(in));
         cp = RandomChord.randMajTonic().setKey(k);
         p1.add(cp.eachChordAs(Sequences.getChord(cp, "w")));
         p2.add(cp.eachChordAs(Sequences.randWholeBeat(0)));
      }
      //four chords in tonic
      if(num == 1){
         cp = new ChordProgression("I").setKey(k);
         p1.add(cp.eachChordAs(Sequences.getChord(cp, "h")));
         p2.add(cp.eachChordAs(Sequences.randHalfBeat(0)).getPattern().setInstrument(in));
         for(int i = 0; i < 3; i++){
            cp = RandomChord.randMajTonic().setKey(k);
            p1.add(cp.eachChordAs(Sequences.getChord(cp, "h")));
            p2.add(cp.eachChordAs(Sequences.randHalfBeat(0)));
         }
      }
      num = (int)(Math.random() * 2);
      //four chords in predom
      if(num == 0){
         for(int i = 0; i < 4; i++){
            cp = RandomChord.randMajPreDom().setKey(k);
            p1.add(cp.eachChordAs(Sequences.getChord(cp, "w")));
            p2.add(cp.eachChordAs(Sequences.randWholeBeat(0)));
         }
      }
      //eight chords in predom
      if(num == 1){
         for(int i = 0; i < 8; i++){
            cp = RandomChord.randMajPreDom().setKey(k);
            p1.add(cp.eachChordAs(Sequences.getChord(cp, "h")));
            p2.add(cp.eachChordAs(Sequences.randHalfBeat(0)));
         }
      }
      //if e is false, then do half cadence
      //one chord in dom, one chord in tonic
      if(e){
         cp = new ChordProgression("V").setKey(k);
         p1.add(cp.eachChordAs(Sequences.getChord(cp, "w")));
         p2.add(cp.eachChordAs(Sequences.randWholeBeat(0)));
         cp = new ChordProgression("I").setKey(k);
         p1.add(cp.eachChordAs(Sequences.getChord(cp, "w")));
         p2.add(cp.eachChordAs(Sequences.randWholeBeat(1)));
      }
      else{
         cp = RandomChord.randMajDom().setKey(k);
         p1.add(cp.eachChordAs(Sequences.getChord(cp, "w")));
         p2.add(cp.eachChordAs(Sequences.randWholeBeat(0)));
         cp = new ChordProgression("V").setKey(k);
         p1.add(cp.eachChordAs(Sequences.getChord(cp, "w")));
         p2.add(cp.eachChordAs(Sequences.randWholeBeat(1)));
      }
      return p4;
   }
   public static Pattern[] medMinFourFour(boolean e, String k, String in){
      //for chords
      Pattern p1 = new Pattern("V0");
      //for sequences
      Pattern p2 = new Pattern("V1");
      ChordProgression cp;
      Pattern[] p4 = {p1, p2};
      int num = (int)(Math.random() * 2);
      //two chord in tonic
      if(num == 0){
         cp = new ChordProgression("i").setKey(k);
         p1.add(cp.eachChordAs(Sequences.getChord(cp, "w")));
         p2.add(cp.eachChordAs(Sequences.randWholeBeat(0)).getPattern().setInstrument(in));
         cp = RandomChord.randMinTonic().setKey(k);
         p1.add(cp.eachChordAs(Sequences.getChord(cp, "w")));
         p2.add(cp.eachChordAs(Sequences.randWholeBeat(0)));
      }
      //four chords in tonic
      if(num == 1){
         cp = new ChordProgression("i").setKey(k);
         p1.add(cp.eachChordAs(Sequences.getChord(cp, "h")));
         p2.add(cp.eachChordAs(Sequences.randHalfBeat(0)).getPattern().setInstrument(in));
         for(int i = 0; i < 3; i++){
            cp = RandomChord.randMinTonic().setKey(k);
            p1.add(cp.eachChordAs(Sequences.getChord(cp, "h")));
            p2.add(cp.eachChordAs(Sequences.randHalfBeat(0)));
         }
      }
      num = (int)(Math.random() * 2);
      //four chords in predom
      if(num == 0){
         for(int i = 0; i < 4; i++){
            cp = RandomChord.randMinPreDom().setKey(k);
            p1.add(cp.eachChordAs(Sequences.getChord(cp, "w")));
            p2.add(cp.eachChordAs(Sequences.randWholeBeat(0)));
         }
      }
      //eight chords in predom
      if(num == 1){
         for(int i = 0; i < 8; i++){
            cp = RandomChord.randMinPreDom().setKey(k);
            p1.add(cp.eachChordAs(Sequences.getChord(cp, "h")));
            p2.add(cp.eachChordAs(Sequences.randHalfBeat(0)));
         }
      }
      //if e is false, then do half cadence
      //one chord in dom, one chord in tonic
      if(e){
         cp = new ChordProgression("V").setKey(k);
         p1.add(cp.eachChordAs(Sequences.getChord(cp, "w")));
         p2.add(cp.eachChordAs(Sequences.randWholeBeat(0)));
         cp = new ChordProgression("i").setKey(k);
         p1.add(cp.eachChordAs(Sequences.getChord(cp, "w")));
         p2.add(cp.eachChordAs(Sequences.randWholeBeat(1)));
      }
      else{
         cp = RandomChord.randMinDom().setKey(k);
         p1.add(cp.eachChordAs(Sequences.getChord(cp, "w")));
         p2.add(cp.eachChordAs(Sequences.randWholeBeat(0)));
         cp = new ChordProgression("V").setKey(k);
         p1.add(cp.eachChordAs(Sequences.getChord(cp, "w")));
         p2.add(cp.eachChordAs(Sequences.randWholeBeat(1)));
      }
      return p4;
   }
   public static Pattern[] medMajThreeFour(boolean e, String k, String in){
      //for chords
      Pattern p1 = new Pattern("V0");
      //for sequences
      Pattern p2 = new Pattern("V1");
      ChordProgression cp;
      Pattern[] p4 = {p1, p2};
      int num = (int)(Math.random() * 2);
      //two chord in tonic
      if(num == 0){
         cp = new ChordProgression("I").setKey(k);
         p1.add(cp.eachChordAs(Sequences.getChord(cp, "hq")));
         p2.add(cp.eachChordAs(Sequences.randDotHalfBeat(0)).getPattern().setInstrument(in));
         cp = RandomChord.randMajTonic().setKey(k);
         p1.add(cp.eachChordAs(Sequences.getChord(cp, "hq")));
         p2.add(cp.eachChordAs(Sequences.randDotHalfBeat(0)));
      }
      //six chords in tonic
      if(num == 1){
         cp = new ChordProgression("I").setKey(k);
         p1.add(cp.eachChordAs(Sequences.getChord(cp, "q")));
         p2.add(cp.eachChordAs(Sequences.randQuaterBeat(0)).getPattern().setInstrument(in));
         for(int i = 0; i < 5; i++){
            cp = RandomChord.randMajTonic().setKey(k);
            p1.add(cp.eachChordAs(Sequences.getChord(cp, "q")));
            p2.add(cp.eachChordAs(Sequences.randQuaterBeat(0)));
         }
      }
      num = (int)(Math.random() * 2);
      //four chords in predom
      if(num == 0){
         for(int i = 0; i < 4; i++){
            cp = RandomChord.randMajPreDom().setKey(k);
            p1.add(cp.eachChordAs(Sequences.getChord(cp, "hq")));
            p2.add(cp.eachChordAs(Sequences.randDotHalfBeat(0)));
         }
      }
      //twelve chords in predom
      if(num == 1){
         for(int i = 0; i < 12; i++){
            cp = RandomChord.randMajPreDom().setKey(k);
            p1.add(cp.eachChordAs(Sequences.getChord(cp, "q")));
            p2.add(cp.eachChordAs(Sequences.randQuaterBeat(0)));
         }
      }
      //if e is false, then do half cadence
      //one chord in dom, one chord in tonic
      if(e){
         cp = new ChordProgression("V").setKey(k);
         p1.add(cp.eachChordAs(Sequences.getChord(cp, "hq")));
         p2.add(cp.eachChordAs(Sequences.randDotHalfBeat(0)));
         cp = new ChordProgression("I").setKey(k);
         p1.add(cp.eachChordAs(Sequences.getChord(cp, "hq")));
         p2.add(cp.eachChordAs(Sequences.randQuaterBeat(1)));
      }
      else{
         cp = RandomChord.randMajDom().setKey(k);
         p1.add(cp.eachChordAs(Sequences.getChord(cp, "hq")));
         p2.add(cp.eachChordAs(Sequences.randHalfBeat(0)));
         cp = new ChordProgression("V").setKey(k);
         p1.add(cp.eachChordAs(Sequences.getChord(cp, "hq")));
         p2.add(cp.eachChordAs(Sequences.randQuaterBeat(1)));
      }
      return p4;
   }
   public static Pattern[] medMinThreeFour(boolean e, String k, String in){
      //for chords
      Pattern p1 = new Pattern("V0");
      //for sequences
      Pattern p2 = new Pattern("V1");
      ChordProgression cp;
      Pattern[] p4 = {p1, p2};
      int num = (int)(Math.random() * 2);
      //two chord in tonic
      if(num == 0){
         cp = new ChordProgression("i").setKey(k);
         p1.add(cp.eachChordAs(Sequences.getChord(cp, "hq")));
         p2.add(cp.eachChordAs(Sequences.randDotHalfBeat(0)).getPattern().setInstrument(in));
         cp = RandomChord.randMinTonic().setKey(k);
         p1.add(cp.eachChordAs(Sequences.getChord(cp, "hq")));
         p2.add(cp.eachChordAs(Sequences.randDotHalfBeat(0)));
      }
      //six chords in tonic
      if(num == 1){
         cp = new ChordProgression("i").setKey(k);
         p1.add(cp.eachChordAs(Sequences.getChord(cp, "q")));
         p2.add(cp.eachChordAs(Sequences.randQuaterBeat(0)).getPattern().setInstrument(in));
         for(int i = 0; i < 5; i++){
            cp = RandomChord.randMinTonic().setKey(k);
            p1.add(cp.eachChordAs(Sequences.getChord(cp, "q")));
            p2.add(cp.eachChordAs(Sequences.randQuaterBeat(0)));
         }
      }
      num = (int)(Math.random() * 2);
      //four chords in predom
      if(num == 0){
         for(int i = 0; i < 4; i++){
            cp = RandomChord.randMinPreDom().setKey(k);
            p1.add(cp.eachChordAs(Sequences.getChord(cp, "hq")));
            p2.add(cp.eachChordAs(Sequences.randDotHalfBeat(0)));
         }
      }
      //twelve chords in predom
      if(num == 1){
         for(int i = 0; i < 12; i++){
            cp = RandomChord.randMinPreDom().setKey(k);
            p1.add(cp.eachChordAs(Sequences.getChord(cp, "q")));
            p2.add(cp.eachChordAs(Sequences.randQuaterBeat(0)));
         }
      }
      //if e is false, then do half cadence
      //one chord in dom, one chord in tonic
      if(e){
         cp = new ChordProgression("V").setKey(k);
         p1.add(cp.eachChordAs(Sequences.getChord(cp, "hq")));
         p2.add(cp.eachChordAs(Sequences.randDotHalfBeat(0)));
         cp = new ChordProgression("i").setKey(k);
         p1.add(cp.eachChordAs(Sequences.getChord(cp, "hq")));
         p2.add(cp.eachChordAs(Sequences.randQuaterBeat(1)));
      }
      else{
         cp = RandomChord.randMinDom().setKey(k);
         p1.add(cp.eachChordAs(Sequences.getChord(cp, "hq")));
         p2.add(cp.eachChordAs(Sequences.randHalfBeat(0)));
         cp = new ChordProgression("V").setKey(k);
         p1.add(cp.eachChordAs(Sequences.getChord(cp, "hq")));
         p2.add(cp.eachChordAs(Sequences.randQuaterBeat(1)));
      }
      return p4;
   }
   public static Pattern[] medMajSixEight(boolean e, String k, String in){
      //for chords
      Pattern p1 = new Pattern("V0");
      //for sequences
      Pattern p2 = new Pattern("V1");
      ChordProgression cp;
      Pattern[] p4 = {p1, p2};
      int num = (int)(Math.random() * 2);
      //two chords in tonic
      if(num == 0){
         cp = new ChordProgression("I").setKey(k);
         p1.add(cp.eachChordAs(Sequences.getChord(cp, "hq")));
         p2.add(cp.eachChordAs(Sequences.randDotHalfBeat(0)).getPattern().setInstrument(in));
         cp = RandomChord.randMajTonic().setKey(k);
         p1.add(cp.eachChordAs(Sequences.getChord(cp, "hq")));
         p2.add(cp.eachChordAs(Sequences.randDotHalfBeat(0)));
      }
      //four chords in tonic
      if(num == 1){
         cp = new ChordProgression("I").setKey(k);
         p1.add(cp.eachChordAs(Sequences.getChord(cp, "qi")));
         p2.add(cp.eachChordAs(Sequences.randDotQuaterBeat(0)).getPattern().setInstrument(in));
         for(int i = 0; i < 3; i++){
            cp = RandomChord.randMajTonic().setKey(k);
            p1.add(cp.eachChordAs(Sequences.getChord(cp, "qi")));
            p2.add(cp.eachChordAs(Sequences.randDotQuaterBeat(0)));
         }
      }
      num = (int)(Math.random() * 2);
      //four chords in predom
      if(num == 0){
         for(int i = 0; i < 4; i++){
            cp = RandomChord.randMajPreDom().setKey(k);
            p1.add(cp.eachChordAs(Sequences.getChord(cp, "hq")));
            p2.add(cp.eachChordAs(Sequences.randDotHalfBeat(0)));
         }
      }
      //eight chords in predom
      if(num == 1){
         for(int i = 0; i < 8; i++){
            cp = RandomChord.randMajPreDom().setKey(k);
            p1.add(cp.eachChordAs(Sequences.getChord(cp, "qi")));
            p2.add(cp.eachChordAs(Sequences.randDotQuaterBeat(0)));
         }
      }
      //if e is false, then do half cadence
      //one chord in dom, one chord in tonic
      if(e){
         cp = new ChordProgression("V").setKey(k);
         p1.add(cp.eachChordAs(Sequences.getChord(cp, "hq")));
         p2.add(cp.eachChordAs(Sequences.randDotHalfBeat(0)));
         cp = new ChordProgression("I").setKey(k);
         p1.add(cp.eachChordAs(Sequences.getChord(cp, "hq")));
         p2.add(cp.eachChordAs(Sequences.randDotHalfBeat(1)));
      }
      else{
         cp = RandomChord.randMajDom().setKey(k);
         p1.add(cp.eachChordAs(Sequences.getChord(cp, "hq")));
         p2.add(cp.eachChordAs(Sequences.randDotHalfBeat(0)));
         cp = new ChordProgression("V").setKey(k);
         p1.add(cp.eachChordAs(Sequences.getChord(cp, "hq")));
         p2.add(cp.eachChordAs(Sequences.randDotHalfBeat(1)));
      }
      return p4;
   }
   public static Pattern[] medMinSixEight(boolean e, String k, String in){
      //for chords
      Pattern p1 = new Pattern("V0");
      //for sequences
      Pattern p2 = new Pattern("V1");
      ChordProgression cp;
      Pattern[] p4 = {p1, p2};
      int num = (int)(Math.random() * 2);
      //two chords in tonic
      if(num == 0){
         cp = new ChordProgression("i").setKey(k);
         p1.add(cp.eachChordAs(Sequences.getChord(cp, "hq")));
         p2.add(cp.eachChordAs(Sequences.randDotHalfBeat(0)).getPattern().setInstrument(in));
         cp = RandomChord.randMinTonic().setKey(k);
         p1.add(cp.eachChordAs(Sequences.getChord(cp, "hq")));
         p2.add(cp.eachChordAs(Sequences.randDotHalfBeat(0)));
      }
      //four chords in tonic
      if(num == 1){
         cp = new ChordProgression("i").setKey(k);
         p1.add(cp.eachChordAs(Sequences.getChord(cp, "qi")));
         p2.add(cp.eachChordAs(Sequences.randDotQuaterBeat(0)).getPattern().setInstrument(in));
         for(int i = 0; i < 3; i++){
            cp = RandomChord.randMinTonic().setKey(k);
            p1.add(cp.eachChordAs(Sequences.getChord(cp, "qi")));
            p2.add(cp.eachChordAs(Sequences.randDotQuaterBeat(0)));
         }
      }
      num = (int)(Math.random() * 2);
      //four chords in predom
      if(num == 0){
         for(int i = 0; i < 4; i++){
            cp = RandomChord.randMinPreDom().setKey(k);
            p1.add(cp.eachChordAs(Sequences.getChord(cp, "hq")));
            p2.add(cp.eachChordAs(Sequences.randDotHalfBeat(0)));
         }
      }
      //eight chords in predom
      if(num == 1){
         for(int i = 0; i < 8; i++){
            cp = RandomChord.randMinPreDom().setKey(k);
            p1.add(cp.eachChordAs(Sequences.getChord(cp, "qi")));
            p2.add(cp.eachChordAs(Sequences.randDotQuaterBeat(0)));
         }
      }
      //if e is false, then do half cadence
      //one chord in dom, one chord in tonic
      if(e){
         cp = new ChordProgression("V").setKey(k);
         p1.add(cp.eachChordAs(Sequences.getChord(cp, "hq")));
         p2.add(cp.eachChordAs(Sequences.randDotHalfBeat(0)));
         cp = new ChordProgression("i").setKey(k);
         p1.add(cp.eachChordAs(Sequences.getChord(cp, "hq")));
         p2.add(cp.eachChordAs(Sequences.randDotHalfBeat(1)));
         }
      else{
         cp = RandomChord.randMinDom().setKey(k);
         p1.add(cp.eachChordAs(Sequences.getChord(cp, "hq")));
         p2.add(cp.eachChordAs(Sequences.randDotHalfBeat(0)));
         cp = new ChordProgression("V").setKey(k);
         p1.add(cp.eachChordAs(Sequences.getChord(cp, "hq")));
         p2.add(cp.eachChordAs(Sequences.randDotHalfBeat(1)));
      }
      return p4;
   }
   public static Pattern[] majLong(String s, String k, String in){
      //for chords
      Pattern p1 = new Pattern("V0");
      //for sequences
      Pattern p2 = new Pattern("V1");
      ChordProgression cp;
      Pattern[] p4 = {p1, p2};
      Pattern[] p5 = new Pattern[2];
      if(s.equals("4/4")){
         p5 = smallMajFourFour(false, k, in);
         p1.add(p5[0]);
         p2.add(p5[1]);
         p5 = medMajFourFour(false, k, in);
         p1.add(p5[0]);
         p2.add(p5[1]);
         p5 = smallMajFourFour(true, k, in);
         p1.add(p5[0]);
         p2.add(p5[1]); 
      }
      if(s.equals("3/4")){
         p5 = smallMajThreeFour(false, k, in);
         p1.add(p5[0]);
         p2.add(p5[1]);
         p5 = medMajThreeFour(false, k, in);
         p1.add(p5[0]);
         p2.add(p5[1]);
         p5 = smallMajThreeFour(true, k, in);
         p1.add(p5[0]);
         p2.add(p5[1]); 
      }
      if(s.equals("6/8")){
         p5 = smallMajSixEight(false, k, in);
         p1.add(p5[0]);
         p2.add(p5[1]);
         p5 = medMajSixEight(false, k, in);
         p1.add(p5[0]);
         p2.add(p5[1]);
         p5 = smallMajSixEight(true, k, in);
         p1.add(p5[0]);
         p2.add(p5[1]); 
      }
      return p4;
   }
   public static Pattern[] minLong(String s, String k, String in){
      //for chords
      Pattern p1 = new Pattern("V0");
      //for sequences
      Pattern p2 = new Pattern("V1");
      ChordProgression cp;
      Pattern[] p4 = {p1, p2};
      Pattern[] p5 = new Pattern[2];
      if(s.equals("4/4")){
         p5 = smallMinFourFour(false, k, in);
         p1.add(p5[0]);
         p2.add(p5[1]);
         p5 = medMinFourFour(false, k, in);
         p1.add(p5[0]);
         p2.add(p5[1]);
         p5 = smallMinFourFour(true, k, in);
         p1.add(p5[0]);
         p2.add(p5[1]); 
      }
      if(s.equals("3/4")){
         p5 = smallMinThreeFour(false, k, in);
         p1.add(p5[0]);
         p2.add(p5[1]);
         p5 = medMinThreeFour(false, k, in);
         p1.add(p5[0]);
         p2.add(p5[1]);
         p5 = smallMinThreeFour(true, k, in);
         p1.add(p5[0]);
         p2.add(p5[1]); 
      }
      if(s.equals("6/8")){
         p5 = smallMinSixEight(false, k, in);
         p1.add(p5[0]);
         p2.add(p5[1]);
         p5 = medMinSixEight(false, k, in);
         p1.add(p5[0]);
         p2.add(p5[1]);
         p5 = smallMinSixEight(true, k, in);
         p1.add(p5[0]);
         p2.add(p5[1]); 
      }
      return p4;
   }
   
   //test
   public static void main(String[] args){
      Player player = new Player();
      Pattern[] p = smallMajFourFour(true, "Db", "acoustic_bass");
      System.out.println(p[0]);
      System.out.println(p[1]);
      player.play(p[0], p[1]);
      
   }
   
}