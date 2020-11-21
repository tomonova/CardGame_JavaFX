/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hr.algebra.controller;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class GlavniMeniController implements Initializable {
    private String ime;
    @FXML
    private Button btnIgraj;
    @FXML
    private TextArea txtIme;
    @FXML
    private Label lblIme;

    public String getIme() {
        return ime;
    }
    

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

    @FXML
    private void BtnIgraj_Click(ActionEvent event) throws IOException {
        ime=txtIme.getText().trim();
        if (ime==null || ime.isEmpty()) {
            lblIme.setText("Ne meže bez imena!!!");
            return;
        }
//        Parent root = FXMLLoader.load(getClass().getResource("/hr/algebra/view/Stol.fxml"));
//        Stage stage = new Stage();
//        stage.setTitle("Igra");
//        stage.setScene(new Scene(root, 1024, 768));
//        stage.show();
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/hr/algebra/view/Stol.fxml"));
        Parent root = loader.load();
        StolController stolController = loader.getController();
        Stage stage = new Stage();
        stage.setTitle("Igra");
        stage.setScene(new Scene(root, 1024, 768));
        stolController.postaviImeIgraca(ime);
        stage.show();
    }

}
