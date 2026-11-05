package org.example.gestorestudiantesjson.dao;

import org.example.gestorestudiantesjson.model.Estudiante;
import java.util.List;
public interface EstudianteDao {
    List<Estudiante> cargar();
    void guardar(List<Estudiante> estudiantes);
}