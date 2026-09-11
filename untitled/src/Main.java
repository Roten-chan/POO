import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Producto>productos = new ArrayList<>();
        productos.add(new Producto("Lapiz", 100));
        productos.add(new Producto("Goma", 200));
        productos.add(new Producto("Sacapuntas", 500));
        productos.add(new Producto("Mochila", 20000));
        productos.forEach();
    }
}