package gt.edu.miumg.pizzeria;

import java.util.ArrayList;
import java.util.List;

public class Sucursal {
    private String nombre;
    private String direccion;
    private List<Empleado> empleados = new ArrayList<>();
    private List<Equipo> equipos =  new ArrayList<>();
    private Pizza pizza;
    private List <Ingredientes> ingredientes = new ArrayList<>();
    public Sucursal(String nombre, String direccion) {
        this.nombre = nombre;
        this.direccion = direccion;
    }

    public void agregarEmpleado (Empleado empleado) {
        System.out.println("Agregando empleado...");
        empleados.add(empleado);
    }
    public void agregarEquipo (Equipo equipo) {
        System.out.println("Agregando equipo...");
        equipos.add(equipo);
    }
    public void agregarEspecialidad(Pizza piza) {
        System.out.println("Agregando pizza...");
        this.pizza = pizza;
    }
    public void agregarIngredientes(Ingredientes ingrediente) {
        System.out.println("Agregando ingrediente...");
        ingredientes.add(ingrediente);
    }

    @Override
    public String toString() {
        return "Sucursal{" +
                "nombre='" + nombre + '\'' +
                ", direccion='" + direccion + '\'' +
                ", empleados=" + empleados +
                ", equipos=" + equipos +
                ", pizza=" + pizza +
                ", ingredientes=" + ingredientes +
                '}';
    }
}
