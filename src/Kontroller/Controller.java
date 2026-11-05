package Kontroller;

import model.Modell;
import Nezet.View;

public class Controller {

    public Controller() {
        Modell modell = new Modell();
        View view = new View();

        view.kiirEredmeny(modell);
    }
}