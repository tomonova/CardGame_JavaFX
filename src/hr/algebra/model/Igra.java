package hr.algebra.model;

import java.util.ArrayList;
import java.util.List;

public class Igra {
    private Igrac igrac1;
    private Igrac igrac2;
    private List<Dijeljenje> dijeljenjaIgre;
    private int igrac1Bodovi;
    private int igrac2Bodovi;

    public Igra(Igrac igrac1, Igrac igrac2) {
        this.igrac1 = igrac1;
        this.igrac2 = igrac2;
        dijeljenjaIgre = new ArrayList<>();
        igrac1Bodovi=0;
        igrac2Bodovi=0;
    }
    
    public void DodajBodove(int i1Bodovi, int i2Bodovi){
        Dijeljenje dijeljenje = new Dijeljenje(igrac1, igrac2);
        dijeljenje.BodoviIgraca(i1Bodovi, i2Bodovi);
        dijeljenjaIgre.add(dijeljenje);
    }
    public List<Dijeljenje> dohvatDijeljenja(){
        return dijeljenjaIgre;
    }
}
