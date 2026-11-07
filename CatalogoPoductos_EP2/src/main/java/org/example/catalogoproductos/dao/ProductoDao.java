package org.example.catalogoproductos.dao;

import org.example.catalogoproductos.model.Producto;
import java.util.List;
public interface ProductoDao {
    List<Producto> cargar();
    void guardar(List<Producto> productos);
}