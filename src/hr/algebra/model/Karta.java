package hr.algebra.model;

import hr.algebra.model.enums.Boja;
import hr.algebra.model.enums.Rang;
import javafx.scene.image.Image;

public class Karta {

    private final Boja boja;
    private final Rang rang;
    private final Image slikaFace;
    private final Image slikaGuze;
    private boolean okrenuta;

    @Override
    public String toString() {
        return rang + "," + boja;
    }

    public Karta(Boja boja, Rang rang) {
        this.boja = boja;
        this.rang = rang;
        this.slikaFace = new Image("file:///" + System.getProperty("user.dir") + "/src/hr/algebra/resources/images/" + rang + "_" + boja + ".PNG");
        this.slikaGuze = new Image("file:///" + System.getProperty("user.dir") + "/src/hr/algebra/resources/images/default.PNG");
    }

    public Image getSlika() {
        if (okrenuta) {
            return slikaGuze;
        }
        return slikaFace;
    }

    public void Aktiviraj() {
        okrenuta = true;
    }

    public void Deaktiviraj() {
        okrenuta = false;
    }
}
