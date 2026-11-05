package Nezet;

import model.Modell;

public class View {

    public void kiirEredmeny(Modell modell) {

        System.out.println("Állítások:");
        System.out.println("=========================");
        for (int i = 0; i < modell.getNevekSzama(); i++) {
            System.out.printf(" - %s azt mondja: \"%s\"%n",
                    modell.getNevek()[i], modell.getAllitasok()[i]);
        }
        
        System.out.println("\nEredmény:");
        int tettesIndex = modell.getTettesHelye();
        if (tettesIndex != -1) {
            String tettesNev = modell.getNevek()[tettesIndex];
            System.out.println("A tettes : " + tettesNev);
        } else {
            System.out.println("Nincs olyan személy, akinél 3 igaz állítás lenne.");
        }
    }
}