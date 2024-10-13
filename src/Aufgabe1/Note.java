package Aufgabe1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Note {



    public static List<Integer> nichtausreichende(int[] noten){
        List<Integer> nichtaus = new ArrayList<Integer>();
        for(int note:noten)
        {
            if(note<40)
                nichtaus.add(note);
        }
        return nichtaus;
    }

    public static double durchsnittsWert(int[] noten){
        double wert = 0.0;
        for(int note:noten)
        {
            wert+=note;
        }
        wert/=noten.length;
        return wert;
    }

    public static int[] abgerundete(int[] noten){
        int[] angerundeteNoten = new int[noten.length];
        int i=0;
        for (int note : noten) {
            if(note<38){
                angerundeteNoten[i++]=note;
                continue;
            }
            int vielfach;
            vielfach=((note/5)+1)*5;
            if(vielfach-note<3)
                angerundeteNoten[i++]=vielfach;
            else
                angerundeteNoten[i++]=note;
        }
        return angerundeteNoten;
    }

    public static int maximal(int[] noten){
        noten=abgerundete(noten);
        List<Integer> notes = new ArrayList<>();
        for(int note:noten){
            notes.add(note);
        }
        Collections.sort(notes);
        return notes.get(notes.size()-1);
    }
}
