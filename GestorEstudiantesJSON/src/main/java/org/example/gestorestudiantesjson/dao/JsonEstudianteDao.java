package org.example.gestorestudiantesjson.dao;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;
import org.example.gestorestudiantesjson.model.Estudiante;
import java.io.*;
import java.util.*;
public class JsonEstudianteDao implements EstudianteDao {
    private final Gson gson = new GsonBuilder().setPrettyPrinting().create();
    @Override
    public List<Estudiante> cargar() {
        try (FileReader lector = new FileReader("estudiantes.json")) {
            List<Estudiante> datos = gson.fromJson(lector, new TypeToken<List<Estudiante>>() {}.getType());
            return datos == null ? new ArrayList<>() : datos;
        } catch (FileNotFoundException e) {
            return new ArrayList<>();
        } catch (IOException e) {
            throw new RuntimeException("Error al cargar JSON", e);
        }
    }
    @Override
    public void guardar(List<Estudiante> estudiantes) {
        try (FileWriter escritor = new FileWriter("estudiantes.json")) {
            gson.toJson(estudiantes, escritor);
        } catch (IOException e) {
            throw new RuntimeException("Error al guardar JSON", e);
        }
    }
}