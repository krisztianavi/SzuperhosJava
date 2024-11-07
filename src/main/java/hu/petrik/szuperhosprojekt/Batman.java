package hu.petrik.szuperhosprojekt;

import java.text.MessageFormat;

public class Batman implements Szuperhos, Milliardos {
    private float lelemenyesseg;

    public Batman() {
        this(100);
    }

    public Batman(float lelemenyesseg) {
        this.lelemenyesseg = lelemenyesseg;
    }

    @Override
    public double mekkoraAzEreje() {
        return lelemenyesseg * 2;
    }

    @Override
    public boolean legyoziE(Szuperhos szuperhos) {
        return this.lelemenyesseg > szuperhos.mekkoraAzEreje();
    }

    @Override
    public void kutyutKeszit() {
        lelemenyesseg += 50;
    }

    @Override
    public String toString() {
        return MessageFormat.format("Batman: leleményesség: {0}", lelemenyesseg);
    }
}