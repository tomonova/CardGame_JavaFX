package hr.algebra.model;

import hr.algebra.model.enums.Boja;
import hr.algebra.model.enums.Rang;
import hr.algebra.model.enums.SpilTip;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Optional;
import java.util.Stack;

public class Spil {
    
    private Stack<Karta> spilKarata;
    
    public Spil(SpilTip spilTip) {
        spilKarata = new Stack<>();
        if (spilTip == SpilTip.NOVI) {
            for (Boja boja : Boja.values()) {
                for (Rang rang : Rang.values()) {
                    Karta karta = new Karta(boja, rang);
                    spilKarata.push(karta);
                }
            }
            Collections.shuffle(spilKarata);
        }
    }
    
    public Optional<Karta> dijeli() {
        return this.spilKarata.empty()
                ? Optional.empty()
                : Optional.of(this.spilKarata.pop());
    }
    public void dodajKartuUSpil(Karta karta){
        spilKarata.add(karta);
    }
}
