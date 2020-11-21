package hr.algebra.model;

public class Dijeljenje {

    private Igrac igrac1;
    private Igrac igrac2;
    private Integer igrac1Bodovi;
    private Integer igrac2Bodovi;
    private int brojDijeljenja;

    public Dijeljenje(Igrac igrac1, Igrac igrac2) {
        this.igrac1 = igrac1;
        this.igrac2 = igrac2;
        igrac1Bodovi = 0;
        igrac2Bodovi = 0;
        brojDijeljenja =0;
    }

    @Override
    public String toString() {
        return "Dijeljenje " + brojDijeljenja + ": "
                + igrac1.toString() + "(" + igrac1Bodovi + ") ; "
                + igrac2.toString() + "(" + igrac2Bodovi + ")";
    }

    public void BodoviIgraca(int i1Bodovi, int i2Bodovi) {
        brojDijeljenja++;
        igrac1Bodovi += i1Bodovi;
        igrac2Bodovi += i2Bodovi;
    }
}
