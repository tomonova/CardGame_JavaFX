package hr.algebra.model.enums;

import hr.algebra.model.interfaces.Rangiranje;
import java.util.HashMap;
import java.util.Map;

public enum Rang implements Rangiranje {
    SEDAM("Sedmica", 0, 0, 7, 7),
    OSAM("Osmica", 0, 0, 8, 8),
    DEVET("Devetka", 0, 14, 9, 13),
    DESET("Cener", 10, 10, 10, 11),
    DECKO("Žandar", 2, 20, 11, 14),
    DAMA("Baba", 3, 3, 12, 9),
    KRALJ("Kralj", 4, 4, 13, 10),
    AS("Kec", 11, 11, 14, 12);

    public final String ime;
    public final int vrijednost;
    public final int vrijednost_adut;
    public final int redosljed;
    public final int redosljed_adut;

    private Rang(String ime, int vrijednost, int vrijednost_adut, int redosljed, int redosljed_adut) {
        this.ime = ime;
        this.vrijednost = vrijednost;
        this.vrijednost_adut = vrijednost_adut;
        this.redosljed = redosljed;
        this.redosljed_adut = redosljed_adut;
    }
    private static final Map<String, Rang> PO_IMENU = new HashMap<>();
    private static final Map<Integer, Rang> PO_VRIJEDNOSTI = new HashMap<>();
    private static final Map<Integer, Rang> PO_VRIJEDNOSTI_ADUT = new HashMap<>();
    private static final Map<Integer, Rang> PO_REDOSLJEDU = new HashMap<>();
    private static final Map<Integer, Rang> PO_REDOSLJEDU_ADUT = new HashMap<>();

    static {
        for (Rang r : values()) {
            PO_IMENU.put(r.ime, r);
            PO_VRIJEDNOSTI.put(r.vrijednost, r);
            PO_VRIJEDNOSTI_ADUT.put(r.vrijednost_adut, r);
            PO_REDOSLJEDU.put(r.redosljed, r);
            PO_REDOSLJEDU_ADUT.put(r.redosljed_adut, r);
        }
    }

    @Override
    public String toString() {
        return ime;
    }

    public static Rang getVrijednost(int vrijednost) {
        return PO_VRIJEDNOSTI.get(vrijednost);
    }

    public static Rang getVrijednostAdut(int vrijednost_adut) {
        return PO_VRIJEDNOSTI_ADUT.get(vrijednost_adut);
    }

    public static Rang getRedosljed(int redosljed) {
        return PO_REDOSLJEDU.get(redosljed);
    }

    public static Rang getRedosljedAdut(int redosljed_adut) {
        return PO_REDOSLJEDU_ADUT.get(redosljed_adut);
    }

    public static Rang getIme(String ime) {
        return PO_IMENU.get(ime);
    }

    @Override
    public Integer getRedosljed() {
        return redosljed;
    }

    @Override
    public Integer getRedosljedAdut() {
        return redosljed_adut;
    }
    
    @Override
    public Integer getVrijednost() {
        return vrijednost;
    }

    @Override
    public Integer getVrijednostAdut() {
        return vrijednost_adut;
    }

    @Override
    public String getIme() {
        return ime;
    }

}
