package zooAnimales;

// Clase Mamifero
public class Mamifero extends Animal {
    private static int caballos;
    private static int leones;
    private boolean pelaje;
    private int patas;

    public Mamifero(String nombre, int edad, String habitat, String genero, boolean pelaje, int patas) {
        super(nombre, edad, habitat, genero);
        this.pelaje = pelaje;
        this.patas = patas;
    }

    public static Mamifero crearCaballo(String nombre, int edad, String habitat, String genero) {
        caballos++;
        return new Mamifero(nombre, edad, habitat, genero, true, 4);
    }

    public static Mamifero crearLeon(String nombre, int edad, String habitat, String genero) {
        leones++;
        return new Mamifero(nombre, edad, habitat, genero, true, 4);
    }

    public static int cantidadMamiferos() {
        return caballos + leones;
    }
}