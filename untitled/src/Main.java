import gt.edu.miumg.pizzeria.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Empleado empleado1 = new Empleado("Andre Calamar", "Cajero", 2000.0);
        System.out.println("empleado1 =" + empleado1 );
        Empleado empleado2 = new Empleado("Valery Palma", "Gerente", 2500.0);
        System.out.println("empleado2 =" + empleado2 );

        Equipo equipo = new Equipo("Horno para pizza", "Encendido");
        System.out.println("equipo =" + equipo );

        Ingredientes masa = new Masa("Simple", 1);
        System.out.println("Masa =" + masa );

        Ingredientes salsa = new Salsa("De quesos", 4);
        System.out.println("Salsa =" + salsa );
        Ingredientes queso= new Queso("Mezcla especial", 3);
        System.out.println("Queso =" + queso  );

         Pizza nuevaYork = new PizzaNuevaYork("Corte horizontal", "Grande" ,50);
        System.out.println("NuevaYork =" + nuevaYork );
        Pizza chicago = new PizzaChicago("Gruesa", "mediana", 30.00);
        System.out.println("Chicago =" + chicago );

        Sucursal sucursalNuevaYork = new Sucursal("Sucursal Colombia","Zona 2" );
        System.out.println("sucursalColombia =" + sucursalNuevaYork );
        sucursalNuevaYork.agregarEmpleado(empleado1);
        sucursalNuevaYork.agregarEmpleado(empleado2);
        sucursalNuevaYork.agregarEquipo(equipo);
        sucursalNuevaYork.agregarEspecialidad(nuevaYork);
        System.out.println("sucursalColombia =" + sucursalNuevaYork );

        Sucursal sucursalChicago = new Sucursal("Sucursal Italia", "Zona 22");
        System.out.println("sucursalItalia =" + sucursalChicago );
        sucursalChicago.agregarEmpleado(empleado1);
        sucursalChicago.agregarEmpleado(empleado2);
        sucursalChicago.agregarEquipo(equipo);
        sucursalChicago.agregarEspecialidad(chicago);
        System.out.println("sucursalItalia =" + sucursalChicago );
    }
}