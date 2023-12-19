package de.hhn.se.foodmood.view.fm;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;

import java.io.IOException;

public class MainPMT extends Application {
  @Override
  public void start(Stage stage) throws IOException {
    FXMLLoader fxmlLoader = new FXMLLoader(MainPMT.class.getResource("home.fxml"));
    Scene scene = new Scene(fxmlLoader.load(), 688, 459);
    stage.setTitle("PMT");
    stage.setScene(scene);
    stage.show();
  }
  public static void main(String[] args) {
    launch();
  }
}