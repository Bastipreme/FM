package de.hhn.se.foodmood.view.fm;

import de.hhn.se.foodmood.view.fm.StadtKoordinatenFinder;
import de.hhn.se.foodmood.view.fm.Koordinaten;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class CreateController {

    @FXML
    private Button buttonFinish;

    @FXML
    private TextField textFieldBusinessName;

    @FXML
    private TextField textFieldLocation;

    @FXML
    private TextField textFieldPLZ;

    private StadtKoordinatenFinder koordinatenFinder = new StadtKoordinatenFinder();

    @FXML
    public void handleButtonFinishClick() {
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
}