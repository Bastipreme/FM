package de.hhn.se.foodmood.view.fm;

  import javafx.event.ActionEvent;
import javafx.fxml.FXML;
  import javafx.fxml.FXMLLoader;
  import javafx.scene.Node;
  import javafx.scene.Parent;
  import javafx.scene.Scene;
  import javafx.scene.control.Button;
import javafx.scene.image.ImageView;
  import javafx.stage.Stage;

  import java.io.IOException;

public class HomeController {

    @FXML
    private Button createButton;

    @FXML
    private ImageView imageViewHome;

    @FXML
    void createButton(ActionEvent event) {
      try {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("create.fxml"));
        Parent root = loader.load();
        Scene scene = new Scene(root);
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.show();
      } catch (IOException e) {
        e.printStackTrace();
      }
    }

  }
