package org.example.gestorestudiantesjson.controller;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import org.example.gestorestudiantesjson.model.Estudiante;
import org.example.gestorestudiantesjson.repository.EstudianteRepository;
public class ListaController {
    private final EstudianteRepository repository = new EstudianteRepository();
    @FXML private TableView<Estudiante> tablaEstudiantes;
    @FXML private TableColumn<Estudiante, Integer> colId;
    @FXML private TableColumn<Estudiante, String> colNombre;
    @FXML private TableColumn<Estudiante, String> colCorreo;
    @FXML private TableColumn<Estudiante, Integer> colEdad;
    @FXML
    public void initialize() {
        colId.setCellValueFactory(new PropertyValueFactory<>("id"));
        colNombre.setCellValueFactory(new PropertyValueFactory<>("nombre"));
        colCorreo.setCellValueFactory(new PropertyValueFactory<>("correo"));
        colEdad.setCellValueFactory(new PropertyValueFactory<>("edad"));
        tablaEstudiantes.setItems(repository.getEstudiantes());
    }
    @FXML
    private void agregarEjemplo() {
        int id = repository.getEstudiantes().size() + 1;
        repository.agregar(new Estudiante(id, "Nuevo estudiante "+ id, "nuevo_"+ id +"@correo.com", 20+id));}
    @FXML
    private void cargarJson() { repository.cargarDesdeJson(); }
    @FXML
    private void guardarJson() { repository.guardarEnJson(); }
}