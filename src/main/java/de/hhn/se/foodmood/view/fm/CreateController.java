// CreateController.java
package de.hhn.se.foodmood.view.fm;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;

public class CreateController {
    @FXML
    private TextField textFieldBusinessName;
    @FXML
    private AnchorPane rootPane;

    @FXML
    private Button buttonFinish;

    @FXML
    private TextField textFieldLocation;

    @FXML
    private TextField textFieldPLZ;

    private StadtKoordinatenFinder koordinatenFinder = new StadtKoordinatenFinder();

    public void buttonFinish(ActionEvent event) {
        String stadt = textFieldLocation.getText();
        String plz = textFieldPLZ.getText();

        Koordinaten koordinaten = koordinatenFinder.findeKoordinaten(stadt, plz);

        if (koordinaten != null) {
            System.out.println("Längengrad: " + koordinaten.getLongitude());
            System.out.println("Breitengrad: " + koordinaten.getLatitude());
        } else {
            System.out.println("Keine Koordinaten gefunden für " + stadt + ", " + plz);
        }
    }
    public void initialize() {
        Platform.runLater(() -> textFieldBusinessName.requestFocus());
    }
}