import Aufgabe1.Note.*;
import Aufgabe2.Zahlen;

import java.util.Arrays;
import java.util.List;

import static Aufgabe1.Note.*;
import static Aufgabe2.Zahlen.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int[] note={29, 37, 38, 41, 84, 67};
        System.out.println(nichtausreichende(note));
        System.out.println(durchsnittsWert(note));
        System.out.println(Arrays.toString(abgerundete(note)));
        System.out.println(maximal(note));

        int[] zahlen={4, 8, 3, 10, 17};
        System.out.println(maximalzahl(zahlen));
        System.out.println(minimalzahl(zahlen));
        System.out.println(maximalesumme(zahlen));
        System.out.println(minimalesumme(zahlen));
        }
    }
