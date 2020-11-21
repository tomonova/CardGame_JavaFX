/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hr.algebra.model;

import java.util.List;
import java.util.Optional;
import java.util.SortedSet;
import java.util.TreeSet;

/**
 *
 * @author TomoNova
 */
public class Ruka {

    private static final int BROJ_KARATA = 6;
    public SortedSet<Karta> karteURuci;

    public Ruka() {
        this.karteURuci = new TreeSet<>();
    }
    
    public void dodajKartu(Optional<Karta> karta) {
        if (karteURuci.size() > BROJ_KARATA) {
            throw new RuntimeException("Previše karata u ruci");
        } else {
            this.karteURuci.add(karta.orElseThrow(IllegalStateException::new));
        }
    }
}
