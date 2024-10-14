package Aufgabe3;

public class Grossezahlen {

    public static int[] summe(int[] zahl1, int[] zahl2) {
        int n = zahl1.length;
        int[] ergebnis = new int[n + 1];
        int ubertrag = 0;

        for (int i = n - 1; i >= 0; i--) {
            int sum = zahl1[i] + zahl2[i] + ubertrag;
            ergebnis[i + 1] = sum % 10;
            ubertrag = sum / 10;
        }

        ergebnis[0] = ubertrag;
        return ergebnis;
    }

    public static int[] differenz(int[] zahl1, int[] zahl2) {
        int n = zahl1.length;
        int[] ergebnis = new int[n];
        int ausleihe = 0;

        for (int i = n - 1; i >= 0; i--) {
            int differenz = zahl1[i] - zahl2[i] - ausleihe;
            if (differenz < 0) {
                differenz += 10;
                ausleihe = 1;
            } else {
                ausleihe = 0;
            }
            ergebnis[i] = differenz;
        }

        return ergebnis;
    }

    public static int[] multiplikation(int[] zahl, int ziffer) {
        int n = zahl.length;
        int[] ergebnis = new int[n + 1];
        int uebertrag = 0;

        for (int i = n - 1; i >= 0; i--) {
            int produkt = zahl[i] * ziffer + uebertrag;
            ergebnis[i + 1] = produkt % 10;
            uebertrag = produkt / 10;
        }

        ergebnis[0] = uebertrag;
        return ergebnis;
    }

    public static int[] division(int[] zahl, int ziffer) {
        int n = zahl.length;
        int[] ergebnis = new int[n];
        int rest = 0;

        for (int i = 0; i < n; i++) {
            int aktuellezahl = rest * 10 + zahl[i];
            ergebnis[i] = aktuellezahl / ziffer;
            rest = aktuellezahl % ziffer;
        }

        return ergebnis;
    }
}
