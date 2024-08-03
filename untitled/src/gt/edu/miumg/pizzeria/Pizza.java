package gt.edu.miumg.pizzeria;

import java.util.ArrayList;
import java.util.List;

public abstract class Pizza {
    private String nombre;
    private String tamano;
    private double precio;
    protected List<Ingredientes> ingredientes = new ArrayList<>();

    public Pizza(String nombre, String tamano, double precio) {
        this.nombre = nombre;
        this.tamano = tamano;
        this.precio = precio;
    }



}
