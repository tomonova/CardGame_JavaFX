package hr.algebra.model;

import hr.algebra.model.enums.Boja;
import hr.algebra.model.enums.Rang;
import java.util.Comparator;
import java.util.Objects;
import javafx.scene.image.Image;

public class Karta implements Comparable<Karta> {

    private final Boja boja;
    private final Rang rang;
    private final Image slikaFace;
    private final Image slikaGuze;
    private boolean okrenuta;
    private boolean adut = false;

    public Karta(Boja boja, Rang rang) {
        this.boja = boja;
        this.rang = rang;
        this.slikaFace = new Image("file:///" + System.getProperty("user.dir") + "/src/hr/algebra/resources/images/" + rang + "_" + boja + ".PNG");
        this.slikaGuze = new Image("file:///" + System.getProperty("user.dir") + "/src/hr/algebra/resources/images/default.PNG");
    }

    public void setAdut(boolean adut) {
        this.adut = true;
    }

    public Image getSlika() {
        if (okrenuta) {
            return slikaFace;
        }
        return slikaGuze;
    }

    public void Okreni() {
        okrenuta = !okrenuta;
    }

    public String getBoja() {
        return this.boja.toString();
    }

    public Integer getRang() {
        if (adut) {
            return this.rang.getRedosljedAdut();
        }
        return this.rang.getRedosljed();
    }


    @Override
    public int compareTo(Karta k) {
        return Comparator.comparing(Karta::getBoja)
                .thenComparingInt(Karta::getRang)
                .compare(this, k);
//        if (this.getRang() > k.getRang()) {
//            return 1;
//        }
//        else return -1;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 67 * hash + Objects.hashCode(this.boja);
        hash = 67 * hash + Objects.hashCode(this.rang.redosljed);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Karta other = (Karta) obj;
        if (this.boja != other.boja) {
            return false;
        }
        if (this.rang != other.rang) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return rang + "," + boja;
    }

}
