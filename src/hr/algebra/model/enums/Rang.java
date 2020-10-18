package hr.algebra.model.enums;

import java.util.HashMap;
import java.util.Map;

public enum Rang {
    SEDAM("Sedmica", 0, 0, 7),
    OSAM("Osmica", 0, 0, 8),
    DEVET("Devetka", 0, 14, 9),
    DESET("Cener", 10, 10, 10),
    DECKO("Žandar", 2, 20, 11),
    DAMA("Baba", 3, 3, 12),
    KRALJ("Kralj", 4, 4, 13),
    AS("Kec", 11, 11, 14);

    public final String ime;
    public final int vrijednost;
    public final int vrijednost_adut;
    public final int redosljed;

    private Rang(String ime, int vrijednost, int vrijednost_adut, int redosljed) {
        this.ime = ime;
        this.vrijednost = vrijednost;
        this.vrijednost_adut = vrijednost_adut;
        this.redosljed = redosljed;
    }
    private static final Map<String, Rang> PO_IMENU = new HashMap<>();
    private static final Map<Integer, Rang> PO_VRIJEDNOSTI = new HashMap<>();
    private static final Map<Integer, Rang> PO_VRIJEDNOSTI_ADUT = new HashMap<>();
    private static final Map<Integer, Rang> PO_REDOSLJEDU = new HashMap<>();

    static {
        for (Rang r : values()) {
            PO_IMENU.put(r.ime, r);
            PO_VRIJEDNOSTI.put(r.vrijednost, r);
            PO_VRIJEDNOSTI_ADUT.put(r.vrijednost_adut, r);
            PO_REDOSLJEDU.put(r.redosljed, r);
        }
    }

    @Override
    public String toString() {
        return ime;
    }
    
        public static Rang getVrijednost(int vrijednost) {
        return PO_VRIJEDNOSTI.get(vrijednost);
    }

    public static Rang getVrijednostAdut(int vrijednost) {
        return PO_VRIJEDNOSTI_ADUT.get(vrijednost);
    }

    public static Rang getRedosljed(int vrijednost) {
        return PO_REDOSLJEDU.get(vrijednost);
    }

    public static Rang getIme(String ime) {
        return PO_IMENU.get(ime);
    }
}
