package org.example.catalogoproductos.repository;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import org.example.catalogoproductos.dao.JsonProductoDao;
import org.example.catalogoproductos.dao.ProductoDao;
import org.example.catalogoproductos.model.Producto;
public class ProductoRepository {
    private final ProductoDao dao = new JsonProductoDao();
    private final ObservableList<Producto> productos = FXCollections.observableArrayList();
    public ObservableList<Producto> getProductos() { return productos; }
    public void agregar(Producto producto) { productos.add(producto); }
    public int siguienteId() {
        int maximo = 0;
        for (Producto p : productos) if (p.getId() > maximo) maximo = p.getId();
        return maximo + 1;
    }
    public void cargarDesdeJson() { productos.setAll(dao.cargar()); }
    public void guardarEnJson() { dao.guardar(productos); }
}
