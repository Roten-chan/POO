package org.example.catalogoproductos.model;
public class Producto {
    private int id;
    private String nombre;
    private TipoProducto tipo;
    private int precioBase;
    private int descuento;
    public Producto() {}
    public Producto(int id, String nombre, TipoProducto tipo, int precioBase, int descuento) {
        this.id = id;
        this.nombre = nombre;
        this.tipo = tipo;
        this.precioBase = precioBase;
        this.descuento = descuento;
        validar();
    }
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }
    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }
    public TipoProducto getTipo() { return tipo; }
    public void setTipo(TipoProducto tipo) { this.tipo = tipo; }
    public int getPrecioBase() { return precioBase; }
    public void setPrecioBase(int precioBase) { this.precioBase = precioBase; }
    public int getDescuento() { return descuento; }
    public void setDescuento(int descuento) { this.descuento = descuento; }
    public int getPrecioFinal() {
        return (int) Math.round(precioBase * (1 - descuento / 100.0));
    }
    public void validar() {
        if (id <= 0) throw new IllegalArgumentException("El ID debe ser positivo.");
        if (nombre == null || nombre.isBlank()) throw new IllegalArgumentException("El nombre es obligatorio.");
        if (tipo == null) throw new IllegalArgumentException("Debe seleccionar un tipo.");
        if (precioBase <= 0) throw new IllegalArgumentException("El precio base debe ser mayor que cero.");
        if (tipo == TipoProducto.NORMAL && descuento != 0) throw new IllegalArgumentException("Un producto NORMAL no tiene descuento.");
        if (tipo == TipoProducto.OFERTA && (descuento < 1 || descuento > 50)) throw new IllegalArgumentException("El descuento de OFERTA debe estar entre 1 y 50.");
    }
}
