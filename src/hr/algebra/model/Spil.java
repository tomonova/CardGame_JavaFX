package hr.algebra.model;

import hr.algebra.model.enums.Boja;
import hr.algebra.model.enums.Rang;
import java.util.Collections;
import java.util.Iterator;
import java.util.Optional;
import java.util.Stack;

public class Spil implements Iterable<Karta>{

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
    
    public Optional<Karta> dijeli(){
        return this.spilKarata.empty() 
                ? Optional.empty()
                : Optional.of(this.spilKarata.pop());
    }

    @Override
    public Iterator<Karta> iterator() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
