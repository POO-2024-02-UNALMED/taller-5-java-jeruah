package zooAnimales;

public class Reptil extends Animal {
    private static int iguanas;
    private static int serpientes;
    private String colorEscamas;
    private int largoCola;

    public Reptil(String nombre, int edad, String habitat, String genero, String colorEscamas, int largoCola) {
        super(nombre, edad, habitat, genero);
        this.colorEscamas = colorEscamas;
        this.largoCola = largoCola;
    }

    public static Reptil crearIguana(String nombre, int edad, String habitat, String genero) {
        iguanas++;
        return new Reptil(nombre, edad, habitat, genero, "Verde", 10);
    }

    public static Reptil crearSerpiente(String nombre, int edad, String habitat, String genero) {
        serpientes++;
        return new Reptil(nombre, edad, habitat, genero, "Negro", 2);
    }

    public static int cantidadReptiles() {
        return iguanas + serpientes;
    }

    @Override
    public String movimiento() {
        return "reptar";
    }
}