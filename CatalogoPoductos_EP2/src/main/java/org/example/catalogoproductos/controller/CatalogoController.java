package org.example.catalogoproductos.controller;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import org.example.catalogoproductos.model.Producto;
import org.example.catalogoproductos.model.TipoProducto;
import org.example.catalogoproductos.repository.ProductoRepository;
public class CatalogoController {
    private final ProductoRepository repository = new ProductoRepository();
    @FXML private TextField txtNombre, txtPrecioBase, txtDescuento;
    @FXML private ComboBox<TipoProducto> cmbTipo;
    @FXML private TableView<Producto> tablaProductos;
    @FXML private TableColumn<Producto, Integer> colId, colPrecioBase, colDescuento, colPrecioFinal;
    @FXML private TableColumn<Producto, String> colNombre;
    @FXML private TableColumn<Producto, TipoProducto> colTipo;
    @FXML private Label lblEstado;
    @FXML
    public void initialize() {
        cmbTipo.getItems().setAll(TipoProducto.values());
        cmbTipo.setValue(TipoProducto.NORMAL);
        txtDescuento.setText("0");
        cmbTipo.valueProperty().addListener((obs, anterior, nuevo) -> {
            if (nuevo == TipoProducto.NORMAL) txtDescuento.setText("0");
        });
        colId.setCellValueFactory(new PropertyValueFactory<>("id"));
        colNombre.setCellValueFactory(new PropertyValueFactory<>("nombre"));
        colTipo.setCellValueFactory(new PropertyValueFactory<>("tipo"));
        colPrecioBase.setCellValueFactory(new PropertyValueFactory<>("precioBase"));
        colDescuento.setCellValueFactory(new PropertyValueFactory<>("descuento"));
        colPrecioFinal.setCellValueFactory(new PropertyValueFactory<>("precioFinal"));
        tablaProductos.setItems(repository.getProductos());
    }
    @FXML
    private void agregarProducto() {
        try {
            String nombre = txtNombre.getText().trim();
            TipoProducto tipo = cmbTipo.getValue();
            int precio = Integer.parseInt(txtPrecioBase.getText().trim());
            int descuento = Integer.parseInt(txtDescuento.getText().trim());
            Producto p = new Producto(repository.siguienteId(), nombre, tipo, precio, descuento);
            repository.agregar(p);
            lblEstado.setText("Producto agregado correctamente.");
            txtNombre.clear();
            txtPrecioBase.clear();
            txtDescuento.setText(tipo == TipoProducto.NORMAL ? "0" : "");
        } catch (NumberFormatException e) {
            lblEstado.setText("Precio base y descuento deben ser números enteros.");
        } catch (IllegalArgumentException e) {
            lblEstado.setText(e.getMessage());
        }
    }
    @FXML
    private void guardarJson() {
        try {
            repository.guardarEnJson();
            lblEstado.setText("Productos guardados en productos.json.");
        } catch (RuntimeException e) {
            lblEstado.setText("No se pudo guardar: " + e.getMessage());
        }
    }
    @FXML
    private void cargarJson() {
        try {
            repository.cargarDesdeJson();
            lblEstado.setText("Productos cargados desde productos.json.");
        } catch (RuntimeException e) {
            lblEstado.setText("No se pudo cargar: " + e.getMessage());
        }
    }
}

