package gt.edu.miumg.pizzeria;

public class Empleado {
    private String nombre;
    private String puesto;
    private Double salario;

    public Empleado(String nombre, String puesto, Double salario) {
        this.nombre = nombre;
        this.puesto = puesto;
        this.salario = salario;
    }
    public void trabajar (){
        System.out.println("Trabajando...");
    }
    public void tomarOrder (){
        System.out.println("Tomando orden...");
    }

    @Override
    public String toString() {
        return "Empleado{" +
                "nombre='" + nombre + '\'' +
                ", puesto='" + puesto + '\'' +
                ", salario=" + salario +
                '}';
    }
}
