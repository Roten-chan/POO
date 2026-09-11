public class Producto {
    private String nombre;
    private int precio;

    public Producto(String nombre, int precio){
        this.nombre = nombre;
        this.precio = precio;
    }

    public String getnombre(){
        return nombre;
    }

    public int getprecio(){
        return precio;
    }

    @Override
    public String toString(){
        return "Nombre: " + nombre + "Precio: " + precio;
    }
}
