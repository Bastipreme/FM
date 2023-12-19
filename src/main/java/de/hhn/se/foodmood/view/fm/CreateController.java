package de.hhn.se.foodmood.view.fm;

import de.hhn.se.pmt.foodmood.model.FoodBusiness;
import de.hhn.se.pmt.foodmood.model.FoodBusinessDAO;
import de.hhn.se.pmt.foodmood.model.Location;
import de.hhn.se.pmt.foodmood.model.LocationDAO;
import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import org.orm.PersistentException;

public class CreateController {
  @FXML
  public TextField textFieldBusinessName;

  @FXML
  public Button buttonFinish;

  @FXML
  public TextField textFieldLocation;

  @FXML
  public TextField textFieldPLZ;

  @FXML
  public void buttonFinish(ActionEvent event) throws PersistentException, IOException {
    String businessName = textFieldBusinessName.getText();
    String locationName = textFieldLocation.getText();
    int plz = Integer.parseInt(textFieldPLZ.getText());

    LocationPLZ locationPLZ = new LocationPLZ();

    Location location = LocationDAO.createLocation();
    location.setCity(locationName);
    location.setPlz(plz);

    for (int i = 0; i < locationPLZ.getLocations().length; i++) {
      if (locationPLZ.getLocations()[i].equals(locationName) && locationPLZ.getPostcodes()[i] == plz) {
        location.setLongtitude(locationPLZ.getLongitude()[i]);
        location.setLatitude(locationPLZ.getLatitude()[i]);
        break;
      }
    }

    LocationDAO.save(location);

    FoodBusiness foodBusiness = FoodBusinessDAO.createFoodBusiness();
    foodBusiness.setBusinessName(businessName);
    foodBusiness.setBusinessLocation(location);
    FoodBusinessDAO.save(foodBusiness);

    System.out.println("Business Name: " + businessName);
    System.out.println("Location: " + locationName);
    System.out.println("PLZ: " + plz);
    System.out.println("Longitude: " + location.getLongtitude());
    System.out.println("Latitude: " + location.getLatitude());

    textFieldBusinessName.clear();
    textFieldLocation.clear();
    textFieldPLZ.clear();

    Alert alert = new Alert(Alert.AlertType.INFORMATION);
    alert.setTitle("Confirmation");
    alert.setHeaderText(null);
    alert.setContentText("Thank you for creating a food business!");
    alert.showAndWait();

    Parent home = FXMLLoader.load(getClass().getResource("home.fxml"));
    textFieldBusinessName.getScene().setRoot(home);
  }

}