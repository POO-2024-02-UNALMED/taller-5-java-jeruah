package zooAnimales;

public class Pez extends Animal {
    private static int salmones;
    private static int bacalaos;
    private String colorEscamas;
    private int cantidadAletas;

    public Pez(String nombre, int edad, String habitat, String genero, String colorEscamas, int cantidadAletas) {
        super(nombre, edad, habitat, genero);
        this.colorEscamas = colorEscamas;
        this.cantidadAletas = cantidadAletas;
    }

    public static Pez crearSalmon(String nombre, int edad, String habitat, String genero) {
        salmones++;
        return new Pez(nombre, edad, habitat, genero, "Plateado", 2);
    }

    public static Pez crearBacalao(String nombre, int edad, String habitat, String genero) {
        bacalaos++;
        return new Pez(nombre, edad, habitat, genero, "Gris", 3);
    }

    public static int cantidadPeces() {
        return salmones + bacalaos;
    }

    @Override
    public String movimiento() {
        return "nadar";
    }
}