package hr.algebra.controller;

import hr.algebra.model.*;
import hr.algebra.model.enums.SpilTip;
import java.net.URL;
import java.util.Optional;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;

public class StolController implements Initializable {

    private final Spil spil;
    private Igrac igrac1;
    private Igrac igrac2;
    private Igra igra;
    private String ime1 = "igrac1";

    public StolController() {
        this.spil = new Spil(SpilTip.NOVI);
        igrac1 = new Igrac(ime1);
        igrac2 = new Igrac("Šeki");
        igra = new Igra(igrac1, igrac2);
    }
    @FXML
    private GridPane mainGrid;
    @FXML
    private GridPane opponentCards;
    @FXML
    private GridPane mainCardArea;
    @FXML
    private GridPane throwingArea;
    @FXML
    private GridPane playerCards;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        SpremiStol();
    }

    public void postaviImeIgraca(String ime) {
        ime1 = ime;
    }

    private void SpremiStol() {
        igrac1 = new Igrac(ime1);
        igra = new Igra(igrac1, igrac2);
        podjeliKartePocetak();
        StaviKarteNaStol(igrac1);
    }

    private void podjeliKartePocetak() {
        for (int i = 1; i < 13; i++) {
            if (i % 2 == 0) {
                igrac2.ruka.dodajKartu(spil.dijeli());
            } else {
                igrac1.ruka.dodajKartu(spil.dijeli());
            }
        }
    }

    private void StaviKarteNaStol(Igrac igrac) {
        int kolona = 0;
        for (Karta karta : igrac1.ruka.karteURuci) {
            karta.Okreni();
            ImageView iv = new ImageView(karta.getSlika());
            iv.setPreserveRatio(true);
            playerCards.add(iv, kolona, 0);
            kolona++;
        }
    }
}
