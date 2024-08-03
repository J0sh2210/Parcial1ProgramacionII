package gt.edu.miumg.pizzeria;

public class Masa implements Ingredientes{
    private String nombre;
    private int cantidad;
    public Masa (String nombre, int cantidad) {
        this.nombre = nombre;
        this.cantidad = cantidad;
    }
    @Override
    public String obtenerNombre() {
    return nombre;
    }

    @Override
    public int obtenerCantidad() {
    return cantidad;
    }

    @Override
    public String toString() {
        return "Masa{" +
                "nombre='" + nombre + '\'' +
                ", cantidad=" + cantidad +
                '}';
    }
}
