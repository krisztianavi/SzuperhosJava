package hu.petrik.szuperhosprojekt;

import java.text.MessageFormat;

public abstract class Bosszuallo implements Szuperhos {
    private float szuperero;
    private boolean vanEGyengesege;

    public Bosszuallo(float szuperero, boolean vanEGyengesege) {
        this.szuperero = szuperero;
        this.vanEGyengesege = vanEGyengesege;
    }

    public abstract boolean megmentiAVilagot();


    public void setSzuperero(float szuperero) {
        this.szuperero = szuperero;
    }

    public float getSzuperero() {
        return szuperero;
    }

    public void setVanEGyengesege(boolean vanEGyengesege) {
        this.vanEGyengesege = vanEGyengesege;
    }

    public boolean isVanEGyengesege() {
        return vanEGyengesege;
    }

    @Override
    public double mekkoraAzEreje() {
        return szuperero;
    }

    @Override
    public boolean legyoziE(Szuperhos szuperhos) {
        if (szuperhos instanceof Bosszuallo) {
            Bosszuallo ellenfel = (Bosszuallo) szuperhos;
            if (ellenfel.vanEGyengesege && ellenfel.mekkoraAzEreje() < this.mekkoraAzEreje()) {
                return true;
            }
        } else if (szuperhos.getClass() == Batman.class) {
            Batman batman = (Batman) szuperhos;
            if (batman.mekkoraAzEreje() * 2 <= this.mekkoraAzEreje()) {
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        return MessageFormat.format("Szupererő: {0}; {1} gyengesége", this.getSzuperero(), this.isVanEGyengesege() ? "van" : "nincs");
    }
}
