package Aufgabe4;

public class Elektronik {

    public static int billigstetastatur(int[] tastaturen) {
        int billigste = tastaturen[0];
        for (int preis : tastaturen) {
            if (preis < billigste) {
                billigste = preis;
            }
        }
        return billigste;
    }

    public static int teuerstengegenstand(int[] tastaturen, int[] usb){
        int maxtast = tastaturen[0];
        int maxusb=tastaturen[0];
        for(int t:tastaturen){
            if(t>maxtast){
                maxtast=t;
            }
        }
        for(int u:usb){
            if(u>maxusb){
                maxusb=u;
            }
        }
        if(maxtast>maxusb)
            return maxtast;
        else return maxusb;

    }

    public static int teurstebuget(int[] usb, int buget){
        int teuer=0;
        for (int preis : usb) {
            if (preis <= buget && preis > teuer) {
                teuer = preis;
            }
        }
        return teuer;
    }

    public static int maximalengeld(int[] tastaturen, int[] usb, int buget){
        int sum=-1;
        for(int t:tastaturen){
            for(int u:usb){
                int preis=t+u;
                if(preis>sum && preis<=buget)
                    sum=preis;
            }
        }
        return sum;
    }
}
