package gt.edu.miumg.pizzeria;

public class Queso implements Ingredientes{
    private String tipo;
    private int cantidad;
    public Queso(String tipo, int cantidad) {
        this.tipo = tipo;
        this.cantidad = cantidad;
    }
    @Override
    public String obtenerNombre() {
        return "Queso " + tipo;
    }

    @Override
    public int obtenerCantidad() {
        return cantidad;
    }

    @Override
    public String toString() {
        return "Queso{" +
                "tipo='" + tipo + '\'' +
                ", cantidad=" + cantidad +
                '}';
    }
}
