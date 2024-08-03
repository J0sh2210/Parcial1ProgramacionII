package gt.edu.miumg.pizzeria;

public class PizzaChicago extends Pizza{
    private String grosorMasa;
    public PizzaChicago(String grosorMasa, String tamano, double precio) {
        super("Pizza chicago", "Mediana", 35);
        this.grosorMasa = grosorMasa;
        ingredientes.add(new Masa("Normal", 1));
        ingredientes.add(new Salsa("Champinones", 1 ));
        ingredientes.add(new Queso("Cheddar", 20));
    }

    @Override
    public String toString() {
        return "PizzaChicago{" +
                "grosorMasa='" + grosorMasa + '\'' +
                '}';
    }
}
