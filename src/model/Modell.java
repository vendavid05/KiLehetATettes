package model;

public class Modell {
    private final String[] nevek = {"Anna", "Béla", "Csaba", "Dávid"};
    private final String[] allitasok = {
        "Béla tette", 
        "Csaba tette", 
        "Nem Béla tette", 
        "Nem Csaba tette"
    };
    
    private final int tettesHelye;

    public Modell() {
        this.tettesHelye = keresdMegATettest();
    }

    private boolean allitasIgaz(int szemely, int tettes) {
        if (szemely == 0) return tettes == 1; // Anna: Bela tette
        if (szemely == 1) return tettes == 2; // Bela: Csaba tette
        if (szemely == 2) return tettes != 1; // Csaba: Nem Bela tette
        if (szemely == 3) return tettes != 2; // David: Nem Csaba tette
        return false;
    }

    
    private int keresdMegATettest() {
        for (int t = 0; t < 4; t++) {
            int igazak = 0;
            if (allitasIgaz(0, t)) igazak++; // Anna
            if (allitasIgaz(1, t)) igazak++; // Bela
            if (allitasIgaz(2, t)) igazak++; // Csaba
            if (allitasIgaz(3, t)) igazak++; // David
            

            if (igazak == 3) {
                return t;
            }
        }
        return -1; 
    }

    public int getNevekSzama() {
        return nevek.length;
    }

    public String[] getNevek() {
        return nevek;
    }

    public String[] getAllitasok() {
        return allitasok;
    }

    public int getTettesHelye() {
        return tettesHelye;
    }
}