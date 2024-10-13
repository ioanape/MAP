package Aufgabe2;

public class Zahlen {

    public static int maximalzahl(int[] zahlen){
        int max=zahlen[0];
        for(int zahl:zahlen)
            if(zahl>max)
                max=zahl;
        return max;
    }

    public static int minimalzahl(int[] zahlen){
        int min=zahlen[0];
        for(int zahl:zahlen)
            if(zahl<min)
                min=zahl;
        return min;
    }

    public static int maximalesumme(int[] zahlen){
        int min=minimalzahl(zahlen);
        int sum=0;
        for(int zahl:zahlen)
            sum+=zahl;
        return sum-min;
    }

    public static int minimalesumme(int[] zahlen){
        int max=maximalzahl(zahlen);
        int sum=0;
        for (int zahl:zahlen) {
            sum+=zahl;
        }
        return sum-max;
    }
}
