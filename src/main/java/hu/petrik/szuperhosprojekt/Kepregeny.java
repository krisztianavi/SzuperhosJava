package hu.petrik.szuperhosprojekt;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Kepregeny {
    public static List<Szuperhos> szuperhosLista = new ArrayList<>();

    public static void szereplok(String file) throws IOException {
        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            String sor;
            while ((sor = br.readLine()) != null) {
                String[] adatok = sor.split(" ");
                String nev = adatok[0];
                int hanyszor = Integer.parseInt(adatok[1]);

                Szuperhos szuperhos;
                if ("Vasember".equals(nev)) {
                    szuperhos = new Vasember();
                } else if ("Batman".equals(nev)) {
                    szuperhos = new Batman();
                } else {
                    continue;
                }

                for (int i = 0; i < hanyszor; i++) {
                    if (szuperhos instanceof Milliardos) {
                        ((Milliardos) szuperhos).kutyutKeszit();
                    }
                }
                szuperhosLista.add(szuperhos);
            }
        }
    }

    public static void szuperhosok() {
        szuperhosLista.forEach(szuperhos -> System.out.println(szuperhos.toString()));
    }
}
