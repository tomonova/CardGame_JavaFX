
package hr.algebra.model;

import hr.algebra.model.enums.SpilTip;
import java.util.ArrayList;
import java.util.Optional;

public class Igrac {
    private String Ime;
    public Spil stihSpil;
    public Ruka ruka;

    public void setIme(String Ime) {
        this.Ime = Ime;
    }

    public Igrac(String Ime) {
        this.Ime = Ime;
        stihSpil = new Spil(SpilTip.STIH);
        ruka = new Ruka();
    }
    
    @Override
    public String toString() {
        return Ime;
    }
    
}
