package gt.edu.miumg.pizzeria;

public class Salsa implements Ingredientes{
    private String tipo;
    private int cantidad;
public Salsa(String tipo, int cantidad) {
    this.tipo = tipo;
    this.cantidad = cantidad;
}

    @Override
    public String obtenerNombre() {
        return "Salsa " + tipo;
    }

    @Override
    public int obtenerCantidad() {
        return cantidad;
    }

    @Override
    public String toString() {
        return "Salsa{" +
                "tipo='" + tipo + '\'' +
                ", cantidad=" + cantidad +
                '}';
    }
}
