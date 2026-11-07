package org.example.catalogoproductos.app;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
public class MainApp extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        FXMLLoader loader = new FXMLLoader(MainApp.class.getResource(
                "/org/example/catalogoproductos/view/catalogo-view.fxml"));
        stage.setTitle("Catálogo de productos");
        stage.setScene(new Scene(loader.load()));
        stage.show();
    }
}
