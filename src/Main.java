import Aufgabe1.Note.*;

import java.util.Arrays;
import java.util.List;

import static Aufgabe1.Note.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int[] note={29, 37, 38, 41, 84, 67};
        System.out.println(nichtausreichende(note));
        System.out.println(durchsnittsWert(note));
        System.out.println(Arrays.toString(abgerundete(note)));
        System.out.println(maximal(note));
        }
    }
