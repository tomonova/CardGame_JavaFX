package hr.algebra.model;

import hr.algebra.model.enums.Boja;
import hr.algebra.model.enums.Rang;
import java.util.Collections;
import java.util.Stack;

public class Spil {

    private final Stack<Karta> spilKarata;

    public Spil(String tip) {
        spilKarata = new Stack<>();
        if (tip == "novi") {
            for (Boja boja : Boja.values()) {
                for (Rang rang : Rang.values()) {
                    Karta karta = new Karta(boja,rang);
                    spilKarata.push(karta);
                }
            }
            Collections.shuffle(spilKarata);
        }   
    }
}
