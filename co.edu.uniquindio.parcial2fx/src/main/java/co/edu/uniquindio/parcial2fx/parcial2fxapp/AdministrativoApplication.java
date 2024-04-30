package co.edu.uniquindio.parcial2fx.parcial2fxapp;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class AdministrativoApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(AdministrativoApplication.class.getResource("Administrativo.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        stage.setTitle("Interfaz administrativa");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}