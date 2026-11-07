package org.example.catalogoproductos.controller;

import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import org.example.catalogoproductos.model.Producto;
import org.example.catalogoproductos.repository.ProductoRepository;

public class CatalogoController {
    private final ProductoRepository respository = new ProductoRepository();
    @FXML private TableView<Producto> tablaProductos;
    @FXML private TableColumn<Producto, Integer> colID;
    @FXML private TableColumn<Producto, String> colNombre;
    @FXML private TableColumn<Producto, String> colTipo;
    @FXML private TableColumn<Producto, String> colPrecioBase;
    @FXML private TableColumn<Producto, String> colDescuento;
    @FXML private TableColumn<Producto, String> colPrecioFinal;
    @FXML
    public void initialize(){
        colID.setCellFactory(new PropertyValueFactory<>("id"));
        colNombre.setCellFactory(new);
    }
}
