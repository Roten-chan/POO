package org.example.gestorestudiantesjson.repository;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import org.example.gestorestudiantesjson.dao.EstudianteDao;
import org.example.gestorestudiantesjson.dao.JsonEstudianteDao;
import org.example.gestorestudiantesjson.model.Estudiante;

public class EstudianteRepository {
    private final EstudianteDao dao = new JsonEstudianteDao();
    private final ObservableList<Estudiante> estudiantes = FXCollections.observableArrayList();

    public ObservableList<Estudiante> getEstudiantes() {
        return estudiantes;
    }

    public void cargarDesdeJson() {
        estudiantes.setAll(dao.cargar());
    }

    public void guardarEnJson() {
        dao.guardar(estudiantes);
    }

    public void agregar(Estudiante estudiante) {
        estudiantes.add(estudiante);
    }
}