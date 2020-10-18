package hr.algebra.model;

import hr.algebra.model.enums.Boja;
import hr.algebra.model.enums.Rang;
import javafx.scene.image.Image;

public class Karta {
    private final Boja boja;
    private final Rang rang;
    private final Image slika;

    @Override
    public String toString() {
        return rang+","+boja;
    }

    public Karta(Boja boja,Rang rang) {
        this.boja = boja;
        this.rang = rang;
        this.slika=null;
        System.out.println(System.getProperty("user-dir"));
    }
}
