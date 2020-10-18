package hr.algebra.model.enums;

public enum Boja {
    
    ZELJE("Zelje"),
    HERC("Herc"),
    ZIR("Žir"),
    BUNDEVA("Bundeva");
    
    private final String boja;

    private Boja(String boja) {
        this.boja = boja;
    }

    @Override
    public String toString() {
        return boja;
    }
}
