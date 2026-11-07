package org.example.catalogoproductos.dao;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;
import org.example.catalogoproductos.model.Producto;
import java.io.*;
import java.util.*;
public class JsonProductoDao implements ProductoDao {
    private final Gson gson = new GsonBuilder().setPrettyPrinting().create();
    @Override
    public List<Producto> cargar() {
        try (FileReader lector = new FileReader("productos.json")) {
            List<Producto> datos = gson.fromJson(lector, new TypeToken<List<Producto>>() {}.getType());
            return datos == null ? new ArrayList<>() : datos;
        } catch (FileNotFoundException e) {
            return new ArrayList<>();
        } catch (IOException e) {
            throw new RuntimeException("Error al cargar JSON", e);
        }
    }
    @Override
    public void guardar(List<Producto> productos) {
        try (FileWriter escritor = new FileWriter("productos.json")) {
            gson.toJson(productos, escritor);
        } catch (IOException e) {
            throw new RuntimeException("Error al guardar JSON", e);
        }
    }
}
