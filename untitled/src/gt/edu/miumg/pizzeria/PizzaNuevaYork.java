package gt.edu.miumg.pizzeria;

public class PizzaNuevaYork extends Pizza{
    private String estiloCorte;
    public PizzaNuevaYork(String estiloCorte, String tamano, double precio) {
        super("Pizza Nueva York", "Grande", 40);
        this.estiloCorte = estiloCorte;
        ingredientes.add(new Masa("Gruesa",1));
        ingredientes.add(new Salsa("Ranchera",3));
        ingredientes.add(new Queso("Mozzarella",4));
    }

    @Override
    public String toString() {
        return "PizzaNuevaYork{" +
                "estiloCorte='" + estiloCorte + '\'' +
                '}';
    }
}
