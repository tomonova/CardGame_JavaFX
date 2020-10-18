/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hr.algebra.controller;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.layout.GridPane;

/**
 * FXML Controller class
 *
 * @author TomoNova
 */
public class StolController implements Initializable {

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

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
