package org.example.gestorestudiantesjson.app;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
public class MainApp extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        FXMLLoader loader = new FXMLLoader(MainApp.class.getResource("/org/example/gestorestudiantesjson/view/lista-view.fxml"));
                stage.setTitle("Gestión de estudiantes");
        stage.setScene(new Scene(loader.load(), 700, 450));
        stage.show();
    }
}