package de.hhn.se.foodmood.view.fm;

  import javafx.event.ActionEvent;
import javafx.fxml.FXML;
  import javafx.fxml.FXMLLoader;
  import javafx.scene.control.Button;
import javafx.scene.image.ImageView;

  public class HomeController {

    @FXML
    private Button createButton;

    @FXML
    private ImageView imageViewHome;

    @FXML
    void createButton(ActionEvent event) {
      FXMLLoader loader = new FXMLLoader(getClass().getResource("create.fxml"));

    }

  }
